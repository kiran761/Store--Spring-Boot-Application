package com.example.StoreSpringBoot.repository;

import com.example.StoreSpringBoot.model.Egg;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EggRepository extends JpaRepository<Egg,Long> {
}
