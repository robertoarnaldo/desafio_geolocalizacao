package br.com.sulamerica.desafio.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PrestadorSaude {

	@NotNull
	@NotEmpty
	private String nome;
	private String endereco;
	private String especialidade;

	public PrestadorSaude(String nome, String endereco, String especialidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.especialidade = especialidade;
	};
	
}
