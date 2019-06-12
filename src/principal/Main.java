package principal;

import Pessoas.*;
import animais.*;
import classes_auxiliares.*;

import java.util.Scanner;


/**
 *
 * @author Ismael de Oliveira
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variaveis implementadas
		int n = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
		String nome, nomeA, raca, end, cpf = "0", rg, genero, generoA, matricula, especialidade, doenca; 
		String op = "0", op1 = "0", op2 = "0", op3 = "0", op4 = "0", op5 = "0";
		int idade, idadeA, idadeV;
		float peso, tamanho;
		boolean teste = false;
		Consulta consulta = new Consulta();
		Administracao admin = new Administracao();

		Veterinario v1 = new Veterinario();
		v1.setNome("Emanuel Augusto");
		v1.setIdade(29);
		v1.setGenero("Masculino");
		v1.setEspecialidade("Cachorro");
		v1.setCpf("08576013302");
		admin.inserirVeterinario(v1);

		Veterinario v2 = new Veterinario();
		v2.setNome("Fernada Guilherme");
		v2.setIdade(20);
		v2.setGenero("Feminino");
		v2.setEspecialidade("Gato");
		v2.setCpf("08476514304");
		admin.inserirVeterinario(v2);

		Veterinario v3 = new Veterinario();
		v3.setNome("Carlos Eduardo");
		v3.setIdade(20);
		v3.setGenero("Masculino");
		v3.setEspecialidade("Hamster");
		v3.setCpf("08175514909");
		admin.inserirVeterinario(v3);

		Cliente c1 = new Cliente();
		c1.setNome("Ismael de Oliveira");
		c1.setCpf("32142435507");
		c1.setRg("005254370");
		c1.setEndereco("Rua Lírio dos Vales");
		c1.setGenero("Masculino");
		c1.setIdade(22);
		admin.inserirCliente(c1);

		Cachorro ca = new Cachorro();
		ca.setNome("Flock");
		ca.setMatricula("2000");
		ca.setGenero("Masculino");
		ca.setIdade(3.4f);
		ca.setPeso(40.0f);
		ca.setTamanho(1.0f);
		ca.setRaca("chihuahua");
		ca.setTipo("Cachorro");
		ca.setDono(c1);
		admin.inserirAnimal(ca, c1);

		Gato g1 = new Gato();
		g1.setNome("Nego");
		g1.setMatricula("3000");
		g1.setGenero("Masculino");
		g1.setIdade(1.2f);
		g1.setPeso(7.0f);
		g1.setTamanho(0.6f);
		g1.setRaca("bombaim");
		g1.setTipo("Gato");
		g1.setDono(c1);
		admin.inserirAnimal(g1, c1);

		Cliente c2 = new Cliente();
		c2.setNome("Plácido Neto");
		c2.setCpf("42145435517");
		c2.setRg("007258376");
		c2.setEndereco("Av. Senador Salgado Filho");
		c2.setGenero("Masculino");
		c2.setIdade(23);
		admin.inserirCliente(c2);

		Coelho co = new Coelho();
		co.setNome("Xena");
		co.setMatricula("4000");
		co.setGenero("Masculino");
		co.setIdade(1.0f);
		co.setPeso(3.0f);
		co.setTamanho(0.5f);
		co.setRaca("Polish");
		co.setTipo("Coelho");
		co.setDono(c2);
		admin.inserirAnimal(co, c2);
		while(n == 0){

			System.out.println("========== MENU ==========");
			System.out.println("01) Inserir");
			System.out.println("02) Remover");
			System.out.println("03) Opções de Consulta");                                                                                                                                                                                                                                                                                                                                               
			System.out.println("04) Listar");
			System.out.println("05) Sair\n\n");
			System.out.print("\nDigite a opção desejada: ");

			op = sc.next();

			switch (op) {
			case "1":
				while(n1 == 0){
					System.out.println("========== MENU ==========");
					System.out.println("01) Inserir um Novo Cliente");
					System.out.println("02) Inserir um Novo Animal");
					System.out.println("03) inserir um Novo Veterinário");
					System.out.println("04) Voltar\n\n");
					System.out.print("Digite a opção desejada: ");
					op1 = sc.next();

					sc = new Scanner(System.in);
					switch (op1){
					case "1":
						System.out.println("========== Cliente ==========");
						Cliente cliente = new Cliente();
						nome = "nome";
						while(admin.nomeSobrenome(nome) != "aceito") {
							System.out.print("\nDigite o nome e Sobrenome do cliente: ");
							nome = sc.nextLine();
							if(admin.nomeSobrenome(nome) == "aceito") {
								cliente.setNome(nome);
							}
							if(admin.nomeSobrenome(nome) == "contem numeros") {
								System.out.println("\nO nome não deve conter Números");
							}
							if(admin.nomeSobrenome(nome) == "mais de um espaco") {
								System.out.println("Você está usando mais de um espaço");
							}
							else { 
								System.out.println("\nEsse campo deve conter nome e sobrenome");
							}

						}
						while(teste == false){
							System.out.print("\nDigite seu CPF: ");
							cpf = sc.next();
							if(cpf.length() == 11) {
								if(admin.testeCpf(cpf) == true) {
									cliente.setCpf(cpf);
									teste = true;
								}
								else {
									System.out.println("\nO CPF deve conter apenas números");
								}
							}

							if(cpf.length() != 11 && admin.testeCpf(cpf) == false) {
								System.out.println("\nO CPF deve conter 11 números e não code ponter letras");
							}
							else {
								System.out.println("\nO CPF deve conter 11 números");
							}
						}

						System.out.print("\nDigite seu RG: ");
						rg = sc.next();
						cliente.setRg(rg);
						System.out.print("\nDigite a idade: ");
						int idadeC = sc.nextInt();
						cliente.setIdade(idadeC);
						sc = new Scanner(System.in);
						System.out.print("\nDigite o endereÃ§o do cliente: ");
						end = sc.nextLine();
						cliente.setEndereco(end);
						System.out.print("\nDigite seu Genero: ");
						genero = sc.next();
						cliente.setGenero(genero);


						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite a idade: ");
						idadeA = sc.nextInt();
						System.out.print("\nDigite seu Genero ");
						generoA = sc.next();
						System.out.print("\nDigite seu Tamanho: ");
						tamanho = sc.nextFloat();
						System.out.print("\nDigite o Peso do Animal: ");
						peso = sc.nextFloat();
						sc = new Scanner(System.in);
						System.out.print("\nDigite a raça: ");
						raca = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.nextLine();

						while(n5 == 0){
							System.out.println("========== Tipo ==========");
							System.out.println("01) Cachorro");
							System.out.println("02) Gato");
							System.out.println("03) Coelho");
							System.out.println("04) Hamster");
							System.out.println("05) Porquinho da india");
							System.out.println("06) outro");
							System.out.print("\n\nDigite a opcao desejada: ");
							sc = new Scanner(System.in);
							op5 = sc.next();
							switch(op5){
							case "1":
								Cachorro cachorro = new Cachorro();
								cachorro.setNome(nomeA);
								cachorro.setIdade(idadeA);
								cachorro.setTamanho(tamanho);
								cachorro.setPeso(peso);
								cachorro.setMatricula(matricula);
								cachorro.setRaca(raca);
								cachorro.setGenero(generoA);
								cachorro.setTipo("Cachorro");
								cachorro.setDono(cliente);
								admin.inserirCliente(cliente);
								admin.inserirAnimal(cachorro, cliente);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");

								break;

							case "2":
								Gato gato = new Gato();
								gato.setNome(nomeA);
								gato.setIdade(idadeA);
								gato.setTamanho(tamanho);
								gato.setPeso(peso);
								gato.setMatricula(matricula);
								gato.setRaca(raca);
								gato.setGenero(generoA);
								gato.setTipo("Gato");
								gato.setDono(cliente);
								admin.inserirCliente(cliente);
								admin.inserirAnimal(gato, cliente);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;

							case "3":
								Coelho coelho = new Coelho();
								coelho.setNome(nomeA);
								coelho.setIdade(idadeA);
								coelho.setTamanho(tamanho);
								coelho.setPeso(peso);
								coelho.setMatricula(matricula);
								coelho.setRaca(raca);
								coelho.setTipo("Coelho");
								coelho.setGenero(generoA);
								coelho.setDono(cliente);
								admin.inserirCliente(cliente);
								admin.inserirAnimal(coelho, cliente);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;

							case "4":
								Hamster hamster = new Hamster();
								hamster.setNome(nomeA);
								hamster.setIdade(idadeA);
								hamster.setTamanho(tamanho);
								hamster.setPeso(peso);
								hamster.setMatricula(matricula);
								hamster.setRaca(raca);
								hamster.setTipo("Hamster");
								hamster.setGenero(generoA);
								hamster.setDono(cliente);
								admin.inserirCliente(cliente);
								admin.inserirAnimal(hamster, cliente);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;

							case "5":
								PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
								porquinho.setNome(nomeA);
								porquinho.setIdade(idadeA);
								porquinho.setTamanho(tamanho);
								porquinho.setPeso(peso);
								porquinho.setMatricula(matricula);
								porquinho.setRaca(raca);
								porquinho.setGenero(generoA);
								porquinho.setTipo("Porquinho");
								porquinho.setDono(cliente);
								admin.inserirCliente(cliente);
								admin.inserirAnimal(porquinho, cliente);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;
							case "6":
								System.out.println("\n\nDeculpe! no momento não estamos atendendo outro tipo de Animal.\n");
								break;
							}
							n5 = 1;
						}
						n5 = 0;
						continue;

					case "2":
						System.out.println("========== Cliente ==========");
						Cliente clienteT = new Cliente();
						while(admin.clienteNomeExiste(clienteT) == false) {
							System.out.print("\nDigite o nome do Cliente: ");
							nome = sc.nextLine();
							clienteT.setNome(nome);
							if(admin.clienteNomeExiste(clienteT) == false) {
								System.out.println("\nO Nome do Cliente está incorreto");
							}

						}
						while(admin.clienteCpfExiste(clienteT) == false) {
							System.out.print("\nDigite o CPF do Cliente: ");
							cpf = sc.nextLine();
							clienteT.setCpf(cpf);
							if(admin.clienteCpfExiste(clienteT) == false) {
								System.out.println("\nO CPF digitado está incorreto");
							}
						}
						sc = new Scanner(System.in);
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						nomeA = sc.nextLine();
						System.out.print("\nDigite seu Tamanho: ");
						tamanho = sc.nextFloat();
						System.out.print("\nDigite seu Peso: ");
						peso = sc.nextFloat();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						System.out.print("\nDigite a idade: ");
						idadeA = sc.nextInt();
						System.out.print("\nDigite o seu Genero ");
						generoA = sc.next();
						sc = new Scanner(System.in);
						System.out.print("\nDigite a raca: ");
						raca = sc.nextLine();
						clienteT = admin.clienteRetorna(clienteT);
						while(n5 == 0){
							System.out.println("========== Tipo ==========");
							System.out.println("01) Cachorro");
							System.out.println("02) Gato");
							System.out.println("03) Coelho");
							System.out.println("04) Hamster");
							System.out.println("05) Porquinho da india");
							System.out.println("06) outro");
							System.out.print("\n\nDigite a opção desejada: ");
							sc = new Scanner(System.in);
							op5 = sc.next();
							switch(op5){
							case "1":
								Cachorro cachorro = new Cachorro();
								cachorro.setNome(nomeA);
								cachorro.setIdade(idadeA);
								cachorro.setTamanho(tamanho);
								cachorro.setPeso(peso);
								cachorro.setMatricula(matricula);
								cachorro.setRaca(raca);
								cachorro.setGenero(generoA);
								cachorro.setTipo("Cachorro");
								cachorro.setDono(clienteT);
								admin.inserirAnimal(cachorro, clienteT);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;


							case "2":
								Gato gato = new Gato();
								gato.setNome(nomeA);
								gato.setIdade(idadeA);
								gato.setTamanho(tamanho);
								gato.setPeso(peso);
								gato.setMatricula(matricula);
								gato.setGenero(generoA);
								gato.setRaca(raca);
								gato.setTipo("Gato");
								gato.setDono(clienteT);
								admin.inserirAnimal(gato, clienteT);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;
							case "3":
								Coelho coelho = new Coelho();
								coelho.setNome(nomeA);
								coelho.setIdade(idadeA);
								coelho.setTamanho(tamanho);
								coelho.setPeso(peso);
								coelho.setMatricula(matricula);
								coelho.setGenero(generoA);
								coelho.setRaca(raca);
								coelho.setTipo("Coelho");
								coelho.setDono(clienteT);
								admin.inserirAnimal(coelho, clienteT);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;
							case "4":
								Hamster hamster = new Hamster();
								hamster.setNome(nomeA);
								hamster.setIdade(idadeA);
								hamster.setTamanho(tamanho);
								hamster.setPeso(peso);
								hamster.setMatricula(matricula);
								hamster.setGenero(generoA);
								hamster.setRaca(raca);
								hamster.setDono(clienteT);
								admin.inserirAnimal(hamster, clienteT);
								hamster.setTipo("Hamster");
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;

							case "5":
								PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
								porquinho.setNome(nomeA);
								porquinho.setIdade(idadeA);
								porquinho.setTamanho(tamanho);
								porquinho.setPeso(peso);
								porquinho.setMatricula(matricula);
								porquinho.setGenero(generoA);
								porquinho.setRaca(raca);
								porquinho.setDono(clienteT);
								porquinho.setTipo("Porquinho");
								admin.inserirAnimal(porquinho, clienteT);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;
							case "6":
								System.out.println("\n\nDeculpe! no momento não estamos atendendo outro tipo de Animal.\n");
								break;
							}
							n5 = 1;
						}
						n5 = 0;
						continue;
					case "3":  
						System.out.println("========== Veterinário ==========");
						Veterinario veterinario = new Veterinario();
						System.out.print("\nDigite o Nome do VeterinÃ¡rio: ");
						nome = sc.nextLine();
						veterinario.setNome(nome);
						System.out.print("\nDigite seu CPF: ");
						cpf = sc.next();
						veterinario.setCpf(cpf);
						System.out.print("\nDigite seu Genero: ");
						genero = sc.next();
						veterinario.setGenero(genero);
						sc = new Scanner(System.in);
						System.out.print("\nDigite a sua Especialidade: ");
						especialidade = sc.nextLine();
						veterinario.setEspecialidade(especialidade);
						System.out.print("\nDigite a idade: ");
						idadeV = sc.nextInt();
						veterinario.setIdade(idadeV);



						admin.inserirVeterinario(veterinario);
						System.out.println("\nNovo VeterinÃ¡rio inserido com Sucesso\n\n");
						continue;
					case "4":
						n1 = 1;
					}
				}
				n1 = 0;
				break;
			case "2":
				while(n2 == 0){
					System.out.println("========== MENU ==========");
					System.out.println("01) Remover um Cliente");
					System.out.println("02) Remover um Animal");
					System.out.println("03) Remover um Veterinario");
					System.out.println("04) Voltar");
					System.out.print("\nDigite a opção desejada: ");
					op2 = sc.next();
					switch (op2){
					case "1":
						System.out.println("========== Cliente ==========");
						Cliente clienteT = new Cliente();
						System.out.print("\nDigite o Nome do Cliente: ");
						sc = new Scanner(System.in);
						nome = sc.nextLine();
						clienteT.setNome(nome);
						System.out.print("\nDigite seu CPF: ");
						cpf = sc.next();
						clienteT.setCpf(cpf);
						admin.removerCliente(clienteT);
						System.out.println("\n\nCliente removido com Sucesso\n\n");
						continue;
						
					case "2":
						Cliente clienteT2 = new Cliente();
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						clienteT2 = admin.clienteRetorna(clienteT2);
						if(admin.tipoAnimal(matricula) == "Cachorro") {
							Cachorro cachorro = new Cachorro();
							cachorro.setNome(nomeA);
							cachorro.setMatricula(matricula);
							admin.removerAnimal(cachorro, clienteT2);
						}
						if(admin.tipoAnimal(matricula) == "Gato") {
							Gato gato = new Gato();
							gato.setNome(nomeA);
							gato.setMatricula(matricula);
							admin.removerAnimal(gato, clienteT2);
						}
						if(admin.tipoAnimal(matricula) == "Coelho") {
							Coelho coelho = new Coelho();
							coelho.setNome(nomeA);
							coelho.setMatricula(matricula);
							admin.removerAnimal(coelho, clienteT2);
						}
						if(admin.tipoAnimal(matricula) == "Hamster") {
							Hamster hamster = new Hamster();
							hamster.setNome(nomeA);
							hamster.setMatricula(matricula);
							admin.removerAnimal(hamster, clienteT2);
						}
						if(admin.tipoAnimal(matricula) == "Porquinho") {
							PorquinhoDaIndia Porquinho = new PorquinhoDaIndia();
							Porquinho.setNome(nomeA);
							Porquinho.setMatricula(matricula);
							admin.removerAnimal(Porquinho, clienteT2);
						}
						else {
							System.out.println("Deu ruim");
						}


						System.out.println("\n\nAnimal removido com Sucesso\n\n");
						continue;
					case "3":
						System.out.println("========== Veterinário ==========");
						Veterinario vet = new Veterinario();
						System.out.print("\nDigite o Nome do Veterinario: ");
						sc = new Scanner(System.in);
						nome = sc.nextLine();
						vet.setNome(nome);
						System.out.print("\nDigite seu CPF: ");
						cpf = sc.next();
						vet.setCpf(cpf);
						admin.removerVeterinario(vet);
						System.out.println("\n\nVeterinÃ¡rio removido com Sucesso\n\n");
						continue;
					case "4":
						n2 = 1;
					}
				}
				n2 = 0;
				break;
			case "3":
				while(n3 == 0){
					System.out.println("========== MENU ==========");
					System.out.println("01) Ver Historico");
					System.out.println("02) Iniciar consuta");
					System.out.println("03) Iniciar Tratamento");
					System.out.println("04) Voltar");
					System.out.print("\n\nDigite a opção desejada: ");
					op3 = sc.next();

					switch (op3){
					case "1":
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						
						if(admin.tipoAnimal(matricula) == "Cachorro") {
							Cachorro cachorro = new Cachorro();
							cachorro.setNome(nomeA);
							cachorro.setMatricula(matricula);
							admin.historico(cachorro);
						}
						if(admin.tipoAnimal(matricula) == "Gato") {
							Gato gato = new Gato();
							gato.setNome(nomeA);
							gato.setMatricula(matricula);
							admin.historico(gato);
						}
						if(admin.tipoAnimal(matricula) == "Coelho") {
							Coelho coelho = new Coelho();
							coelho.setNome(nomeA);
							coelho.setMatricula(matricula);
							admin.historico(coelho);
						}
						if(admin.tipoAnimal(matricula) == "Hamster") {
							Hamster hamster = new Hamster();
							hamster.setNome(nomeA);
							hamster.setMatricula(matricula);
							admin.historico(hamster);
						}
						if(admin.tipoAnimal(matricula) == "Porquinho") {
							PorquinhoDaIndia Porquinho = new PorquinhoDaIndia();
							Porquinho.setNome(nomeA);
							Porquinho.setMatricula(matricula);
							admin.historico(Porquinho);
						}
						else {
							System.out.println("Deu ruim");
						}
						n5 = 1;

						continue;
					case "2":
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						sc = new Scanner(System.in);
						System.out.println("\n========== Consulta ==========");
						sc = new Scanner(System.in);
						System.out.print("\nDigite a data da consulta: ");
						String data = sc.nextLine();
						consulta.setData(data);
						System.out.print("\nDigite a descrição da consulta: ");
						String descricao = sc.nextLine();
						consulta.setDescricao(descricao);
						System.out.print("\nDigite a doença diagnosticada:");
						doenca = sc.nextLine();
						consulta.setDoencaDiagnosticada(doenca);

						if(admin.tipoAnimal(matricula) == "Cachorro") {
							Cachorro cachorro = new Cachorro();
							cachorro.setNome(nomeA);
							cachorro.setMatricula(matricula);
							admin.iniciarConsulta(cachorro, doenca);
							admin.inserirConsulta(consulta, cachorro);
							System.out.println("Entrou aqui");
						}

						if(admin.tipoAnimal(matricula) == "Gato") {
							Gato gato = new Gato();
							gato.setNome(nomeA);
							gato.setMatricula(matricula);
							admin.iniciarConsulta(gato, doenca);
							admin.inserirConsulta(consulta, gato);
						}

						if(admin.tipoAnimal(matricula) == "Coelho") {
							Coelho coelho = new Coelho();
							coelho.setNome(nomeA);
							coelho.setMatricula(matricula);
							admin.iniciarConsulta(coelho, doenca);
							admin.inserirConsulta(consulta, coelho);
						}

						if(admin.tipoAnimal(matricula) == "Hamster") {
							Hamster hamster = new Hamster();
							hamster.setNome(nomeA);
							hamster.setMatricula(matricula);
							admin.iniciarConsulta(hamster, doenca);
							admin.inserirConsulta(consulta, hamster);
						}

						if(admin.tipoAnimal(matricula) == "Porquinho") {
							PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
							porquinho.setNome(nomeA);
							porquinho.setMatricula(matricula);
							admin.iniciarConsulta(porquinho, doenca);
							admin.inserirConsulta(consulta, porquinho);
						}
						else {
							System.out.println("Deu ruim");
						}
						continue;
					case "3":
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						
						if(admin.tipoAnimal(matricula) == "Cachorro") {
							Cachorro cachorro = new Cachorro();
							cachorro.setNome(nomeA);
							cachorro.setMatricula(matricula);
							admin.tratamenteto(cachorro);
							System.out.println("Entrou aqui");
						}

						if(admin.tipoAnimal(matricula) == "Gato") {
							Gato gato = new Gato();
							gato.setNome(nomeA);
							gato.setMatricula(matricula);
							admin.tratamenteto(gato);
						
						}

						if(admin.tipoAnimal(matricula) == "Coelho") {
							Coelho coelho = new Coelho();
							coelho.setNome(nomeA);
							coelho.setMatricula(matricula);
							admin.tratamenteto(coelho);
						
						}

						if(admin.tipoAnimal(matricula) == "Hamster") {
							Hamster hamster = new Hamster();
							hamster.setNome(nomeA);
							hamster.setMatricula(matricula);
							admin.tratamenteto(hamster);
							
						}

						if(admin.tipoAnimal(matricula) == "Porquinho") {
							PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
							porquinho.setNome(nomeA);
							porquinho.setMatricula(matricula);
							admin.tratamenteto(porquinho);
						
						}
						else {
							System.out.println("Deu ruim");
						}
						
						continue;
					case "4":
						n3 = 1;
					}
				}
				n3 = 0;
				break;
			case "4":
				while(n4 == 0){
					System.out.println("========== MENU ==========");
					System.out.println("01) Listar Animais Cadastrados");
					System.out.println("02) Listar Animais do Cliente");
					System.out.println("03) Listar Clientes Cadastrados");
					System.out.println("04) Listar veterinÃ¡rios Cadastrados na Clinica");
					System.out.println("05) Voltar");
					System.out.print("\n\nDigite a opção desejada: ");
					op4 = sc.next();
					switch (op4){
					case "1":
						admin.listarAnimais();
						continue;
						
					case "2":
						System.out.println("========== Cliente ==========");
						Cliente clienteT = new Cliente();
						System.out.print("\nDigite o nome do Cliente: ");
						sc = new Scanner(System.in);
						nome = sc.nextLine();
						clienteT.setNome(nome);
						System.out.print("\nDigite seu CPF: ");
						cpf = sc.next();
						clienteT.setCpf(cpf);
						System.out.print("\nDigite seu RG: ");
						rg = sc.next();
						clienteT.setRg(rg);
						System.out.print("\n\n");
						admin.listarAnimaisClientes(clienteT);
						continue;
						
					case "3":
						System.out.println("==Listando Clientes Cadastrados==");
						admin.listarClientes();
						continue;
						
					case "4":
						System.out.println("==Listando Veterinarios Cadastrados==");
						admin.listarVeterinarios();
						continue;
						
					case "5":
						n4 = 1;

					}
				}
				n4 = 0;
				break;
			case "5":
				n = 1;
			}
		}
		System.out.println("\n\nPrograma Encerrado\n\n");
	}
}
