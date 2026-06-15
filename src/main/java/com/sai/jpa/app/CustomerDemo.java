package com.sai.jpa.app;

import com.sai.jpa.entity.Customer;
import com.sai.jpa.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
//
public class CustomerDemo {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Customer customer = new Customer();

        customer.setEmail("sai@gmail.com");
        customer.setName("Sai");
        customer.setMobileNo("9876543210");

        em.persist(customer);

        tx.commit();

        System.out.println("Customer Saved");

        em.close();
        JpaUtil.close();
    }
}
