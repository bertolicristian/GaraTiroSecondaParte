/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garatirosecondaparte;

/**
 *
 * @author bertoli.cristian
 */
public class Arco {
    private String modello;
    private int precisione;
    private Arciere a;

    public Arco(String modello, int precisione) {
        this.modello = modello;
        this.precisione = precisione;
    }
    
    public int getPrecisione(){
        return precisione;
    }
    
    public void setArciere(Arciere ar) {
        a = ar;
    }
    
    public String getModello() {
        return modello;
    }
}
