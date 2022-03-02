package br.com.maria.projetobootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Conteudo> contBootcamp = new ArrayList();
			
		contBootcamp.add(new Mentorias("Como ingressar no mercado de desenvolvimento de software? ", 
		"Nessa mentoria você irá conhecer os principais métodos de como se destacar no mercado de trabalho. ", LocalDate.now()));
		
		contBootcamp.add(new Cursos ("POO", "Aprenda o essencial de Programação Orientada a Objetos.", 6));
		contBootcamp.add(new Cursos ("Estrutura de Dados", "Conheça as principais estruturas e como utilizá-las.", 5));
		contBootcamp.add(new Cursos ("Banco de Dados", "Aprenda a modelar e realizar consultas basicas em um banco de dados.", 3));
		
		List<Devs> devsBootcamp = new ArrayList();
		devsBootcamp.add(new Devs("Maria"));
		devsBootcamp.add(new Devs("João"));
		
		Bootcamp Java = new Bootcamp("O Essencial de Java", "Aprenda sobre Java, suas principais tecnologias e atribuições.", devsBootcamp, contBootcamp);
		
		devsBootcamp.get(1).inscreverNoBootcamp(Java);
		devsBootcamp.get(1).progredir();
		devsBootcamp.get(1).progredir();
		devsBootcamp.get(1).progredir();
		devsBootcamp.get(1).exibirRelatorioDev();
		
		
		
		
		
		
		// atividades ("POO", "Aprenda o essencial de Programação Orientada a Objetos", 6);
		//("Estrutura de Dados", "Conheça as principais estruturas e como utiliza-lás, 5);
		//("Banco de Dados", "Aprenda a modelar e realizar consultas basicas em um banco de dados", 3);
		
		//mentorias ("Como ingressar no mercado de desenvolvimento de software", "Nessa mentoria você irá conhecer
		//os principais métodos de como se destacar no mercado")
		
		//Devs
		
		
		/*{"POO", "Aprenda o essencial de Programação Orientada a Objetos", 6};
		("Estrutura de Dados", "Conheça as principais estruturas e como utiliza-lás", 5);
		("Banco de Dados", "Aprenda a modelar e realizar consultas basicas em um banco de dados", 3);
		 }};*/
		

	}

}
