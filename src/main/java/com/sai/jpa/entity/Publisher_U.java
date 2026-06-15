package com.sai.jpa.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher")
public class Publisher_U {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pub_name;

    public Publisher_U() {

    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="publisher_id")
    private List<Title_U> titles;


    public Publisher_U(String pub_name) {
        this.pub_name = pub_name;
    }

    public void setTitles(List<Title_U> titles)
    {
        this.titles=titles;
    }

    public List<Title_U> getTitles()
    {
        return titles;
    }
    public String getPub_name() {
        return pub_name;
    }

    public void setPub_name(String pub_name) {
        this.pub_name = pub_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
