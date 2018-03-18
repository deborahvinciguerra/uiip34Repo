package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Libro;
import model.Prestito;
import model.Tessera;
import persistence.dao.PrestitoDAO;
import persistence.dao.TesseraDAO;
import persistence.jdbc.PrestitoJdbcDAO;
import persistence.jdbc.TesseraJdbcDAO;

/**
 * Servlet implementation class PrestaLibro
 * 
 * gestisce la richiesta di prestito di un libro 
 * per un determinato utente
 */
public class PrestaLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrestaLibro() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// istanzio i dao necessari per l'interrogazione del database
		TesseraDAO tDao = new TesseraJdbcDAO();
		PrestitoDAO pDao = new PrestitoJdbcDAO();
		HttpSession session = request.getSession(true);
		// leggo il libro salvato precedentemente in sessione
		// nella fase di ricerca del libro 
		Libro libro = (Libro)session.getAttribute("libro");
		// leggo il numero della tessera dalla richiesta http
		int idUtente = Integer.parseInt(request.getParameter("numeroTessera"));
		// Verifico se l'utente è presente all'interno del database
		// e se il libro richiesto è disponibile
		// ed in caso affermativo procedo al prestito del libro
		Tessera utente = tDao.doRetrieveById(idUtente);
		int prestati = pDao.countPrestati(libro.getTitolo());
		if (utente != null && (libro.getnCopie()-prestati)>0) {
			pDao.save(new Prestito(utente, libro));
			session.setAttribute("tessera", utente);
			RequestDispatcher dispatcher = request.getRequestDispatcher("prestitoRiuscito.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("prestitoNonRiuscito.html");
			dispatcher.forward(request, response);
		}
		
	}

}
