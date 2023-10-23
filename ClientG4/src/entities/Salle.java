/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

public class Salle implements Serializable{
    private int id;
    private String codeSalle;

    public Salle() {
    }

    public Salle(String codeSalle) {
        this.codeSalle = codeSalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeSalle() {
        return codeSalle;
    }

    public void setCodeSalle(String codeSalle) {
        this.codeSalle = codeSalle;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", codeSalle=" + codeSalle + "}";
    }
}
