package com.gtm.proxibanque.metiers;

public class Personne {

	protected String nom;
	protected String prenom;
	protected String adresse;
	protected int codePostal;
	protected String ville;
	protected String numeroTelephone;
	
	public Personne(String nom, String prenom, String adresse, int codePostal, String ville, String numeroTelephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroTelephone = numeroTelephone;
	}
	
	

	public Personne() {
		super();
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", numeroTelephone=" + numeroTelephone + "]";
	}
	
	
	
	
	
	
}
