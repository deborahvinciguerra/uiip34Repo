package it.sopra.uiip.biblioteca.model;

public class Libri {
	private int idLibro;
	private String titolo;
	private String autori;
	private int numeroCopie;
	
	
	public Libri() {
		this.idLibro = -1;
		this.titolo = "";
		this.autori = "";
		this.numeroCopie = -1;
	}

	
	public Libri(int idLibro, String titolo, String autori, int numeroCopie) {
		this.idLibro = idLibro;
		this.titolo = titolo;
		this.autori = autori;
		this.numeroCopie = numeroCopie;
	}
	
	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

	public int getNumeroCopie() {
		return numeroCopie;
	}

	public void setNumeroCopie(int numeroCopie) {
		this.numeroCopie = numeroCopie;
	}


	@Override
	public String toString() {
		return "Libri [idLibro=" + idLibro + ", titolo=" + titolo + ", autori=" + autori + ", numeroCopie="
				+ numeroCopie + "]";
	}

	
}