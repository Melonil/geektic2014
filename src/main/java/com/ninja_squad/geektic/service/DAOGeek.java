package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.Model.Geek;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Melonil on 22/06/2015.
 */
@Repository
public class DAOGeek {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Geek> getGeek(int sexe) {
        String req = "select p from Geek p where 1=1 ";
        if(sexe==1){
            req+="and sexe=1";
        }else if(sexe==0){
            req+="and sexe=0";
        }
        TypedQuery<Geek> query = entityManager.createQuery(req,Geek.class);
        entityManager.close();
        return query.getResultList();
    }


    public void getByIdElement() {
        entityManager.find(Geek.class,4);
        //return element;
    }
}
