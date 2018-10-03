package model;




public class Lettore 
{
	private String idLettore;
	private String nome;
	private String indirizzo;
	private String libro;

	public Lettore(String idLettore, String nome, String indirizzo, String libro) {
		super();
		this.idLettore = idLettore;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.libro = libro;
	}
	public String getIdLettore() {
		return idLettore;
	}
	public void setIdLettore(String idLettore) {
		this.idLettore = idLettore;
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
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	@Override
	public String toString() {
		return "Lettore [idLettore=" + idLettore + ", nome=" + nome + ", indirizzo=" + indirizzo + ", libro=" + libro
				+ "]";
	}
	
	
	
}
