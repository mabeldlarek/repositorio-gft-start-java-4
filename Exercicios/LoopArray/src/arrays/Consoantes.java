package arrays;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		int total=0;
		String vetor[] = new String [6];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("\nDigite a letra: ");
			String letra = entrada.next();
			
			if(letra.equalsIgnoreCase("a")| letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u")) {
				total++;
				vetor[i] = letra;
			}
		}

		System.out.println("\nO total de consoantes é: " + total + ". As consoantes são:\n" );
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]!= null)
				System.out.println(vetor[i]);
		}
	}
}
