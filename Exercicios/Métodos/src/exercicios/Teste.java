package exercicios;

public class Teste {

	public static void main(String[] args) {
		System.out.println("Exercicio um sendo executado:");
		
		Um operacao = new Um();
		Um mensagem = new Um();
		Um emprestimo = new Um();
		
		operacao.escolhaOperacao(1, 2, 2);
		
		mensagem.printarMensagem(14);
		
		emprestimo.calcularEmprestimo(50.000, 24);
		
		System.out.println("------------------------------");
		
		System.out.println("Exercicio dois sendo executado:");
		
		Dois ex2 = new Dois();
		ex2.calcularArea(5);
		ex2.calcularArea(2, 6);
		ex2.calcularArea(5, 3, 4);
		
		System.out.println("------------------------------");
		
		System.out.println("Exercicio tr�s sendo executado:");
		
		Tr�s ex3 = new Tr�s();
		System.out.println(ex3.calcularArea(5));
		System.out.println(ex3.calcularArea(2, 6));
		System.out.println(ex3.calcularArea(5, 3, 4));
		
		System.out.println("------------------------------");

	}

}
