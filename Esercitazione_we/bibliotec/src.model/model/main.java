package model;

import java.util.Vector;

import dao.LibroDao;
import daoimpl.JDBCLibroDao;

public class main {

	public static void main(String[] args) {
		LibroDao lDao= new JDBCLibroDao();
		Vector <Libro> l=lDao.visualizzaLbiri();
		for (int i =0; i < l.size();i++) {
		System.out.println(l.get(i).toString());
		}
		System.out.println("\n\n\n");
		Libro li=lDao.cercaLbiriTitolo("il codice da vinci");
		
		System.out.println(li.toString());
		
		System.out.println("\n\n\n");
		Vector <Libro>lis=lDao.cercaLbiriAutore("luigi pirandello");
		for (int i =0; i < lis.size();i++) {
		System.out.println(lis.get(i).toString());
		}
		System.out.println("\n\n\n");
		lDao.prestaLibro("la coscienza di zeno", "eugenio", "trodella", "via fontana");
		
		Vector <Libro> al=lDao.visualizzaLbiri();
		for (int i =0; i < al.size();i++) {
		System.out.println(al.get(i).toString());
		}
	}

	
}
