package it.sopra.uiip.libeccio.viaggi;

import it.sopra.uiip.libeccio.viaggi.model.dao.VoloDAO;
import it.sopra.uiip.libeccio.viaggi.model.daoimpl.JdbcVoloDAO;
import it.sopra.uiip.libeccio.viaggi.model.Aeroporto;
import it.sopra.uiip.libeccio.viaggi.model.dao.AeroportoDAO;
import it.sopra.uiip.libeccio.viaggi.model.daoimpl.JdbcAeroportoDAO;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )    {   
		VoloDAO vDao= new JdbcVoloDAO() ;    	
		vDao.selectById(1);
		Aeroporto aer = new Aeroporto("italia","Roma", 12);
		AeroportoDAO aerDAO = new JdbcAeroportoDAO();
		aerDAO.update("Roma",aer);
		Aeroporto aer1 = aerDAO.selectByCitta("Napoli");
		System.out.println(aer1.getNazione());

	}
}
