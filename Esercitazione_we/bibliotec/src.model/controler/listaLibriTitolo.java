package controler;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LibroDao;
import daoimpl.JDBCLibroDao;
import model.Libro;

/**
 * Servlet implementation class listaLibriTitolo
 */
public class listaLibriTitolo extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	Libro li=new Libro();
	LibroDao lDao= new JDBCLibroDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listaLibriTitolo() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		String titolo =request.getParameter("titolo");
		li=lDao.cercaLbiriTitolo(titolo);
		HttpSession sess = request.getSession(true);
		sess.setAttribute("lista", li);
		sess.setAttribute("titolo", titolo);
		if(li.getNCopie()!=0) {
		RequestDispatcher disp = request.getRequestDispatcher("listaLibriTitolo.jsp");
		disp.forward(request, response);
		}else {RequestDispatcher disp = request.getRequestDispatcher("libroNo.html");
		disp.forward(request, response);}
	}

}
