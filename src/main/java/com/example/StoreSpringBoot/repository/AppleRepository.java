package com.example.StoreSpringBoot.repository;

import com.example.StoreSpringBoot.model.Apple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppleRepository extends JpaRepository<Apple,Long> {
}
