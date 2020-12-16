package com.gestionUtil.app;

public class Personne{

	private String matricule;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private double salaire;
	
	public Personne(String nom, String prenom, String email, String telephone, double salaire)
	{
		
		this.matricule = "HH"+ Math.floor(Math.random() * 90);
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public String getMatricule() {
		return matricule;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	//Calcule Salaire 
	public double calculeSalaire()
	{
		double result = 0;
		
		return result;
	}
	
	
	@Override
	public String toString()
	{
		return "|"+this.matricule+"|"+this.nom+"|"+this.prenom+"|"+this.email+"|"+this.telephone+"|"+this.salaire+"|";
	}
}
