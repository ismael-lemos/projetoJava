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



	//		FUNÇÕES DE INSERIR

	public void inserirCliente(Cliente cliente){
		boolean clienteExiste = false;
		if(clientes.size() == 0) {
			clientes.add(cliente);
		}
		else {
			for(Cliente c : clientes) {
				if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					clienteExiste = true;
				}
			}
			if(clienteExiste == true) {
				System.out.println("\nCliente já Existe");
			}
			else {
				clientes.add(cliente);
				System.out.println("\nCliente Inserido com sucesso");
			}
		}
	}

	public void inserirAnimal(Animal animal, Cliente cliente){
		boolean clienteExiste = false;
		boolean animalExiste = false;
		for(Cliente c : clientes) {
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				clienteExiste = true;
				if(animais.size() == 0) {
					animais.add(animal);
					c.inserirAnimalEmC(animal);
					break;
				}
				else {
					for(Animal a: animais) {
						if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())){
							System.out.println("\nAnimal já existe");
							animalExiste = true;
							break;
						}
					}
					if(animalExiste == false) {
						animais.add(animal);
						c.inserirAnimalEmC(animal);
						System.out.println("\nAnimal inserido com Sucesso");
					}
				}
			}

		}
		if(clienteExiste = false) {
			System.out.println("\nCliente Não Existe!");
		}
	}



	public void inserirVeterinario(Veterinario veterinario){
		if(veterinarios.size() == 0){
			veterinarios.add(veterinario);
		}else{
			boolean existe = false;
			boolean especialidadeExiste = false;
			int cont = 0;
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
				for(Animal a : animais) {
					if(a.getTipo().equalsIgnoreCase(veterinario.getEspecialidade())) {
						cont++;
					}
				}
				if(especialidadeExiste == false){
					veterinarios.add(veterinario);
					System.out.println("\nVeterinario inserido com sucesso");
				}
				if(especialidadeExiste == true && cont >= 10) {
					veterinarios.add(veterinario);
				}
				if(especialidadeExiste == true && cont < 10) {
					System.out.println("\nNão temos " + veterinario.getEspecialidade() + "s suficientes para contratar outro veterinario");
				}
			}
			if(existe == true) {
				System.out.println("\nVeterinario já existe em nossos dados");
			}
		}
	} 


	public void inserirAnimaisDados(Animal animal, Cliente cliente) {
		animais.add(animal);
		cliente.getAnimais().add(animal);
	}

	public void inserirClienteDados(Cliente cliente) {
		clientes.add(cliente);
	}

	public void inserirVetDados(Veterinario vet) {
		veterinarios.add(vet);
	}

	//		FUNÇÕES DE REMOVER

	public void removerCliente(Cliente cliente){
		boolean clienteRemovido = false;
		boolean clienteExiste = false;
		Cliente cli = null;
		ArrayList<Animal> array = null;
		int cont = 0;
		for(Cliente c : clientes){
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf()) ){
				clienteExiste = true;
				cli = c;
				array = c.getAnimais();
				for(Animal a : array) {
					animais.remove(a);
					cont++;
				}
			}
		}
		if(array.size() == cont) {
			clientes.remove(cli);
			clienteRemovido = true;
			System.out.println("\nCliente Removido com Sucesso");
		}
		if(clienteExiste == false) {
			System.out.println("\nCliente não existe");
		}
		if(clienteRemovido = false) {
			System.out.println("\nCliente não foi removido");
		}
	}


	public void removerAnimal(Animal animal, Cliente cliente){
		boolean clienteExiste = false;
		boolean animalExiste = false;
		Animal ani = null;
		Cliente cli = null;
		for(Cliente  c : clientes) {
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				cli = c;
				clienteExiste = true;
				ArrayList<Animal> animaisCliente = c.getAnimais();
				for(Animal a : animaisCliente) {
					if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
						animalExiste = true;
						ani = a;	
					}
				}
			}

			if(clienteExiste = false) {
				System.out.println("Cliente não existe");
			}
			if(animalExiste = false) {
				System.out.println("Animal não existe");
			}
		}
		animais.remove(ani);
		cli.getAnimais().remove(ani);
		System.out.println("\nAnimal foi Removido");
		if(cli.getAnimais().size() == 0) {
			System.out.println("\nPor não conter mais animais cadastrados " + cli.getNome() + " foi removido");
			clientes.remove(cli);
		}
	}


	public void removerVeterinario(Veterinario veterinario){
		boolean veterinarioExiste = false;
		Veterinario vet = null;
		for(Veterinario v : veterinarios){
			if(v.getCpf().equalsIgnoreCase(veterinario.getCpf()) ){
				veterinarioExiste = true;
				vet = v;
				break;
			}
		}
		if(veterinarioExiste = false) {
			System.out.println("\nVeterinario não Existe");
		}
		if(veterinarioExiste = true) {
			System.out.println("\nVeterinario removido com sucesso");
			veterinarios.remove(vet);
		}
	}


	//			FUNÇÕES DE LISTAR
	public void listarAnimais(){
		if(animais.size() > 0) {
			System.out.println("\n================= Listando Animais =================\n");
			for(Animal a : animais){
				System.out.println("======= " + a.getTipo() + " =======" +
						"\nNome: " + a.getNome() + 
						"\nMatricula: " + a.getMatricula() + 
						"\nRaça: " + a.getRaca()+
						"\nTamanho: " + a.getTamanho() + 
						"\nPeso: " + a.getPeso() +
						"\nIdade: " + a.getIdade() +
						"\nGenero: " + a.getGenero() +
						"\nDoença: " + a.getDoenca() +
						"\nDono: " + a.getNomeDono() +"\n\n");
			}
		}
		else {
			System.out.println("Não temos animais cadastrados no momento");
		}
	}

	public void listarClientes(){
		if(clientes.size() > 0) {
			System.out.println("\n================= Listando Clientes =================\n");
			for(Cliente c : clientes){
				System.out.println("Nome: " + c.getNome() + 
						"\nCPF: " + c.getCpf() + 
						"\nRG: " + c.getRg() +
						"\nGenero: " + c.getGenero() + 
						"\nIdade: " + c.getIdade() +
						"\nEstado: " + c.getEstado() +
						"\nCidade: " + c.getCidade() +
						"\nCEP: " + c.getCep() +
						"\nEndereço: " + c.getEndereco() + "\n\n");
			}
		}
		else {
			System.out.println("Não temos clientes cadastrados no momento");
		}
	}


	public void listarVeterinarios(){
		if(veterinarios.size() > 0) {
			System.out.println("\n================= Listando Veterinários =================\n");
			for(Veterinario v : veterinarios){
				System.out.println("Nome: " + v.getNome() + 
						"\nCPF: " + v.getCpf() + 
						"\nEspecialidade: " + v.getEspecialidade() + 
						"\nIdade: " + v.getIdade() +
						"\nGenero: " + v.getGenero() + "\n\n");
			}
		}
		else {
			System.out.println("Não temos veterinários cadastrados no momento");
		}
	}


	public void listarAnimaisClientes(Cliente cliente){
		if(clientes.size() > 0) {
			for(Cliente c : clientes) {
				if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
					ArrayList <Animal> animaisCliente = c.getAnimais();
					if(animaisCliente.size() > 0) {
						System.out.println("\n================= Listando Animais do Cliente =================\n");
						for(Animal a : animaisCliente){
							System.out.println("Nome: " + a.getNome() + 
									"\nMatricula: " + a.getMatricula() + 
									"\nRaça: " + a.getRaca()+
									"\nTamanho: " + a.getTamanho() + 
									"\nPeso: " + a.getPeso() +
									"\nIdade: " + a.getIdade() +
									"\nGenero: " + a.getGenero() +
									"\nDoença: "+ a.getDoenca()+"\n\n");
						}
					}
					else {
						System.out.println("Esse Cliente não tem Animais Cadastrados no momento");
					}
				}

			}

		}
		else {
			System.out.println("Não temos clientes cadastrados no momento");
		}
	}


	public boolean veterinarioExiste(Animal animal){
		for(Veterinario v : veterinarios){
			if(v.getEspecialidade().equalsIgnoreCase(animal.getTipo())){
				return true;
			}
		}
		return false;
	}



	//				FUNÇÕES DE CONSULTAS
	public void historico(Animal animal) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				ArrayList <Consulta> consultas = a.getConsultas();
				if(consultas.size() > 0) {
					for(Consulta c : consultas) {
						System.out.print("\n============================== Consulta ==============================" +
								"\nNome: " + a.getNome() + "\t\t" + a.getTipo() + "(" + a.getRaca() + ") " +
								"\t\t\tMatricula " + a.getMatricula() +
								"\n\n\t\tIdade: " + a.getIdade() + ", Peso: " + a.getPeso() + ", Tamanho: " + a.getTamanho());
						System.out.println("\n\nDescrição: " + c.getDescricao() +
								"\n\n\t\tDoença Diagnosticada: " + c.getDoencaDiagnosticada() +
								"\n\nData: " + c.getData() + "\t\t\t\t\tDr(a): " + c.getNomeDoVeterinario());
					}
					break;
				}
				else {
					System.out.println("\nEsse não tem registro de consultas em nossa clinica");
				}
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
	


	//			FUNÇÕES DE ACESSO E RETORNO
	public boolean clienteNomeExiste(Cliente cliente) {
		for(Cliente c : clientes) {
			if(c.getNome().equalsIgnoreCase(cliente.getNome())) {
				return true;

			}

		}
		return false;
	}
	public String drAtende(String Tipo) {
		for(Veterinario v : veterinarios) {
			if(v.getEspecialidade().equalsIgnoreCase(Tipo)) {
				return v.getNome();
			}
		}
		return null;
	}
	
	public boolean clienteCpfExiste(Cliente cliente) {
		for(Cliente c : clientes) {
			if(c.getCpf().equalsIgnoreCase(cliente.getCpf())) {
				return true;
			}
		}
		return false;
	}

	public String testeCpf(String cpf) {
		boolean contemLetras = false;
		boolean contemEspacos = false;
		boolean diferenteDe11 = false;
		boolean contemSinais = false;
		if(cpf.length() == 11) {
			for(int i = 0; i < cpf.length(); i++){
				if(cpf.charAt(i) == 32) {
					contemEspacos = true;
				}
				if(cpf.charAt(i) > '9'){
					contemLetras = true;
				}
				if(cpf.charAt(i) < '0'){
					contemSinais = true;
				}
			}

		}
		if(cpf.length() < 11 || cpf.length() > 11) {
			diferenteDe11 = true;
			for(int i = 0; i < cpf.length(); i++){
				if(cpf.charAt(i) == 32) {
					contemEspacos = true;
				}
				if(cpf.charAt(i) > '9'){
					contemLetras = true;
				}
				if(cpf.charAt(i) < '0'){
					contemSinais = true;
				}
			}
		}
		if(diferenteDe11 == true && contemLetras == true || contemSinais == true || contemEspacos == true) {
			return "diferente de 11 e letras ou sinais ou espacos";
		}
		if(contemLetras == true || contemEspacos == true || contemSinais == true) {
			return "letras ou espacos ou sinais";
		}
		if(contemLetras == false && contemEspacos == false && diferenteDe11 == false && contemSinais == false) {
			return "aceito";
		}
		if(diferenteDe11 == true) {
			return "diferente de 11";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		}
		return "invalido";
	}


	public String nomeSobrenome(String nome) {
		boolean teste = false;
		if(nome.length() >= 7){
			for(int i = 0; i < nome.length(); i++){
				if(nome.charAt(i) == 32 && nome.charAt(i+1) == 32){
					return "mais de um espaco";
				}
				if(nome.charAt(i) > 47 && nome.charAt(i) < 58){
					teste = false;
					return "contem numeros";
				}
				if(nome.charAt(i) <= 47 && nome.charAt(i) >= 58){
					teste = true;
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

	public Cliente donoAnimal(Animal animal) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(animal.getMatricula())) {
				return a.getDono();
			}
		}
		return null;
	}

	public Veterinario retornaVeterinario(Veterinario vet) {
		for(Veterinario v : veterinarios) {
			if(v.getCpf().equalsIgnoreCase(vet.getCpf())) {
				return v;
			}
		}
		return null;
	}


	public String testeRg(String rg) {
		if(rg.length() == 9){
			for(int i = 0; i < rg.length(); i++){
				if(rg.charAt(i) < '0') {
					return "contem sinais";

				}
				if(rg.charAt(i) > '9'){
					return "contem letras";
				}
			}
		}
		else{
			for(int i = 0; i < rg.length(); i++){
				if(rg.charAt(i) < '0') {
					return "diferente de 9 e contem sinais";

				}
				if(rg.charAt(i) > '9'){
					return "diferente de 9 e contem letras";
				}
			}
			return "diferente de 9";
		}
		return "aceito";
	}
	public String testeIdade(String idade) {
		if(idade.length() <= 3) {
			for(int i = 0; i < idade.length(); i++) {
				if(idade.charAt(i) < '0') {
					return "contem sinais";

				}
				if(idade.charAt(i) > '9'){
					return "contem letras";
				}
			}
			int var = Integer.parseInt(idade);
			if(var > 150) {
				return "idade muito alta";
			}
			if(var < 18) {
				return "menor de idade";
			}
			return "aceito";
		}
		else {
			return "valor invalido";
		}
	}
	public String testeGenero(String genero) {
		if(genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("feminino")) {
			return "aceito";
		}
		else {
			return "invalido";
		}
	}
	public String testeIdadeAnimal(String idadeA) {
		if(idadeA.length() <= 2) {
			for(int i = 0; i < idadeA.length(); i++) {
				if(idadeA.charAt(i) < '0') {
					return "contem sinais";

				}
				if(idadeA.charAt(i) > '9'){
					return "contem letras";
				}
			}
			float var = Float.parseFloat(idadeA);
			if(var > 40) {
				return "idade muito alta";
			}
			if(var < 0) {
				return "valor invalido";
			}
			return "aceito";
		}
		else {
			return "valor invalido";
		}
	}
	public String testePav(String nomeA) {
		if(nomeA.length() >= 2) {
			for(int i = 0; i < nomeA.length(); i++) {
				if(nomeA.charAt(i) <= '9' && nomeA.charAt(i) != 32) {
					return "numero ou sinal";
				}
			}
			return "aceito";
		}
		return "invalido";
	}
	
	public String testeCep(String cep) {
		if(cep.length() == 8) {
			for(int i = 0; i < cep.length(); i++) {
				if(cep.charAt(i) < '0' || cep.charAt(i) > '9') {
					return "contem sinais ou letras";
				}
			}
			return "aceito";
		}
		else {
			return "cep invalido";
		}
		
	}
	
	public String testeTamanho(String tamanho) {
		boolean pontoExiste = false;
		if(tamanho.length() <= 4 && tamanho.length() != 0) {
			for(int i = 0; i < tamanho.length(); i++) {
				if(tamanho.charAt(i) < '0' && tamanho.charAt(i) != '.') {
					return "contem sinais";

				}
				if(tamanho.charAt(i) > '9'){
					return "contem letras";
				}

			}

			float var = Float.parseFloat(tamanho);
			if(var > 1.50f 	|| var <= 0f) {
				return "tamanho invalido";
			}
			return "aceito";

		}
		return "invalido";
	}
	public String testePeso(String peso) {
		boolean pontoExiste = false;
		if(peso.length() <= 6 && peso.length() != 0) {
			for(int i = 0; i < peso.length(); i++) {
				if(peso.charAt(i) < '0' && peso.charAt(i) != '.') {
					return "contem sinais";

				}
				if(peso.charAt(i) > '9'){
					return "contem letras";
				}

			}

			float var = Float.parseFloat(peso);
			if(var > 160.0f 	|| var <= 0f) {
				return "peso invalido";
			}
			return "aceito";

		}
		return "invalido";
	}
	public boolean especialidadeExiste(String especialidade) {
		if("Cachorro".equalsIgnoreCase(especialidade) || "Gato".equalsIgnoreCase(especialidade) || "Coelho".equalsIgnoreCase(especialidade) || "Hamster".equalsIgnoreCase(especialidade) || "Porquinho".equalsIgnoreCase(especialidade)) {
			return true;
		}
		return false;
	}
	public boolean nomeAnimal(String nomeA) {
		for(Animal a : animais) {
			if(a.getNome().equalsIgnoreCase(nomeA)) {
				return true;
			}
		}
		return false;
	}
	public boolean matriculaExiste(String matricula) {
		for(Animal a : animais) {
			if(a.getMatricula().equalsIgnoreCase(matricula)) {
				return true;
			}
		}
		return false;
	}
	public boolean nomeVet(String nomeV) {
		for(Veterinario v : veterinarios) {
			if(v.getNome().equalsIgnoreCase(nomeV)) {
				return true;
			}
		}
		return false;
	}

	public boolean cpfVet(String cpf) {
		for(Veterinario v : veterinarios) {
			if(v.getCpf().equalsIgnoreCase(cpf)) {
				return true;
			}
		}
		return false;
	}
}


