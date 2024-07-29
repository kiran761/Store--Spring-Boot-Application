package com.example.StoreSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StoreSpringBoot.model.Egg;
import com.example.StoreSpringBoot.repository.EggRepository;
@Service
public class EggService {

    @Autowired
    EggRepository erepo;

    public Egg getEgg(Long id) {
        Optional<Egg> optional = erepo.findById(id);
        if (optional.isPresent())
            return optional.get();
        else
            return null;
    }

    public Egg addEgg(Egg egg) {
        return erepo.save(egg);
    }

    public List<Egg> saveAllEggs(List<Egg> eggs) {
        return erepo.saveAll(eggs);
    }

    public Egg updateEgg(Egg egg, Long id) {
        Optional<Egg> optional = erepo.findById(id);
        if (optional.isPresent()) {
            Egg temp = optional.get();

            temp.setEggName(egg.getEggName());
            temp.setEggDescription(egg.getEggDescription());
            temp.setEggPrice(egg.getEggPrice());
            return erepo.save(temp);
        }
        return null;
    }

    public Egg deleteEgg(Long id) {
        Optional<Egg> e = erepo.findById(id);
        if (e.isPresent()) {
            erepo.deleteById(id);
            return e.get();
        }
        return null;
    }
}
