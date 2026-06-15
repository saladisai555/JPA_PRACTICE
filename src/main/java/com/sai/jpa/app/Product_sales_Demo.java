package com.sai.jpa.app;
import com.sai.jpa.entity.Sales;
import com.sai.jpa.entity.Product_sales;
import com.sai.jpa.util.JpaUtil;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Product_sales_Demo {
    public static void main(String[] args){
        EntityManager em=JpaUtil.getEntityManager();
        EntityTransaction tx= em.getTransaction();
        try{
            tx.begin();
            Product_sales p1=new Product_sales("oppo");
            Sales s1=new Sales(2);
            Sales s2=new Sales(3);
            s1.setProduct(p1);
            s2.setProduct(p1);
            List<Sales> sales=new ArrayList<>();
            sales.add(s1);
            sales.add(s2);
            p1.setSales(sales);
            em.persist(p1);
            tx.commit();
            em.close();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }
}
