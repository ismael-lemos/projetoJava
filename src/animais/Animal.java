package animais;

import java.util.ArrayList;

import Pessoas.Cliente;
import classes_auxiliares.Consulta;
/**
 *
 * @author Ismael
 */
public abstract class Animal {
    //Atributos da classe Animal
    protected String nome;
    protected float idade;
    protected float peso;
    protected float tamanho;
    protected String raca; //Ra�a
    protected String genero;
    protected String matricula;
    protected String doenca;
    protected String tipo;
    protected ArrayList<Consulta> consultas = new ArrayList();
    //Metodos Gets e Sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
    public void inserirconsuta(Consulta consulta) {
    	consultas.add(consulta);
    }
    public void listarConsultas() {
    	for(Consulta c : consultas) {
    		System.out.println("Descri��o: " + c.getDescricao() +
    		"Data: " + c.getData());
    	}
    }
    
}
