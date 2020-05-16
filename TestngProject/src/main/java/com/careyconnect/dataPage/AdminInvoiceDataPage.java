package com.careyconnect.dataPage;


	
	

	/******************* This is the data getter and setter class to fetch data from the data loader util class *********/

	public class AdminInvoiceDataPage {
	
		String description;
		String Environment;
		boolean isInvoicePage;
		boolean isHelpIconVerbiage;
		public boolean isHelpIconVerbiage() {
			return isHelpIconVerbiage;
		}

		public void setHelpIconVerbiage(boolean isHelpIconVerbiage) {
			this.isHelpIconVerbiage = isHelpIconVerbiage;
		}
		boolean isSearchingInvoice;
		boolean  isVerifyingSettingsIcon;
		String dateFrom;
		String dateTo;
		String invoiceNum;
		String accountNum;
		String reservationNum;
		boolean isSearchingInvoiceIncompleteTab;
		boolean isSearchingInvoiceCompletedTab;
		
		String loginEmail;
		String loginPassword;
		String scenario;
		boolean isViewInvoice;

		public boolean isViewInvoice() {
			return isViewInvoice;
		}

		public void setViewInvoice(boolean isViewInvoice) {
			this.isViewInvoice = isViewInvoice;
		}

		public boolean isInvoicePage(){
			
			return isInvoicePage;
			
			}
		
		public void setVerifyingInvoicePage(boolean isInvoicePage){
			this.isInvoicePage=isInvoicePage;
		}
		
		
		public void setVerifyingSettingsIcon(boolean isVerifyingSettingsIcon) {
			this.isVerifyingSettingsIcon = isVerifyingSettingsIcon;
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
	
		public boolean isSearchingInvoiceIncompleteTab() {
			return isSearchingInvoiceIncompleteTab;
		}
		public void setSearchingInvoiceIncompleteTab(boolean isSearchingInvoiceIncompleteTab) {
			this.isSearchingInvoiceIncompleteTab= isSearchingInvoiceIncompleteTab;
		}
		public String getInvoiceFrom_TravelDate() {
			return dateFrom;
		}
		public void setInvoiceFrom_TravelDate(String dateFrom) {
			this.dateFrom = dateFrom;
		}
		public String getInvoiceTo_TravelDate() {
			return dateTo;
		}
		public void setInvoiceTo_TravelDate(String dateTo) {
			this.dateTo = dateTo;
		}
		
		
		public boolean isSearchingInvoice() {
			return isSearchingInvoice;
		}
		public void setisSearchingInvoice(boolean isSearchingInvoice) {
			this.isSearchingInvoice= isSearchingInvoice;
		}
		
		public boolean	isVerifyingSettingsIcon(){
			
			return isVerifyingSettingsIcon;
		}
		
		
		
		public String getInvoiceNum(){
			return invoiceNum;
		}
		
		
		public void setInvoiceNum(String invoiceNum ){
			    this.invoiceNum = invoiceNum ;
		}
		
		
		public String  getAccountNum(){
			
			return accountNum;
		}
		
		public void setAccountNum(String accountNum){
			this.accountNum=accountNum;
		}
		public String getReservationNum(){
			
			return reservationNum;
		}
		
		public void setReservationNum(String reservationNum){
			this.reservationNum=reservationNum;
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
	}

