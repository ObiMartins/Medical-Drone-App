package com.martins.springboot.medicaldroneapp.model;

public enum Dronemodel {
	
	 LIGHTWEIGHT("1"), 
	  MIDDLEWEIGHT("2"), 
	  CRUISERWEIGHT("3"), 
	  HEAVYWEIGHT("4");
	  
	  private String codemodel;
	  private Dronemodel(String codemodel) {
		  this.codemodel=codemodel;
	  }
	  public String getcode() {
		  return this.codemodel;
	  }
}
