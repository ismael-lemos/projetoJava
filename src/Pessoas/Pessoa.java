package Pessoas;

/**
 *
 * @author Ismael de Oliveira
 */
public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected String genero;
    protected int idade;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
