package com.gtm.proxibanque.metiers;

public class CompteCourant extends Compte {
	private float decouvert; //decouvert max autorisé
	private String numeroCC;//CCpour compte courant
	private float soldeCC;
	
	
	
	/**
	 * @return the decouvert
	 */
	public float getDecouvert() {
		return decouvert;
	}

	/**
	 * @return the numeroCC
	 */
	public String getNumeroCC() {
		return numeroCC;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * @param numeroCC the numeroCC to set
	 */
	public void setNumeroCC(String numeroCC) {
		this.numeroCC = numeroCC;
	}

			
	/**
	 * @return the soldeCC
	 */
	public float getSoldeCC() {
		return soldeCC;
	}

	/**
	 * @param soldeCC the soldeCC to set
	 */
	public void setSoldeCC(float soldeCC) {
		this.soldeCC = soldeCC;
	}

//	/**
//	 * @param numero
//	 * @param soldeCC
//	 * @param année
//	 * @param cb
//	 * @param decouvert
//	 * @param numeroCC
//	 */
//	public CompteCourant(String numeroCC, float soldeCC, int année, String cb, float decouvert) {
//		super(numeroCC, soldeCC, année, cb);
//		this.decouvert = decouvert;
//		this.numeroCC = numeroCC;
//	}

/**
 * @param numero
 * @param solde
 * @param année
 * @param cb
 * @param decouvert
 * @param numeroCC
 * @param soldeCC
 */
public CompteCourant(String numero, float solde, int année, String cb, float decouvert, String numeroCC,
		float soldeCC) {
	super(numero, solde, année, cb);
	this.decouvert = decouvert;
	this.numeroCC = numeroCC;
	this.soldeCC = soldeCC;
}	


	/**
	 * Méthode de compte courant
	 */
	public float ConsulterCompteCourant()
	{
		System.out.println("Voici votre compte courant: ");
		
		System.out.println("Le numéro de votre compte courant est : " + numeroCC + " et votre compte possède un solde de : " + soldeCC + "€");
		System.out.println("Attention votre compte a un découvert autorisé de " + decouvert + "€");
		return soldeCC;
		
	
	}

}
