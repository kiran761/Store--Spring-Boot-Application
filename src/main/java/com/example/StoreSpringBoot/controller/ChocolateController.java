package com.example.StoreSpringBoot.controller;

import com.example.StoreSpringBoot.model.Chocolate;
import com.example.StoreSpringBoot.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chocolate")
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;
    @GetMapping("/{id}")
    public Chocolate getChocolate(@PathVariable Long id) {
        return chocolateService.getChocolate(id);
    }

    @PostMapping("/add")
    public Chocolate addChocolate(@RequestBody Chocolate chocolate) {
        return chocolateService.addChocolate(chocolate);
    }

    @PostMapping("/saveall")
    public List<Chocolate> addChocolates(@RequestBody List<Chocolate> chocolates)
    {
        return chocolateService.saveallChocolates(chocolates);
    }

    @PutMapping("/update/{id}")
    public Chocolate updateChocolate(@RequestBody Chocolate chocolate, @PathVariable Long id)
    {
        return chocolateService.updateChocolate(chocolate,id);
    }

    @DeleteMapping("/delete/{id}")
    public Chocolate deleteChocolate(@PathVariable Long id)
    {
        return chocolateService.deleteChocolate(id);
    }
}
