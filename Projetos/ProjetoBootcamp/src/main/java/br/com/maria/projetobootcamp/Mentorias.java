package br.com.maria.projetobootcamp;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Mentorias extends Conteudo {
	private LocalDate data;

	public Mentorias(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}
	
	public int calcularXp() {
		return XP_PADRAO + 20;
	}
}
