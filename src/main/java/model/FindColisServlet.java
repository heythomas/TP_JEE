package model;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Cette servlet permet de trouver un colis
@WebServlet("/FindColisServlet")
public class FindColisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private ColisEJBITF ejb;

    public FindColisServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération de l'id du colis via l'URL
		long id = Long.parseLong(request.getParameter("id"));
		
		// Récupération du colis dans la DB
		Colis c = ejb.findColis(id);
		
		// Redirection vers la page de visualisation du colis trouvé
		request.setAttribute("colis", c);
		request.getRequestDispatcher("/showColis.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
