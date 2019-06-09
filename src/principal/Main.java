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
								admin.inserirCliente(cliente);
								admin.inserirAnimal(porquinho, cliente);
								System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
								break;
							case "6":
								System.out.println("\n\nDeculpe! no momento nao estamos atendendo outro tipo de Animal.\n");
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
						System.out.println("========== VeterinÃ¡rio ==========");
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
						System.out.print("\nDigite seu RG: ");
						rg = sc.next();
						clienteT.setRg(rg);
						//Adcionar função
						System.out.println("\n\nCliente removido com Sucesso\n\n");
						continue;
					case "2":
						System.out.println("========== Cliente ==========");
						System.out.print("\nDigite o nome do Cliente: ");
						sc = new Scanner(System.in);
						nome = sc.nextLine();
						System.out.print("\nDigite o seu CPF: ");
						cpf = sc.next();
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						//Adcionar switch case

						System.out.println("\n\nAnimal removido com Sucesso\n\n");
						continue;
					case "3":
						System.out.println("========== VeterinÃ¡rio ==========");
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
						Cliente clienteT = new Cliente();
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						System.out.print("\nDigite o Nome do Cliente: ");
						String nomeC = sc.nextLine();
						clienteT.setNome(nomeC);
						System.out.print("\nDigite seu CPF: ");
						cpf = sc.nextLine();
						clienteT.setCpf(cpf);
						while(n5 == 0){
							System.out.println("========== Tipo ==========");
							System.out.println("01) Cachorro");
							System.out.println("02) Gato");
							System.out.println("03) Coelho");
							System.out.println("04) Hamster");
							System.out.println("05) Porquinho da india");
							System.out.print("\n\nDigite a opção desejada: ");
							sc = new Scanner(System.in);
							op5 = sc.next();
							switch(op5){
							case "1":
								Cachorro cachorro = new Cachorro();
								cachorro.setNome(nomeA);
								cachorro.setMatricula(matricula);
								cachorro.setTipo("Cachorro");
								admin.historico(cachorro);
								break;


							case "2":
								Gato gato = new Gato();
								gato.setNome(nomeA);
								gato.setMatricula(matricula);
								gato.setTipo("Gato");
								admin.historico(gato);
								break;
							case "3":
								Coelho coelho = new Coelho();
								coelho.setNome(nomeA);
								coelho.setMatricula(matricula);
								coelho.setTipo("Coelho");
								admin.historico(coelho);
								break;
							case "4":
								Hamster hamster = new Hamster();
								hamster.setNome(nomeA);
								hamster.setMatricula(matricula);
								hamster.setTipo("Hamster");
								admin.historico(hamster);
								break;

							case "5":
								PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
								porquinho.setNome(nomeA);
								porquinho.setMatricula(matricula);
								porquinho.setTipo("Porquinho");
								admin.historico(porquinho);
								break;
							}
							n5 = 1;
						}
						n5 = 0;
						continue;
					case "2":
						Cliente clienteT2 = new Cliente();
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						sc = new Scanner(System.in);
						System.out.println("\n========== Cliente ==========");
						System.out.print("\nDigite o nome do Cliente: ");
						nomeC = sc.nextLine();
						clienteT2.setNome(nomeC);
						System.out.print("\nDigite o CPF do Cliente: ");
						cpf = sc.next();
						clienteT2.setCpf(cpf);
						sc = new Scanner(System.in);
						System.out.print("\nDigite a data da consulta: ");
						String data = sc.nextLine();
						System.out.print("\nDigite a doença do Animal:");
						doenca = sc.nextLine();
						while(n5 == 0){
							System.out.println("========== Tipo ==========");
							System.out.println("01) Cachorro");
							System.out.println("02) Gato");
							System.out.println("03) Coelho");
							System.out.println("04) Hamster");
							System.out.println("05) Porquinho da india");
							System.out.print("\n\nDigite a opção desejada: ");
							sc = new Scanner(System.in);
							op5 = sc.next();
							switch(op5){
							case "1":
								Cachorro cachorro = new Cachorro();
								cachorro.setNome(nomeA);
								cachorro.setMatricula(matricula);
								cachorro.setTipo("Cachorro");
								consulta.iniciarConsulta(cachorro, doenca);
								break;


							case "2":
								Gato gato = new Gato();
								gato.setNome(nomeA);
								gato.setMatricula(matricula);
								gato.setTipo("Gato");
								consulta.iniciarConsulta(gato, doenca);
								break;
							case "3":
								Coelho coelho = new Coelho();
								coelho.setNome(nomeA);
								coelho.setMatricula(matricula);
								coelho.setTipo("Coelho");
								consulta.iniciarConsulta(coelho, doenca);
								break;
							case "4":
								Hamster hamster = new Hamster();
								hamster.setNome(nomeA);
								hamster.setMatricula(matricula);
								hamster.setTipo("Hamster");
								consulta.iniciarConsulta(hamster, doenca);
								break;

							case "5":
								PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
								porquinho.setNome(nomeA);
								porquinho.setMatricula(matricula);
								porquinho.setTipo("Porquinho");
								consulta.iniciarConsulta(porquinho, doenca);
								break;
							}
							n5 = 1;
						}
						n5 = 0;
						continue;
					case "3":
						Cliente clienteT3 = new Cliente();
						System.out.println("\n========== Animal ==========");
						System.out.print("\nDigite o Nome do Animal: ");
						sc = new Scanner(System.in);
						nomeA = sc.nextLine();
						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();
						System.out.println("\n========== Cliente ==========");
						System.out.print("\nDigite o nome do Cliente: ");
						nomeC = sc.nextLine();
						clienteT3.setNome(nomeC);
						System.out.print("\nDigite o CPF do Cliente: ");
						sc = new Scanner(System.in);
						cpf = sc.next();
						clienteT3.setCpf(cpf);
						while(n5 == 0){
							System.out.println("========== Tipo ==========");
							System.out.println("01) Cachorro");
							System.out.println("02) Gato");
							System.out.println("03) Coelho");
							System.out.println("04) Hamster");
							System.out.println("05) Porquinho da india");
							System.out.print("\n\nDigite a opção desejada: ");
							sc = new Scanner(System.in);
							op5 = sc.next();
							switch(op5){
							case "1":
								Cachorro cachorro = new Cachorro();
								cachorro.setNome(nomeA);
								cachorro.setMatricula(matricula);
								cachorro.setTipo("Cachorro");
								consulta.tratamento(cachorro);
								break;


							case "2":
								Gato gato = new Gato();
								gato.setNome(nomeA);
								gato.setMatricula(matricula);
								gato.setTipo("Gato");
								consulta.tratamento(gato);
								break;
							case "3":
								Coelho coelho = new Coelho();
								coelho.setNome(nomeA);
								coelho.setMatricula(matricula);
								coelho.setTipo("Coelho");
								consulta.tratamento(coelho);
								break;
							case "4":
								Hamster hamster = new Hamster();
								hamster.setNome(nomeA);
								hamster.setMatricula(matricula);
								hamster.setTipo("Hamster");
								consulta.tratamento(hamster);
								break;

							case "5":
								PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
								porquinho.setNome(nomeA);
								porquinho.setMatricula(matricula);
								porquinho.setTipo("Porquinho");
								consulta.tratamento(porquinho);
								break;
							}
							n5 = 1;
						}
						n5 = 0;
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
						/*while(n6 == 0){
							System.out.println("========== MENU ==========");
							System.out.println("01) Listar Animais todos os Animais");
							System.out.println("02) Listar Cachorros");
							System.out.println("03) Listar Gatos");
							System.out.println("04) Listar Coelhos");
							System.out.println("05) Listar Hamsters");
							System.out.println("06) Listar Porquinhos da India");
							System.out.print("\n\nDigite a opÃ§Ã£o desejada: ");
							sc = new Scanner(System.in);
							op5 = sc.next();


							switch(op5){
							case "1":
								System.out.println("==Listando Cachorros==");

								continue;

							case "2":
								System.out.println("==Listando Gatos===");

								continue;

							case "3":
								System.out.println("==Listando Coelhos==");

								continue;

							case "4":
								System.out.println("==Listando Hamsters==");

								continue;
							case "5":
								System.out.println("Lisntando Porquinhos da India");

								break;
							}
							n6 = 1;
						}
							n6 = 0;
						 */
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
