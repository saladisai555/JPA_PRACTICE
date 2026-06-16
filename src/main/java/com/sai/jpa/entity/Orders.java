package com.sai.jpa.entity;
import jakarta.persistence.*;
import com.sai.jpa.entity.Product_ord;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    private int id;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="order_products",
    joinColumns =
    @JoinColumn(name="order_id"),
    inverseJoinColumns =
    @JoinColumn(name="product_id")
    )
    private List<Product_ord> products=new ArrayList<>();

    public Orders(){

    }
    public Orders(int id) {
        this.id = id;
    }

    public List<Product_ord> getProducts() {
        return products;
    }

    public void setProducts(List<Product_ord> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
