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
    int op = 0, op1 = 0, op2 = 0, op3 = 0, op4 = 0, op5 = 0,
    n = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
    String nome,nomeA, raca, end, cpf, rg, genero, matricula, especialida, doenca;
    int idade, idadeA, idadeV;
    float peso, tamanho;
    Cliente cliente = new Cliente();
    Veterinario veterinario = new Veterinario();
    while(n == 0){
            
        System.out.println("========== MENU ==========");
        System.out.println("01) Inserir");
        System.out.println("02) Remover");
        System.out.println("03) Iniciar um Consuta");
        System.out.println("04) Listar");
        System.out.println("05) Sair\n\n");
        System.out.print("\nDigite a opção desejada: ");
            
        op = sc.nextInt();
        switch (op) {
          case 1:
             while(n1 == 0){
               System.out.println("========== MENU ==========");
               System.out.println("01) Inserir um Novo Cliente");
               System.out.println("02) Inserir um Novo Animal");
               System.out.println("03) inserir um Novo Veterinário");
               System.out.println("04) Voltar\n\n");
               System.out.print("Digite a opção desejada: ");
               op1 = sc.nextInt();
               sc = new Scanner(System.in);
                switch (op1){
                    case 1:
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
                            op5 = sc.nextInt(); 
                            switch(op5){
                                case 1:
                                  Cachorro cachorro = new Cachorro();
                                  cachorro.setNome(nomeA);
                                  cachorro.setIdade(idadeA);
                                  cachorro.setTamanho(tamanho);
                                  cachorro.setPeso(peso);
                                  cachorro.setMatricula(matricula);
                                  cachorro.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                  
                                case 2:
                                  Gato gato = new Gato();
                                  gato.setNome(nomeA);
                                  gato.setIdade(idadeA);
                                  gato.setTamanho(tamanho);
                                  gato.setPeso(peso);
                                  gato.setMatricula(matricula);
                                  gato.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                case 3:
                                  Coelho coelho = new Coelho();
                                  coelho.setNome(nomeA);
                                  coelho.setIdade(idadeA);
                                  coelho.setTamanho(tamanho);
                                  coelho.setPeso(peso);
                                  coelho.setMatricula(matricula);
                                  coelho.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                case 4:
                                  Hamster hamster = new Hamster();
                                  hamster.setNome(nomeA);
                                  hamster.setIdade(idadeA);
                                  hamster.setTamanho(tamanho);
                                  hamster.setPeso(peso);
                                  hamster.setMatricula(matricula);
                                  hamster.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                  
                                case 5:
                                  PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
                                  porquinho.setNome(nomeA);
                                  porquinho.setIdade(idadeA);
                                  porquinho.setTamanho(tamanho);
                                  porquinho.setPeso(peso);
                                  porquinho.setMatricula(matricula);
                                  porquinho.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                case 6:
                                    System.out.println("\n\nDeculpe! no momento não estamos atendendo outro tipo de Animal.\n");
                                    break;
                            }
                            n5 = 1;
                       }
                        n5 = 0;
                            continue;
                    case 2:
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
                            op5 = sc.nextInt(); 
                            switch(op5){
                                case 1:
                                  Cachorro cachorro = new Cachorro();
                                  cachorro.setNome(nomeA);
                                  cachorro.setIdade(idadeA);
                                  cachorro.setTamanho(tamanho);
                                  cachorro.setPeso(peso);
                                  cachorro.setMatricula(matricula);
                                  cachorro.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                  
                                case 2:
                                  Gato gato = new Gato();
                                  gato.setNome(nomeA);
                                  gato.setIdade(idadeA);
                                  gato.setTamanho(tamanho);
                                  gato.setPeso(peso);
                                  gato.setMatricula(matricula);
                                  gato.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                case 3:
                                  Coelho coelho = new Coelho();
                                  coelho.setNome(nomeA);
                                  coelho.setIdade(idadeA);
                                  coelho.setTamanho(tamanho);
                                  coelho.setPeso(peso);
                                  coelho.setMatricula(matricula);
                                  coelho.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                case 4:
                                  Hamster hamster = new Hamster();
                                  hamster.setNome(nomeA);
                                  hamster.setIdade(idadeA);
                                  hamster.setTamanho(tamanho);
                                  hamster.setPeso(peso);
                                  hamster.setMatricula(matricula);
                                  hamster.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                  
                                case 5:
                                  PorquinhoDaIndia porquinho = new PorquinhoDaIndia();
                                  porquinho.setNome(nomeA);
                                  porquinho.setIdade(idadeA);
                                  porquinho.setTamanho(tamanho);
                                  porquinho.setPeso(peso);
                                  porquinho.setMatricula(matricula);
                                  porquinho.setRaca(raca);
                                  System.out.println("\nNovo Cliente e Animal Inserido com Sucesso\n\n");
                                  break;
                                case 6:
                                    System.out.println("\n\nDeculpe! no momento não estamos atendendo outro tipo de Animal.\n");
                                    break;
                            }
                            n5 = 1;
                       }
                        n5 = 0;
                        continue;
                    case 3:  
                        System.out.println("========== Veterinário ==========");
                        System.out.print("\nDigite o Nome do Veterinário: ");
                        nome = sc.nextLine();
                        veterinario.setNome(nome);
                        System.out.print("\nDigite a sua Especialidade: ");
                        especialida = sc.nextLine();
                        veterinario.setEspecialidade(especialida);
                        System.out.print("\nDigite a idade: ");
                        idadeV = sc.nextInt();
                        veterinario.setIdade(idadeV);
                        especialida = sc.nextLine();
                        System.out.println("\nNovo Veterinário inserido com Sucesso\n\n");
                        continue;
                    case 4:
                        n1 = 1;
              }
                }
                    n1 = 0;
                    break;
          case 2:
              while(n2 == 0){
                  System.out.println("========== MENU ==========");
                  System.out.println("01) Remover um Cliente");
                  System.out.println("02) Remover um Animal");
                  System.out.println("03) Remover um Veterinário");
                  System.out.println("04) Voltar");
                  System.out.print("\nDigite a opção desejada: ");
                  op2 = sc.nextInt();	
                  switch (op2){
                    case 1:
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
                    case 2:
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
                    case 3:
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
                    case 4:
                        n2 = 1;
                 }
              }
              n2 = 0;
              break;
          case 3:
              while(n3 == 0){
              System.out.println("========== MENU ==========");
              System.out.println("01) Ver Historico");
              System.out.println("02) Gerar Diagnostico");
              System.out.println("03) Iniciar Tratamento");
              System.out.println("04) Voltar");
              System.out.print("\n\nDigite a opção desejada: ");
              op3 = sc.nextInt();	
              switch (op3){
                    case 1:
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        nomeA = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.println("\n\nHistorico de Animal\n\n");
                        continue;
                    case 2:
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
                    case 3:
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        nomeA = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.println("\n\nTratamento iniciado\n\n");
                        continue;
                    case 4:
                        n3 = 1;
              }
              }
              n3 = 0;
              break;
          case 4:
               while(n4 == 0){
                   System.out.println("========== MENU ==========");
                   System.out.println("01) Listar Animais Cadastrados");
                   System.out.println("02) Listar Animais do Cliente");
                   System.out.println("03) Listar veterinários da Clinica");
                   System.out.println("04) Voltar");
                   System.out.print("\n\nDigite a opção desejada: ");
                   op4 = sc.nextInt();
                    switch (op4){
                        case 1:
                            System.out.println("\n\nListando de Animal\n\n");
                            continue;
                        case 2:
                            System.out.println("========== Cliente ==========");
                            System.out.print("\nDigite o nome do Cliente: ");
                            sc = new Scanner(System.in);
                            nome = sc.nextLine();
                            System.out.print("\nDigite seu CPF: ");
                            cpf = sc.next();
                            System.out.print("\nDigite seu RG: ");
                            rg = sc.next();
                            System.out.println("\n\nListando Animais do Clientes\n\n");
                            continue;
                        case 3:
                            System.out.println("\n\nListando Veterinários\n\n");
                            continue;
                        case 4:
                           n4 = 1;

                   }
                }
                  n4 = 0;
                   break;
               case 5:
                   n = 1;
            }
        }
        System.out.println("\n\nPrograma Encerrado\n\n");
    }
}
