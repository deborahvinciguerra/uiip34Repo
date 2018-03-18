package interfacce;
import classi.*;

public interface PrestitoDAO
{
	public void insert (Prestito prestito);
	public Prestito cercaPrestito(int id_prestito);
}
