package com.sai.jpa.entity;
import jakarta.persistence.*;
import java.util.*;
import com.sai.jpa.entity.Orders;
@Entity
@Table(name="prod_ord")
public class Product_ord {
    @Id
    private int id;
    private String name;
    @ManyToMany(mappedBy = "products")
    private List<Orders> orders=new ArrayList<>();

    public Product_ord(){

    }
    public Product_ord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
