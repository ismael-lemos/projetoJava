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
    private ArrayList<Cachorro> cachorros = new ArrayList();
    private ArrayList<Gato> gatos = new ArrayList();
    private ArrayList<Coelho> coelhos = new ArrayList();
    private ArrayList<Hamster> hamsters = new ArrayList();
    private ArrayList<PorquinhoDaIndia> porquinhos = new ArrayList();
    
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
        clientes.add(cliente);
    }
    
    public void inserirAnimal(Animal animal, Cliente cliente){
        animais.add(animal);
        cliente.inserirAnimalEmC(animal);
        if(animal.getTipo() == "Cachorro"){
            cachorros.add((Cachorro) animal);
        }
        if(animal.getTipo() == "Gato"){
          gatos.add((Gato) animal);
        }
        if(animal.getTipo() == "Hamster"){
            hamsters.add((Hamster) animal);
        }
        if(animal.getTipo() == "Coelho"){
            coelhos.add((Coelho) animal);
        }
        if(animal.getTipo() == "Porquinho"){
            porquinhos.add((PorquinhoDaIndia) animal);
        }
        }
    
    public void inserirVeterinario(Veterinario veterinario){
        veterinarios.add(veterinario);
    } 
    public void removerCliente(Cliente cliente){
        boolean existe=false;
        for(Cliente c : clientes){
            if(c.getCpf().equals(cliente.getCpf()) ){
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("O Cliente já existe");
        } else{
            clientes.remove(cliente);
        }
    }
    public void removerAnimal(Animal animal){
        boolean existe=false;
        for(Animal a : animais){
            if(a.getMatricula().equals(animal.getMatricula()) ){
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("O animal não ja existe"); 
        } else{
            animais.remove(animal);
        }
    }
    
    
    public void removerVeterinario(Veterinario veterinario){
        boolean existe=false;
        for(Veterinario v : veterinarios){
            if(v.getCpf().equals(veterinario.getCpf()) ){
                existe=true;
                break;
            }
        }
        if(!existe){
            System.out.println("O não Veterinário já existe");
        } else{
            veterinarios.remove(veterinario);
        }
    }
    
    public void listarAnimais(){
       for(Animal a : animais){
           System.out.println("Nome: " + a.getNome() + 
                              "\nMatricula: " + a.getMatricula() + 
                              "\nRaça: " + a.getRaca()+
                              "\nTamanho: " + a.getTamanho() + 
                              "\nPeso: " + a.getPeso() +
                              "\nIdade: " + a.getIdade() +
                              "\nGenero: " + a.getGenero() + "\n\n");
       }
    }
    
    public void listarCachorros(){
        for(Cachorro c : cachorros){
           System.out.println("Nome: " + c.getNome() + 
                              "\nMatricula: " + c.getMatricula() + 
                              "\nRaça: " + c.getRaca()+
                              "\nTamanho: " + c.getTamanho() + 
                              "\nPeso: " + c.getPeso() +
                              "\nIdade: " + c.getIdade() +
                              "\nGenero: " + c.getGenero() + "\n\n");
        }
    }
      
    
    public void listarGatos(){
        for(Gato g : gatos){
           System.out.println("Nome: " + g.getNome() + 
                              "\nMatricula: " + g.getMatricula() + 
                              "\nRaça: " + g.getRaca()+
                              "\nTamanho: " + g.getTamanho() + 
                              "\nPeso: " + g.getPeso() +
                              "\nIdade: " + g.getIdade() +
                              "\nGenero: " + g.getGenero() + "\n\n");
        }
    }
    
    public void listarCoelhos(){
        for(Coelho c : coelhos){
           System.out.println("Nome: " + c.getNome() + 
                              "\nMatricula: " + c.getMatricula() + 
                              "\nRaça: " + c.getRaca()+
                              "\nTamanho: " + c.getTamanho() + 
                              "\nPeso: " + c.getPeso() +
                              "\nIdade: " + c.getIdade() +
                              "\nGenero: " + c.getGenero() + "\n\n");
        }
    }
    
    public void listarHamisters(){
        for(Hamster h : hamsters){
           System.out.println("Nome: " + h.getNome() + 
                              "\nMatricula: " + h.getMatricula() + 
                              "\nRaça: " + h.getRaca()+
                              "\nTamanho: " + h.getTamanho() + 
                              "\nPeso: " + h.getPeso() +
                              "\nIdade: " + h.getIdade() +
                              "\nGenero: " + h.getGenero() + "\n\n");
        }
    }
    public void listarPorquinhos(){
        for(PorquinhoDaIndia p : porquinhos){
           System.out.println("Nome: " + p.getNome() + 
                              "\nMatricula: " + p.getMatricula() + 
                              "\nRaça: " + p.getRaca()+
                              "\nTamanho: " + p.getTamanho() + 
                              "\nPeso: " + p.getPeso() +
                              "\nIdade: " + p.getIdade() +
                              "\nGenero: " + p.getGenero() + "\n\n");
        }
    }
    public void listarClientes(){
        for(Cliente c : clientes){
           System.out.println("Nome: " + c.getNome() + 
                              "\nCPF: " + c.getCpf() + 
                              "\nRG: " + c.getRg() +
                              "\nEndereço: " + c.getEndereco()+ 
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
       cliente.listarAnimais();
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
                     System.out.println("entrou aqui cpf...");
                    break;
                } 
            }
           if(existe == false){
               for(Veterinario v : veterinarios){
                if(veterinario.getEspecialidade().equalsIgnoreCase(v.getEspecialidade())){
                    especialidadeExiste = true;
                    System.out.println("entrou aqui especialidade...");
                    break;
                }
               }
               if(especialidadeExiste == false){
                   veterinarios.add(veterinario);
                    System.out.println("entrou aqui...");
               }
           } 
        }
    }
}
