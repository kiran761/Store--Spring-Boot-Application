package com.example.StoreSpringBoot.controller;

import com.example.StoreSpringBoot.model.Bread;
import com.example.StoreSpringBoot.service.BreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("store/bread")
public class BreadController
{
    @Autowired
    BreadService breadService;
    @GetMapping("/{id}")
    public Bread getBread(@PathVariable Long id)
    {
        return breadService.getBread(id);
    }

    @PostMapping("/add")
    public Bread getBread(@PathVariable Bread bread)
    {
        return breadService.addBread(bread);
    }

    @PostMapping("/saveall")
    public List<Bread> addBreads(@RequestBody List<Bread> breads) {
        return breadService.saveAllBreads(breads);
    }

    @PutMapping("/update/{id}")
    public Bread updateBread(@RequestBody Bread bread, @PathVariable Long id) {
        return breadService.updateBread(bread, id);
    }

    @DeleteMapping("/delete/{id}")
    public Bread deleteBread(@PathVariable Long id) {
        return breadService.deleteBread(id);
    }
}
