package classes_auxiliares;

import Pessoas.Veterinario;
import animais.*;
/**
 *
 * @author Ismael de Oliveira
 */

public class Consulta {
	private String data;
	private String descricao;


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public void iniciarConsulta(Animal animal, String doenca) {
		Administracao admin = new Administracao();
		if(admin.veterinarioExiste(animal) == true) {
			diagnostico(animal, doenca);
		}
		else {
			System.out.println("Não temos Veterinário para atender seu " + animal.getTipo() + "no momento");
		}

	}

	public void diagnostico(Animal animal, String doenca) {
		Administracao admin = new Administracao();
		if(admin.animalExiste(animal) == true) {
			admin.doencaAnimal(animal, doenca);
		}
	}

	public void tratamento(Animal animal) {
		Administracao admin = new Administracao();
		String estado = "Saudavel";
		if(admin.animalExiste(animal) == true) {
			if(admin.animalEstaDoente(animal) == true) {
				admin.doencaAnimal(animal, estado);
			}
			else {
				System.out.println("Seu animal não está doente");
			}
		}
		else {
			System.out.println("Esse animal não existe em nosso Banco de Dados");
		}

	}


}
