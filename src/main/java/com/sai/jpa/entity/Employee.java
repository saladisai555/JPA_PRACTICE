package com.sai.jpa.entity;
import jakarta.persistence.*;
import com.sai.jpa.entity.LibraryMembership;
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(
        mappedBy="employee",
        cascade=CascadeType.ALL
    )
    private LibraryMembership membership;
    public Employee(){

    }
    public Employee(String name,LibraryMembership membership){
        this.name=name;
        this.membership=membership;
    }

    public void setMembership(LibraryMembership membership) {
        this.membership = membership;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
