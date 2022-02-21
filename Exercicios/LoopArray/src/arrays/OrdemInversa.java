package arrays;

import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {
		int vetor[] = new int [5];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("\nDigite o número " + (i+1) + ":");
			vetor[i] = entrada.nextInt();
		}
		
		System.out.println("A ordem inversa é: ");
		
		for(int i=vetor.length-1; i>=0; --i) {
			System.out.println(vetor[i]);
		}
	}

}
