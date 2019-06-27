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
	private String doencaDiagnosticada;
	private String nomeDoVeterinario;

	public String getNomeDoVeterinario() {
		return nomeDoVeterinario;
	}


	public void setNomeDoVeterinario(String nomeDoVeterinario) {
		this.nomeDoVeterinario = nomeDoVeterinario;
	}


	public String getDoencaDiagnosticada() {
		return doencaDiagnosticada;
	}


	public void setDoencaDiagnosticada(String doencaDiagnosticada) {
		this.doencaDiagnosticada = doencaDiagnosticada;
	}


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
}
