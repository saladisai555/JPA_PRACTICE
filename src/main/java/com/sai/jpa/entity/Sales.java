package com.sai.jpa.entity;
import jakarta.persistence.*;
import com.sai.jpa.entity.Product_sales;
@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product_sales product;

    public Sales(){

    }

    public Sales( int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product_sales getProduct() {
        return product;
    }

    public void setProduct(Product_sales product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

