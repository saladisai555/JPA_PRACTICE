package com.sai.jpa.app;

import com.sai.jpa.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class TestConnection {

    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        System.out.println("Connection Successful");

        em.close();

        JpaUtil.close();
    }
}