package com.example.StoreSpringBoot.controller;

import com.example.StoreSpringBoot.model.Milk;
import com.example.StoreSpringBoot.service.MilkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/milk")
public class MilkController {
    @Autowired
    private MilkService milkService;
    @GetMapping("/{id}")
    public Milk getMilk(@PathVariable Long id) {
        return milkService.getMilk(id);
    }

    @PostMapping("/add")
    public Milk addMilk(@RequestBody Milk milk) {
        return milkService.addMilk(milk);
    }

    @PostMapping("/saveall")
    public List<Milk> addMilks(@RequestBody List<Milk> milks) {
        return milkService.saveAllMilks(milks);
    }

    @PutMapping("/update/{id}")
    public Milk updateMilk(@RequestBody Milk milk, @PathVariable Long id) {
        return milkService.updateMilk(milk, id);
    }

    @DeleteMapping("/delete/{id}")
    public Milk deleteMilk(@PathVariable Long id) {
        return milkService.deleteMilk(id);
    }
}
