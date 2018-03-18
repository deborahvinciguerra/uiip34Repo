package model;

/*
 * Classe che modella la tabella Libro del database
 */

public class Libro {

	private String codice;
	private String titolo;
	private int nCopie;
	
	public Libro() {
		codice = "";
		titolo = "";
		nCopie = -1;
	}

	public Libro(String codice, String titolo, int nCopie) {
		this.codice = codice;
		this.titolo = titolo;
		this.nCopie = nCopie;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getnCopie() {
		return nCopie;
	}

	public void setnCopie(int nCopie) {
		this.nCopie = nCopie;
	}

	@Override
	public String toString() {
		return "Libro [codice=" + codice + ", titolo=" + titolo + ", nCopie=" + nCopie + "]";
	}
}
