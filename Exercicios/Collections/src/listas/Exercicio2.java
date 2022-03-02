package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int positivo = 0;
		
		List<String> respostas = new ArrayList();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima?");
		respostas.add(entrada.nextLine());
		
		System.out.println("Esteve no local do crime?");
		respostas.add(entrada.nextLine());
		
		System.out.println("Mora perto da vítima?");
		respostas.add(entrada.nextLine());
		
		System.out.println("Devia para a vítima?");
		respostas.add(entrada.nextLine());
		
		System.out.println("Já trabalhou com a vítima?");
		respostas.add(entrada.nextLine());
		
		for(int i=0; i<respostas.size();i++) {
			if(respostas.get(i).equals("sim")) {
				positivo++;
			}
		}
		
		if(positivo == 2) 
			System.out.println("Suspeita");
		
		else if(positivo == 3 | positivo == 4) 
			System.out.println("Cúmplice");
		
		else if(positivo == 5)
			System.out.println("Assassina");
		
		else
			System.out.println("Inocente");
	}
}

