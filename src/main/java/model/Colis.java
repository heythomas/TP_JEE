package model;

import java.io.Serializable;
import javax.persistence.*;

// Classe colis serializable, la donnée stockée du projet
@Entity
public class Colis implements Serializable{
	// UID
	private static final long serialVersionUID = 1L;

	// Paramètres permanents
	@Id	@GeneratedValue
	private long id;
	
	private double poids;
	private double valeur;
	private String origine;
	private String destination;
	
	// Paramètres modifiables
	private double latitude;
	private double longitude;
	private String emplacement;
	private String etat;
	
	public Colis() {
		super();
	}
	
	public Colis(double poids,double valeur,String origine,String destination,double latitude,double longitude,String emplacement,String etat) {
		this.poids = poids;
		this.valeur = valeur;
		this.origine = origine;
		this.destination = destination;
		this.latitude = latitude;
		this.longitude = longitude;
		this.emplacement = emplacement;
		this.etat = etat;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getId() {
		return id;
	}

}
