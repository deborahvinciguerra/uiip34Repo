package classi;
public class Tessera
{
	private int id_tessera;
	private String nome;
	private String indirizzo;
	
	//costruttore parametrico
	public Tessera(int id_tessera, String nome, String indirizzo) {
		this.id_tessera = id_tessera;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	
	//getters&setters
	public int getId_tessera() {
		return id_tessera;
	}

	public void setId_tessera(int id_tessera) {
		this.id_tessera = id_tessera;
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
	
}
