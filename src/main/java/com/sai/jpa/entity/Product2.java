package com.sai.jpa.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products2")
public class Product2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    @ElementCollection
    @CollectionTable(name="features",joinColumns = @JoinColumn(name="feature_id"))
    private Set<String> feature=new HashSet<>();

    public Product2(String name,int price,Set<String> feature) {
        this.name=name;
        this.price=price;
        this.feature = feature;
    }
   public Product2(){

   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Set<String> getFeature() {
        return feature;
    }

    public void setFeature(Set<String> feature) {
        this.feature = feature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

