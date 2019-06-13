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
				System.out.println("Cliente j� Existe");
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
							System.out.println("Animal j� existe");
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
				System.out.println("Cliente N�o Existe!");
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
		boolean clienteRemovido = false;
		boolean clienteExiste = false;
		int cont = 0;
		for(Cliente c : clientes){
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf()) ){
				clienteExiste = true;
				ArrayList<Animal> animaisCliente = c.getAnimais();
				for(Animal a : animaisCliente) {
					animais.remove(a);
					cont++;
					if(animaisCliente.size() == cont) {
						clientes.remove(c);
						clienteRemovido = true;
						break;
					}
				}
			}
		}
		if(clienteExiste == false) {
			System.out.println("Cliente n�o existe");
		}
		if(clienteRemovido = false) {
			System.out.println("Cliente n�o foi removido");
		}
	}


	public void removerAnimal(Animal animal, Cliente cliente){
		boolean clienteExiste = false;
		boolean animalExiste = false;
		for(Cliente  c : clientes) {
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				System.out.println("Entrou cliente");
				clienteExiste = true;
				ArrayList<Animal> animaisCliente = c.getAnimais();
				for(Animal a : animaisCliente) {
					if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
						System.out.println("Entrou animal");
						animalExiste = true;
						animais.remove(a);
						animaisCliente.remove(a);
						if(animaisCliente.size() == 0) {
							clientes.remove(c);
						}	
					}
				}
			}

			if(clienteExiste = false) {
				System.out.println("Cliente n�o existe");
			}
			if(animalExiste = false) {
				System.out.println("Animal n�o existe");
			}
		}
	}


	public void removerVeterinario(Veterinario veterinario){
		boolean veterinarioExiste = false;
		for(Veterinario v : veterinarios){
			if(v.getCpf().equalsIgnoreCase(veterinario.getCpf()) ){
				veterinarioExiste = true;
				veterinarios.remove(v);
				break;
			}
		}
		if(veterinarioExiste = false) {
			System.out.println("Veterinario n�o Existe");
		}
	}

	public void listarAnimais(){
		for(Animal a : animais){
			System.out.println("Nome: " + a.getNome() + 
					"\nMatricula: " + a.getMatricula() + 
					"\nRa�a: " + a.getRaca()+
					"\nTamanho: " + a.getTamanho() + 
					"\nPeso: " + a.getPeso() +
					"\nIdade: " + a.getIdade() +
					"\nGenero: " + a.getGenero() +
					"\nDono: " + a.getNomeDono() +"\n\n");
		}
	}

	public void listarClientes(){
		for(Cliente c : clientes){
			System.out.println("Nome: " + c.getNome() + 
					"\nCPF: " + c.getCpf() + 
					"\nRG: " + c.getRg() +
					"\nEndere�o: " + c.getEndereco()+ 
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
						"\nTipo: " + a.getTipo() +
						"\nIdade: " + a.getIdade() +
						"\nPeso Atual: " + a.getPeso() +
						"\nRa�a: " + a.getRaca() +
						"\nTamanho: " + a.getTamanho() +
						"\nMatricula" + a.getMatricula());
				ArrayList <Consulta> consultas = a.getConsultas();
				for(Consulta c : consultas) {
					System.out.println("\nDescri��o: " + c.getDescricao() +
							"\nData: " + c.getData() + 
							"\nDoen�a Diagnosticada: " + c.getDoencaDiagnosticada());
				}
				break;
			}
		}

	}
	public void tratamenteto(Animal animal) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				a.setDoenca(null);
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

	public boolean clienteNomeExiste(Cliente cliente) {
		for(Cliente c : clientes) {
			if(c.getNome().equalsIgnoreCase(cliente.getNome())) {
				return true;

			}
			else {
				return false;

			}

		}
		return false;
	}
	public boolean clienteCpfExiste(Cliente cliente) {
		for(Cliente c : clientes) {
			if(c.getNome().equalsIgnoreCase(cliente.getNome())) {
				if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}

	public boolean testeCpf(String cpf) {
		boolean teste = true;
		for(int i = 0; i < cpf.length(); i++){
			if(cpf.charAt(i) < 48  || cpf.charAt(i) > 57){
				teste = false;
			}      
		}
		if(teste == true) {
			return true;
		}
		else {
			return false;
		}
	}
	public String nomeSobrenome(String nome) {
		boolean teste = false;
		if(nome.length() >= 7){
			for(int i = 0; i < nome.length(); i++){
				if(nome.charAt(i) == 32){
					teste = true;
				}
				if(nome.charAt(i) == 32 && nome.charAt(i+1) == 32){
					return "mais de um espaco";
				}
				if(nome.charAt(i) > 47 && nome.charAt(i) < 58){
					teste = false;
					return "contem numeros";
				}
			}
			if(teste = false){
				return "sem sobrenome";
			}
			if(teste = true) {
				return "aceito";
			}
			else{
				return "invalido";
			}
		}
		else{
			return "sem sobrenome";
		}
	}
	public String tipoAnimal(String matricula) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(matricula)) {
				return a.getTipo();
			}
		}
		return "nao achado";
	}
	public void iniciarConsulta(Animal animal, String doenca) {
		for(Veterinario v : veterinarios) {
			if(v.getEspecialidade().equalsIgnoreCase(animal.getTipo())) {
				for(Animal a : animais) {
					if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
						a.setDoenca(doenca);
						for(Cliente c : clientes) {
							if(c.getCpf().equalsIgnoreCase(a.getDono().getCpf())) {
								c.animalDonca(animal, doenca);
								break;
							}
						}
						break;
					}
				}
				break;
			}
		}
	}
	public void inserirConsulta(Consulta consulta, Animal animal) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				a.inserirConsuta(consulta);
			}
		}
	}
	public Animal animalRetorna(String matricula) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(matricula)) {
				return a;
			}
		}
		return null;
	}


	public Cliente clienteRetorna(Cliente clienteT) {
		for(Cliente c : clientes) {
			if(c.getCpf().equalsIgnoreCase(clienteT.getCpf())) {
				return c;
			}
		}
		return clienteT;
	}
	public void numeroConsultas(Animal animal) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				ArrayList <Consulta> consultas = a.listarConsultas();
				System.out.println(consultas.size());
			}
		}
	}
}


