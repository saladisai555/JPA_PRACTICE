package com.sai.jpa.entity;
import jakarta.persistence.*;
import com.sai.jpa.entity.Publisher_U;
@Entity
@Table(name = "titles")
public class Title_U {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int t_id;

    private int price;
    private String t_name;
    public Title_U(){

    }
    public Title_U(int price, String t_name) {
        this.price = price;
        this.t_name = t_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }
}
