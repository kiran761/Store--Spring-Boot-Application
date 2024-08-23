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
public class Bread {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long breadId;
    private String breadName;
    private int breadPrice;
    private String breadDescription;
    private String breadUrl;
}
