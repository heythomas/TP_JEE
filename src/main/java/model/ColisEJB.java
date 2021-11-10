package model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

// EJB du colis pour réaliser les opérations nécessaires
@Stateless
public class ColisEJB implements ColisEJBITF {
	
	@PersistenceContext
	private EntityManager em;
	
	public ColisEJB() {
		super();
	}

	// Création et ajout d'un colis
	@Override
	public Colis addColis(double poids, double valeur, String origine, String destination, double latitude, double longitude, String emplacement, String etat) {
		Colis c = new Colis(poids, valeur, origine, destination, latitude, longitude, emplacement, etat);
		em.persist(c);
		return c;
	}
	
	// Recherche d'un colis dans la DB
	@Override
	public Colis findColis(long id) {
		Colis c = em.find(Colis.class, id);
		return c;
	}
	
	// Modification d'un colis de la DB
	@Override
	public Colis updateColis(long id, double longitude, double latitude, String emplacement, String etat) {
		// Récupération du colis ciblé
		Colis c = em.find(Colis.class, id);
		
		// Modifications des données
		c.setLatitude(latitude);
		c.setLongitude(longitude);
		c.setEmplacement(emplacement);
		c.setEtat(etat);
		
		// Mise à jour du contexte de la base de donnée avec le contexte courant modifié
		em.flush();
		c = em.find(Colis.class, id);
		
		return c;
	}
}
