package br.com.maria.ProjetoBancoDigital;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data public abstract class Conta implements Funcionalidades {
	private Integer numeroConta;
	private Integer senha;
	private Double saldo;
	
	public void depositar() {
		
	};
	
	public void sacar() {
		
	};
	
	public void transferir() {
		
	};
	
}
