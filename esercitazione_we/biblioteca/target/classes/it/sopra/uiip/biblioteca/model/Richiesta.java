package it.sopra.uiip.biblioteca.model;
public class Richiesta {

	private int idRichiesta;
	private int idLibro;
	
	
	public Richiesta(int idRichiesta, int idLibro) {
		this.idRichiesta = idRichiesta;
		this.idLibro = idLibro;
	}

	

	public Richiesta() {
	}



	public int getIdRichiesta() {
		return idRichiesta;
	}

	
	public void setIdRichiesta(int idRichiesta) {
		this.idRichiesta = idRichiesta;
	}


	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	@Override
	public String toString() {
		return "Richiesta [idRichiesta=" + idRichiesta + ", idLibro=" + idLibro + "]";
	}
	
	
}


