package br.com.maria.projetobootcamp;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Devs {
	private String nome;
	private int xpTotal;
	private List<Conteudo> conteudosInscritos;
	private List<Conteudo> conteudosRealizados;
	
	public Devs(String nome){
		super();
		this.nome = nome;
		this.xpTotal = 0;
		this.conteudosInscritos = new ArrayList();
		this.conteudosRealizados = new ArrayList();
	}
	
	public void inscreverNoBootcamp(Bootcamp bootcamp) {
		conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
	}
	
	
    public void progredir() {
    	Conteudo auxCont = conteudosInscritos.get(0);
    	
    	if(conteudosInscritos.isEmpty() == false) {
    	conteudosInscritos.remove(auxCont);
    	conteudosRealizados.add(auxCont);
    	calcularTotalXp(auxCont);
    	}
    	
    	else
    	System.out.println("Você não está inscrito em nenhum curso");
  
    }
	
	public void calcularTotalXp(Conteudo auxCont) {
		this.setXpTotal(getXpTotal() + auxCont.calcularXp());
	}
	
	public void exibirRelatorioDev() {
		System.out.println("---------RELATÓRIO ALUNO---------------\nNome: " + nome + "\nTotal XP: " + xpTotal );
		System.out.println("\n----------CONTEÚDOS REALIZADOS----------");
		for(int i=0; i<conteudosRealizados.size(); i++) {
			conteudosRealizados.get(i).descreverConteudo();	
		}
			
		System.out.println("----------CONTEÚDOS INSCRITOS----------");
		for(int i=0; i<conteudosInscritos.size(); i++) {
			conteudosInscritos.get(i).descreverConteudo();	
		}
	}
}
