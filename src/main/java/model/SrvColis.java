package model;

public class SrvColis {
	// TODO JPA
	// Rendu le 10 Novembre
	// push, pull
	// setProgression
	// getProgression
	
	public void pushDB(Colis c) {
		// TODO
	}
	
	public Colis pullColis(int id) {
		// TODO
		Colis c = new Colis(id, id, null, null, id, id, null, null);
		return c;
	}
	
	public void updateColis(int id, Colis c) {
		// TODO
	}
}
