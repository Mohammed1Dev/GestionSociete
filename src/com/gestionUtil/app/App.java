package com.gestionUtil.app;

import java.util.ArrayList;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profile profileManager = new Profile("Soc1234", "MN");
		Profile profileChefProjet = new Profile("Soc692", "CP");
		Profile profileDirecteurProjet = new Profile("Soc3533", "DP");
		Profile profileRessource = new Profile("Soc2398", "DRH");
		Profile profileDirecteurGeneral = new Profile("Soc3453", "DG");
		
		ArrayList<Utilisateur> userList = new ArrayList<Utilisateur>();
		
		Utilisateur user1 = new Utilisateur("Bettaoui", "Mohammed-Amine", "mohammed@gmail.com", "067277323", 4800, "MohammedDev", "fhghsgsd","Services Continue", profileDirecteurGeneral);
		Utilisateur user2 = new Utilisateur("Bettaoui", "Houssame-Eddine", "houssame@gmail.com", "06363673", 3500, "HoussamAth", "shsrtsrt","Services Soir", profileManager);
		Utilisateur user3 = new Utilisateur("kamili", "zakaria", "zikaria@gmail.com", "0765325632", 3500, "ZakariaKam", "srthhqerh","Services Continue", profileDirecteurProjet);
		
		user1.setSalaire(user1.calculeSalaire());
		user2.setSalaire(user2.calculeSalaire());
		user3.setSalaire(user3.calculeSalaire());
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		
		
		for(int i = 0; i < userList.size(); i++)
		{
			System.out.println(userList.get(i).toString());
			
		}
		


		
		

	}

}
