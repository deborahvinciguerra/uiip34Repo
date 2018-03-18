package classi;
public class Libro
{
	private int id_libro;
	private String titolo;
	private String autori;
	private int nCopie;
		
	//costruttore parametrico
	public Libro(int id_libro, String titolo, String autori, int nCopie) {
		this.id_libro = id_libro;
		this.titolo = titolo;
		this.autori = autori;
		this.nCopie = nCopie;
	}
	
	//getters&setters
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutori() {
		return autori;
	}
	public void setAutori(String autori) {
		this.autori = autori;
	}
	public int getnCopie() {
		return nCopie;
	}
	public void setnCopie(int nCopie) {
		this.nCopie = nCopie;
	}
	
}
