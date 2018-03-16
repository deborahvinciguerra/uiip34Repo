package it.sopra.uiip.viaggi.model;

public class Aeroporto {
	private String citta;
	private String nazione;
	private int numeroPiste;
	
	public Aeroporto() {
		this.citta = "";
		this.nazione = "";
		this.numeroPiste = 0;
	}
	
	public Aeroporto(String citta, String nazione, int numeroPiste) {
		this.citta = citta;
		this.nazione = nazione;
		this.numeroPiste = numeroPiste;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public String getNazione() {
		return nazione;
	}
	
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	
	public int getNumeroPiste() {
		return numeroPiste;
	}
	
	public void setNumeroPiste(int numeroPiste) {
		this.numeroPiste = numeroPiste;
	}
	
	@Override
	public String toString() {
		return "Aeroporto [citta=" + citta + ", nazione=" + nazione + ", numeroPiste=" + numeroPiste + "]";
	}
	
	
}
