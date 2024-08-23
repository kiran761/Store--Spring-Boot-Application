package com.example.StoreSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Milk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long milkId;
    private String milkName;
    private String milkDescription;
    private int milkPrice;
    private String milkUrl;
}
