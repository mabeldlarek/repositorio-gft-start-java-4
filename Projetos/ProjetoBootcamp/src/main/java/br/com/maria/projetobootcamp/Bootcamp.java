package br.com.maria.projetobootcamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Bootcamp {
	private String nome;
	private String descricao;
	private List <Devs> devs;
	private List <Conteudo> conteudos;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
}
