package com.example.StoreSpringBoot.service;

import com.example.StoreSpringBoot.model.Chocolate;
import com.example.StoreSpringBoot.repository.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ChocolateService {

    @Autowired
    ChocolateRepository crepo;

    public Chocolate getChocolate(Long id) {
        Optional<Chocolate> optional = crepo.findById(id);
        if (optional.isPresent())
            return optional.get();
        else
            return null;
    }

    public Chocolate addChocolate(Chocolate chocolate) {
        return crepo.save(chocolate);
    }

    public List<Chocolate> saveallChocolates(List<Chocolate> chocolates) {
        return crepo.saveAll(chocolates);
    }

    public Chocolate updateChocolate(Chocolate chocolate,Long id) {
        Optional<Chocolate> optional=crepo.findById(id);
        if(optional.isPresent())
        {
            Chocolate temp=optional.get();
            temp.setChocolateDescription(chocolate.getChocolateDescription());
            temp.setChocolateName(chocolate.getChocolateName());
            temp.setChocolatePrice(chocolate.getChocolatePrice());
            return crepo.save(chocolate);
        }
        return null;
    }

    public Chocolate deleteChocolate(Long id) {
        Optional<Chocolate> c=crepo.findById(id);
        if(c.isPresent()) {
            crepo.deleteById(id);
            return c.get();
        }

        return null;

    }
}
