package model;

public class Utente {
	int id;
	String nome;
	String cognome;
	String indirizzo;
	public Utente(int id, String nome, String cognome, String indirizzo) {
	
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}
	public Utente() {
		
		this.id = 0;
		this.nome = "";
		this.cognome = "";
		this.indirizzo = "";
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
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + "]";
	}
	
	@Override
	public boolean equals (Object o) {
		if(o instanceof Utente ) {
			Utente l= (Utente) o;
			return (l.nome.equals(nome)&&l.cognome.equals(cognome)&&l.indirizzo.equals(indirizzo)&&l.id==id);
		}
		return false;
	}
}
