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
        int op = 0, op1 = 0, op2 = 0, op3 = 0, op4 = 0, n = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        while(n == 0){
            
            System.out.println("========== MENU ==========");
            System.out.println("01) Inserir");
            
            System.out.println("02) Remover");
            
            System.out.println("03) Iniciar um Consuta");
            
            System.out.println("04) Listar");
            
            System.out.println("05) Sair\n\n");
            System.out.println("Digite a opção desejada: ");
            
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
                              System.out.print("\nDigite o nome do Cliente: ");
                              String nome = sc.nextLine();
                              System.out.print("\nDigite o CPF do Cliente: ");
                              String cpf = sc.nextLine();
                              System.out.print("\nDigite o RG do cliente: ");
                              String rg = sc.nextLine();
                              System.out.println("\nDigite o endereço do cliente: ");
                              String end = sc.nextLine();
                              System.out.println("Novo Cliente Inserido com Sucesso\n\n");
                              continue;
                          case 2:
                              System.out.println("Novo Animal inserido com Sucesso\n\n");
                               continue;
                          case 3:
                              System.out.println("Novo Veterinário inserido com Sucesso\n\n");
                               continue;
                          case 4:
                            n1 = 1;
                    }
                    }
                    break;
                case 2:
                    while(n2 == 0){
                    System.out.println("========== MENU ==========");
                    System.out.println("01) Remover um Cliente");
                    System.out.println("02) Remover um Animal");
                    System.out.println("03) Remover um Veterinário");
                    op2 = sc.nextInt();	
                    switch (op2){
                          case 1:
                              System.out.println("Cliente removido com Sucesso\n\n");
                              continue;
                          case 2:
                              System.out.println("Animal removido com Sucesso\n\n");
                              continue;
                          case 3:
                              System.out.println("Veterinário removido com Sucesso\n\n");
                            
                    }
                    }
                    break;
               case 3:
                   while(n3 == 0){
                   System.out.println("========== MENU ==========");
                   System.out.println("01) Ver Historico");
                   System.out.println("02) Gerar Diagnostico");
                   System.out.println("03) Iniciar Tratamento");
                   System.out.print("\n\nDigite a opção desejada: ");
                   op3 = sc.nextInt();	
                   switch (op3){
                          case 1:
                              System.out.println("Historico de Animal\n\n");
                              continue;
                          case 2:
                              System.out.println("Diagnostico gerado\n\n");
                              continue;
                          case 3:
                              System.out.println("Tratamento iniciado\n\n");
                    }
                   }
                   break;
               case 4:
                   while(n4 == 0){
                       System.out.println("========== MENU ==========");
                       System.out.println("Listar Animais Cadastrados");
                       System.out.println("\tListar Animais do Cliente");
                       System.out.println("\tListar veterinários da Clinica");
                   
                   System.out.print("\n\nDigite a opção desejada: ");
                   op4 = sc.nextInt();
                  
                
                   switch (op4){
                          case 1:
                              System.out.println("Listando de Animal\n\n");
                          case 2:
                              System.out.println("Listando Animais do Clientes\n\n");
                          case 3:
                              System.out.println("Listando Veterinários\n\n");
                   }
                }
                   break;
               case 5:
                   n = 1;
            }
        }
    }
}
