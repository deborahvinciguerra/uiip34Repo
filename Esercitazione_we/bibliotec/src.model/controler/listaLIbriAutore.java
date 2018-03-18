package controler;

import java.io.IOException;
import java.util.Vector;
import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LibroDao;
import daoimpl.JDBCLibroDao;
import model.Libro;

/**
 * Servlet implementation class listaLIbriAutore
 */
public class listaLIbriAutore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Vector<Libro>li=new Vector<Libro>();
	LibroDao lDao= new JDBCLibroDao();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public listaLIbriAutore() {
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
		String a = request.getParameter("autore");
		li =  lDao.cercaLbiriAutore(a);
		
		HttpSession sess= request.getSession(true);
		sess.setAttribute("listaPerAutore", li);
		
		RequestDispatcher disp = request.getRequestDispatcher("listaLibriAutore.jsp");
		disp.forward(request, response);
			
			
			
			
	}

}
