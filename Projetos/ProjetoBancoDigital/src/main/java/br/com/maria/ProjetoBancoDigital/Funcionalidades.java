package br.com.maria.ProjetoBancoDigital;

public interface Funcionalidades {
	void depositar(Double valor);
	void sacar(Double valor);
	void transferir(Integer numConta, Double valor);
}
