package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LibroDao;
import dao.UtenteDao;
import daoimpl.JDBCLibroDao;
import daoimpl.JDBCUtenteDao;

/**
 * Servlet implementation class prestaLibro
 */
public class prestaLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LibroDao lDao= new JDBCLibroDao();
    UtenteDao uDao =new JDBCUtenteDao(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prestaLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession(true);
		String titolo= (String) sess.getAttribute("titolo");
		String nome =request.getParameter("nome");
		String cognome =request.getParameter("cognome");
		String indirizzo =request.getParameter("indirizzo");
		sess.setAttribute("cognome", cognome);
		sess.setAttribute("nome", nome);
		
		int i = uDao.cercaUtente(nome, cognome, indirizzo);
		if(i>0) {
		lDao.prestaLibro(titolo, nome, cognome, indirizzo);
		
		RequestDispatcher disp = request.getRequestDispatcher("libroSi.jsp");
		disp.forward(request, response);}
		else {RequestDispatcher disp = request.getRequestDispatcher("utenteNo.html");
		disp.forward(request, response);}
	}

}
