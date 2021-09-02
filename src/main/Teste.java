package Main;

import campeonato.Campeonato;

public class Teste {
	public static void main(String[] args) {
		String[] nomeTimes = {"Flamengo        ", "Internacional   ", "Fluminense      ",
				"Atletico Mineiro", "Sao Paulo       ", "Gremio          ", "Santa Cruz      ",
				"Palmeiras       ", "Santos          ", "Ceara           ", "Corinthians     ",
				"Bahia           ", "Fortaleza       ", "Botafogo        ", "Goias           "};
		int j = nomeTimes.length;
		Campeonato camp = new Campeonato(j);
		for(int i = 0; i < j; i++) {
			camp.criarClube(nomeTimes[i]);
		}
		
		camp.jogarCampeonato();
		System.out.println("Campeao: " + camp.getCampeao().getNome());
		camp.Tabela();
	}
}
