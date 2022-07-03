package com.joseparradev.model;

public class InformationLibrary {

	public static final String NAME_LIBRARY = "Learning Spring";
	private boolean isvalidEmail;
	private String telephoneDirector;

	public InformationLibrary() {
		super();
	}

	public InformationLibrary(boolean isvalidEmail, String telephoneDirector) {
		super();
		this.isvalidEmail = isvalidEmail;
		this.telephoneDirector = telephoneDirector;
	}

	public String getTelephoneDirector() {
		return telephoneDirector;
	}

	public void setTelephoneDirector(String telephoneDirector) {
		this.telephoneDirector = telephoneDirector;
	}

	public boolean isIsvalidEmail() {
		return isvalidEmail;
	}

	public void setIsvalidEmail(boolean isvalidEmail) {
		this.isvalidEmail = isvalidEmail;
	}

	public static String getInformationLibrary() {
		return "Description: " + NAME_LIBRARY + ". Books to learn Spring";
	}

}
