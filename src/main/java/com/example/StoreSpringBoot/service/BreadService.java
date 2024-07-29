package com.example.StoreSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StoreSpringBoot.model.Bread;
import com.example.StoreSpringBoot.repository.BreadRepository;
@Service
public class BreadService {

    @Autowired
    BreadRepository brepo;

    public Bread getBread(Long id) {
        Optional<Bread> optional = brepo.findById(id);
        if (optional.isPresent())
            return optional.get();
        else
            return null;
    }

    public Bread addBread(Bread bread) {
        return brepo.save(bread);
    }

    public List<Bread> saveAllBreads(List<Bread> breads) {
        return brepo.saveAll(breads);
    }

    public Bread updateBread(Bread bread, Long id) {
        Optional<Bread> optional = brepo.findById(id);
        if (optional.isPresent()) {
            Bread temp = optional.get();
            temp.setBreadName(bread.getBreadName());
            temp.setBreadDescription(bread.getBreadDescription());
            temp.setBreadPrice(bread.getBreadPrice());
            return brepo.save(temp);
        }
        return null;
    }

    public Bread deleteBread(Long id) {
        Optional<Bread> b = brepo.findById(id);
        if (b.isPresent()) {
            brepo.deleteById(id);
            return b.get();
        }
        return null;
    }
}
