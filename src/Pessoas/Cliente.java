package Pessoas;

import animais.Animal;
import classes_auxiliares.Administracao;

import java.util.ArrayList;

/**
 *
 * @author Ismael de Oliveira
 */
public class Cliente extends Pessoa {
	private String rg;
	private String endereco;
	private String estado;
	private String cidade;
	private String cep;
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	protected ArrayList<Animal> animais = new ArrayList();

	public Cliente() {
	}

	public Cliente(String nome, String cpf, String rg, String endereco, String genero, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.genero = genero;
		this.idade = idade;
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
	
	public int numeroAnimais() {
		return animais.size();
	}
	public void removerAnimal(Animal animal) {
		animais.remove(animal);

	}
	public void remover(Animal animal) {
		if(animais.size() > 0) {
			for(Animal a : animais) {
				if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())){
					animais.remove(a);
				}
			}
		}
	}
	public void animalDonca(Animal animal, String doenca) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				a.setDoenca(doenca);
			}
		}
	}
	
	public ArrayList<Animal> getAnimais(){
		return animais;
	}

}
