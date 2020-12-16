package com.gestionUtil.app;

public class Utilisateur extends Personne{
	
	private String login;
	private String motDePass;
	private String service;
	private Profile profile;
	
	public Utilisateur(String nom, String prenom, String email, String telephone, double salaire, String login, String motDePass, String service, Profile profile)
	{
		super(nom, prenom, email, telephone, salaire);
		this.login = login;
		this.motDePass = motDePass;
		this.service = service;
		this.profile = profile;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePass() {
		return motDePass;
	}

	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	
	public Profile getProfile()
	{
		return this.profile;
	}
	
	public void setProfile(Profile profile)
	{
		this.profile = profile;
	}
	
	@Override
	public double calculeSalaire()
	{
		double result = this.getSalaire();
		
		if(this.profile.getLibelle().equalsIgnoreCase("MN"))
		{
			result = result + (this.getSalaire() * 0.8);
		}else if(this.profile.getLibelle().equalsIgnoreCase("DG"))
		{
			result = result + (this.getSalaire() * 1.5);
		}
		
		
		return result;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"|"+this.service+"  à un profile:"+this.profile.toString();
	}

}
