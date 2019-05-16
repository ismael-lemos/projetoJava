package Pessoas;

import animais.Animal;
import java.util.ArrayList;

/**
 *
 * @author Ismael de Oliveira
 */
public class Cliente extends Pessoa {
    private String rg;
    private String endereco;
    private ArrayList<Animal> animais = new ArrayList();

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
    public boolean existeAnimalEmC(Animal animal){
       for(Animal a : animais){
            if(a.getMatricula() == animal.getMatricula()){
                return false;
            }      
        }
        return true; 
    }
    public void inserirAnimalEmC(Animal animal){
        animais.add(animal);
    }
    public void listarAnimais(){
       for(Animal a : animais){
           System.out.println("Nome: " + a.getNome() + 
                              "\nMatricula: " + a.getMatricula() + 
                              "\nRaça: " + a.getRaca()+
                              "\nTamanho: " + a.getTamanho() + 
                              "\nPeso: " + a.getPeso() +
                              "\nIdade: " + a.getIdade() +
                              "\nGenero: " + a.getGenero() + "\n\n");
       }
    }
}
