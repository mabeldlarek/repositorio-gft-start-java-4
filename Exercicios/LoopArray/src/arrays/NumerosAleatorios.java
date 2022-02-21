package arrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

	public static void main(String[] args) {
		int vet[]= new int [20];
		
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = aleatorio.nextInt(100);
		}
		
		System.out.println("Os números são:");
		for(int i=0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
