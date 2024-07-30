package com.example.StoreSpringBoot.controller;

import com.example.StoreSpringBoot.model.Egg;
import com.example.StoreSpringBoot.service.EggService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("store/egg")
public class EggController {

    @Autowired
    private EggService eggService;

    @GetMapping("/egg/{id}")
    public Egg getEgg(@PathVariable Long id) {
        return eggService.getEgg(id);
    }

    @PostMapping("/egg/add")
    public Egg addEgg(@RequestBody Egg egg) {
        return eggService.addEgg(egg);
    }

    @PostMapping("/saveall")
    public List<Egg> addEggs(@RequestBody List<Egg> eggs) {
        return eggService.saveAllEggs(eggs);
    }

    @PutMapping("/update/{id}")
    public Egg updateEgg(@RequestBody Egg egg, @PathVariable Long id) {
        return eggService.updateEgg(egg, id);
    }

    @DeleteMapping("/delete/{id}")
    public Egg deleteEgg(@PathVariable Long id) {
        return eggService.deleteEgg(id);
    }

    @GetMapping("/getall")
    public List<Egg> getAllEggs()
    {
        return eggService.getAllEggs();
    }
}
