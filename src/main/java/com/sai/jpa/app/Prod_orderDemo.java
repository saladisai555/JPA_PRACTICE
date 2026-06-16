package com.sai.jpa.app;
import jakarta.persistence.*;
import com.sai.jpa.entity.Product_ord;
import com.sai.jpa.entity.Orders;
import com.sai.jpa.util.JpaUtil;

import java.util.ArrayList;
import java.util.List;

public class Prod_orderDemo {
    public static void main(String[] args){
        EntityManager em=JpaUtil.getEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            Orders o =new Orders(1);
            Product_ord p1=new Product_ord(1,"sai");
            Product_ord p2=new Product_ord(2,"giresh");
            o.getProducts().add(p1);
            o.getProducts().add(p2);
            em.persist(o);
            tx.commit();
            em.close();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }
}
