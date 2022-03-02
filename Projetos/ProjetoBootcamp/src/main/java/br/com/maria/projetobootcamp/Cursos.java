package br.com.maria.projetobootcamp;

import lombok.Data;

@Data
public class Cursos extends Conteudo {
	private int cargaHoraria;
	private int cargaHorariaRealizada;
	
	public Cursos(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	public int calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
}
