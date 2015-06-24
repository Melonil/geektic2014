package com.ninja_squad.geektic.Model;

/**
 * Created by Melonil on 22/06/2015.
 */

import javax.persistence.*;

@Entity
@Table(name="USER")
public class Geek {

    @Id
    @Column
    private int id;

    @Column
    public String prenom;

    @Column
    public String nom;


    public Geek (){

    }
    public Geek(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }


}
