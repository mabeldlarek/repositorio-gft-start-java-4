package br.com.maria.ProjetoBancoDigital;

public class ContaPoupança extends Conta {

	public ContaPoupança(Integer numeroConta, Integer senha, Double saldo) {
		super(numeroConta, senha, saldo);
	}

	@Override
	public void depositar(Double valor) {
		this.setSaldo(getSaldo() + valor);
	}

	@Override
	public void sacar(Double valor) {
		this.setSaldo(getSaldo() - valor );
	}

	@Override
	public void transferir(Integer numConta, Double valor) {
		double taxaTranferencia = 1.50;
		this.setSaldo(getSaldo() - valor + taxaTranferencia);
	};
}
