package com.example.StoreSpringBoot.controller;

import com.example.StoreSpringBoot.model.Apple;
import com.example.StoreSpringBoot.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apple")
public class AppleController {
    @Autowired
    AppleService appleService;

    @GetMapping("/{id}")
    public Apple getApple(@PathVariable Long id)
    {
        return appleService.getApple(id);
    }

    @PostMapping("/add")
    public Apple addApple(@RequestBody Apple apple)
    {
        return appleService.addApple(apple);
    }


    @PostMapping("/saveall")
    public List<Apple> addApples(@RequestBody List<Apple> apples) {
        return appleService.saveAllApples(apples);
    }

    @PutMapping("/update/{id}")
    public Apple updateApple(@RequestBody Apple apple, @PathVariable Long id) {
        return appleService.updateApple(apple, id);
    }

    @DeleteMapping("/delete/{id}")
    public Apple deleteApple(@PathVariable Long id) {
        return appleService.deleteApple(id);
    }
}
