package model;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Cette servlet permet de modifier les données de localisation des colis
@WebServlet("/UpdateColisServlet")
public class UpdateColisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private ColisEJBITF ejb;
	
    public UpdateColisServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération des paramètres via l'URL
		long id = Long.parseLong(request.getParameter("id"));
		double latitude = Double.parseDouble(request.getParameter("latitude"));
		double longitude = Double.parseDouble(request.getParameter("longitude"));
		String emplacement = request.getParameter("emplacement");
		String etat = request.getParameter("etat");
		
		// Modification des colis via les données récupérées
		Colis c = ejb.updateColis(id, longitude, latitude, emplacement, etat);
		
		// Redirection vers la page de visualisation du colis modifié
		request.setAttribute("colis", c);
		request.getRequestDispatcher("/showColis.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
