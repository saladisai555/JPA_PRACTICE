package com.sai.jpa.entity;
import jakarta.persistence.*;
import com.sai.jpa.entity.Course_Q9;
@Entity
public class OnlineCourse_Q9 extends Course_Q9 {

    private String url;

    public OnlineCourse_Q9() {}
    public OnlineCourse_Q9(Long id, String name, String url) {
        super(id, name);
        this.url = url;
    }

    @Override
    public String toString() {
        return "OnlineCourse{id=" + getId() + ", name='" + getName() + "', url='" + url + "'}";
    }
}
