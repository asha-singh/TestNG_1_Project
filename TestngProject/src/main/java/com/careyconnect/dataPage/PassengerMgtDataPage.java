package com.careyconnect.dataPage;

public class PassengerMgtDataPage 
{
	String description;
	String isExecuted;
	boolean isDeletePassenger;
	boolean isImportPax;
	String serachEmailAddress;
	String searchCountry;
	String searchMobile;
	String requestAccess;
	String firstName;
	String LastName;
	String companyName;
	String title;
	String workNumber;
	String extension;
	boolean isNotificationEmailSame,isEditPassenger,changeMyName,change_CompanyName,change_workno,addRidePref;
	String notificationEmail;
	String LoginEmail;
	String LoginPassword;
	String deletedPassengerName;
	String ridePrefCity;
	String countryName, countryCode,mobileNumber,ext, accountno, delAccountNo;
	String cardType, cardNunber, nameOnCard, expMonth, expYear, country, billingAddress, city, state, postalCode, creditCardName; 
	String cardName;
	String rideCity, rideValue, rideInput, delPreferences;
	String passengerEmailID;
	String fn,ln,compnayname;

	public String getPassengerEmailID() {
		return passengerEmailID;
	}
	public void setPassengerEmailID(String passengerEmailID) {
		this.passengerEmailID = passengerEmailID;
	}

	String scenarioType;
	boolean isPassengerProfileUpadte, isChangeName, isChangeMobile, isChangeCompany, isChangeWork, isAdAccount, isDeleteAccount, isAddCreditCard, isDeleteCreditCard, isAddRidePreferences, isDeletePreferences;
	
	
	public String getScenarioType() {
		return scenarioType;
	}
	public void setScenarioType(String scenarioType) {
		this.scenarioType = scenarioType;
	}

	public Boolean getIsImportPax() {
		return isImportPax;
	}
	public void setIsImportPax(Boolean isImportPax) {
		this.isImportPax = isImportPax;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isPassengerProfileUpadte() {
		return isPassengerProfileUpadte;
	}

	public void setPassengerProfileUpadte(boolean isPassengerProfileUpadte) {
		this.isPassengerProfileUpadte = isPassengerProfileUpadte;
	}

	public boolean isChangeName() {
		return isChangeName;
	}

	public void setChangeName(boolean isChangeName) {
		this.isChangeName = isChangeName;
	}

	public boolean isChangeMobile() {
		return isChangeMobile;
	}

	public void setChangeMobile(boolean isChangeMobile) {
		this.isChangeMobile = isChangeMobile;
	}

	public boolean isChangeCompany() {
		return isChangeCompany;
	}

	public void setChangeCompany(boolean isChangeCompany) {
		this.isChangeCompany = isChangeCompany;
	}

	public boolean isChangeWork() {
		return isChangeWork;
	}

	public void setChangeWork(boolean isChangeWork) {
		this.isChangeWork = isChangeWork;
	}

	public boolean isAdAccount() {
		return isAdAccount;
	}

	public void setAdAccount(boolean isAdAccount) {
		this.isAdAccount = isAdAccount;
	}

	public boolean isDeleteAccount() {
		return isDeleteAccount;
	}

	public void setDeleteAccount(boolean isDeleteAccount) {
		this.isDeleteAccount = isDeleteAccount;
	}

	public boolean isAddCreditCard() {
		return isAddCreditCard;
	}

	public void setAddCreditCard(boolean isAddCreditCard) {
		this.isAddCreditCard = isAddCreditCard;
	}

	public boolean isDeleteCreditCard() {
		return isDeleteCreditCard;
	}

	public void setDeleteCreditCard(boolean isDeleteCreditCard) {
		this.isDeleteCreditCard = isDeleteCreditCard;
	}

	public boolean isAddRidePreferences() {
		return isAddRidePreferences;
	}

	public void setAddRidePreferences(boolean isAddRidePreferences) {
		this.isAddRidePreferences = isAddRidePreferences;
	}

	public boolean isDeletePreferences() {
		return isDeletePreferences;
	}

	public void setDeletePreferences(boolean isDeletePreferences) {
		this.isDeletePreferences = isDeletePreferences;
	}

	public void setNotificationEmailSame(boolean isNotificationEmailSame) {
		this.isNotificationEmailSame = isNotificationEmailSame;
	}

	public String getIsExecuted()
	{
		return isExecuted;
	}
	
	public void setIsExecuted(String isExecuted) 
	{
		
		this.isExecuted = isExecuted;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isEditPassenger() {
		return isEditPassenger;
	}
	public void setEditPassenger(boolean isEditPassenger) {
		this.isEditPassenger = isEditPassenger;
	}
	public boolean isDeletePassenger() {
		return isDeletePassenger;
	}
	public void setDeletePassenger(boolean isDeletePassenger) {
		this.isDeletePassenger = isDeletePassenger;
	}
	public String getDeletedPassengerName() {
		return deletedPassengerName;
	}
	public void setDeletedPassengerName(String deletedPassengerName) {
		this.deletedPassengerName = deletedPassengerName;
	}
	
	public String getSerachEmailAddress() {
		return serachEmailAddress;
	}
	public void setSerachEmailAddress(String serachEmailAddress) {
		this.serachEmailAddress = serachEmailAddress;
	}
	public String getSearchCountry() {
		return searchCountry;
	}
	public void setSearchCountry(String searchCountry) {
		this.searchCountry = searchCountry;
	}
	public String getSearchMobile() {
		return searchMobile;
	}
	public void setSearchMobile(String searchMobile) {
		this.searchMobile = searchMobile;
	}
	public String getRequestAccess() {
		return requestAccess;
	}
	public void setRequestAccess(String requestAccess) {
		this.requestAccess = requestAccess;
	}
	
	public boolean getChange_MyName(){
		return changeMyName;
	}
	
	public void setChange_MyName(boolean changeMyName){
		this.changeMyName=changeMyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWorkNumber() {
		return workNumber;
	}
	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public Boolean getIsNotificationEmailSame() {
		return isNotificationEmailSame;
	}
	public void setIsNotificationEmailSame(Boolean isNotificationEmailSame) {
		this.isNotificationEmailSame = isNotificationEmailSame;
	}
	public String getNotificationEmail() {
		return notificationEmail;
	}
	public void setNotificationEmail(String notificationEmail) {
		this.notificationEmail = notificationEmail;
	}
	public String getLoginEmail() {
		return LoginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		LoginEmail = loginEmail;
	}
	public String getLoginPassword() {
		return LoginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		LoginPassword = loginPassword;
	}

	public boolean getChange_CompanyName() {
		return change_CompanyName;
	}
	public void setChange_CompanyName(Boolean change_CompanyName) {
		this.change_CompanyName = change_CompanyName;
	}
	
	public boolean getChange_workno(){
		return change_workno;
	}
	
	public void setChange_workno(Boolean change_workno) {
		this.change_workno = change_workno;
	}
	public String getWork_Number() {
		return workNumber;
	}
	
	public void setWork_Number(String work) {
	this.workNumber=work;
	}
	
	public String getFirst_name() {
		return fn;
			
	}
	
	public void setFirst_name(String fn) {
		this.fn=fn;
			
	}
	
	public String getLast_name() {
		return ln;
			
	}
	
	public void setLast_name(String ln) {
		this.ln=ln;
			
	}
	
	public String getCompany_name() {
		return compnayname;
			
	}
	
	public void setCompany_name(String compnayname)
	{
		
		this.compnayname=compnayname;
	
	}
	
	public String getRidePrefCity()
	{
		
		return ridePrefCity;
	}
	
	public void setRidePrefCity( String ridePrefCity )
	{
		
		this.ridePrefCity= ridePrefCity;
	}
	public boolean addRidePreference()
	{
		// TODO Auto-generated method stub
		return addRidePref;
	}
	

	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
	

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	

	public String getDelAccountNo() {
		return delAccountNo;
	}

	public void setDelAccountNo(String delAccountNo) {
		this.delAccountNo = delAccountNo;
	}
	
	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNunber() {
		return cardNunber;
	}

	public void setCardNunber(String cardNunber) {
		this.cardNunber = cardNunber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCreditCardName() {
		return creditCardName;
	}

	public void setCreditCardName(String creditCardName) {
		this.creditCardName = creditCardName;
	}	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getRideCity() {
		return rideCity;
	}

	public void setRideCity(String rideCity) {
		this.rideCity = rideCity;
	}

	public String getRideValue() {
		return rideValue;
	}

	public void setRideValue(String rideValue) {
		this.rideValue = rideValue;
	}

	public String getRideInput() {
		return rideInput;
	}

	public void setRideInput(String rideInput) {
		this.rideInput = rideInput;
	}
	public String getDelPreferences() {
		return delPreferences;
	}

	public void setDelPreferences(String delPreferences) {
		this.delPreferences = delPreferences;
	}
}
