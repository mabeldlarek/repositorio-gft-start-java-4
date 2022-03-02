package br.com.maria.ProjetoBancoDigital;

import lombok.Data;
import java.util.Random;

@Data 
public abstract class Conta {
	private static final int AGENCIA_PADRÃO = 1;
	private static int SEQUENCIA = 0;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta() {
		this.agencia = AGENCIA_PADRÃO;
		this.numero =  SEQUENCIA++;
		this.saldo = 0.0;
	}	
	
	public void depositar(Double valor) {
		this.setSaldo(saldo + valor);
	}

	public void sacar(Double valor) {
		if(saldo > valor) {
		this.setSaldo(saldo - valor);
		}
		else
			System.out.println("Saldo insuficiente para saque");
	}

	public void transferir(Conta contaReceptora, Double valor) {
		double taxaTranferencia = 1.10;
		if(this.getSaldo() >= (valor + taxaTranferencia)) {
			this.setSaldo(this.getSaldo() - (valor + taxaTranferencia));
			contaReceptora.setSaldo(contaReceptora.saldo + valor);
		}
		else
			System.out.println("Saldo insuficiente para transferência");
	}
	
	public void imprimirExtrato(){
		System.out.println("\nCliente: " + this.getCliente().getNome() + "\nNumero da conta: " + numero + "\nSaldo: " + saldo + "\n");
	}
}
