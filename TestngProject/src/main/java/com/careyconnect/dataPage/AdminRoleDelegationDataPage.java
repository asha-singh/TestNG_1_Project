package com.careyconnect.dataPage;

public class AdminRoleDelegationDataPage {

	String description;
	String Environment;
	boolean isAssigningRoleDelegation;
	boolean isHelpIconVerbiage;
	boolean isVerifyingRoleDelegationPage;
	boolean isVerifyingHelpIcon;
	String dateFrom;
	String dateTo;
	String accountNum;
	String reservationNum;
	String OriginalemailID;
	String FinalEmailID;
	public String getFinalEmailID() {
		return FinalEmailID;
	}
	public void setFinalEmailID(String finalEmailID) {
		FinalEmailID = finalEmailID;
	}
	boolean isRevokeDelegateResposibilty;
	public boolean isRevokeDelegateResposibilty() {
		return isRevokeDelegateResposibilty;
	}
	public void setRevokeDelegateResposibilty(boolean isRevokeDelegateResposibilty) {
		this.isRevokeDelegateResposibilty = isRevokeDelegateResposibilty;
	}
	String accessType;
	String accountType;
	String loginEmail;
	String loginPassword;
	String scenario;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEnvironment() {
		return Environment;
	}
	public void setEnvironment(String environment) {
		Environment = environment;
	}
	public boolean isAssigningRoleDelegation() {
		return isAssigningRoleDelegation;
	}
	public void setAssigningRoleDelegation(boolean isAssigningRoleDelegation) {
		this.isAssigningRoleDelegation = isAssigningRoleDelegation;
	}
	public boolean isHelpIconVerbiage() {
		return isHelpIconVerbiage;
	}
	public void setHelpIconVerbiage(boolean isHelpIconVerbiage) {
		this.isHelpIconVerbiage = isHelpIconVerbiage;
	}
	public boolean isVerifyingRoleDelegationPage() {
		return isVerifyingRoleDelegationPage;
	}
	public void setVerifyingRoleDelegationPage(boolean isVerifyingRoleDelegationPage) {
		this.isVerifyingRoleDelegationPage = isVerifyingRoleDelegationPage;
	}
	public boolean isVerifyingHelpIcon() {
		return isVerifyingHelpIcon;
	}
	public void setVerifyingHelpIcon(boolean isVerifyingHelpIcon) {
		this.isVerifyingHelpIcon = isVerifyingHelpIcon;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(String reservationNum) {
		this.reservationNum = reservationNum;
	}
	public String getEmailID() {
		return OriginalemailID;
	}
	public void setEmailID(String emailID) {
		this.OriginalemailID = emailID;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getScenario() {
		return scenario;
	}
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	
	
}