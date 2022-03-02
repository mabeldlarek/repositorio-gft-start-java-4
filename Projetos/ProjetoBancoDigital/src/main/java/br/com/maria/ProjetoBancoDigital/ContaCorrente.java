package br.com.maria.ProjetoBancoDigital;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super();
		
	}
	
	public void imprimirExtrato(){
		System.out.println("-----Extrato conta corrente------");
		super.imprimirExtrato();
	}
	
}
