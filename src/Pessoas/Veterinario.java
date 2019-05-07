package Pessoas;

/**
 *
 * @author Ismael de Oliveira
 */
public class Veterinario extends Pessoa {
    private String especialidade;

    public Veterinario(String nome, int idade, String genero, String especialidade){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.especialidade = especialidade;
    }

    

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
