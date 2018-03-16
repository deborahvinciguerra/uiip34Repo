package it.sopra.uiip.libeccio.viaggi.model;

public class Volo {

	int id;
	String giorno;
	String partenza;
	String arrivo;
	String tipoAereo;
	int oraPartenza;
	int oraArrivo;
	public Volo(int id, String giorno, String partenza, String arrivo, String tipoAereo, int oraPartenza,
			int oraArrivo) {
		super();
		this.id = id;
		this.giorno = giorno;
		this.partenza = partenza;
		this.arrivo = arrivo;
		this.tipoAereo = tipoAereo;
		this.oraPartenza = oraPartenza;
		this.oraArrivo = oraArrivo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGiorno() {
		return giorno;
	}
	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}
	public String getPartenza() {
		return partenza;
	}
	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}
	public String getArrivo() {
		return arrivo;
	}
	public void setArrivo(String arrivo) {
		this.arrivo = arrivo;
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
	
	
}
