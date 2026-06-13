package com.sai.jpa.entity;
import jakarta.persistence.*;

import javax.lang.model.element.Name;

@Entity
@Table(name = "product")
public class Product {
    public Product() {
    }

    @Id
    @Column(name = "Prod_id")
    private int id;
    @Column(name="Prod_name")
    private String name;
    @Column
    private int price;

    public Product(int Prod_id,String Prod_name,int price){
        this.id=Prod_id;
        this.name=Prod_name;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

