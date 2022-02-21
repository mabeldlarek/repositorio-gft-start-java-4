package loops;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		int n;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número que se deseja a tabuada:");
		n = entrada.nextInt();
		
		System.out.println("A tabuada de " + n + ":\n");
		
		for(int i=1; i<=10; i++) {
			System.out.println(n + " X "+ i + " = " + (n * i) + "\n");
		}

	}

}
