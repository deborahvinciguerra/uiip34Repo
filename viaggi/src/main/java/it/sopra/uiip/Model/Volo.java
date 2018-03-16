package it.sopra.uiip.Model;

public class Volo {
	private int idVolo;
	private String giornoSett;
	private String cittaPart;
	private String cittaArr;
	private int oraPart;
	private int oraArr;
	private String tipoAereo;
	
	public Volo(int idVolo, String giornoSett, String cittaPart, String cittaArr, String tipoAereo, int oraPart, int oraArr) {
		this.idVolo = idVolo;
		this.giornoSett = giornoSett;
		this.cittaPart = cittaPart;
		this.cittaArr = cittaArr;
		this.tipoAereo = tipoAereo;
		this.oraPart = oraPart;
		this.oraArr = oraArr;
		
	}
	
	
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
	
	public int getOraPart() {
		return oraPart;
	}
	
	public void setOraPart(int oraPart) {
		this.oraPart = oraPart;
	}
	
	public int getOraArr() {
		return oraArr;
	}
	
	public void setOraArr(int oraArr) {
		this.oraArr = oraArr;
	}
	
	public String getTipoAereo() {
		return tipoAereo;
	}
	
	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}
	
	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + ", giornoSett=" + giornoSett + ", cittaPart=" + cittaPart + ", cittaArr="
				+ cittaArr + ", oraPart=" + oraPart + ", oraArr=" + oraArr + ", tipoAereo=" + tipoAereo + "]";
	}
	
	
}
