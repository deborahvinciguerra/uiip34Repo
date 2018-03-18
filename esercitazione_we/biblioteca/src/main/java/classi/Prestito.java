package classi;
public class Prestito
{
	private int id_prestito;
	private int id_libro;
	private int id_tessera;
	
	//costruttore parametrico
	public Prestito(int id_prestito, int id_libro, int id_tessera) {
		this.id_prestito = id_prestito;
		this.id_libro = id_libro;
		this.id_tessera = id_tessera;
	}
	
	//getters&setters
	public int getId_prestito() {
		return id_prestito;
	}

	public void setId_prestito(int id_prestito) {
		this.id_prestito = id_prestito;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public int getId_tessera() {
		return id_tessera;
	}

	public void setId_tessera(int id_tessera) {
		this.id_tessera = id_tessera;
	}
	
	
}
