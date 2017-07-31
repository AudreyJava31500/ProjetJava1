package com.gtm.proxibanque.metiers;

public class CompteEpargne extends Compte {
	private float taux;
	private String numeroCE;// CE pour compte epargne
	private float soldeCE;
	
		
	/**
	 * @param numero
	 * @param solde
	 * @param année
	 * @param cb
	 * @param taux
	 * @param numeroCE
	 * @param soldeCE
	 */
	public CompteEpargne(String numero, float soldeCE, int année, String cb, float taux, String numeroCE ) {
		super(numero, soldeCE, année, cb);
		this.taux = taux;
		this.numeroCE = numeroCE;
		this.soldeCE = soldeCE;
	}
	
	/**
	 * @return the soldeCE
	 */
	public float getSoldeCE() {
		return soldeCE;
	}


	/**
	 * @param soldeCE the soldeCE to set
	 */
	public void setSoldeCE(float soldeCE) {
		this.soldeCE = soldeCE;
	}


	/**
	 * @return the taux
	 */
	public float getTaux() {
		return taux;
	}

	/**
	 * @return the numeroCE
	 */
	public String getNumeroCE() {
		return numeroCE;
	}

	/**
	 * @param taux
	 *            the taux to set
	 */
	public void setTaux(float taux) {
		this.taux = taux;
	}

	/**
	 * @param numeroCE
	 *            the numeroCE to set
	 */
	public void setNumeroCE(String numeroCE) {
		this.numeroCE = numeroCE;
	}

	/**
	 * Méthode de Compte epargne
	 */

	public float ConsulterCompteEpargne() {
		System.out.println("Voici votre compte Epargne: ");

		System.out.println("Le numéro de votre compte epargne est : " + numeroCE
				+ " et votre compte possède un solde de : " + soldeCE + "€");
		System.out.println("Votre compte beneficie d'un taux d'interet de : " + taux + "%");
		
		soldeCE +=  (soldeCE* taux/100);
		System.out.println("Votre nouveau solde est de : " + soldeCE);
		
		return soldeCE;

	}

}
