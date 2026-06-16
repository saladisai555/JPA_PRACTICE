package com.sai.jpa.app;
import jakarta.persistence.*;
import com.sai.jpa.entity.OfflineCourse_Q9;
import com.sai.jpa.entity.Course_Q9;
import com.sai.jpa.entity.OnlineCourse_Q9;
import com.sai.jpa.util.JpaUtil;
public class Course_Q9demo {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx=em.getTransaction();

        OnlineCourse_Q9 online = new OnlineCourse_Q9(1L, "AWS", "meet.google.com/aws");

        OfflineCourse_Q9 offline = new OfflineCourse_Q9(2L, "Java", "Hyderabad");

        tx.begin();

        em.persist(online);

        em.persist(offline);

        tx.commit();

        System.out.println(online);

        System.out.println(offline);

        em.close();

    }

}
