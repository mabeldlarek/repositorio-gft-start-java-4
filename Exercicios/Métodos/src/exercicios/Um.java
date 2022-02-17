package exercicios;

public class Um {
	private double total;
	
	public Um() {
		this.total = 0;
	}

	public void escolhaOperação(int opcao, double valor1, double valor2) {
		switch(opcao) {
		case 1: realizarSoma(valor1, valor2);
			break;
		case 2: realizarSubtracao(valor1, valor2);
			break;
		case 3: realizarMultiplicacao(valor1, valor2);
			break;
		case 4: realizarDivisao(valor1, valor2);
			break;
		}
	}
	
	private void realizarSoma(double valor1, double valor2){
		total=valor1+valor2;
		System.out.println("O total é: " + total + "\n");
	}
	
	private void realizarSubtracao(double valor1, double valor2){
		total=valor1-valor2;
		System.out.println("O total é: " + total + "\n");
	}
	
	private void realizarMultiplicacao(double valor1, double valor2){
		total=valor1*valor2;	
		System.out.println("O total é: " + total + "\n");
	}
	
	private void realizarDivisao(double valor1, double valor2){
		total=valor1/valor2;
		System.out.println("O total é: " + total + "\n");
	}
	
	public void printarMensagem(int hora) {
		if(hora>0 && hora<12) {
			System.out.println("Bom dia\n");
		}
		else if(hora>=12 && hora<18) {
			System.out.println("Boa Tarde\n");
		}
		else {
			System.out.println("Boa Noite\n");
		}
		
	}
	
	public void calcularEmprestimo(double valor, int parcela) {
		double taxa=0;
		
		if(parcela>0 && parcela <24) {
			taxa = ((valor)*(0.5/100))* parcela;
		}
		
		else if(parcela>=24 && parcela <48) {
			taxa = ((valor)*(1.5/100))* parcela;
		}
		
		else if(parcela >48) {
			taxa = ((valor)*(2.5/100))* parcela;
		}
		
		realizarSoma(taxa, valor);
	}
}
