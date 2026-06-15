package com.sai.jpa.entity;
import jakarta.persistence.*;
import com.sai.jpa.entity.Sales;

import java.util.List;

@Entity
@Table(name = "product_s")
public class Product_sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;
    private String p_name;
    public Product_sales(){

    }
    @OneToMany(
            mappedBy = "product",
            cascade=CascadeType.ALL
    )
    private List<Sales> sales;

    public List<Sales> getSales() {
        return sales;
    }

    public void setSales(List<Sales> sales) {
        this.sales = sales;
    }

    public Product_sales(String p_name) {
        this.p_name = p_name;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}
