package br.com.maria.ProjetoBancoDigital;

import lombok.Data;
import java.util.Random;
import java.util.Scanner;

@Data
public class Banco {
	private String nome;
	private Integer cnpj;
	private Conta [] conta;
	
	Scanner entrada = new Scanner(System.in);
	
	public Banco() {
		super();
		this.nome = "Banco Brasil";
		this.cnpj = 80080800;
		this.conta = new Conta[3];
	}
	
	private void vincularConta (int i) {
		System.out.println("Digite o tipo da conta:\n1-CONTA CORRENTE  2-CONTA POUPANÇA");
		int op = entrada.nextInt();
		
		if(op==1) {
			conta[i] = new ContaCorrente();
		}
		
		else if(op==2) {
			conta[i] = new ContaPoupanca();
		}
	}
	
	public void registrarClientes(String nome) {
		for(int i=0; i<this.conta.length; i++ ) {
			if(this.conta[i] == null) {
				vincularConta(i);
				Cliente cliente = new Cliente(nome);
				this.getConta()[i].setCliente(cliente);
				break;
			}
		}
	}
	
	private int localizarConta(int numConta) {
		int indiceConta = 0;
		for(int i=0; i<this.conta.length; i++) {
			if(this.getConta()[i].getNumero() == numConta) {
				indiceConta = i;
				break;
			}
		}
		
		return indiceConta;
	}
	
	public void efetuarAcoes() {
		double valor = 0.00;
		
		System.out.println("Digite o numero da sua conta:");
		Integer num = entrada.nextInt();
		
		int c = localizarConta(num);
		
		System.out.println("Digite que operação você deseja realizar:\n1-DEPÓSITO  2-SAQUE  3-TRANSFERÊNCIA");
		Integer op = entrada.nextInt();
		
		switch(op) {
		case 1: 
			System.out.println("Digite o valor de depósito: "); 
			valor = entrada.nextDouble();
			this.getConta()[c].depositar(valor);
			break;
		case 2:
			System.out.println("Digite o valor de saque: "); 
			valor = entrada.nextDouble();
			this.getConta()[c].sacar(valor);
			break;
		case 3:
			System.out.println("Digite o valor de tranferência: ");
			valor = entrada.nextDouble();
			
			System.out.println("Digite o número da conta a ser efetuada a tranferência: ");
			Integer numReceptor = entrada.nextInt();
			
			int cP = localizarConta(numReceptor);
			
			this.getConta()[c].transferir(this.conta[cP], valor);
			
			break;
		}
	}
	
	public void imprimirExtratoBanco() {
		System.out.println("O banco possui as seguintes contas:\n");
		for(int i=0; i<this.conta.length; i++) {
			if(this.conta[i]!=null)
			System.out.println(this.conta[i].toString() + "\n");
		}
	}
}
	
