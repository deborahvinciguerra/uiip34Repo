package model;

public class Libro
{
	private String idLibri;
	private String titolo;
	private int nCopie;
	private String autore;
	
	
	public Libro(String idLibri, String titolo, int nCopie, String autore) {
		super();
		this.idLibri = idLibri;
		this.titolo = titolo;
		this.nCopie = nCopie;
		this.autore = autore;
	}
	
	public String getIdLibri() {
		return idLibri;
	}
	public void setIdLibri(String idLibri) {
		this.idLibri = idLibri;
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
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	@Override
	public String toString() {
		return "Libro [idLibri=" + idLibri + ", titolo=" + titolo + ", nCopie=" + nCopie + ", autore=" + autore + "]";
	}


	


}
