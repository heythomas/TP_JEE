package model;

// Interface de l'EJB
public interface ColisEJBITF {

	Colis addColis(double poids, double valeur, String origine, String destination, double latitude, double longitude, String emplacement, String etat);
	Colis findColis(long id);
	Colis updateColis(long id, double longitude, double latitude, String emplacement, String etat);
	
}
