package loops;

import java.util.Scanner;

public class Ex1_NomeIdade {
	public static void main(String[] args) {
		String nome;
		int idade = -1;
		
		while(idade != 0) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome = entrada.nextLine();
		
		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();
		}
	}
}
