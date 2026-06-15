package com.sai.jpa.entity;
import com.sai.jpa.entity.Employee;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Locale;

@Entity
@Table(name = "lib_membership")
public class LibraryMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int store_id;
    private LocalDate date;
    private String mem_type;
    public LibraryMembership(){

    }
    public LibraryMembership(LocalDate date,String mem_type){
        this.date=date;
        this.mem_type=mem_type;
    }
    @OneToOne
    @JoinColumn(name="Employee_id")
    private Employee employee;

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getMem_type() {
        return mem_type;
    }

    public void setMem_type(String mem_type) {
        this.mem_type = mem_type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

}
