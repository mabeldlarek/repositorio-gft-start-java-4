package loops;

import java.util.Scanner;

public class Ex4_ParImpar {

	public static void main(String[] args) {
		int num, n, i=0, impar=0, par=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de números:");
		n = entrada.nextInt();
		 
		do {
			System.out.println("\nDigite o número " + (i+1) + " :");
			num = entrada.nextInt();
			
			if(num % 2 > 0) {
				impar++;
			}
			else
				par++;
			
			i++;
				
		}while(i<n);
		
		System.out.println("A quantidade de números ímpares: " + impar);
		System.out.println("A quantidade de números pares: " + par);
	}
}
	
