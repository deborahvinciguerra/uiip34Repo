package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Libro;
import persistence.dao.LibroDAO;
import persistence.jdbc.LibroJdbcDAO;

/**
 * Servlet implementation class CercaLibroPerTitolo
 * 
 * gestisce la richiesta di visualizzazione 
 * di un libro dato il titolo
 */
public class CercaLibroPerTitolo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CercaLibroPerTitolo() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// leggo i paramentri dalla richiesta http
		String titolo = request.getParameter("titoloLibro");
		// cerco il libro all'interno del database
		LibroDAO lDao = new LibroJdbcDAO();
		List<Libro> libri = lDao.doRetrieveByTitolo(titolo);
		// salvo i dati in sessione
		HttpSession session = request.getSession(true);
		session.setAttribute("libri", libri);
		// reindirizzo la richiesta alla jsp per la visualizzazione del risultato
		request.getRequestDispatcher("visualizzaLibriTitolo.jsp").forward(request, response);
	}

}
