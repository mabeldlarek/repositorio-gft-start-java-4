package loops;

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		int nota = -1;
		
		Scanner entrada = new Scanner(System.in);
		
		while(nota<0 | nota>10) {
			System.out.println("Digite sua nota:");
			nota = entrada.nextInt();
			
			if(nota<0 | nota>10) {
				System.out.println("Nota inválida");
			}
		}
	}

}
