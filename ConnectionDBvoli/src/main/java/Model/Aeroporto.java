package Model;

public class Aeroporto
{
	private String citta;
	private String nazione;
    private int npiste;
	
    //costruttore parametrico
    public Aeroporto(String citta, String nazione, int npiste) {
		this.citta = citta;
		this.nazione = nazione;
		this.npiste = npiste;
	}

	
    //getters&setters
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

	public int getNpiste() {
		return npiste;
	}

	public void setNpiste(int npiste) {
		this.npiste = npiste;
	}


	
	//metodi override
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
	
    
}
