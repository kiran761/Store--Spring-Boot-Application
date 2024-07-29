package com.example.StoreSpringBoot.repository;

import com.example.StoreSpringBoot.model.Bread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreadRepository extends JpaRepository<Bread,Long> {
}
