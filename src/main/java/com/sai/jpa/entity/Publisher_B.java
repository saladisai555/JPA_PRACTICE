package com.sai.jpa.entity;
import com.sai.jpa.entity.Title_B;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher_B")
public class Publisher_B {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Pub_id;
    private String Pub_name;

    @OneToMany(
         mappedBy="Publisher_id",
         cascade=CascadeType.ALL)
    private List<Title_B> titles;

    public Publisher_B(){

    }

    public Publisher_B(String pub_name) {
        Pub_name = pub_name;
    }

    public int getPub_id() {
        return Pub_id;
    }

    public void setPub_id(int pub_id) {
        Pub_id = pub_id;
    }

    public List<Title_B> getTitles() {
        return titles;
    }

    public void setTitles(List<Title_B> titles) {
        this.titles = titles;
    }

    public String getPub_name() {
        return Pub_name;
    }

    public void setPub_name(String pub_name) {
        Pub_name = pub_name;
    }
}
