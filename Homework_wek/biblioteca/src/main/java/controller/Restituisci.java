package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;
import model.Prestito;
import model.Tessera;
import persistence.dao.LibroDAO;
import persistence.dao.PrestitoDAO;
import persistence.dao.TesseraDAO;
import persistence.jdbc.LibroJdbcDAO;
import persistence.jdbc.PrestitoJdbcDAO;
import persistence.jdbc.TesseraJdbcDAO;

/**
 * Servlet implementation class Restituisci
 * 
 * gestisce la richiesta di restituzione di un libro 
 * in prestito ad un determinato utente
 */
public class Restituisci extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Restituisci() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ricavo i paramentri dalla riciesta http
		String libro = request.getParameter("titoloLibro");
		int tessera = Integer.parseInt(request.getParameter("numeroTessera"));
		// istanzio le classi dao necessarie per l'interrogazione del database
		LibroDAO lDao = new LibroJdbcDAO();
		TesseraDAO tDao = new TesseraJdbcDAO();
		PrestitoDAO pDao = new PrestitoJdbcDAO();
		// verifico sel il libro e l'utente esistono
		List<Libro> libri = lDao.doRetrieveByTitolo(libro);
		Libro l=null;
		if (!libri.isEmpty() && libri != null)
			l = libri.get(0);
		Tessera t = (Tessera)tDao.doRetrieveById(tessera);
		// procedo alla restituzione cancellando il relativo record dal database
		if (l != null && t != null)
			pDao.delete(new Prestito(t,l));
		response.sendRedirect("index.html");
	}

}
