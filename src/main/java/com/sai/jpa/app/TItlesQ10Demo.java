package com.sai.jpa.app;
import com.sai.jpa.entity.Titles_Q10;
import com.sai.jpa.util.JpaUtil;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public class TItlesQ10Demo {
    public static void main(String[] args) {


        EntityManager em = JpaUtil.getEntityManager();


        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Titles_Q10> cq = cb.createQuery(Titles_Q10.class);

        Root<Titles_Q10> root = cq.from(Titles_Q10.class);

        cq.select(root)
                .where(cb.between(root.get("price"), 10.0, 20.0));

        List<Titles_Q10> titles = em.createQuery(cq).getResultList();

        for (Titles_Q10 t : titles)
            System.out.println(t);

        em.close();
    }
}
