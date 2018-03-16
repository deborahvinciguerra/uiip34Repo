package it.sopra.uiip.libeccio.viaggi.model;

public class Aeroporto {

	String nazione;
	String citta;
	int piste;
	
	public Aeroporto(String nazione, String citta, int piste) {
		super();
		this.nazione = nazione;
		this.citta = citta;
		this.piste = piste;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public int getPiste() {
		return piste;
	}

	public void setPiste(int piste) {
		this.piste = piste;
	}
	
	
	
	
	
}
