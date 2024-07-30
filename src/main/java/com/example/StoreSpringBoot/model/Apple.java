package com.example.StoreSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Apple {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appleId;
    private String appleName;
    private int applePrice;
    private String appleDescription;
}
