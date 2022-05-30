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
    public String modelo, cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.printf("Modelo: %s.\nUma caneta %s.\nPonta: %2f.\nCarga: %d"
                + "\nEstá tampada? %b.\n", modelo, cor, ponta, carga, tampada);
    }
    
    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar!");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
