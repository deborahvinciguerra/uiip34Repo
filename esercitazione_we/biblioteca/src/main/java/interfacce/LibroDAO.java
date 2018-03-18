package interfacce;
import classi.*;

public interface LibroDAO
{
	public void insert (Libro libro);
	public Libro cercaLibro(int id_libro);
}
