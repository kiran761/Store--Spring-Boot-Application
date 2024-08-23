package com.example.StoreSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Chocolate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chocolateId;
    private String chocolateName;
    private String chocolateDescription;
    private int chocolatePrice;
    private String chocolateUrl;
}
