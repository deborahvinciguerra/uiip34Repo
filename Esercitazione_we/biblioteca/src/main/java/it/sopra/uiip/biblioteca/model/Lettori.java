package it.sopra.uiip.biblioteca.model;

public class Lettori {
	private String codiceFiscale;
	private String nome;
	private String indirizzo;
	
	public Lettori() {
		this.codiceFiscale = "";
		this.nome = "";
		this.indirizzo = "";
	}

	public Lettori(String codiceFiscale, String nome, String indirizzo) {
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Lettori [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
	
	
	
}

