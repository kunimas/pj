package com.kunimas.kumiawase;

public class Person
{
	private String sex;
	private Integer age;
	private String firstName;
	private String lastName;
	private String firstNameYomi;
	private String lastNameYomi;
	private String nickName;

	public void setSex(String strIn) {
		sex=strIn;
	}
	public String getSex(){
		return sex;
	}
	public void setAge(Integer intIn){
		age=intIn;	
	}
	public Integer getAge(){
		return age;
	}
	public void setFirstName(String strIn) {
		firstName=strIn;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String strIn) {
		lastName=strIn;
	}
	public String getLastName(){
		return lastName;
	}
	public void setFirstNameYomi(String strIn) {
		firstNameYomi=strIn;
	}
	public String getFirstNameYomi(){
		return firstNameYomi;
	}
	public void setLastNameYomi(String strIn) {
		lastNameYomi=strIn;
	}
	public String getLastNameYomi(){
		return lastNameYomi;
	}
	public void setNickName(String strIn) {
		nickName=strIn;
	}
	public String getNickName(){
		return nickName;
	}
}

