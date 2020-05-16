package com.careyconnect.dataPage;

public class LogInDataPage {
	
	private String description;
	private String username;
	private String password;
	private String isExecuted;
	private String scenarioType;
	
	public String getScenarioType() {
		return scenarioType;
	}
	public void setScenarioType(String scenarioType) {
		this.scenarioType = scenarioType;
	}
	public String getIsExecuted() 
	{
		return isExecuted;
	}
	public void setIsExecuted(String isExecuted) 
	{
		this.isExecuted = isExecuted;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}

}
