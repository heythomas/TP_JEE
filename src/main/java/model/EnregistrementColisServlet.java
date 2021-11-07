package model;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnregistrementColisServlet
 */
@WebServlet("/EnregistrementColisServlet")
public class EnregistrementColisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private ColisEJBITF ejb;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnregistrementColisServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Récupération des paramètres
		double poids = Double.parseDouble(request.getParameter("poids"));
		double valeur = Double.parseDouble(request.getParameter("valeur"));
		String origine = request.getParameter("origine");
		String destination = request.getParameter("destination");
		double latitude = Double.parseDouble(request.getParameter("latitude"));
		double longitude = Double.parseDouble(request.getParameter("longitude"));
		String emplacement = request.getParameter("emplacement");
		String etat = request.getParameter("etat");
		
		// Ajout du colis en DB
		Colis c = ejb.addColis(poids, valeur, origine, destination, latitude, longitude, emplacement, etat);
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
