package com.gestionUtil.app;

public class Profile{
	
	private int id;
	private String code;
	private String libelle;
	
	public Profile(String code, String libelle)
	{
		this.id++;
		this.code = code;
		this.libelle = libelle;
	}
	
	//Setters
	public void setCode(String code)
	{
		this.code = code;
	}
	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}
	
	//Getters
	public int getId()
	{
		return this.id;
	}
	public String getCode()
	{
		return this.code;
	}
	public String getLibelle()
	{
		return this.libelle;
	}
	
	@Override
	public String toString()
	{
		return "|"+this.id+"|"+this.libelle+"|"+this.code+"|"; 
	}

}
