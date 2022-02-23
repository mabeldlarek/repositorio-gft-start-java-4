package br.com.maria.ProjetoBancoDigital;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Banco {
	private String nome;
	private Integer cnpj;
	private Cliente []cliente;
	
}
