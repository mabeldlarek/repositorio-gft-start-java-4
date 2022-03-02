package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Double mediaSemestral= 0.0;
		List<Double> temp = new ArrayList();
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.println("Informe a temperatura m�dia do m�s "+ (i+1) + ":");
			temp.add(entrada.nextDouble());
			mediaSemestral+=mediaSemestral;
		}
		
		mediaSemestral = mediaSemestral/6;
		
		System.out.println("\nO(s) m�s(es) com m�dia maior que a m�dia semestral �/s�o:");
		for(int i=0; i<6; i++) {
			if(temp.get(i) > mediaSemestral) {
				switch(i) {
				case 1:
					System.out.println("1 - Janeiro\n");
					break;
				case 2:
					System.out.println("2 - Fevereiro\n");
					break;
				case 3:
					System.out.println("3 - Mar�o\n");
					break;
				case 4:
					System.out.println("4 - Abril\n");
					break;
				case 5 :
					System.out.println("5 - Maio\n");
					break;
				case 6:
					System.out.println("6 - Junho\n");
					break;
				}
			}
			
		}
	}
}



