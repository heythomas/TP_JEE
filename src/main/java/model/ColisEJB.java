package model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ColisEJB implements ColisEJBITF {
	
	@PersistenceContext
	private EntityManager em;
	
	public ColisEJB() {
		super();
	}

	@Override
	public Colis addColis(double poids, double valeur, String origine, String destination, double latitude, double longitude, String emplacement, String etat) {
		Colis c = new Colis(poids, valeur, origine, destination, latitude, longitude, emplacement, etat);
		em.persist(c);
		return c;
	}

	@Override
	public Colis findColis(long id) {
		Colis c = em.find(Colis.class, id);
		return c;
	}

	@Override
	public Colis updateColis(long id, double longitude, double latitude, String emplacement, String etat) {
		Colis c = em.find(Colis.class, id);
		c.setLatitude(latitude);
		c.setLongitude(longitude);
		c.setEmplacement(emplacement);
		c.setEtat(etat);
		em.flush();
		c = em.find(Colis.class, id);
		return c;
	}
}
