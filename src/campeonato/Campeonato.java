package campeonato;

import java.util.Random;
import java.util.ArrayList;

public class Campeonato {
	private ArrayList<Clube> camp;
	private int qtd;
	public Campeonato(int qtd) {
		this.camp = new ArrayList<Clube>();
		this.qtd = qtd;
	}
	
	public void criarClube(String nome) {
			Clube novo = new Clube(nome);
			this.camp.add(novo);
	}
	
	public void jogarPartida(Clube primeiro, Clube segundo) {
		Random number = new Random();
		int ngolsPrimeiro = number.nextInt(5);
		int ngolsSegundo = number.nextInt(5);
		if (ngolsPrimeiro > ngolsSegundo) {
			primeiro.ganhar(ngolsPrimeiro-ngolsSegundo);
			segundo.perder(ngolsSegundo-ngolsPrimeiro);
		} else if (ngolsPrimeiro < ngolsSegundo){
			segundo.ganhar(ngolsSegundo-ngolsPrimeiro);
			primeiro.perder(ngolsPrimeiro-ngolsSegundo);
		} else {
			segundo.empatar();
			primeiro.empatar();
		}
	}
	
	public void jogarCampeonato() {
		for (int primeiro=0; primeiro<this.getQtd(); primeiro++) {
			for (int segundo=0; segundo<this.getQtd(); segundo++) {
				if(primeiro!=segundo) {
					this.jogarPartida(this.getCamp().get(primeiro), this.getCamp().get(segundo));
				}
			}
		}
	}

	public Clube getCampeao() {
		Clube campeao = this.getCamp().get(0);
		for(int i = 1; i<this.getQtd(); i++) {
			if(this.getCamp().get(i).getPontos() > campeao.getPontos()) {
				campeao = this.getCamp().get(i);
			} else if (this.getCamp().get(i).getPontos() == campeao.getPontos()){
				if (this.getCamp().get(i).getSaldoGols() > campeao.getSaldoGols()) {
					campeao = this.getCamp().get(i);
				} else {
					continue;
				}
			}
		}
		return campeao;
	}
	
	public void Tabela() {
		for (int i = 0; i < this.getQtd(); i++) {
			System.out.println(this.getCamp().get(i).toString());
		}
	}
	
	public ArrayList<Clube> getCamp() {
		return camp;
	}
	public void setCamp(ArrayList<Clube> camp) {
		this.camp = camp;
	}

	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}
