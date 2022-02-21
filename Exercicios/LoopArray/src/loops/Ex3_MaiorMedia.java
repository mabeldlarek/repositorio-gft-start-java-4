package loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
	public static void main(String[] args) {
		int total=0, num, maior=0, i=0, media;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número");
			num = entrada.nextInt();
			total = total + num;
			i++;
			
			if(maior<num) 
				maior = num;
			
		} while(i!=5);
		
		media = total/5;
		
		System.out.println("O maior número é: " + maior + "\nA média é:" + media);
	}
}
