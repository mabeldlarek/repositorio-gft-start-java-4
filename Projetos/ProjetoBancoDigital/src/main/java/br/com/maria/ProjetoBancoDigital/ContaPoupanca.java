package br.com.maria.ProjetoBancoDigital;

public class ContaPoupanca extends Conta {
	double taxaSaque;
	double taxaTransferência;
	
	public ContaPoupanca() {
		super();
	}

	public void imprimirExtrato(){
		System.out.println("-----Extrato conta poupança------");
		super.imprimirExtrato();
	}
	
}
