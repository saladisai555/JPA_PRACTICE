package com.sai.jpa.app;
import jakarta.persistence.*;
import com.sai.jpa.util.JpaUtil;
import com.sai.jpa.entity.Product;
public class ProductDemo {
     public static void main(String[] args){
         EntityManager em=JpaUtil.getEntityManager();
         EntityTransaction tx=em.getTransaction();
         Product product=new Product(1,"sai",1000);
         try{
             tx.begin();
             em.persist(product);
             Product p1=new Product(2,"gireesh",2000);
             em.persist(p1);
             tx.commit();
             em.close();
         } catch (Exception e) {
             tx.rollback();
         }
     }

}