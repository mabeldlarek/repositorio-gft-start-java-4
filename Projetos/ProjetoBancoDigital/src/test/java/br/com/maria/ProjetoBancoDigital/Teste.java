package br.com.maria.ProjetoBancoDigital;

public class Teste {

	public static void main(String[] args) {
		Banco bancoBR = new Banco();
		
		bancoBR.registrarClientes("Maria");
		bancoBR.registrarClientes("Maria");
		bancoBR.registrarClientes("João");
		bancoBR.efetuarAcoes();
		bancoBR.getConta()[1].imprimirExtrato();
		bancoBR.getConta()[2].imprimirExtrato();
	}
}
