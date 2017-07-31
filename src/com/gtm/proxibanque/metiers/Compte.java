package com.gtm.proxibanque.metiers;

import com.gtm.proxibanque.metiers.CompteCourant;
import com.gtm.proxibanque.metiers.CompteEpargne;


public class Compte {
	protected String numeroClient; // numero de compte = numero client --> 1 numero pour compte courant et 1 numero pour compte epargne
	protected float solde;
	protected int année;
	protected String cb;

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numeroClient;
	}

	/**
	 * @return the solde
	 */
	public float getSolde() {
		return solde;
	}

	/**
	 * @return the année
	 */
	public int getAnnée() {
		return année;
	}

	/**
	 * @return the cb
	 */
	public String getCb() {
		return cb;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numeroClient = numero;
	}

	/**
	 * @param solde
	 *            the solde to set
	 */
	public void setSolde(float solde) {
		this.solde = solde;
	}

	/**
	 * @param année
	 *            the année to set
	 */
	public void setAnnée(int année) {
		this.année = année;
	}

	/**
	 * @param cb
	 *            the cb to set
	 */
	public void setCb(String cb) {
		this.cb = cb;
	}

	/**
	 * constructeur de Compte
	 * 
	 * @param numero
	 * @param solde
	 * @param année
	 * @param cb
	 */
	public Compte(String numero, float solde, int année, String cb) {
		super();
		this.numeroClient = numero;
		this.solde = solde;
		this.année = année;
		this.cb = cb;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [numero=" + numeroClient + ", solde=" + solde + ", année=" + année + ", cb=" + cb + "]";
	}

	/**
	 * Méthode de présentation de compte
	 * 
	 * @param solde
	 */
	public float Consulter()
	{
		System.out.println("Merci vous possedez au moins un compte chez nous");
		
		CompteCourant cc = new CompteCourant("123456", 1000, 1995, "visa", 1000, "987654A", 1000);
		CompteEpargne ce = new CompteEpargne("123456", 2000, 1995, "visa", 3, "159753CE");
		solde = cc.getSoldeCC() + ce.getSoldeCE();
		
		System.out.println("Votre numéro client de votre compte est :" +numeroClient + " et vos comptes possèdent un solde de :" + solde + "€");
		return solde;
	}
}