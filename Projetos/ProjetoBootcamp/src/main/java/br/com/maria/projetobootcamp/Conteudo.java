package br.com.maria.projetobootcamp;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public abstract class Conteudo {
	protected static final int XP_PADRAO = 10;
	private String titulo;
	private String descricao;

	public abstract int calcularXp();

	public void descreverConteudo() {
		System.out.println("TÍTULO: " + titulo + "\nDESCRIÇÃO: " + descricao +"\n");
	}
}
