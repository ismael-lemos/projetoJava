package animais;

/**
 *
 * @author Ismael de Oliveira
 */
public class Cachorro extends Animal {
    //String doenca[] = {"raiva", "cinomose", "doença periodental", "parvovirose", "câncer", "leptospirose", "hepatite infecciosa"};
    public Cachorro(String nome, String matricula, String raca, String genero, float idade, float tamanho, String doenca) {
        this.nome = nome;
        this.matricula = matricula;
        this.raca = raca;
        this.genero = genero;
        this.idade = idade;
        this.tamanho = tamanho;
        this.doenca = doenca;
    }
    
    
}
