package principal;

//import Pessoas.Veterinario;

import java.util.Scanner;


/**
 *
 * @author Ismael de Oliveira
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int op = 0, op1 = 0, op2 = 0, op3 = 0, op4 = 0, op5 = 0,
    n = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
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
                       String nome = sc.nextLine();
                       System.out.print("\nDigite seu CPF: ");
                       String cpf = sc.next();
                       System.out.print("\nDigite seu RG: ");
                       String rg = sc.next();
                       System.out.print("\nDigite a idade: ");
                       int idadeC = sc.nextInt();
                       sc = new Scanner(System.in);
                       System.out.print("\nDigite o endereço do cliente: ");
                       String end = sc.nextLine();
                       System.out.println("\n========== Animal ==========");
                       System.out.print("\nDigite o Nome do Animal: ");
                       String animal = sc.nextLine();
                       System.out.print("\nDigite a idade: ");
                       float idadeA = sc.nextFloat();
                       System.out.print("\nDigite seu Tamanho: ");
                       float tamanho = sc.nextFloat();
                       System.out.print("\nDigite o Peso do Animal: ");
                       float peso = sc.nextFloat();
                       sc = new Scanner(System.in);
                       System.out.print("\nDigite sua Matricula: ");
                       String matricula = sc.nextLine();
                       /*while(n5 == 0){
                            System.out.println("========== Tipo ==========");
                            System.out.println("01) Cachorro");
                            System.out.println("02) Gato");
                            System.out.println("03) Coelho");
                            System.out.println("04) Hamister");
                            System.out.println("05) Porquinho da india");
                            System.out.println("06) ---");
                            System.out.print("\n\nDigite a opção desejada: ");
                            sc = new Scanner(System.in);
                            op5 = sc.nextInt(); 
                            */
                            System.out.println("\nNovo Cliente Inserido com Sucesso\n\n");
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
                        animal = sc.nextLine();
                        System.out.print("\nDigite o tipo do Animal: (ex: Gato) ");
                        String tipo = sc.nextLine();
                        System.out.print("\nDigite seu Tamanho: ");
                        tamanho = sc.nextFloat();
                        System.out.print("\nDigite seu Peso: ");
                        peso = sc.nextFloat();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.println("\nNovo Animal inserido com Sucesso\n\n");
                        continue;
                    case 3:  
                        System.out.println("========== Veterinário ==========");
                        System.out.print("\nDigite o Nome do Veterinário: ");
                        nome = sc.nextLine();
                        System.out.print("\nDigite a sua Especialidade: ");
                        String esp = sc.nextLine();
                        System.out.print("\nDigite seu CPF: ");
                        cpf = sc.next();
                        System.out.print("\nDigite seu RG: ");
                        rg = sc.next();
                        System.out.print("\nDigite a idade: ");
                        int idadeV = sc.nextInt();
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
                        String nome = sc.nextLine();
                        System.out.print("\nDigite seu CPF: ");
                        String cpf = sc.next();
                        System.out.print("\nDigite seu RG: ");
                        String rg = sc.next();
                        System.out.println("\n\nCliente removido com Sucesso\n\n");
                        continue;
                    case 2:
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        String animal = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        String matricula = sc.next();
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
                        String animal = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        String matricula = sc.next();
                        System.out.println("\n\nHistorico de Animal\n\n");
                        continue;
                    case 2:
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        animal = sc.nextLine();
                        System.out.print("\nDigite sua Matricula: ");
                        matricula = sc.next();
                        System.out.print("\nDigite sua Doença: ");
                        sc = new Scanner(System.in);
                        String doenca = sc.nextLine();
                        System.out.println("\n\nDiagnostico gerado\n\n");
                        continue;
                    case 3:
                        System.out.println("\n========== Animal ==========");
                        System.out.print("\nDigite o Nome do Animal: ");
                        sc = new Scanner(System.in);
                        animal = sc.nextLine();
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
                            String nome = sc.nextLine();
                            System.out.print("\nDigite seu CPF: ");
                            String cpf = sc.next();
                            System.out.print("\nDigite seu RG: ");
                            String rg = sc.next();
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
