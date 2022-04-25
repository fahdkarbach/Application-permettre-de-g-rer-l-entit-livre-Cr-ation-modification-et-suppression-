package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Livres")
public class Livre {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 50)
    private String titre;
    @Column(nullable = false, updatable = false)
    private String maisonedition;
    @Column(nullable = false)
    private String datesortie;
    @Column(nullable = false)
    private int nbrp;
    @Column(unique=true, nullable = false, updatable = false)
    private int isbn;
    @Column(nullable = false)
    private String dateconsu;
    @Column(nullable = false)
    private String dispo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMaisonedition() {
        return maisonedition;
    }

    public void setMaisonedition(String maisonedition) {
        this.maisonedition = maisonedition;
    }

    public String getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(String datesortie) {
        this.datesortie = datesortie;
    }

    public int getNbrp() {
        return nbrp;
    }

    public void setNbrp(int nbrp) {
        this.nbrp = nbrp;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getDateconsu() {
        return dateconsu;
    }

    public void setDateconsu(String dateconsu) {
        this.dateconsu = dateconsu;
    }

    public String getDispo() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
    }
}
