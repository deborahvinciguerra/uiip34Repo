package Model;

public class Volo
{
	private int idVolo;
	private String giornoSett;
	private String cittaPart;
	private String cittaArr;
	private String tipoAereo;
    private int oraPartenza;
    private int oraArrivo;
    
    //costruttore parametrico
	public Volo(int idVolo, String giornoSett, String cittaPart, String cittaArr, String tipoAereo, int oraPartenza,
			int oraArrivo) {
		this.idVolo = idVolo;
		this.giornoSett = giornoSett;
		this.cittaPart = cittaPart;
		this.cittaArr = cittaArr;
		this.tipoAereo = tipoAereo;
		this.oraPartenza = oraPartenza;
		this.oraArrivo = oraArrivo;
	}

	//getters&setters
	public int getIdVolo() {
		return idVolo;
	}
	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}
	public String getGiornoSett() {
		return giornoSett;
	}
	public void setGiornoSett(String giornoSett) {
		this.giornoSett = giornoSett;
	}
	public String getCittaPart() {
		return cittaPart;
	}
	public void setCittaPart(String cittaPart) {
		this.cittaPart = cittaPart;
	}
	public String getCittaArr() {
		return cittaArr;
	}
	public void setCittaArr(String cittaArr) {
		this.cittaArr = cittaArr;
	}
	public String getTipoAereo() {
		return tipoAereo;
	}
	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}
	public int getOraPartenza() {
		return oraPartenza;
	}
	public void setOraPartenza(int oraPartenza) {
		this.oraPartenza = oraPartenza;
	}
	public int getOraArrivo() {
		return oraArrivo;
	}
	public void setOraArrivo(int oraArrivo) {
		this.oraArrivo = oraArrivo;
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
