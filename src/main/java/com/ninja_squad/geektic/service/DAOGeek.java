package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.Model.Geek;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

/**
 * Created by Melonil on 22/06/2015.
 */
@Repository
public class DAOGeek {
    @PersistenceContext
    private EntityManager entityManager;

    public Geek getGeek() {
        String req = "select p from Geek p where p.sexe=1";
        TypedQuery<Geek> query = entityManager.createQuery(req,Geek.class);
        entityManager.close();
        return (Geek)query.getResultList();
    }


    public void getByIdElement() {
        entityManager.find(Geek.class,4);
        //return element;
    }
}
