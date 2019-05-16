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
    String nome, nomeA, raca, end, cpf, rg, genero, matricula, especialidade, doenca; 
    String op = "0", op1 = "0", op2 = "0", op3 = "0", op4 = "0", op5 = "0";
    int idade, idadeA, idadeV;
    float peso, tamanho;
    Cliente cliente = new Cliente();
    Administracao admin = new Administracao();
    
    Veterinario v1 = new Veterinario();
    v1.setNome("Emanuel Augusto");
    v1.setIdade(29);
    v1.setGenero("Masculino");
    v1.setEspecialidade("Cachorro");
    v1.setCpf("08576013302");
    admin.inserirVet(v1);
    
    Veterinario v2 = new Veterinario();
    v2.setNome("Fernada Guilherme");
    v2.setIdade(20);
    v2.setGenero("Feminino");
    v2.setEspecialidade("Cachorro");
    v2.setCpf("08476514304");
    admin.inserirVet(v2);
    
    Veterinario v3 = new Veterinario();
    v3.setNome("Carlos Eduardo");
    v3.setIdade(20);
    v3.setGenero("Masculino");
    v3.setEspecialidade("Hamster");
    v3.setCpf("08175514909");
    admin.inserirVet(v3);
    
    while(n == 0){
            
        System.out.println("========== MENU ==========");
        System.out.println("01) Inserir");
        System.out.println("02) Remover");
        System.out.println("03) Iniciar um Consuta");                                                                                                                                                                                                                                                                                                                                               
        System.out.println("04) Listar");
        System.out.println("05) Sair\n\n");
        System.out.print("\nDigite a opção desejada: ");
            
        op = sc.next();
        if(op != "1" && op != "2" && op != "3" && op != "4" && op != "5"){
            System.out.println("\nOpção invalida, tente novamente.\n");
        }
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
                if(op1 != "1" && op1 != "2" && op1 != "3" && op1 != "4"){
                    System.out.println("\nOpção invalida, tente novamente.\n");
                }
               sc = new Scanner(System.in);
                switch (op1){
                    case "1":
                       System.out.println("========== Cliente ==========");
                       System.out.print("\nDigite o nome do Cliente: ");
                       nome = sc.nextLine();
                       cliente.setNome(nome);
                       System.out.print("\nDigite seu CPF: ");
                       cpf = sc.next();
                       cliente.setCpf(cpf);
                       System.out.print("\nDigite seu RG: ");
                       rg = sc.next();
                       cliente.setRg(rg);
                       System.out.print("\nDigite a idade: ");
                       int idadeC = sc.nextInt();
                       cliente.setIdade(idadeC);
                       sc = new Scanner(System.in);
                       System.out.print("\nDigite o endereço do cliente: ");
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
                            System.out.print("\n\nDigite a opção desejada: ");
                            sc = new Scanner(System.in);
                            op5 = sc.next();
                            if(op5 != "1" && op5 != "2" && op5 != "3" && op5 != "4" &&  op5 != "5" && op5 != "6"){
                                System.out.println("\nOpção invalida, tente novamente.\n");
                            }
                            switch(op5){
                                case "1":
                                  Cachorro cachorro = new Cachorro();
                                  cachorro.setNome(nomeA);
                                  cachorro.setIdade(idadeA);
                                  cachorro.setTamanho(tamanho);
                                  cachorro.setPeso(peso);
                                  cachorro.setMatricula(matricula);
                                  cachorro.setRaca(raca);
                                  cachorro.setTipo("Cachorro");
                                  admin.inserirAnimal(cachorro, cliente);
                               
                                  break;
                                  
                                case "2":
                                  Gato gato = new Gato();
                                  gato.setNome(nomeA);
                                  gato.setIdade(idadeA);
                                  gato.setTamanho(tamanho);
                                  gato.setPeso(peso);
                                  gato.setMatricula(matricula);
                                  gato.setRaca(raca);
                                  gato.setTipo("Gato");
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
                                  porquinho.setTipo("Porquinho");
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
                        System.out.print("\nDigite o nome do Cliente: ");
                        nome = sc.nextLine();
                        System.out.print("\nDigite o CPF do Cliente: ");
                        cpf = sc.nextLine();
                        
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
                        System.out.print("\nDigite a raça: ");
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
                            if(op5 != "1" && op5 != "2" && op5 != "3" && op5 != "4" &&  op5 != "5" && op5 != "6"){
                                System.out.println("\nOpção invalida, tente novamente.\n");
                            }
                            switch(op5){
                                case "1":
                                  Cachorro cachorro = new Cachorro();
                                  cachorro.setNome(nomeA);
                                  cachorro.setIdade(idadeA);
                                  cachorro.setTamanho(tamanho);
                                  cachorro.setPeso(peso);
                                  cachorro.setMatricula(matricula);
                                  cachorro.setRaca(raca);
                                  cachorro.setTipo("Cachorro");
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
                                  gato.setTipo("Gato");
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
                                  porquinho.setTipo("Porquinho");
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
                        System.out.print("\nDigite o Nome do Veterinário: ");
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
                      
                        
                        
                            admin.inserirVet(veterinario);
                        System.out.println("\nNovo Veterinário inserido com Sucesso\n\n");
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
                  System.out.println("03) Remover um Veterinário");
                  System.out.println("04) Voltar");
                  System.out.print("\nDigite a opção desejada: ");
                  op2 = sc.next();
                  if(op2 != "1" && op2 != "2" && op2 != "3" && op2 != "4"){
                                System.out.println("\nOpção invalida, tente novamente.\n");
                   }
                  switch (op2){
                    case "1":
                        System.out.println("========== Cliente ==========");
                        System.out.print("\nDigite o Nome do Cliente: ");
                        sc = new Scanner(System.in);
                        nome = sc.nextLine();
                        System.out.print("\nDigite seu CPF: ");
                        cpf = sc.next();
                        System.out.print("\nDigite seu RG: ");
                        rg = sc.next();
                        System.out.println("\n\nCliente removido com Sucesso\n\n");
                        continue;
                    case "2":
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        nomeA = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.println("========== Cliente ==========");
                        System.out.print("\nDigite o nome do Cliente: ");
                        sc = new Scanner(System.in);
                        nome = sc.nextLine();
                        System.out.println("\n\nAnimal removido com Sucesso\n\n");
                        continue;
                    case "3":
                        System.out.println("========== Veterinário ==========");
                        System.out.print("\nDigite o Nome do Veterinário: ");
                        sc = new Scanner(System.in);
                        nome = sc.nextLine();
                        System.out.print("\nDigite seu CPF: ");
                        cpf = sc.next();
                        System.out.print("\nDigite seu RG: ");
                        rg = sc.next();
                        
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
              System.out.println("========== MENU ==========");
              System.out.println("01) Ver Historico");
              System.out.println("02) Gerar Diagnostico");
              System.out.println("03) Iniciar Tratamento");
              System.out.println("04) Voltar");
              System.out.print("\n\nDigite a opção desejada: ");
              op3 = sc.next();
              if(op3 != "1" && op3 != "2" && op3 != "3" && op3 != "4"){
                    System.out.println("\nOpção invalida, tente novamente.\n");
               }
              switch (op3){
                    case "1":
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        nomeA = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.println("\n\nHistorico de Animal\n\n");
                        continue;
                    case "2":
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        nomeA = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.print("\nDigite sua Doença: ");
                        sc = new Scanner(System.in);
                        doenca = sc.nextLine();
                        System.out.println("\n\nDiagnostico gerado\n\n");
                        continue;
                    case "3":
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        nomeA = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.println("\n\nTratamento iniciado\n\n");
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
                   System.out.println("04) Listar veterinários Cadastrados na Clinica");
                   System.out.println("05) Voltar");
                   System.out.print("\n\nDigite a opção desejada: ");
                   op4 = sc.next();
                   if(op4 != "1" && op4 != "2" && op4 != "3" && op4 != "4" &&  op4 != "5"){
                        System.out.println("\nOpção invalida, tente novamente.\n");
                    }
                    switch (op4){
                        case "1":
                            while(n6 == 0){
                                System.out.println("========== MENU ==========");
                                System.out.println("01) Listar Animais todos os Animais");
                                System.out.println("02) Listar Cachorros");
                                System.out.println("03) Listar Gatos");
                                System.out.println("04) Listar Coelhos");
                                System.out.println("05) Listar Hamsters");
                                System.out.println("06) Listar Porquinhos da India");
                                System.out.print("\n\nDigite a opção desejada: ");
                                op5 = sc.next();
                                
                                if(op5 != "1" && op5 != "2" && op5 != "3" && op5 != "4" &&  op5 != "5" && op5 != "6"){
                                    System.out.println("\nOpção invalida, tente novamente.\n");
                                }
                                switch(op5){
                                    case "1":
                                        System.out.println("==Listando Cachorros==");
                                        admin.listarCachorros();
                                        continue;
                                        
                                    case "2":
                                        System.out.println("==Listando Gatos===");
                                        admin.listarGatos();
                                        continue;
                                        
                                    case "3":
                                        System.out.println("==Listando Coelhos==");
                                        admin.listarCoelhos();
                                        continue;
                                        
                                    case "4":
                                        System.out.println("==Listando Hamsters==");
                                        admin.listarHamisters();
                                        continue;
                                    case "5":
                                        System.out.println("Lisntando Porquinhos da India");
                                        admin.listarPorquinhos();
                                        break;
                                }
                               n6 = 1;
                            }
                            n6 = 0;
                            admin.listarAnimais();
                            continue;
                        case "2":
                            System.out.println("========== Cliente ==========");
                            System.out.print("\nDigite o nome do Cliente: ");
                            sc = new Scanner(System.in);
                            nome = sc.nextLine();
                            System.out.print("\nDigite seu CPF: ");
                            cpf = sc.next();
                            System.out.print("\nDigite seu RG: ");
                            rg = sc.next();
                            if(admin.clienteExiste(cliente) == true){
                                System.out.println("\n\n==Listando Animais do Clientes==\n\n");
                                admin.listarAnimaisClientes(cliente);
                            }
                            else{
                                System.out.println("Cliente não está Cadastrado.");
                            }
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
