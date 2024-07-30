package com.example.StoreSpringBoot.service;

import com.example.StoreSpringBoot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {

    @Autowired
    AppleRepository arepo;
    @Autowired
    BreadRepository brepo;
    @Autowired
    ChocolateRepository crepo;
    @Autowired
    EggRepository erepo;
    @Autowired
    MilkRepository mrepo;

    List<Object> storeList=new ArrayList<>();
    public List getAllInStore()
    {
        storeList.add(arepo.findAll());
        storeList.add(brepo.findAll());
        storeList.add(crepo.findAll());
        storeList.add(erepo.findAll());
        storeList.add(mrepo.findAll());
        return storeList;
    }
}
