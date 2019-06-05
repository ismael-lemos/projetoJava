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
			admin.diagnostico(animal, doenca);
		}
		else {
			System.out.println("Não temos Veterinário para atender seu " + animal.getTipo() + "no momento");
		}
		
	}
}