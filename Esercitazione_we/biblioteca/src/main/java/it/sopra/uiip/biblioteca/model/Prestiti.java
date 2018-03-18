package it.sopra.uiip.biblioteca.model;

public class Prestiti {
	private String codiceFiscale;
	private int idLibro;
	
	public Prestiti() {
		this.codiceFiscale = "";
		this.idLibro = -1;
	}
	
	public Prestiti(String codiceFiscale, int idLibro) {
		this.codiceFiscale = codiceFiscale;
		this.idLibro = idLibro;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public int getIdLibro() {
		return idLibro;
	}
	
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	
	@Override
	public String toString() {
		return "Prestiti [codiceFiscale=" + codiceFiscale + ", idLibro=" + idLibro + "]";
	}
}