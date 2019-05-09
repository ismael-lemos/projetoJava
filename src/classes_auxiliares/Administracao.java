package classes_auxiliares;

import Pessoas.Cliente;
import Pessoas.Veterinario;
import animais.Animal;
import java.util.*;

/**
 *
 * @author Ismael
 */
public class Administracao {
    private ArrayList<Animal> animais = new ArrayList();
    private ArrayList<Veterinario> veterinarios = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    
    public void inserirCliente(Cliente cliente){
        boolean existe=false;
        for(Cliente c : clientes){
            if(c.getCpf().equals(cliente.getCpf()) ){
                existe=true;
                break;
            }
        }
        if(!existe){
            clientes.add(cliente);
        } else{
            System.out.println("O Cliente já existe");
        }
    }
    
    public void inserirAnimal(Animal animal){
        boolean existe=false;
        for(Animal a : animais){
            if(a.getMatricula().equals(animal.getMatricula()) ){
                existe=true;
                break;
            }
        }
        if(!existe){
            animais.add(animal);
        } else{
            System.out.println("O animal ja existe");
        }
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
    public void inserirVeterinario(Veterinario veterinario){
       boolean existe=false;
        for(Veterinario v : veterinarios){
            if(v.getCpf().equals(veterinario.getCpf()) ){
                existe=true;
                break;
            }
        }
        if(!existe){
            veterinarios.add(veterinario);
        } else{
            System.out.println("O Veterinário já existe");
        }
    } 
    
    public void listarAnimais(){
        System.out.println("Listando Animais...");
    }
    public void listarClientes(){
        System.out.println("Listando Animais...");
    }
    
}
