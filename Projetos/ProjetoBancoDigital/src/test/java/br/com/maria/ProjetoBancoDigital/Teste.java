package br.com.maria.ProjetoBancoDigital;

public class Teste {

	public static void main(String[] args) {
		
		Conta contaBR1 = new ContaCorrente(2356, 4456, 0.00);
		Conta contaBR2 = new ContaCorrente(7789, 2289, 0.00);
		
		Cliente [] clienteBR = new Cliente [2];
		
		clienteBR[0] = new Cliente("Maria", 000123000, contaBR1);
		
		clienteBR[1]= new Cliente("João", 000456000, contaBR2);
		
		Banco bancoBR = new Banco("BancoBR", 5656, clienteBR);
		
		clienteBR[0].getConta().depositar(10.00);
		clienteBR[1].getConta().depositar(10.00);
		clienteBR[0].getConta().sacar(5.00);
		
		System.out.println(clienteBR[1].toString());
		System.out.println(clienteBR[1].getConta().getSaldo());
	}

}
