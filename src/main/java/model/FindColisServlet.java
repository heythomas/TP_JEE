package model;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindColisServlet
 */
@WebServlet("/FindColisServlet")
public class FindColisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private ColisEJBITF ejb;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindColisServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération ID
		long id = Long.parseLong(request.getParameter("id"));
		
		// Récupération Objet de la DB
		Colis c = ejb.findColis(id);
		request.setAttribute("colis", c);
		
		request.getRequestDispatcher("/showColis.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
