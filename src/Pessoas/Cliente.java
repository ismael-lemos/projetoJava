package Pessoas;

import animais.Animal;

/**
 *
 * @author Ismael de Oliveira
 */
public class Cliente extends Pessoa {
    private String rg;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String rg, String endereco, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.genero = genero;
        this.idade = idade;
    }

 
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
