package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Autore;
import model.Libro;
import persistence.dao.AutoreDAO;
import persistence.dao.LibroDAO;
import persistence.jdbc.AutoreJdbcDAO;
import persistence.jdbc.LibroJdbcDAO;

/**
 * Servlet implementation class CercaLibroAutore
 * 
 * gestisce la richiesta di visualizzazione dei libri 
 * scritti da un determinato autore
 */
public class CercaLibroAutore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CercaLibroAutore() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		// istanzio i dao necessari 
		AutoreDAO autDao = new AutoreJdbcDAO();
		LibroDAO libDao = new LibroJdbcDAO();
		// prelevo il nome e cognome dell'autore da ricercare dalla richiesta http
		String nome = request.getParameter("nomeAutore");
		String cognome = request.getParameter("cognomeAutore");
		// cerco l'autore e i libri scritti all'interno del database
		Autore autore = autDao.doRetrieveByName(nome, cognome);
		List<Libro> libri = null;
		if (autore != null) {
			libri = libDao.doRetrieveByAutore(autore.getId());
		}
		// salvo i dati necessari in sessione 
		HttpSession session = request.getSession(true);
		session.setAttribute("libri", libri);
		session.setAttribute("autore", autore);
		// reindirizzo la richiesta alla jsp per la visualizzazioen del risultato
		request.getRequestDispatcher("visualizzaLibriAutore.jsp").forward(request, response);
	}

}
