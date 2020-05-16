package com.careyconnect.dataPage;


public class CareyRewardsDataPage 
{
	private boolean isRegister;
	private boolean isUpdate;
	private boolean isOptout;
	private String description;
	private String cntryName;
	private String address;
	private String stName;
	private String cityName;
	private String zipCode;
	private String wrkNum;
	private String emailId;
	private String username;
	private String password;
	private String scenarioType;

	
	public boolean isRegister() {
		return isRegister;
	}
	public void setRegister(boolean isRegister) {
		this.isRegister = isRegister;
	}
	public boolean isUpdate() {
		return isUpdate;
	}
	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	public boolean isOptout() {
		return isOptout;
	}
	public void setOptout(boolean isOptout) {
		this.isOptout = isOptout;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setCountryName(String cN)
	{
		 this.cntryName=cN;
	}
	public String getCountryName() 
	{
		return cntryName;
	}

	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String a) 
	{
		 this.address= a;
	}
	public String getStateName() 
	{
		return stName;
	}
	public void setStateName(String sn) 
	{
		  this.stName = sn;
	}

	public String getCityName() 
	{
		return cityName;
	}

	public void setCityName(String CN) 
	{
		this.cityName = CN;
	}

	public String getZipCode() 
	{
		return zipCode;
	}
	public void setZipCode(String zc) 
	{
		this.zipCode = zc;
	}
	public String getWorkNumber() 
	{
		return wrkNum;
	}
	public void setWorkNumber(String WN) 
	{
		this.wrkNum=WN;
	}

	public String getEmailId() 
	{
		return emailId;
	}
	public void setEmailId(String email) 
	{
		this.emailId = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getScenarioType() {
		return scenarioType;
	}
	public void setScenarioType(String scenarioType) {
		this.scenarioType = scenarioType;
	}
	
}
