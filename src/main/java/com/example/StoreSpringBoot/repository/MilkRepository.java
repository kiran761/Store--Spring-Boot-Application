package com.example.StoreSpringBoot.repository;

import com.example.StoreSpringBoot.model.Milk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilkRepository extends JpaRepository<Milk,Long> {

}
