package model;

public class Libro {
	int id;
	int nCopie;
	String titolo;
	String autore;
	
	
	public Libro(int id, int nCopie, String titolo, String autore) {
		super();
		this.id = id;
		this.nCopie = nCopie;
		this.titolo = titolo;
		this.autore = autore;
	}
	public Libro(int id, String titolo, String autore) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
	}
	public Libro() {
		this.id = 0;
		this.titolo = "";
		this.autore = "";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getNCopie() {
		return nCopie;
	}
	public void setNCopie(int nCopie) {
		this.nCopie = nCopie;
	}
	
	
	@Override
	public String toString() {
		
		return "Libro [id=" + id +", nCopie="+ nCopie+ ", titolo=" + titolo + ", autore=" + autore + "]";
	}
	
	@Override
	public boolean equals (Object o) {
		if(o instanceof Libro ) {
			Libro l= (Libro) o;
			return (l.autore.equals(autore)&&l.titolo.equals(titolo)&&l.id==id);
		}
		return false;
	}
	
}
