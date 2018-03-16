package it.sopra.uiip.Model;

public class Aereo {
	private String tipoAereo;
	private int numeroPass;
	private int quantitaMerci;
	
	public Aereo() {
		this.tipoAereo = "";
		this.numeroPass = 0;
		this.quantitaMerci = 0;
		
	}

	public Aereo(String tipoAereo, int numeroPass, int quantitaMerci) {
		this.tipoAereo = tipoAereo;
		this.numeroPass = numeroPass;
		this.quantitaMerci = quantitaMerci;
	}

	public String getTipoAereo() {
		return tipoAereo;
	}

	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}

	public int getNumeroPass() {
		return numeroPass;
	}

	public void setNumeroPass(int numeroPass) {
		this.numeroPass = numeroPass;
	}

	public int getQuantitaMerci() {
		return quantitaMerci;
	}

	public void setQuantitaMerci(int quantitaMerci) {
		this.quantitaMerci = quantitaMerci;
	}

	@Override
	public String toString() {
		return "Aereo [tipoAereo=" + tipoAereo + ", numeroPass=" + numeroPass + ", quantitaMerci=" + quantitaMerci
				+ "]";
	}
	
	
}
