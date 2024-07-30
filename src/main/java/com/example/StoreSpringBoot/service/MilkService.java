package com.example.StoreSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StoreSpringBoot.model.Milk;
import com.example.StoreSpringBoot.repository.MilkRepository;
@Service
public class MilkService {

    @Autowired
    MilkRepository mrepo;

    public Milk getMilk(Long id) {
        Optional<Milk> optional = mrepo.findById(id);
        if (optional.isPresent())
            return optional.get();
        else
            return null;
    }

    public Milk addMilk(Milk milk) {
        return mrepo.save(milk);
    }

    public List<Milk> saveAllMilks(List<Milk> milks) {
        return mrepo.saveAll(milks);
    }

    public Milk updateMilk(Milk milk, Long id) {
        Optional<Milk> optional = mrepo.findById(id);
        if (optional.isPresent()) {
            Milk temp = optional.get();
            temp.setMilkName(milk.getMilkName());
            temp.setMilkDescription(milk.getMilkDescription());
            temp.setMilkPrice(milk.getMilkPrice());
            return mrepo.save(temp);
        }
        return null;
    }

    public Milk deleteMilk(Long id) {
        Optional<Milk> m = mrepo.findById(id);
        if (m.isPresent()) {
            mrepo.deleteById(id);
            return m.get();
        }
        return null;
    }

    public List<Milk> getAllMilk() {
        return mrepo.findAll();
    }
}
