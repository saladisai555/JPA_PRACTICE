package com.sai.jpa.app;
import com.sai.jpa.entity.Title_B;
import com.sai.jpa.entity.Publisher_B;
import com.sai.jpa.entity.Title_U;
import com.sai.jpa.util.JpaUtil;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Publisher_title_B_demo {
    public static void main(String[] args){
        EntityManager em=JpaUtil.getEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            Publisher_B p=new Publisher_B("Gireesh");
            Title_B t=new Title_B(10000,"abc");
            Title_B t1=new Title_B(20000,"xyz");
            Title_B t2=new Title_B();
            t2.setPrice(30000);
            t2.setT_name("qwe");
            List<Title_B> titles=new ArrayList<>();
            titles.add(t);
            titles.add(t1);
            titles.add(t2);
            t.setPublisher_id(p);
            t1.setPublisher_id(p);
            t2.setPublisher_id(p);
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
