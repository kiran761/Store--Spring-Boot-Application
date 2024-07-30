package com.example.StoreSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StoreSpringBoot.model.Apple;
import com.example.StoreSpringBoot.repository.AppleRepository;

@Service
public class AppleService {
    @Autowired
    AppleRepository arepo;
    public Apple getApple(Long id) {
        Optional<Apple> optional=arepo.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;
    }

    public Apple addApple(Apple apple)
    {
        return arepo.save(apple);
    }

    public List<Apple> saveAllApples(List<Apple> apples) {
        return arepo.saveAll(apples);
    
    }


    public Apple updateApple(Apple apple, Long id) {
        Optional<Apple> optional = arepo.findById(id);
        if (optional.isPresent()) {
            Apple temp = optional.get();
            temp.setAppleName(apple.getAppleName());
            temp.setAppleDescription(apple.getAppleDescription());
            temp.setApplePrice(apple.getApplePrice());
            return arepo.save(temp);
        }
        return null;
    }

    public Apple deleteApple(Long id) {
        Optional<Apple> a = arepo.findById(id);
        if (a.isPresent()) {
            arepo.deleteById(id);
            return a.get();
        }
        return null;
    }


    public List<Apple> getAllApples() {
        return arepo.findAll();
    }
}
