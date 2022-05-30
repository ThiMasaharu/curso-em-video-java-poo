/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Admin
 */
public abstract class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    // Métodos
    public final void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "==========\n" + "Pessoa{" + "\nnome=" + nome + 
                        ",\nidade=" + idade + 
                        ",\nsexo=" + sexo + '}';
    }
    
}
