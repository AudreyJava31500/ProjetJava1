package com.gtm.proxibanque.presentation;

import com.gtm.proxibanque.metiers.Compte;
import com.gtm.proxibanque.metiers.CompteCourant;
import com.gtm.proxibanque.metiers.CompteEpargne;

public class MainProxiBanque {

	public static void main(String[] args) {

		//tout revoir avec constructeur sans arguments et utiliser setters et getters
		
		Compte c = new Compte("123456",5000, 1995, "visa");
		c.Consulter();
		System.out.println(c);
		System.out.println();
		
		CompteCourant cc = new CompteCourant("123456", 5000, 1996, "visa", 1000, "987654A", 1000);
		cc.ConsulterCompteCourant();
		System.out.println(cc);
		System.out.println();
		
		CompteEpargne ce = new CompteEpargne("123456", 2000, 1997, "visa", 3, "159753CE");
		ce.ConsulterCompteEpargne();
		System.out.println(ce);
	}

}
