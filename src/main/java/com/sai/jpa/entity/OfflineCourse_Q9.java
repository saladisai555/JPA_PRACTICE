package com.sai.jpa.entity;

import jakarta.persistence.*;
import com.sai.jpa.entity.Course_Q9;
@Entity
public class OfflineCourse_Q9 extends Course_Q9 {

    private String location;

    public OfflineCourse_Q9() {}

    public OfflineCourse_Q9(Long id, String name, String location) {
        super(id, name);
        this.location = location;
    }

    @Override
    public String toString() {
        return "OfflineCourse{id=" + getId() + ", name='" + getName() + "', location='" + location + "'}";
    }
}
