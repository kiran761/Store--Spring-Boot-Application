package com.example.StoreSpringBoot.repository;

import com.example.StoreSpringBoot.model.Chocolate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChocolateRepository extends JpaRepository<Chocolate,Long> {
}
