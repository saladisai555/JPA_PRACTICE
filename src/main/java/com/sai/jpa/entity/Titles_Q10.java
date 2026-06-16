package com.sai.jpa.entity;
import jakarta.persistence.*;
@Entity
public class Titles_Q10 {
    @Id
    private Long id;

    private String titleName;

    private double price;

    public Titles_Q10() {}

    public Titles_Q10(Long id, String titleName, double price) {
        this.id = id;
        this.titleName = titleName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title{id=" + id + ", titleName='" + titleName + "', price=" + price + "}";
    }
}
