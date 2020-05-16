package com.careyconnect.dataPage;

/******************* This is the data getter and setter class to fetch data from the data loader util class *********/

public class ReservationDataPage 
{
	private String TestCase;
	private String Description;
	private String isExecuted;
    private String Login_user;
    private String Login_password;
    private String isMultiplePassenger;
    private String multiplePassengerCount;
	private String Reservation_Type;
    private String Pax_Name;
    private String pax_Email;
    private String Pax_mobile;
    private String Pax_F_Name;
	private String Pax_L_Name;
    private String Pax_C_Name;
    private String Pax_Title;
    private String Pax_Work;
    private String Pax_Ext;
    private String Num_Pax;
    private static String Trip_Type;
    private String Pickup_date;
    private String Pickup_month;
    private String Pickup_year;
    private String Pick_loc_Type;
    private Boolean IsTrainPickupValidate;
    private Boolean IsAirportPickupValidate;
    private String Pick_Location;
    private String PAirLine_Name;
	private String PFlight_No;
    private String PTCarrier_Name;
    private String PTrain_Number;
	private String PTArrival_Time;
	private String PTArrival_TimeFromat;
    private String PGPickup_Time;
    private String PGPickup_TimeFormat;
    private Boolean isAddStop;
    private String stopCount;
    private String Stop1_Type;
    private String Stop1_Location;
    private String Stop2_Type;
    private String Stop2_Location;
    private String Stop3_Type;
    private String Stop3_Location;
    private String Drop_Loc_Type;
    private Boolean IsTrainDropoffValidate;
    private String IsAirportDropoffValidate;
    private String Drop_Location;
    private String DAirLine_Number;
    private String DFlight_No;
    private String DTCarrier_Name;
    private String DTrain_Number;
    private String DTDeparture_Time;
    private String DTDeparture_TimeFormat;
    private Boolean DropOff_Checked;
    private String Time_Or_Duration;
    private String DropOff_Time;
    private String DropOff_TimeFormat;
    private Boolean isNextDay;
    private String Trip_Duration;
	private String Special_Instruction;
    private String Payment_Type;
    private String Promo_Code;
    private String User_Type;
    private Boolean isCreditCard;
    private Boolean isPaxCCaccount;
    private Boolean isBillAccount;
    private Boolean isAccountCC;
	private String accountNumber;
    private String CarType;
    private String CardType;
	private String CardNumber;
    private String Name_On_Card;
    private String Exp_Month;
    private String Exp_Year;
    private String Card_CVV;
    private String Card_Country;
    private String Billing_Address;
	private String City;
    private String State;
    private String Postal_Code;
    private Boolean isSaveToProfile;
    private String Scenario_type;
    
    
    public String getScenarioType() {
		return Scenario_type;
	}
	public void setScenarioType(String Scenario_type) {
		this.Scenario_type = Scenario_type;
	}
	public String getIsExecuted() {
		return isExecuted;
	}
	public void setIsExecuted(String isExecuted) {
		this.isExecuted = isExecuted;
	}
    
    
    private String guestBookingFirstName;
    public String getGuestBookingFirstName() {
		return guestBookingFirstName;
	}
	public void setGuestBookingFirstName(String guestBookingFirstName) {
		this.guestBookingFirstName = guestBookingFirstName;
	}
	public String getGuestBookingLastName() {
		return guestBookingLastName;
	}
	public void setGuestBookingLastName(String guestBookingLastName) {
		this.guestBookingLastName = guestBookingLastName;
	}
	private String guestBookingLastName;
    private String guestBookingMobilenumber;
   
	public String getGuestBookingMobilenumber() {
		return guestBookingMobilenumber;
	}
	public void setGuestBookingMobilenumber(String guestBookingMobilenumber) {
		this.guestBookingMobilenumber = guestBookingMobilenumber;
	}

    public String getIsMultiplePassenger() {
		return isMultiplePassenger;
	}
	public void setIsMultiplePassenger(String isMultiplePassenger) {
		this.isMultiplePassenger = isMultiplePassenger;
	}
	public String getMultiplePassengerCount() {
		return multiplePassengerCount;
	}
	public void setMultiplePassengerCount(String multiplePassengerCount) {
		this.multiplePassengerCount = multiplePassengerCount;
	}


	private String Num_Bag;
	
	
	
	public String getReservation_Type() {
		return Reservation_Type;
	}
	public void setReservation_Type(String reservation_Type) {
		Reservation_Type = reservation_Type;
	}
	public String getPax_Name() {
		return Pax_Name;
	}
	public void setPax_Name(String pax_Name) {
		Pax_Name = pax_Name;
	}
	public String getPax_Email() {
		return pax_Email;
	}
	public void setPax_Email(String pax_Email) {
		this.pax_Email = pax_Email;
	}
	public String getPax_mobile() {
		return Pax_mobile;
	}
	public void setPax_mobile(String pax_mobile) {
		Pax_mobile = pax_mobile;
	}
	public String getPax_F_Name() {
		return Pax_F_Name;
	}
	public void setPax_F_Name(String pax_F_Name) {
		Pax_F_Name = pax_F_Name;
	}
	public String getPax_L_Name() {
		return Pax_L_Name;
	}
	public void setPax_L_Name(String pax_L_Name) {
		Pax_L_Name = pax_L_Name;
	}
	public String getPax_C_Name() {
		return Pax_C_Name;
	}
	public void setPax_C_Name(String pax_C_Name) {
		Pax_C_Name = pax_C_Name;
	}
	public String getPax_Title() {
		return Pax_Title;
	}
	public void setPax_Title(String pax_Title) {
		Pax_Title = pax_Title;
	}
	public String getPax_Work() {
		return Pax_Work;
	}
	public void setPax_Work(String pax_Work) {
		Pax_Work = pax_Work;
	}
	public String getPax_Ext() {
		return Pax_Ext;
	}
	public void setPax_Ext(String pax_Ext) {
		Pax_Ext = pax_Ext;
	}
	public String getNum_Pax() {
		return Num_Pax;
	}
	public void setNum_Pax(String num_Pax) {
		Num_Pax = num_Pax;
	}
	public String getNum_Bag() {
		return Num_Bag;
	}
	public void setNum_Bag(String num_Bag) {
		Num_Bag = num_Bag;
	}
	public static String getTrip_Type() {
		return Trip_Type;
	}
	public void setTrip_Type(String trip_Type) {
		Trip_Type = trip_Type;
	}
	
    public String getPickup_date() {
		return Pickup_date;
	}
	public void setPickup_date(String pickup_date) {
		Pickup_date = pickup_date;
	}
	public String getPickup_month() {
		return Pickup_month;
	}
	public void setPickup_month(String pickup_month) {
		Pickup_month = pickup_month;
	}
	public String getPickup_year() {
		return Pickup_year;
	}
	public void setPickup_year(String pickup_year) {
		Pickup_year = pickup_year;
	}
	
	public String getPick_loc_Type() {
		return Pick_loc_Type;
	}
	public void setPick_loc_Type(String pick_loc_Type) {
		Pick_loc_Type = pick_loc_Type;
	}
	
    public Boolean getIsTrainPickupValidate() {
		return IsTrainPickupValidate;
	}
	public void setIsTrainPickupValidate(Boolean isTrainPickupValidate) {
		IsTrainPickupValidate = isTrainPickupValidate;
	}
	
    public Boolean getIsAirportPickupValidate() {
		return IsAirportPickupValidate;
	}
	public void setIsAirportPickupValidate(Boolean isAirportPickupValidate) {
		IsAirportPickupValidate = isAirportPickupValidate;
	}
	
	public String getPick_Location() {
		return Pick_Location;
	}
	
	public void setPick_Location(String pick_Location) {
		Pick_Location = pick_Location;
	}
	public String getPAirLine_Name() {
		return PAirLine_Name;
	}
	public void setPAirLine_Name(String pAirLine_Name) {
		PAirLine_Name = pAirLine_Name;
	}
	public String getPFlight_No() {
		return PFlight_No;
	}
	public void setPFlight_No(String pFlight_No) {
		PFlight_No = pFlight_No;
	}
	public String getPTCarrier_Name() {
		return PTCarrier_Name;
	}
	public void setPTCarrier_Name(String pTCarrier_Name) {
		PTCarrier_Name = pTCarrier_Name;
	}
	public String getPTrain_Number() {
		return PTrain_Number;
	}
	public void setPTrain_Number(String pTrain_Number) {
		PTrain_Number = pTrain_Number;
	}
	public String getPTArrival_Time() {
		return PTArrival_Time;
	}
	public void setPTArrival_Time(String pTArrival_Time) {
		PTArrival_Time = pTArrival_Time;
	}
	
	public String getPTArrival_TimeFromat() {
		return PTArrival_TimeFromat;
	}
	public void setPTArrival_TimeFromat(String pTArrival_TimeFromat) {
		PTArrival_TimeFromat = pTArrival_TimeFromat;
	}
	
	public String getPGPickup_Time() {
		return PGPickup_Time;
	}
	public void setPGPickup_Time(String pGPickup_Time) {
		PGPickup_Time = pGPickup_Time.toString();
	}
	
	public String getPGPickup_TimeFormat() {
		return PGPickup_TimeFormat;
	}
	public void setPGPickup_TimeFormat(String pGPickup_TimeFormat) {
		PGPickup_TimeFormat = pGPickup_TimeFormat;
	}
	
	public Boolean getIsAddStop() {
		return isAddStop;
	}
	public void setIsAddStop(Boolean isAddStop) {
		this.isAddStop = isAddStop;
	}
	public String getStopCount() {
		return stopCount;
	}
	public void setStopCount(String stopCount) {
		this.stopCount = stopCount;
	}
	public String getStop1_Type() {
		return Stop1_Type;
	}
	public void setStop1_Type(String stop1_Type) {
		Stop1_Type = stop1_Type;
	}
	public String getStop1_Location() {
		return Stop1_Location;
	}
	public void setStop1_Location(String stop1_Location) {
		Stop1_Location = stop1_Location;
	}
	public String getStop2_Type() {
		return Stop2_Type;
	}
	public void setStop2_Type(String stop2_Type) {
		Stop2_Type = stop2_Type;
	}
	public String getStop2_Location() {
		return Stop2_Location;
	}
	public void setStop2_Location(String stop2_Location) {
		Stop2_Location = stop2_Location;
	}
	public String getStop3_Type() {
		return Stop3_Type;
	}
	public void setStop3_Type(String stop3_Type) {
		Stop3_Type = stop3_Type;
	}
	public String getStop3_Location() {
		return Stop3_Location;
	}
	public void setStop3_Location(String stop3_Location) {
		Stop3_Location = stop3_Location;
	}
	public String getDrop_Loc_Type() {
		return Drop_Loc_Type;
	}
	public void setDrop_Loc_Type(String drop_Loc_Type) {
		Drop_Loc_Type = drop_Loc_Type;
	}
	
	public Boolean getIsTrainDropoffValidate() {
		return IsTrainDropoffValidate;
	}
	public void setIsTrainDropoffValidate(Boolean isTrainDropoffValidate) {
		IsTrainDropoffValidate = isTrainDropoffValidate;
	}
	
	public String getIsAirportDropoffValidate() {
		return IsAirportDropoffValidate;
	}
	public void setIsAirportDropoffValidate(String isAirportDropoffValidate) {
		IsAirportDropoffValidate = isAirportDropoffValidate;
	}
	
	public String getDrop_Location() {
		return Drop_Location;
	}
	public void setDrop_Location(String drop_Location) {
		Drop_Location = drop_Location;
	}
	public String getDAirLine_Number() {
		return DAirLine_Number;
	}
	public void setDAirLine_Number(String dAirLine_Number) {
		DAirLine_Number = dAirLine_Number;
	}
	public String getDFlight_No() {
		return DFlight_No;
	}
	public void setDFlight_No(String dFlight_No) {
		DFlight_No = dFlight_No;
	}
	public String getDTCarrier_Name() {
		return DTCarrier_Name;
	}
	public void setDTCarrier_Name(String dTCarrier_Name) {
		DTCarrier_Name = dTCarrier_Name;
	}
	public String getDTrain_Number() {
		return DTrain_Number;
	}
	public void setDTrain_Number(String dTrain_Number) {
		DTrain_Number = dTrain_Number;
	}
	public String getDTDeparture_Time() {
		return DTDeparture_Time;
	}
	public void setDTDeparture_Time(String dTDeparture_Time) {
		DTDeparture_Time = dTDeparture_Time;
	}
	
	public String getDTDeparture_TimeFormat() {
		return DTDeparture_TimeFormat;
	}
	public void setDTDeparture_TimeFormat(String dTDeparture_TimeFormat) {
		DTDeparture_TimeFormat = dTDeparture_TimeFormat;
	}
	
	public Boolean getDropOff_Checked() {
		return DropOff_Checked;
	}
	public void setDropOff_Checked(Boolean dropOff_Checked) {
		DropOff_Checked = dropOff_Checked;
	}
	public String getTime_Or_Duration() {
		return Time_Or_Duration;
	}
	public void setTime_Or_Duration(String time_Or_Duration) {
		Time_Or_Duration = time_Or_Duration;
	}
	public String getDropOff_Time() {
		return DropOff_Time;
	}
	public void setDropOff_Time(String dropOff_Time) {
		DropOff_Time = dropOff_Time;
	}
	
	public String getDropOff_TimeFormat() {
		return DropOff_TimeFormat;
	}
	public void setDropOff_TimeFormat(String dropOff_TimeFormat) {
		DropOff_TimeFormat = dropOff_TimeFormat;
	}
	
	public Boolean getIsNextDay() {
		return isNextDay;
	}
	public void setIsNextDay(Boolean isNextDay) {
		this.isNextDay = isNextDay;
	}
	public String getTrip_Duration() {
		return Trip_Duration;
	}
	public void setTrip_Duration(String trip_Duration) {
		Trip_Duration = trip_Duration;
	}
	public String getSpecial_Instruction() {
		return Special_Instruction;
	}
	public void setSpecial_Instruction(String special_Instruction) {
		Special_Instruction = special_Instruction;
	}
	public String getPayment_Type() {
		return Payment_Type;
	}
	public void setPayment_Type(String payment_Type) {
		Payment_Type = payment_Type;
	}
	public String getPromo_Code() {
		return Promo_Code;
	}
	public void setPromo_Code(String promo_Code) {
		Promo_Code = promo_Code;
	}
	public String getUser_Type() {
		return User_Type;
	}
	public void setUser_Type(String user_Type) {
		User_Type = user_Type;
	}
	public Boolean getIsCreditCard() {
		return isCreditCard;
	}
	public void setIsCreditCard(Boolean isCreditCard) {
		this.isCreditCard = isCreditCard;
	}
	public Boolean getIsPaxCCaccount() {
		return isPaxCCaccount;
	}
	public void setIsPaxCCaccount(Boolean isPaxCCaccount) {
		this.isPaxCCaccount = isPaxCCaccount;
	}
	public Boolean getIsBillAccount() {
		return isBillAccount;
	}
	public void setIsBillAccount(Boolean isBillAccount) {
		this.isBillAccount = isBillAccount;
	}
	public Boolean getIsAccountCC() {
		return isAccountCC;
	}
	public void setIsAccountCC(Boolean isAccountCC) {
		this.isAccountCC = isAccountCC;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
    public String getCardType() {
		return CardType;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getName_On_Card() {
		return Name_On_Card;
	}
	public void setName_On_Card(String name_On_Card) {
		Name_On_Card = name_On_Card;
	}
	public String getExp_Month() {
		return Exp_Month;
	}
	public void setExp_Month(String exp_Month) {
		Exp_Month = exp_Month;
	}
	public String getExp_Year() {
		return Exp_Year;
	}
	public void setExp_Year(String exp_Year) {
		Exp_Year = exp_Year;
	}
	public String getCard_CVV() {
		return Card_CVV;
	}
	public void setCard_CVV(String card_CVV) {
		Card_CVV = card_CVV;
	}
	public String getCard_Country() {
		return Card_Country;
	}
	public void setCard_Country(String card_Country) {
		Card_Country = card_Country;
	}
	public String getBilling_Address() {
		return Billing_Address;
	}
	public void setBilling_Address(String billing_Address) {
		Billing_Address = billing_Address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPostal_Code() {
		return Postal_Code;
	}
	public void setPostal_Code(String postal_Code) {
		Postal_Code = postal_Code;
	}
	public Boolean getIsSaveToProfile() {
		return isSaveToProfile;
	}
	public void setIsSaveToProfile(Boolean isSaveToProfile) {
		this.isSaveToProfile = isSaveToProfile;
	}

    
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	
    public String getLogin_user() 
    {
		return Login_user;
	}
	public void setLogin_user(String login_user) 
	{
		Login_user = login_user;
	}
	public String getLogin_password() 
	{
		return Login_password;
	}
	public void setLogin_password(String login_password) 
	{
		Login_password = login_password;
	}
	public String getDescription() 
	{
		return Description;
	}
	public void setDescription(String description) 
	{
		Description = description;
	}

	
}
