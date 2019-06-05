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

	public boolean clienteExiste(Cliente cliente){
		for(Cliente c : clientes){
			if(c.getCpf() == cliente.getCpf()){
				return false;
			}      
		}
		return true;
	}

	public boolean animalExiste(Animal animal){
		for(Animal a : animais){
			if(a.getMatricula() == animal.getMatricula()){
				return false;
			}      
		}
		return true;
	}

	public boolean veterinarioExiste(Veterinario veterinario){
		for(Veterinario v : veterinarios){
			if(v.getCpf() == veterinario.getCpf()){
				return true;
			}      
		}
		return false;
	}
	public boolean especialidadeExiste(Veterinario veterinario){
		for(Veterinario v : veterinarios){
			if(v.getEspecialidade() == veterinario.getEspecialidade()){
				return true;
			}      
		}
		return false;
	}
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
				System.out.println("Cliente j· Existe");
			}
			else {
				clientes.add(cliente);
			}
		}
	}

	public void inserirAnimal(Animal animal, Cliente cliente){
		if(animais.size() == 0) {
			animais.add(animal);
			cliente.inserirAnimalEmC(animal);
		}
		else {
			boolean existe = false;
			for(Animal a: animais) {
				if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())){
					existe = true;
				}
			}
			
			if(existe == true) {
				System.out.println("Animal ja existe");
			}
			else {
				animais.add(animal);
				for(Cliente c : clientes) {
					if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
						c.inserirAnimalEmC(animal);
					}
				}
				
			}
			
		}

	}

	public void inserirVeterinario(Veterinario veterinario){
		veterinarios.add(veterinario);
	} 
	public void removerCliente(Cliente cliente){
		boolean existe=false;
		for(Cliente c : clientes){
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf()) ){
				existe=true;
				break;
			}
		}
		if(!existe){
			System.out.println("O Cliente j√° existe");
		} else{
			clientes.remove(cliente);
		}
	}
	public void removerAnimal(Animal animal, Cliente cliente){
		for(Animal a : animais){
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula()) ){
				animais.remove(a);
				for(Cliente c : clientes) {
					if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
						if(c.numeroAnimais() == 0) {
							clientes.remove(c);
							break;
						}
					}
					else {
						System.out.println("Os dados do Cliente est„o incorretos");
					}
				}
				break;
			}
			else {
				System.out.println("Animal nao existe");
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
				System.out.println("Veterinario n„o existe");
			}
		}
	}

	public void listarAnimais(){
		for(Animal a : animais){
			System.out.println("Nome: " + a.getNome() + 
					"\nMatricula: " + a.getMatricula() + 
					"\nRa√ßa: " + a.getRaca()+
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
					"\nEndere√ßo: " + c.getEndereco()+ 
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
	public boolean possoInserir(Veterinario veterinario){
		boolean existe = false;
		for(Veterinario v : veterinarios){
			if(v.getEspecialidade()== veterinario.getEspecialidade()){
				existe = true;
			}
		}
		if(existe == true){
			return false;
		}
		else{
			return true;
		}
	}
	public void inserirVet(Veterinario veterinario){
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
	public void consulta(Animal animal, String doenca) {
		if(animal.getTipo().equalsIgnoreCase("Cachorro")) {
			for(Veterinario v : veterinarios) {
				if(v.getEspecialidade().equalsIgnoreCase(animal.getTipo())) {
					
				}
				else {
					System.out.println("N„o temos veterinario para atender seu c„o no momento.");
				}
			}
		}
		
	}
	
	public void historico() {
		
	}
	
	public void tratamento(Animal animal) {
		animal.setDoenca("Saldavel");
	}
	
}
