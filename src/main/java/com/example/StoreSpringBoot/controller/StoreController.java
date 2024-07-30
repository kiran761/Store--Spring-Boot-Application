package com.example.StoreSpringBoot.controller;

import com.example.StoreSpringBoot.repository.*;
import com.example.StoreSpringBoot.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping
    public List getAllInStore()
    {
        return storeService.getAllInStore();
    }
}
