package loops;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		int n, fatorial = 1;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número que se deseja o fatorial:");
		n = entrada.nextInt();
		
		for(int i=1; i<=n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println("O fatorial de : " + n + " é: " + fatorial);

	}

}

