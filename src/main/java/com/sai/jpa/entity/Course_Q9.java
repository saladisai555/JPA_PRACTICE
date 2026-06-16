package com.sai.jpa.entity;
import jakarta.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Course_Q9 {

    @Id
    private Long id;

    private String name;

    public Course_Q9() {
    }

    public Course_Q9(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

