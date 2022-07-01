package com.joseparradev.model;

public class InformationLibrary {

	public static final String NAME_LIBRARY = "Learning Spring";
	private boolean isvalidEmail;

	public InformationLibrary() {
		super();
	}

	public InformationLibrary(boolean isvalidEmail) {
		super();
		this.isvalidEmail = isvalidEmail;
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
