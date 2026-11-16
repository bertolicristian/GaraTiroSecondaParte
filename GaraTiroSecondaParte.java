/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garatirosecondaparte;

/**
 *
 * @author bertoli.cristian
 */
public class GaraTiroSecondaParte {

    public static void main(String[] args) {
        Arciere arciere1 = new Arciere("cristian");
        Arciere arciere2 = new Arciere("luca");
        Arco arco1 = new Arco ("mega arco 2000", 2);
        Arco arco2 = new Arco("super arco 3000", 3);
        
        arciere1.prendiArco(arco2);
        arciere2.prendiArco(arco1);
        
        System.out.println(arciere1.getNome());
        gareggia(arciere1);
        arciere1.stampaPunteggi();
        System.out.println();
        System.out.println(arciere1.calcolaPunteggioTotale());
        
        System.out.println();
        System.out.println();
        
        System.out.println(arciere2.getNome());
        gareggia(arciere2);
        arciere2.stampaPunteggi();
        System.out.println();
        System.out.println(arciere2.calcolaPunteggioTotale());
        
        if (arciere1.calcolaPunteggioTotale() > arciere2.calcolaPunteggioTotale()) {
            System.out.println();
            System.out.println();
            
            System.out.println("===ha vinto " + arciere1.getNome() + " con arco: " + arciere1.getModello() + "===");
        }
        
        else if (arciere1.calcolaPunteggioTotale() < arciere2.calcolaPunteggioTotale()){
            System.out.println();
            System.out.println();
            
            System.out.println("===ha vinto " + arciere2.getNome() + " con arco: " + arciere2.getModello() + "===");
        }
        
        else {
            System.out.println();
            System.out.println();
            
            System.out.println("===la gara tra " + arciere1.getNome() + " con arco: " + arciere1.getModello() +" e " + arciere2.getNome() + " con arco: " + arciere2.getModello() + " e finita in pareggio===");
        }
    }
    
    static void gareggia(Arciere a){
        
        for (int i = 0; i < 5; i++){
            a.tiro();
        }
    }
}