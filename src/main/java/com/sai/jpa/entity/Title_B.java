package com.sai.jpa.entity;
import jakarta.persistence.*;
import com.sai.jpa.entity.Publisher_B;
@Entity
@Table(name = "titles_B")
public class Title_B {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tit_id;
    private int price;
    private String t_name;

    public Title_B(int price, String t_name) {
        this.price = price;
        this.t_name = t_name;
    }

    public Title_B(){

    }
    @ManyToOne
    @JoinColumn(name="Publisher_id")
    private Publisher_B Publisher_id;
    public int getTit_id() {
        return tit_id;
    }

    public Publisher_B getPublisher_id() {
        return Publisher_id;
    }

    public void setPublisher_id(Publisher_B Publisher_id) {
        this.Publisher_id = Publisher_id;
    }

    public void setTit_id(int tit_id) {
        this.tit_id = tit_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
