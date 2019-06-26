package principal;

import Pessoas.*;
import animais.*;
import classes_auxiliares.*;
import java.util.*;


/**
 *
 * @author Ismael de Oliveira
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variaveis implementadas
		int n = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
		String nome, nomeA = "", nomeV = "", raca = "", end = "", cpf = "", rg = "", genero = "0", generoA = "", matricula = "0", especialidade = "", doenca; 
		String op = "0", op1 = "0", op2 = "0", op3 = "0", op4 = "0", op5 = "0", idadeA = "0.0", tamanho = "0", peso = "0", idadeV = "0"; 
		boolean teste = false;

		Consulta consulta = new Consulta();
		Administracao admin = new Administracao();

		// Dados Pre-Cadastrados

		Veterinario v1 = new Veterinario();
		v1.setNome("Emanuel Augusto");
		v1.setIdade(29);
		v1.setGenero("Masculino");
		v1.setEspecialidade("Cachorro");
		v1.setCpf("08576013302");
		admin.inserirVetDados(v1);

		Veterinario v2 = new Veterinario();
		v2.setNome("Fernada Guilherme");
		v2.setIdade(20);
		v2.setGenero("Feminino");
		v2.setEspecialidade("Gato");
		v2.setCpf("08476514304");
		admin.inserirVetDados(v2);

		Veterinario v3 = new Veterinario();
		v3.setNome("Carlos Eduardo");
		v3.setIdade(20);
		v3.setGenero("Masculino");
		v3.setEspecialidade("Hamster");
		v3.setCpf("08175514909");
		admin.inserirVetDados(v3);

		Veterinario v4 = new Veterinario();
		v4.setNome("Amanda Cavalcante");
		v4.setIdade(23);
		v4.setGenero("Feminino");
		v4.setEspecialidade("Coelho");
		v4.setCpf("68175544999");
		admin.inserirVetDados(v4);

		Cliente c1 = new Cliente();
		c1.setNome("Ismael de Oliveira");
		c1.setCpf("32142435507");
		c1.setRg("005254370");
		c1.setEndereco("Rua Lírio dos Vales");
		c1.setGenero("Masculino");
		c1.setIdade(22);
		admin.inserirClienteDados(c1);

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
		admin.inserirAnimaisDados(ca, c1);

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
		admin.inserirAnimaisDados(g1, c1);

		Cliente c2 = new Cliente();
		c2.setNome("Plácido Neto");
		c2.setCpf("42145435517");
		c2.setRg("007258376");
		c2.setEndereco("Av. Senador Salgado Filho");
		c2.setGenero("Masculino");
		c2.setIdade(23);
		admin.inserirClienteDados(c2);

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
		admin.inserirAnimaisDados(co, c2);


		while(n == 0){

			System.out.println("\n==================================================== MENU ====================================================");
			System.out.println("(1) Inserir");
			System.out.println("(2) Remover");
			System.out.println("(3) Opções de Consulta");                                                                                                                                                                                                                                                                                                                                               
			System.out.println("(4) Listar");
			System.out.println("(5) Sair\n\n");
			System.out.print("\nDigite a opção desejada: ");

			op = sc.next();

			if(op.length() == 1) {

				if(op.charAt(0) < '1'|| op.charAt(0) > '5' ) {
					System.out.println("Opção invalida");
					System.out.println("Digite as opções citadas no Menu");
				}

			}
			else {
				System.out.println("Opção invalida");
			}

			switch (op) {

			case "1":
				//			INSERIR
				while(n1 == 0){
					System.out.println("\n==================================================== MENU ====================================================");
					System.out.println("(1) Inserir um Novo Cliente");
					System.out.println("(2) Inserir um Novo Animal");
					System.out.println("(3) inserir um Novo Veterinario");
					System.out.println("(4) Voltar\n\n");
					System.out.print("Digite a opção desejada: ");
					op1 = sc.next();

					sc = new Scanner(System.in);

					if(op1.length() == 1) {

						if(op1.charAt(0) < '1'|| op1.charAt(0) > '4' ) {
							System.out.println("Opção invalida");
							System.out.println("Digite as opções citadas no Menu");
						}

					}
					else {
						System.out.println("Opção invalida");
					}

					switch (op1){
					case "1":

						//			INSERIR CLIENTE
						System.out.println("========== Cliente ==========");
						Cliente cliente = new Cliente();
						nome = "nome";
						while(admin.nomeSobrenome(nome) != "aceito") {
							System.out.print("\nDigite o nome e Sobrenome do cliente: ");
							nome = sc.nextLine().trim();
							if(admin.nomeSobrenome(nome) == "aceito") {
								cliente.setNome(nome);
							}
							if(admin.nomeSobrenome(nome) == "contem numeros") {
								System.out.println("\nO nome não deve conter Números");
							}
							if(admin.nomeSobrenome(nome) == "mais de um espaco") {
								System.out.println("Você está usando mais de um espaço");
							}
							if(admin.nomeSobrenome(nome) == "sem sobrenome") { 
								System.out.println("\nEsse campo deve conter nome e sobrenome");
							}
						}

						while(admin.testeCpf(cpf) != "aceito"){
							System.out.print("\nDigite seu CPF: ");
							cpf = sc.nextLine().trim();
							if(admin.testeCpf(cpf) == "aceito") {
								cliente.setCpf(cpf);
							}

							if(admin.testeCpf(cpf) == "diferente de 11 e letras ou sinais ou espacos") {
								System.out.println("\nO CPF deve conter 11 números e não deve conter letras, espaços ou sinais");
							}
							if(admin.testeCpf(cpf) == "letras ou espacos ou sinais") {
								System.out.println("\nO CPF não pode conter letras, espaços ou sinais");
							}
							if(admin.testeCpf(cpf) == "diferente de 11") {
								System.out.println("\nO CPF deve conter 11 números");
							}
						}
						cpf = "";
						while(admin.testeRg(rg) != "aceito") {
							System.out.print("\nDigite seu RG: ");
							rg = sc.next().trim();
							admin.testeRg(rg);
							if(admin.testeRg(rg) == "aceito") {
								cliente.setRg(rg);
							}
							else {
								if((admin.testeRg(rg) == "diferente de 9 e contem letras") || (admin.testeRg(rg) == "diferente de 9 e contem sinais")) {
									System.out.println("O RG deve conter 9 números e não deve conter letras, espaços ou sinais");
								}
								if((admin.testeRg(rg) == "contem letras") || (admin.testeRg(rg) == "contem sinais")) {
									System.out.println("O RG deve conter apenas números");
								}
								if(admin.testeRg(rg) == "diferente de 9") {
									System.out.println("O RG deve conter 9 números");
								}
							}
						}
						rg = "";
						String idadeC = "0";
						while(admin.testeIdade(idadeC) != "aceito") {
							System.out.print("\nDigite a idade: ");
							idadeC = sc.next();
							if(admin.testeIdade(idadeC) == "aceito") {
								int idadeC1 = Integer.parseInt(idadeC);
								cliente.setIdade(idadeC1);
							}
							else {
								if(admin.testeIdade(idadeC) == "contem sinais" || admin.testeIdade(idadeC) == "contem letras") {
									System.out.println("Esse campo não pode conter sinais, letras ou espaços");
								}
								if(admin.testeIdade(idadeC) == "idade muito alta") {
									System.out.println("idade acima do comum");
								}
								if(admin.testeIdade(idadeC) == "menor de idade") {
									System.out.println("Não cadastramos menor de idade");
								}
								if(admin.testeIdade(idadeC) == "valor invalido") {
									System.out.println("Valor invalido");
								}
							}
						}

						sc = new Scanner(System.in);
						System.out.print("\nDigite o endereço do cliente: ");
						end = sc.nextLine();
						cliente.setEndereco(end);
						end = "";
						while(admin.testeGenero(genero) != "aceito") {
							System.out.print("\nDigite seu Genero: ");
							genero = sc.next();
							if(admin.testeGenero(genero) == "aceito") {
								cliente.setGenero(genero);
							}
							if(admin.testeGenero(genero) == "invalido") {
								System.out.println("Você deve digitar Masculino ou Feminino");
							}
						}
						genero = "";
						System.out.println("\n========== Animal ==========");

						while(admin.testePav(nomeA) != "aceito") {
							System.out.print("\nDigite o Nome do Animal: ");
							sc = new Scanner(System.in);
							nomeA = sc.nextLine();
							if(admin.testePav(nomeA) == "contem nemeros ou sinais") {
								System.out.println("Esse campo não deve conter números ou sinais");
							}
							if(admin.testePav(nomeA) == "invalido") {
								System.out.println("Algo de errado");
							}
						}



						while(admin.testeIdadeAnimal(idadeA) != "aceito") {
							System.out.print("\nDigite a idade: ");
							sc = new Scanner(System.in);
							idadeA = sc.next();
							if(admin.testeIdadeAnimal(idadeA) == "contem sinais" || admin.testeIdadeAnimal(idadeA) == "contem letras") {
								System.out.println("Esse campo não pode conter sinais, letras ou espaços");
							}
							if(admin.testeIdadeAnimal(idadeA) == "idade muito alta") {
								System.out.println("Idade fora do Comum");
							}
							if(admin.testeIdadeAnimal(idadeA) == "valor invalido") {
								System.out.println("Valor invalido digite novamente");
							}
						}
						Float idadeA1 = Float.parseFloat(idadeA);

						while(admin.testeGenero(generoA) != "aceito") {
							System.out.print("\nDigite seu Genero: ");
							generoA = sc.next();

							if(admin.testeGenero(generoA) == "invalido") {
								System.out.println("Você deve digitar Masculino ou Feminino");
							}
						}

						while(admin.testeTamanho(tamanho) != "aceito") {
							System.out.print("\nDigite seu Tamanho: ");
							tamanho = sc.next();
							if(admin.testeTamanho(tamanho) == "contem letras" || admin.testeTamanho(tamanho) == "contem sinais") {
								System.out.println("Esse campo não pode conter letras, espaços ou sinais");
							}
							if(admin.testeTamanho(tamanho) == "tamanho invalido") {
								System.out.println("Tamanho invalido");
							}
							if(admin.testeTamanho(tamanho) == "invalido") {
								System.out.println("O tamanho não pode ser menor que 0 ou maior que 1.50");
							}
						}
						float tam = Float.parseFloat(tamanho);

						while(admin.testePeso(peso) != "aceito") {
							System.out.print("\nDigite o Peso do Animal: ");
							peso = sc.next();
							sc = new Scanner(System.in);
							if(admin.testeTamanho(peso) == "contem letras" || admin.testeTamanho(peso) == "contem sinais") {
								System.out.println("Esse campo não pode conter letras, espaços ou sinais");
							}
							if(admin.testeTamanho(peso) == "peso invalido") {
								System.out.println("peso invalido");
							}
							if(admin.testeTamanho(peso) == "invalido") {
								System.out.println("Peso invalido");
							}
						}
						float pesoA = Float.parseFloat(peso);

						while(admin.testePav(raca) != "aceito") {
							System.out.print("\nDigite a raça: ");
							raca = sc.nextLine();
							if(admin.testePav(raca) == "contem nemeros ou sinais") {
								System.out.println("Esse campo não deve conter números ou sinais");
							}
							if(admin.testePav(raca) == "invalido") {
								System.out.println("Algo de errado");
							}
						}

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
								cachorro.setIdade(idadeA1);
								cachorro.setTamanho(tam);
								cachorro.setPeso(pesoA);
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
								gato.setIdade(idadeA1);
								gato.setTamanho(tam);
								gato.setPeso(pesoA);
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
								coelho.setIdade(idadeA1);
								coelho.setTamanho(tam);
								coelho.setPeso(pesoA);
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
								hamster.setIdade(idadeA1);
								hamster.setTamanho(tam);
								hamster.setPeso(pesoA);
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
								porquinho.setIdade(idadeA1);
								porquinho.setTamanho(tam);
								porquinho.setPeso(pesoA);
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
							nomeA = ""; idadeA = "0.0"; tamanho = ""; peso = ""; raca = ""; generoA = "";
							n5 = 1;
						}
						n5 = 0;
						continue;

					case "2":

						//						INSERIR ANIMAL
						System.out.println("========== Cliente ==========");
						Cliente clienteT = new Cliente();
						Cliente clienteTemp = new Cliente();
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


						clienteTemp = admin.clienteRetorna(clienteT);
						if(!(clienteT.getNome().equalsIgnoreCase(clienteTemp.getNome()))) {
							System.out.println("\nO nome cadastrado não pertence a esse CPF");
							continue;
						}
						cpf = "";
						sc = new Scanner(System.in);
						System.out.println("\n========== Animal ==========");
						while(admin.testePav(nomeA) != "aceito") {
							System.out.print("\nDigite o Nome do Animal: ");
							sc = new Scanner(System.in);
							nomeA = sc.nextLine();
							if(admin.testePav(nomeA) == "numero ou sinal") {
								System.out.println("Esse campo não deve conter números ou sinais");
							}
							if(admin.testePav(nomeA) == "invalido") {
								System.out.println("Algo de errado");
							}
						}


						while(admin.testeIdadeAnimal(idadeA) != "aceito") {
							System.out.print("\nDigite a idade: ");
							sc = new Scanner(System.in);
							idadeA = sc.next();
							if(admin.testeIdade(idadeA) == "contem sinais" || admin.testeIdade(idadeA) == "contem letras") {
								System.out.println("Esse campo não pode conter sinais, letras ou espaços");
							}
							if(admin.testeIdade(idadeA) == "idade muito alta") {
								System.out.println("Idade fora do Comum");
							}
							if(admin.testeIdade(idadeA) == "valor invalido") {
								System.out.println("Valor invalido digite novamente");
							}
						}
						idadeA1 = Float.parseFloat(idadeA);

						while(admin.testeGenero(generoA) != "aceito") {
							System.out.print("\nDigite seu Genero: ");
							generoA = sc.next();

							if(admin.testeGenero(generoA) == "invalido") {
								System.out.println("Você deve digitar Masculino ou Feminino");
							}
						}

						sc = new Scanner(System.in);

						while(admin.testeTamanho(tamanho) != "aceito") {
							System.out.print("\nDigite seu Tamanho: ");
							tamanho = sc.next();
							if(admin.testeTamanho(tamanho) == "contem letras" || admin.testeTamanho(tamanho) == "contem sinais") {
								System.out.println("Esse campo não pode conter letras, espaços ou sinais");
							}
							if(admin.testeTamanho(tamanho) == "tamanho invalido") {
								System.out.println("Tamanho invalido");
							}
						}
						tam = Float.parseFloat(tamanho);

						while(admin.testePeso(peso) != "aceito") {
							System.out.print("\nDigite o Peso do Animal: ");
							peso = sc.next();
							sc = new Scanner(System.in);
							if(admin.testeTamanho(peso) == "contem letras" || admin.testeTamanho(peso) == "contem sinais") {
								System.out.println("Esse campo não pode conter letras, espaços ou sinais");
							}
							if(admin.testeTamanho(peso) == "peso invalido") {
								System.out.println("peso invalido");
							}
							if(admin.testeTamanho(peso) == "invalido") {
								System.out.println("Peso invalido");
							}
						}
						pesoA = Float.parseFloat(peso);

						while(admin.testePav(raca) != "aceito") {
							System.out.print("\nDigite a raça: ");
							raca = sc.nextLine();
							if(admin.testePav(raca) == "contem nemeros ou sinais") {
								System.out.println("Esse campo não deve conter números ou sinais");
							}
							if(admin.testePav(raca) == "invalido") {
								System.out.println("Algo de errado");
							}
						}

						System.out.print("\nDigite sua Matricula: ");
						matricula = sc.next();

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
								cachorro.setIdade(idadeA1);
								cachorro.setTamanho(tam);
								cachorro.setPeso(pesoA);
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
								gato.setIdade(idadeA1);
								gato.setTamanho(tam);
								gato.setPeso(pesoA);
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
								coelho.setIdade(idadeA1);
								coelho.setTamanho(tam);
								coelho.setPeso(pesoA);
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
								hamster.setIdade(idadeA1);
								hamster.setTamanho(tam);
								hamster.setPeso(pesoA);
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
								porquinho.setIdade(idadeA1);
								porquinho.setTamanho(tam);
								porquinho.setPeso(pesoA);
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
							nomeA = ""; idadeA = "0.0"; tamanho = ""; peso = ""; raca = ""; generoA = "";
							n5 = 1;
						}
						n5 = 0;
						continue;
					case "3": 

						//						INSERIR VETERINÁRIO
						System.out.println("========== Veterinário ==========");
						Veterinario veterinario = new Veterinario();

						while(admin.nomeSobrenome(nomeV) != "aceito") {
							System.out.print("\nDigite o nome e Sobrenome do Veterinario: ");
							nomeV = sc.nextLine().trim();
							if(admin.nomeSobrenome(nomeV) == "aceito") {
								veterinario.setNome(nomeV);
							}
							if(admin.nomeSobrenome(nomeV) == "contem numeros") {
								System.out.println("\nO nome não deve conter Números");
							}
							if(admin.nomeSobrenome(nomeV) == "mais de um espaco") {
								System.out.println("Você está usando mais de um espaço");
							}
							if(admin.nomeSobrenome(nomeV) == "sem sobrenome") { 
								System.out.println("\nEsse campo deve conter nome e sobrenome");
							}
						}
						nomeV = "";

						while(admin.testeCpf(cpf) != "aceito"){
							System.out.print("\nDigite seu CPF: ");
							cpf = sc.nextLine().trim();
							if(admin.testeCpf(cpf) == "aceito") {
								veterinario.setCpf(cpf);
							}

							if(admin.testeCpf(cpf) == "diferente de 11 e letras ou sinais ou espacos") {
								System.out.println("\nO CPF deve conter 11 números e não deve conter letras, espaços ou sinais");
							}
							if(admin.testeCpf(cpf) == "letras ou espacos ou sinais") {
								System.out.println("\nO CPF não pode conter letras, espaços ou sinais");
							}
							if(admin.testeCpf(cpf) == "diferente de 11") {
								System.out.println("\nO CPF deve conter 11 números");
							}
						}
						cpf = "0";


						while(admin.testeGenero(genero) != "aceito") {
							System.out.print("\nDigite seu Genero: ");
							genero = sc.next();
							if(admin.testeGenero(genero) == "aceito") {
								veterinario.setGenero(genero);
							}
							if(admin.testeGenero(genero) == "invalido") {
								System.out.println("Você deve digitar Masculino ou Feminino");
							}
						}
						genero = "";

						sc = new Scanner(System.in);

						while(admin.testeIdade(idadeV) != "aceito") {
							System.out.print("\nDigite a idade: ");
							idadeV = sc.next();
							if(admin.testeIdade(idadeV) == "aceito") {
								int idadeV1 = Integer.parseInt(idadeV);
								veterinario.setIdade(idadeV1);
							}
							else {
								if(admin.testeIdade(idadeV) == "contem sinais" || admin.testeIdade(idadeV) == "contem letras") {
									System.out.println("Esse campo não pode conter sinais, letras ou espaços");
								}
								if(admin.testeIdade(idadeV) == "idade muito alta") {
									System.out.println("idade acima do comum");
								}
								if(admin.testeIdade(idadeV) == "menor de idade") {
									System.out.println("Não cadastramos menor de idade");
								}
								if(admin.testeIdade(idadeV) == "valor invalido") {
									System.out.println("Valor invalido");
								}
							}
						}
						idadeV = "0";
						sc = new Scanner(System.in);

						while(admin.especialidadeExiste(especialidade) != true) {
							System.out.print("\nDigite a sua Especialidade: ");
							especialidade = sc.nextLine();
							if(admin.especialidadeExiste(especialidade) == true) {
								veterinario.setEspecialidade(especialidade);
							}
							else {
								System.out.println("Especialidade Não Existe em nosso Banco de Dados");
								System.out.println("As Especialidades disponiveis são: Cachorro, Gato, Coelho, Hamster e Porquinho (porquinho da india)");
							}
						}

						admin.inserirVeterinario(veterinario);
						System.out.println("\nNovo Veterinário inserido com Sucesso\n\n");
						continue;
					case "4":
						n1 = 1;
					}
				}
				n1 = 0;
				break;
			case "2":

				//				REMOVER
				while(n2 == 0){
					System.out.println("\n==================================================== MENU ====================================================");
					System.out.println("(1) Remover um Cliente");
					System.out.println("(2) Remover um Animal");
					System.out.println("(3) Remover um Veterinario");
					System.out.println("(4) Voltar");
					System.out.print("\nDigite a opção desejada: ");
					op2 = sc.next();

					if(op2.length() == 1) {

						if(op2.charAt(0) < '1'|| op2.charAt(0) > '4' ) {
							System.out.println("Opção invalida");
							System.out.println("Digite as opções citadas no Menu");
						}

					}
					else {
						System.out.println("Opção invalida");
					}

					switch (op2){
					case "1":

						//						REMOVER CLIENTE
						System.out.println("========== Cliente ==========");
						Cliente clienteT = new Cliente();
						sc = new Scanner(System.in);
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
						admin.removerCliente(clienteT);
						nome = ""; cpf = "0";
						continue;

					case "2":

						//						REMOVER ANIMAL
						Cliente clienteT2 = new Cliente();
						Cliente clienteA = new Cliente();
						Animal animalT;
						System.out.println("\n========== Animal ==========");
						sc = new Scanner(System.in);

						while(admin.nomeAnimal(nomeA) != true) {
							System.out.print("\nDigite o Nome do Animal: ");
							nomeA = sc.nextLine();
							if(admin.nomeAnimal(nomeA) == false) {
								System.out.println("O nome do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}
						while(admin.matriculaExiste(matricula) != true) {
							System.out.print("\nDigite sua Matricula: ");
							matricula = sc.next();
							if(admin.matriculaExiste(matricula) == false) {
								System.out.println("A matricula do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}
						animalT = admin.animalRetorna(matricula);
						if(!(animalT.getNome().equalsIgnoreCase(nomeA))) {
							System.out.println("\nO nome cadastrado não pertence a essa matricula");
							System.out.println("Tente novamento...");
							continue;
						}

						clienteA = admin.donoAnimal(animalT);
						clienteT2 = admin.clienteRetorna(clienteA);
						System.out.println(clienteA.getNome());
						/*System.out.println("========== Cliente ==========");
						sc = new Scanner(System.in);
						while(admin.clienteNomeExiste(clienteT2) == false) {
							System.out.print("\nDigite o nome do Cliente: ");
							nome = sc.nextLine();
							clienteT2.setNome(nome);
							if(admin.clienteNomeExiste(clienteT2) == false) {
								System.out.println("\nO Nome do Cliente está incorreto");
							}
						}

						while(admin.clienteCpfExiste(clienteT2) == false) {
							System.out.print("\nDigite o CPF do Cliente: ");
							cpf = sc.nextLine();
							clienteT2.setCpf(cpf);
							if(admin.clienteCpfExiste(clienteT2) == false) {
								System.out.println("\nO CPF digitado está incorreto");
							}
						}*/

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
						nomeA = ""; matricula = "0";
						continue;

					case "3":

						//						REMOVER VETERINÁRIO
						System.out.println("========== Veterinário ==========");
						Veterinario vet = new Veterinario();
						sc = new Scanner(System.in);
						while(admin.nomeVet(nomeV) != true) {
							System.out.print("\nDigite o Nome do Veterinario: ");
							nomeV = sc.nextLine();
							if(admin.nomeVet(nomeV) == true) {
								vet.setNome(nomeV);
							}
							else {
								System.out.println("O nome está incorreto ou não está cadastrado no nosso banco de dados");
							}
						}
						nomeV = "";
						while(admin.cpfVet(cpf) != true) {
							System.out.print("\nDigite seu CPF: ");
							cpf = sc.next();
							if(admin.cpfVet(cpf) == true) {
								vet.setCpf(cpf);
							}
							else {
								System.out.println("O cpf está incorreto ou não está cadastrado no nosso banco de dados");
							}
						}
						cpf = "0";
						Veterinario vetTemp = new Veterinario();
						vetTemp = admin.retornaVeterinario(vet);

						if(!(vetTemp.getNome().equalsIgnoreCase(vet.getNome()))) {
							System.out.println("\nO nome cadastrado não pertence a esse CPF");
							System.out.println("Tente novamento...");
							continue;
						}

						admin.removerVeterinario(vet);
						System.out.println("\n\nVeterinário removido com Sucesso\n\n");
						continue;
					case "4":
						n2 = 1;
					}
				}
				n2 = 0;
				break;
			case "3":
				while(n3 == 0){

					//					CONSULTAR
					System.out.println("\n==================================================== MENU ====================================================");
					System.out.println("(1) Ver Historico");
					System.out.println("(2) Iniciar consuta");
					System.out.println("(3) Iniciar Tratamento");
					System.out.println("(4) Voltar");
					System.out.print("\n\nDigite a opção desejada: ");
					op3 = sc.next();

					if(op3.length() == 1) {

						if(op3.charAt(0) < '1'|| op3.charAt(0) > '4' ) {
							System.out.println("Opção invalida");
							System.out.println("Digite as opções citadas no Menu");
						}

					}
					else {
						System.out.println("Opção invalida");
					}

					switch (op3){
					case "1":

						//						HISTORICO
						System.out.println("\n========== Animal ==========");
						nomeA = "a"; matricula = "0";
						sc = new Scanner(System.in);
						Animal animalT;
						while(admin.nomeAnimal(nomeA) != true) {
							System.out.print("\nDigite o Nome do Animal: ");
							nomeA = sc.nextLine();
							if(admin.nomeAnimal(nomeA) == false) {
								System.out.println("O nome do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}
						while(admin.matriculaExiste(matricula) != true) {
							System.out.print("\nDigite sua Matricula: ");
							matricula = sc.next();
							if(admin.matriculaExiste(matricula) == false) {
								System.out.println("A matricula do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}
						animalT = admin.animalRetorna(matricula);
						if(!(animalT.getNome().equalsIgnoreCase(nomeA))) {
							System.out.println("\nO nome cadastrado não pertence a essa matricula");
							System.out.println("Tente novamento...");
							continue;
						}

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
						nomeA = ""; matricula = "0";
						n5 = 1;

						continue;
					case "2":

						//						INICIAR UMA CONSULTA
						System.out.println("\n========== Animal ==========");
						nomeA = "a"; matricula = "0";
						sc = new Scanner(System.in);
						while(admin.nomeAnimal(nomeA) != true) {
							System.out.print("\nDigite o Nome do Animal: ");
							nomeA = sc.nextLine();
							if(admin.nomeAnimal(nomeA) == false) {
								System.out.println("O nome do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}

						while(admin.matriculaExiste(matricula) != true) {
							System.out.print("\nDigite sua Matricula: ");
							matricula = sc.next();
							if(admin.matriculaExiste(matricula) == false) {
								System.out.println("A matricula do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}
						animalT = admin.animalRetorna(matricula);
						if(!(animalT.getNome().equalsIgnoreCase(nomeA))) {
							System.out.println("\nO nome cadastrado não pertence a essa matricula");
							System.out.println("Tente novamento...");
							continue;
						}

						System.out.println("\n========== Consulta ==========");
						sc = new Scanner(System.in);
						System.out.print("\nDigite a data da consulta: ");
						String data = sc.nextLine();
						consulta.setData(data);
						data = "";
						System.out.print("\nDigite a descrição da consulta: ");
						String descricao = sc.nextLine();
						consulta.setDescricao(descricao);
						descricao = "";
						System.out.print("\nDigite a doença diagnosticada:");
						doenca = sc.nextLine();
						consulta.setDoencaDiagnosticada(doenca);
						doenca = "";

						if(admin.tipoAnimal(matricula) == "Cachorro") {
							Cachorro cachorro = new Cachorro();
							cachorro.setNome(nomeA);
							cachorro.setMatricula(matricula);
							admin.iniciarConsulta(cachorro, doenca);
							admin.inserirConsulta(consulta, cachorro);
							continue;
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
						nomeA = "a"; matricula = "0";
						continue;

					case "3":

						//						TRATAMENTO
						System.out.println("\n========== Animal ==========");
						sc = new Scanner(System.in);
						while(admin.nomeAnimal(nomeA) != true) {
							System.out.print("\nDigite o Nome do Animal: ");
							nomeA = sc.nextLine();
							if(admin.nomeAnimal(nomeA) == false) {
								System.out.println("O nome do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}
						while(admin.matriculaExiste(matricula) != true) {
							System.out.print("\nDigite sua Matricula: ");
							matricula = sc.next();
							if(admin.matriculaExiste(matricula) == false) {
								System.out.println("A matricula do Animal está incorreto ou não está cadastrado em nosso banco de dados");
							}
						}

						animalT = admin.animalRetorna(matricula);
						if(!(animalT.getNome().equalsIgnoreCase(nomeA))) {
							System.out.println("\nO nome cadastrado não pertence a essa matricula");
							System.out.println("Tente novamento...");
							continue;
						}

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
						nomeA = ""; matricula = "0";
						continue;
					case "4":
						n3 = 1;
					}
				}
				n3 = 0;
				break;
			case "4":
				while(n4 == 0){

					//					LISTAR
					System.out.println("\n==================================================== MENU ====================================================");
					System.out.println("(1) Listar Animais Cadastrados");
					System.out.println("(2) Listar Animais do Cliente");
					System.out.println("(3) Listar Clientes Cadastrados");
					System.out.println("(4) Listar veterinários Cadastrados na Clinica");
					System.out.println("(5) Voltar");
					System.out.print("\n\nDigite a opção desejada: ");
					op4 = sc.next();

					if(op4.length() == 1) {

						if(op4.charAt(0) < '1'|| op4.charAt(0) > '5' ) {
							System.out.println("Opção invalida");
							System.out.println("Digite as opções citadas no Menu");
						}

					}
					else {
						System.out.println("Opção invalida");
					}

					switch (op4){
					case "1":

						//						LISTAR TODOS OS ANIMAIS
						admin.listarAnimais();
						continue;

					case "2":

						//						LISTAR ANIMAIS DE CLIENTE
						System.out.println("========== Cliente ==========");
						Cliente clienteT = new Cliente();
						Cliente clienteTemp = new Cliente();
						sc = new Scanner(System.in);
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


						clienteTemp = admin.clienteRetorna(clienteT);
						if(!(clienteT.getNome().equalsIgnoreCase(clienteTemp.getNome()))) {
							System.out.println("\nO nome cadastrado não pertence a esse CPF");
							continue;
						}
						cpf = "";
						System.out.print("\n\n");
						admin.listarAnimaisClientes(clienteT);
						continue;

					case "3":

						//						LISTAR CLIENTES
						System.out.println("==Listando Clientes Cadastrados==");
						admin.listarClientes();
						continue;

					case "4":

						//						LISTAR VETERINÁRIOS
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
