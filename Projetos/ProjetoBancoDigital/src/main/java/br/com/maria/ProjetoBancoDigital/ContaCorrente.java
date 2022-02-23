package br.com.maria.ProjetoBancoDigital;

public class ContaCorrente extends Conta {

	public ContaCorrente(Integer numeroConta, Integer senha, Double saldo) {
		super(numeroConta, senha, saldo);
	}

	@Override
	public void depositar(Double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	@Override
	public void sacar(Double valor) {
		double taxaSaque = 1.40;
		this.setSaldo(this.getSaldo() - (valor + taxaSaque));
	}

	@Override
	public void transferir(Integer numConta, Double valor) {
		double taxaTranferencia = 1.10;
		this.setSaldo(getSaldo() - (valor + taxaTranferencia));
	};

}
