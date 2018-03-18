package it.sopra.uiip.biblioteca.model;
public class Libro {

	private int idLibro;
	private String titolo;
	private String autori;
	private int nCopie;
	
	public Libro(int idLibro, String titolo, String autori, int nCopie) {
		this.idLibro = idLibro;
		this.titolo = titolo;
		this.autori = autori;
		this.nCopie = nCopie;
	}
	

	public Libro() {
		
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

	public int getnCopie() {
		return nCopie;
	}

	public void setnCopie(int nCopie) {
		this.nCopie = nCopie;
	}


	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titolo=" + titolo + ", autori=" + autori + ", nCopie=" + nCopie + "]";
	}
	
	
	
}