package com.kunimas.kumiawase;

public class Members extends Person
{
	static String lvl_bigginer = "BIGGINER";
	static String lvl_intermediate = "INTERMEDIATE";
	static String lvl_professional = "PROFESSIONAL";
	static Number accountBaseNumber=1;

	private boolean righthand = true;
	private Number experience =0;
	private String level = lvl_professional;
	private Number accountNumber;

	public void setRighthand(boolean blnIn) {
		righthand=blnIn;
	} 
	public boolean getRighthand(){
		return righthand;
	}
	public void setExperience(Number numIn) {
		experience=numIn;
	}
	public Number getExperience(){
		return experience;
	}
	public void setLevel(String strIn) {
		level=strIn;
	}
	public String getLevel(){
		return level;
	}
	public void setAccountNumber(Number numIn) {
		accountNumber=numIn;
	}
	public Number getAccountNumber(){
		return accountNumber;
	}

}
