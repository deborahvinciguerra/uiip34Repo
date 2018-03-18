package interfacce;
import classi.*;

public interface TesseraDAO
{
	public void insert (Tessera tessera);
	public Tessera cercaTessera(int id_tessera);
}
