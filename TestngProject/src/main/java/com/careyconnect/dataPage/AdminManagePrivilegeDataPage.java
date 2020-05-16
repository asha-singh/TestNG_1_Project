package com.careyconnect.dataPage;

public class AdminManagePrivilegeDataPage {

	String description;
	String Environment;
	boolean isVerifyingManagePage;
	boolean isVerifyingHelpIcon;
	boolean isRequestInvoiceAccess;
	boolean isHelpIconVerbiage;
	boolean isVerifyingViewRequestPage;
	boolean isVerifyingRequestToMeTab;
	boolean isVerifyingExistingPrivilegesTab;
	String isArrangerOrManagerCheck;
	boolean isSearchingRecords;
	String dateFrom;
	String dateTo;
	String accountNum;
	String accountName;
	String requestType;
	String requestedPrivAccountNum;
	String requestedPrivType;
	String status;
	boolean isVerfyingTab;
	String loginEmail;
	String loginPassword;
	String scenario;
	boolean isDeniedAccess;
	boolean isApprovedAccountRequest;
	boolean isRevokedAccountRequest;
	String ExtPrvUserFirstName;
	String ExtPrvUserLastName;
	
	public String isArrangerOrManagerCheck(){
		
		return isArrangerOrManagerCheck;
	}
	
	public void setArrangerOrManagerCheck(String isArrangerOrManagerCheck){
		this.isArrangerOrManagerCheck=isArrangerOrManagerCheck;
	}
	
	public boolean isVerifyingRequestToMeTab(){
		return isVerifyingRequestToMeTab;
	}
	
	public boolean isVerifyingExistingPrivilegesTab(){
		return isVerifyingExistingPrivilegesTab;
	}
	
	public boolean isVerifyingViewRequestPage(){
		
		return isVerifyingViewRequestPage;
	}
	
	public void setVerifyingExistingPrivilegesTab(boolean isVerifyingExistingPrivilegesTab){
		this.isVerifyingExistingPrivilegesTab=isVerifyingExistingPrivilegesTab;
	}
	
	public void setVerifyingRequestToMeTab(boolean isVerifyingRequestToMeTab){
		this.isVerifyingRequestToMeTab=isVerifyingRequestToMeTab;
	}
	
	public void setVerifyingViewRequestPage(Boolean isVerifyingViewRequestPage){
		this.isVerifyingViewRequestPage=isVerifyingViewRequestPage;
	}
	
	
	public void setVerifyingManagePrivTab(boolean isVerifyingManagePage ){
		this.isVerifyingManagePage=isVerifyingManagePage;
	}
	
	public boolean isVerifyingManagePage(){
		
		return isVerifyingManagePage;
	}

	public  boolean isHelpIconVerbiage(){
		return  isHelpIconVerbiage;
	}
	
	public boolean isSearchingRecords(){
		
		return isSearchingRecords;
	}
	
	public void setisSearchingRecords(boolean isSearchingRecords) {
	this.isSearchingRecords = isSearchingRecords;
	}
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
	public void setDateTo(String dataTo) {
		this.dateTo = dataTo;
	}
	public String getUserName() {
		return loginEmail;
	}
	public void setUserName(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getPassword() {
		return loginPassword;
	}
	public void setPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getScenario() {
		return scenario;
	}
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestStatus() {
		return status;
	}

	public void setRequestStatus(String status) {
		this.status = status;
	}
	public boolean isVerfyingTab() {
		return isVerfyingTab;
	}

	public void setVerfyingTab(boolean isVerfyingTab) {
		this.isVerfyingTab = isVerfyingTab;
	}
	public boolean isRequestInvoiceAccess() {
		return isRequestInvoiceAccess;
	}

	public void setisRequestInvoiceAccess(boolean isRequestInvoiceAccess) {
		this.isRequestInvoiceAccess = isRequestInvoiceAccess;
	}
	public String getrequestedPrivAccountNum() {
		return requestedPrivAccountNum;
	}

	public void setrequestedPrivAccountNum(String requestedPrivAccountNum) {
		this.requestedPrivAccountNum = requestedPrivAccountNum;
	}
	public String getrequestedPrivType() {
		return requestedPrivType;
	}

	public void setrequestedPrivType(String requestedPrivType) {
		this.requestedPrivType = requestedPrivType;
	}
	public boolean isDeniedAccess() {
		return isDeniedAccess;
	}

	public void setDeniedAccess(boolean isDeniedAccess) {
		this.isDeniedAccess = isDeniedAccess;
	}

	public boolean isApprovedAccountRequest() {
		return isApprovedAccountRequest;
	}

	public void setApprovedAccountRequest(boolean isApprovedAccountRequest) {
		this.isApprovedAccountRequest = isApprovedAccountRequest;
	}

	public boolean isRevokedAccountRequest() {
		return isRevokedAccountRequest;
	}

	public void setRevokedAccountRequest(boolean isRevokedAccountRequest) {
		this.isRevokedAccountRequest = isRevokedAccountRequest;
	}

	public String getExtPrvUserFirstName() {
		return ExtPrvUserFirstName;
	}

	public void setExtPrvUserFirstName(String extPrvUserFirstName) {
		ExtPrvUserFirstName = extPrvUserFirstName;
	}

	public String getExtPrvUserLastName() {
		return ExtPrvUserLastName;
	}

	public void setExtPrvUserLastName(String extPrvUserLastName) {
		ExtPrvUserLastName = extPrvUserLastName;
	}
	
}