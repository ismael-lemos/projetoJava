package classes_auxiliares;

import Pessoas.*;
import animais.*;
import java.util.*;

/**
 *
 * @author Ismael de Oliveira
 */
public class Administracao {
	private ArrayList<Animal> animais = new ArrayList();
	private ArrayList<Veterinario> veterinarios = new ArrayList();
	private ArrayList<Cliente> clientes = new ArrayList();

	public void inserirCliente(Cliente cliente){
		if(clientes.size() == 0) {
			clientes.add(cliente);
		}
		else {
			boolean existe = false;
			for(Cliente c : clientes) {
				if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					existe = true;
				}
			}
			if(existe == true) {
				System.out.println("Cliente já Existe");
			}
			else {
				clientes.add(cliente);
			}
		}
	}

	public void inserirAnimal(Animal animal, Cliente cliente){
		for(Cliente c : clientes) {
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				if(animais.size() == 0) {
					animais.add(animal);
					c.inserirAnimalEmC(animal);
					break;
				}
				else {
					for(Animal a: animais) {
						if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())){
							System.out.println("Animal já existe");
							break;
						}
						else {
							animais.add(animal);
							c.inserirAnimalEmC(animal);
							break;
						}
					}
				}
			}
			else {
				System.out.println("Cliente Não Existe!");
			}
		}


	}



	public void inserirVeterinario(Veterinario veterinario){
		if(veterinarios.size() == 0){
			veterinarios.add(veterinario);
		}else{
			boolean existe = false;
			boolean especialidadeExiste = false;
			for(Veterinario v : veterinarios){
				if(v.getCpf().equalsIgnoreCase(veterinario.getCpf())){
					existe = true;
					break;
				} 
			}
			if(existe == false){
				for(Veterinario v : veterinarios){
					if(veterinario.getEspecialidade().equalsIgnoreCase(v.getEspecialidade())){
						especialidadeExiste = true;
						break;
					}
				}
				if(especialidadeExiste == false){
					veterinarios.add(veterinario);
				}
			} 
		}
	} 
	public void removerCliente(Cliente cliente){
		for(Cliente c : clientes){
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf()) ){
				cliente.removerTudo();
				clientes.remove(c);
				break;
			}
			else {
				System.out.println("Cliente Não Existe");
			}
		}
	}


	public void removerAnimal(Animal animal, Cliente cliente){
		for(Cliente c : clientes) {
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				for(Animal a : animais){
					if(a.getMatricula().equalsIgnoreCase(animal.getMatricula()) ){
						animais.remove(a);
						cliente.removerAnimal(a);
						if(c.numeroAnimais() == 0) {
							clientes.remove(c);
							break;
						}
					}
					else {
						System.out.println("Animal não existe");
						break;
					}
				}
			}
			else {
				System.out.println("Os dados do Cliente estão incorretos");
			}

		}

	}


	public void removerVeterinario(Veterinario veterinario){
		for(Veterinario v : veterinarios){
			if(v.getCpf().equalsIgnoreCase(veterinario.getCpf()) ){
				veterinarios.remove(v);
				break;
			}
			else {
				System.out.println("Veterinario não existe");
			}
		}
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

	public void listarClientes(){
		for(Cliente c : clientes){
			System.out.println("Nome: " + c.getNome() + 
					"\nCPF: " + c.getCpf() + 
					"\nRG: " + c.getRg() +
					"\nEndereço: " + c.getEndereco()+ 
					"\nIdade: " + c.getIdade() +
					"\nGenero: " + c.getGenero() + "\n\n");
		}
	}
	public void listarVeterinarios(){
		for(Veterinario v : veterinarios){
			System.out.println("Nome: " + v.getNome() + 
					"\nCPF: " + v.getCpf() + 
					"\nEspecialidade: " + v.getEspecialidade() + 
					"\nIdade: " + v.getIdade() +
					"\nGenero: " + v.getGenero() + "\n\n");
		}
	}
	public void listarAnimaisClientes(Cliente cliente){
		for(Cliente c : clientes) {
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				c.listarAnimais();
			}
			else {
				System.out.println("Cliente nao cadastrado");
			}
		}
	}
	public boolean veterinarioExiste(Animal animal){
		for(Veterinario v : veterinarios){
			if(v.getEspecialidade().equalsIgnoreCase(animal.getTipo())){
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	public void historico(Animal animal) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				System.out.println("Nome do Animal: " + a.getNome() +
						"Tipo: " + a.getTipo() +
						"Idade: " + a.getIdade() +
						"Peso Atual: " + a.getPeso() +
						"Raça: " + a.getRaca() +
						"Tamanho: " + a.getTamanho() +
						"Matricula" + a.getMatricula());
				animal.listarConsultas();
			}
			else {
				System.out.println("O animal não existe em nosso dados");
			}
		}

	}
	public void doencaAnimal(Animal animal, String doenca) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				a.setDoenca(doenca);
			}
		}
	}
	public boolean animalEstaDoente(Animal animal) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				if(a.getDoenca() != "Saudavel") {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	public boolean animalExiste(Animal animal){
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	public void removerAnimalEmCliente(Animal animal) {
		animais.remove(animal);
	}

}


