package SquadreDiCalcio;

public class Calciatore {
	private String nome;
	private String cognome;
	private int ngoal;
	
	public Calciatore(String nome, String cognome, int ngoal) {
		this.nome=nome;
		this.cognome=cognome;
		this.ngoal=ngoal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNgoal() {
		return ngoal;
	}

	public void setNgoal(int ngoal) {
		this.ngoal = ngoal;
	}
	
	
}
