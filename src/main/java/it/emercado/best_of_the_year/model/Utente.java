package it.emercado.best_of_the_year.model;

public class Utente {
	
	private String name;
	
	private String surname;
	

	public Utente(String name, String surname) {
		
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	

}
