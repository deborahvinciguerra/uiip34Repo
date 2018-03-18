package model;

/*
 * Classe che modella la tabella Prestito del database
 */

public class Prestito {
	
	private Tessera tessera;
	private Libro libro;
	public Prestito() {
		tessera = new Tessera();
		libro = new Libro();
	}
	public Prestito(Tessera tessera, Libro libro) {
		super();
		this.tessera = tessera;
		this.libro = libro;
	}
	public Tessera getTessera() {
		return tessera;
	}
	public void setTessera(Tessera tessera) {
		this.tessera = tessera;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	

}
