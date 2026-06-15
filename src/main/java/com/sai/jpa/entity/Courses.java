package com.sai.jpa.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Courses {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    @Embedded
    private Location location;
    public Courses(){
         //default constructor
    }
    public Courses(String name,Location location){
        this.name=name;
        this.location=location;
    }

    public Courses(int id,String name,Location location){
        this.id=id;
        this.name=name;
        this.location=location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



