package loops;

import java.util.Scanner;

public class Ex4_ParImpar {

	public static void main(String[] args) {
		int num, n, i=0, impar=0, par=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de n�meros:");
		n = entrada.nextInt();
		 
		do {
			System.out.println("\nDigite o n�mero " + (i+1) + " :");
			num = entrada.nextInt();
			
			if(num % 2 > 0) {
				impar++;
			}
			else
				par++;
			
			i++;
				
		}while(i<n);
		
		System.out.println("A quantidade de n�meros �mpares: " + impar);
		System.out.println("A quantidade de n�meros pares: " + par);
	}
}
	
