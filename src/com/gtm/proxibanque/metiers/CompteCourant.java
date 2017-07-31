package com.gtm.proxibanque.metiers;

public class CompteCourant extends Compte {
	private float decouvert; //decouvert max autoris�
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
//	 * @param ann�e
//	 * @param cb
//	 * @param decouvert
//	 * @param numeroCC
//	 */
//	public CompteCourant(String numeroCC, float soldeCC, int ann�e, String cb, float decouvert) {
//		super(numeroCC, soldeCC, ann�e, cb);
//		this.decouvert = decouvert;
//		this.numeroCC = numeroCC;
//	}

/**
 * @param numero
 * @param solde
 * @param ann�e
 * @param cb
 * @param decouvert
 * @param numeroCC
 * @param soldeCC
 */
public CompteCourant(String numero, float solde, int ann�e, String cb, float decouvert, String numeroCC,
		float soldeCC) {
	super(numero, solde, ann�e, cb);
	this.decouvert = decouvert;
	this.numeroCC = numeroCC;
	this.soldeCC = soldeCC;
}	


	/**
	 * M�thode de compte courant
	 */
	public float ConsulterCompteCourant()
	{
		System.out.println("Voici votre compte courant: ");
		
		System.out.println("Le num�ro de votre compte courant est : " + numeroCC + " et votre compte poss�de un solde de : " + soldeCC + "�");
		System.out.println("Attention votre compte a un d�couvert autoris� de " + decouvert + "�");
		return soldeCC;
		
	
	}

}
