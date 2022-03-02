package arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayMultidimensional {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int maior=0, menor, linha=0, coluna=0;
		
		Random aleatorio = new Random();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				matriz[i][j] = aleatorio.nextInt(9);
			
				if(maior < matriz[i][j]) {
					maior = matriz[i][j];
				}
			}
		}
		
		menor = maior; 
			
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println("O menor número é: " + menor +
				"\nE está na linha: " + linha + " e coluna: " + coluna);
	}
}
