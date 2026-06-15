package com.sai.jpa.app;
import com.sai.jpa.entity.Location;
import com.sai.jpa.entity.Courses;
import com.sai.jpa.util.JpaUtil;
import jakarta.persistence.EntityManager;
import org.hibernate.Transaction;
import jakarta.persistence.*;

public class Coursesdemo {
    public static void main (String[] args){
        EntityManager em=JpaUtil.getEntityManager();
        EntityTransaction tx=em.getTransaction();
        try {
            tx.begin();
            Location l=new Location("gwk","pedagantyada","vignan");
            Courses c1=new Courses("JPA",l);
            em.persist(c1);
            Location l1=new Location("abc","xyz","pqr");
            Courses c2=new Courses();
            c2.setLocation(l1);
            c2.setName("JDBC");
            em.persist(c2);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
        em.close();
    }
}
