package com.sai.jpa.app;
import com.sai.jpa.entity.Product2;
import com.sai.jpa.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Products2demo {
    public static void main(String[] args){
        EntityManager em=JpaUtil.getEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            Product2 p=new Product2();
            p.setName("OPPO");
            p.setPrice(30000);
            p.getFeature().add("4700mah battery");
            p.getFeature().add("80W fast charging");
            em.persist(p);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }

}
