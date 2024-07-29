package com.example.StoreSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Egg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eggId;
    private String eggName;
    private String eggDescription;
    private int eggPrice;

}
