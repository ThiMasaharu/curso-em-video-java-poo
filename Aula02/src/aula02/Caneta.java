/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Admin
 */
public class Caneta {
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.printf("Modelo: %s.\nUma caneta %s.\nPonta: %2f.\nCarga: %d"
                + "\nEstá tampada? %b.\n", modelo, cor, ponta, carga, tampada);
    }
    
    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
