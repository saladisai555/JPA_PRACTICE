package com.sai.jpa.app;
import jakarta.persistence.*;
import com.sai.jpa.entity.LibraryMembership;
import com.sai.jpa.entity.Employee;
import com.sai.jpa.util.JpaUtil;

import java.time.LocalDate;

public class Employee_libraryDemo {
    public static void main(String[] args){
        EntityManager em=JpaUtil.getEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            Employee e=new Employee();
            e.setName("SAI");
            LibraryMembership lb=new LibraryMembership(LocalDate.now(),"history_books");
            e.setMembership(lb);
            lb.setEmployee(e);
            em.persist(e);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }
}
