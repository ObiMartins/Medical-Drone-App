package com.martins.springboot.medicaldroneapp.model;

public enum Dronestate {
	
	 IDLE("1"), 
	  LOADING("2"), 
	  LOADED("3"),
	  DELIVERING("4"), 
	  DELIVERED("5"), 
	  RETURNING("6");
	  
	  private String codestate;
	  private Dronestate(String codestate) {
		  this.codestate=codestate;
	  }
	  public String getDronestate() {
		  return this.codestate;
	  }
}
