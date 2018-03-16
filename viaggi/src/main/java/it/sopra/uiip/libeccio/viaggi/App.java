package it.sopra.uiip.libeccio.viaggi;

import it.sopra.uiip.libeccio.viaggi.model.Volo;
import it.sopra.uiip.libeccio.viaggi.model.dao.VoloDAO;
import it.sopra.uiip.libeccio.viaggi.model.daoimpl.JdbcVoloDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   VoloDAO vDao= new JdbcVoloDAO() ;
    	
    	
    	vDao.selectById(1);
    }
}
