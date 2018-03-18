package model;

/*
 * Classe che modella la tabella Tessera del database
 */

public class Tessera {

	private int id;
	private String nome;
	private String cognome;
	private String indirizzo;
	
	public Tessera() {
		id=-1;
		nome="";
		cognome="";
		indirizzo="";
	}

	public Tessera(int id, String nome, String cognome, String indirizzo) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Tessera [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + "]";
	}
}
