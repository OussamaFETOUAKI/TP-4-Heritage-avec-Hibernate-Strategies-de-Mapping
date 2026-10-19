package com.example.model.tableperclass;

import javax.persistence.Entity;

@Entity
public class Electronique extends Produit {

    private int garantie; // durée en mois

    public Electronique() {}

    public Electronique(String nom, int garantie) {
        super(nom);
        this.garantie = garantie;
    }

    // Getters et Setters
    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }

    @Override
    public String toString() {
        return "Electronique{id=" + getId() + ", nom='" + getNom() + "', garantie=" + garantie + " mois}";
    }
}
