/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14e15projetoyoutube;

/**
 *
 * @author Admin
 */
public class Gafanhoto extends Pessoa {
    
    // Atributos
    private String login;
    private int totAssistindo;

    // Métodos especiais
    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + 
                "\nlogin=" + login + 
                ",\n totAssistindo=" + totAssistindo + '}';
    }
    
}
