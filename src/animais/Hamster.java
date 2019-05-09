/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Ismael
 */
public class Hamster extends Animal {

    public Hamster() {
    }
    
     public Hamster(String nome, String matricula, String raca, String genero, float idade, float tamanho, String doenca, String ND) {
        this.nome = nome;
        this.matricula = matricula;
        this.raca = raca;
        this.genero = genero;
        this.idade = idade;
        this.tamanho = tamanho;
        this.doenca = doenca;
        String NomeDono = ND;
    }
}
