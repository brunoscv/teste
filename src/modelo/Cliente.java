package modelo;

public class Cliente {
	
	private String nome;
	private double pontos;
	
	public Cliente(String nome, int pontos) {
		super();
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	
	
}
