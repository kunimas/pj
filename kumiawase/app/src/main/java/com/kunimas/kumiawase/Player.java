package com.kunimas.kumiawase;

public class Player extends Members
{
	boolean breakFlag=false;
	String group;
	
	public void setBreak(boolean blnIn)
	{
		breakFlag = blnIn;
	}
	public boolean getBreak(){
		return(breakFlag);
	}
	
	public void setGroup(String strIn)
	{
		group = strIn;
	}
	public String getGroup()
	{
		return(group);
	}
}
