package com.sai.jpa.app;
import jakarta.persistence.*;
import com.sai.jpa.entity.Title_U;
import com.sai.jpa.entity.Publisher_U;
import com.sai.jpa.util.JpaUtil;

import java.util.ArrayList;
import java.util.List;

public class Publisher_titledemo {
    public static void main(String[] args){
        EntityManager em=JpaUtil.getEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            Publisher_U p=new Publisher_U("SAI");
            Title_U t=new Title_U(1000,"commit");
            Title_U t1=new Title_U(2000,"push");
            Title_U t2=new Title_U();
            t2.setPrice(3000);
            t2.setT_name("Merge");
            List<Title_U> titles=new ArrayList<>();
            titles.add(t1);
            titles.add(t2);
            titles.add(t);
            p.setTitles(titles);
            em.persist(p);
            tx.commit();
            em.close();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
    }
}
