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

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        if(sexe==1){
            return "Homme";
        }else{
            return "Femme";
        }
    }

    @Column
    private String prenom;

    @Column
    private String nom;

    @Column
    private String email;

    @Column
    private int sexe;


    public Geek (){

    }
    public Geek(String nom, String prenom,int sexe){
        this.nom=nom;
        this.prenom=prenom;
        this.sexe=sexe;
    }


    public String getEmail() {
        return email;
    }
}
