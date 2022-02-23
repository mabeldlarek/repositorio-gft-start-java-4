package br.com.maria.ProjetoBancoDigital;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data public class Cliente {
	private String nome;
	private int cpf;
	private Conta conta;
	
}
