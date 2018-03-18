package it.sopra.uiip.biblioteca.model;
public class Lettore {

	private int id;
	private String nome;
	private String indirizzo;
	private int idTessera;
	private int idRichiesta;
	
	public Lettore(int id, String nome, String indirizzo, int idTessera, int idRichiesta) {
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.idTessera = idTessera;
		this.idRichiesta = idRichiesta;
	}

	public Lettore() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getIdTessera() {
		return idTessera;
	}

	public void setIdTessera(int idTessera) {
		this.idTessera = idTessera;
	}

	public int getIdRichiesta() {
		return idRichiesta;
	}

	public void setIdRichiesta(int idRichiesta) {
		this.idRichiesta = idRichiesta;
	}

	@Override
	public String toString() {
		return "Lettore [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", idTessera=" + idTessera
				+ ", idRichiesta=" + idRichiesta + "]";
	}
	
	
}


