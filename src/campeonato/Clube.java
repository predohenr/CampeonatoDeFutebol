package campeonato;

public class Clube {
	String nome;
	int pontos;
	int saldoGols;
	public Clube(String nome) {
		this.nome = nome;
		this.pontos = 0;
		this.saldoGols = 0;
	}
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getSaldoGols() {
		return saldoGols;
	}
	public void setSaldoGols(int saldoGols) {
		this.saldoGols = saldoGols;
	}


	void ganhar(int saldoGols){
		this.setPontos(this.getPontos() + 3);
		this.setSaldoGols(this.getSaldoGols() + saldoGols);
	}
	
	void empatar() {
		this.setPontos(this.getPontos() + 1);
	}
	
	void perder(int saldoGols) {
		this.setSaldoGols(this.getSaldoGols() + saldoGols);
	}
	public String toString() {
		return "**    " + this.getNome() + "    **    Pontos: " + this.getPontos() +
				"    **    Saldo de gols: " + this.getSaldoGols();
	}
}
