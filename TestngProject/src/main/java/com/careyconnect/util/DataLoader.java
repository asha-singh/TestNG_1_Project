package com.careyconnect.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.careyconnect.dataBase.DataBase;
import com.careyconnect.dataPage.AdminAccountReservationsDataPage;
import com.careyconnect.dataPage.AdminAccountUsersDataPage;
import com.careyconnect.dataPage.AdminInvoiceDataPage;
import com.careyconnect.dataPage.AdminManagePrivilegeDataPage;
import com.careyconnect.dataPage.AdminReceiptsDataPage;
import com.careyconnect.dataPage.AdminRoleDelegationDataPage;
import com.careyconnect.dataPage.CareyRewardsDataPage;
import com.careyconnect.dataPage.LogInDataPage;
import com.careyconnect.dataPage.ManageReservationDataPage;
import com.careyconnect.dataPage.PassengerMgtDataPage;
import com.careyconnect.dataPage.RegistrationDataPage;
import com.careyconnect.dataPage.ReservationDataPage;
import com.careyconnect.dataPage.UpdateProfileDataPage;
import com.careyconnect.dataPage.smokedata;
import com.mysql.jdbc.Statement;



public class DataLoader 
{
	
    
    public static LogInDataPage loadLoginData(LogInDataPage logindataPage)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("SELECT * FROM champs_new_db.tbl_login where Environment = 'SYSTest';");
    	            
            while(rs.next())
            {
            	logindataPage.setDescription(rs.getString(2));
            	logindataPage.setIsExecuted(rs.getString(3));
            	logindataPage.setUsername(rs.getString(4));
            	logindataPage.setPassword(rs.getString(5));
            	logindataPage.setScenarioType(rs.getString(6));
            	break;
            }
            dbConn.close();	
    	    
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return logindataPage;
    }
    
    public static UpdateProfileDataPage loadUpdateProfileData(String testcase, UpdateProfileDataPage updateProfileDataPage)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
            {
            	
            	updateProfileDataPage.setDescription(rs.getString(2));
            	updateProfileDataPage.setIsEcexuted(rs.getString(3));
            	updateProfileDataPage.setChange_ID_(getBoolValue(rs.getString(4)));
            	updateProfileDataPage.setLogin_ID(rs.getString(5));
            	updateProfileDataPage.setCurrent_Password(rs.getString(6));
            	updateProfileDataPage.setChange_Password_(getBoolValue(rs.getString(7)));
            	updateProfileDataPage.setNew_Password(rs.getString(8));
            	updateProfileDataPage.setConfirm_Password(rs.getString(9));
            	updateProfileDataPage.setChange_MyName_(getBoolValue(rs.getString(10)));
            	updateProfileDataPage.setFirst_name(rs.getString(11));
            	updateProfileDataPage.setLast_Name(rs.getString(12));
            	updateProfileDataPage.setChange_CompanyName(getBoolValue(rs.getString(13)));
            	updateProfileDataPage.setCompany_Name(rs.getString(14));
            	updateProfileDataPage.setChange_workno_(getBoolValue(rs.getString(15)));
            	updateProfileDataPage.setWork_Number(rs.getString(16));
            	updateProfileDataPage.setWork_Number_Ext(rs.getString(17));
            	updateProfileDataPage.setChange_MobileNo_(getBoolValue(rs.getString(18)));
            	updateProfileDataPage.setMob_country(rs.getString(19));
            	updateProfileDataPage.setMob_Number(rs.getString(20));
            	updateProfileDataPage.setAdd_Account_(getBoolValue(rs.getString(21)));
            	updateProfileDataPage.setAccount_Number(rs.getString(22));
            	updateProfileDataPage.setAccount_Role(rs.getString(23));
            	updateProfileDataPage.setDel_AccNo_(getBoolValue(rs.getString(24)));
            	updateProfileDataPage.setDel_AC_number(rs.getString(25));
            	updateProfileDataPage.setChange_Notifications(getBoolValue(rs.getString(26)));
            	updateProfileDataPage.setPre_Administrative(getBoolValue(rs.getString(27)));
            	updateProfileDataPage.setPre_Book_confirm(getBoolValue(rs.getString(28)));
            	updateProfileDataPage.setPre_Book_Mod(getBoolValue(rs.getString(29)));
            	updateProfileDataPage.setPre_Prof_Mod(getBoolValue(rs.getString(30)));
            	updateProfileDataPage.setPre_tripreminder(getBoolValue(rs.getString(31)));
            	updateProfileDataPage.setPre_chauf_Details(getBoolValue(rs.getString(32)));
            	updateProfileDataPage.setPre_trip_status(getBoolValue(rs.getString(33)));
            	updateProfileDataPage.setAdd_Contact_(getBoolValue(rs.getString(34)));
            	updateProfileDataPage.setAdding_Email(rs.getString(35));
            	updateProfileDataPage.setDel_Contact_(getBoolValue(rs.getString(36)));
            	updateProfileDataPage.setDeleting_Email(rs.getString(37));
            	updateProfileDataPage.setAdd_Loc_(getBoolValue(rs.getString(38)));
            	updateProfileDataPage.setAddLOcation(rs.getString(39));
            	updateProfileDataPage.setDel_Location_(getBoolValue(rs.getString(40)));
            	updateProfileDataPage.setDeleteLocation(rs.getString(41));
            	updateProfileDataPage.setLogin_user(rs.getString(42));
            	updateProfileDataPage.setLogin_password(rs.getString(43));
            	updateProfileDataPage.setScenarioType(rs.getString(44));
            	break;
            }       	
            dbConn.close();	
    	    
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return updateProfileDataPage;
    }
    public static RegistrationDataPage loadRegistrationData(String testcase, RegistrationDataPage registrationdataPage)
    {
    	try
    	{
    		
    		/*DBConnClass dbConn = new DBConnClass();
    	    Connection conn = dbConn.getConnection();
    	    String sqlQuery="SELECT * FROM champs_new_db.tbl_registration where Testcase_Name='"+testcase+"'";
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            ResultSet rs = dbConn.executeQuery(null, stmt);*/
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	registrationdataPage.setDescription(rs.getString(2));
            	registrationdataPage.setIsExecuted(rs.getString(3));
            	registrationdataPage.setProfile(rs.getString(4));
            	registrationdataPage.setFirstname(rs.getString(5));
            	registrationdataPage.setLastname(rs.getString(6));
            	registrationdataPage.setNewLoginID(rs.getString(7));
            	registrationdataPage.setCountry(rs.getString(8));
            	registrationdataPage.setMobilenumber(rs.getString(9));
            	registrationdataPage.setPassword(rs.getString(10));
            	registrationdataPage.setConfirmpassword(rs.getString(11));
            	registrationdataPage.setCompanyname(rs.getString(12));
            	registrationdataPage.setWorknumber(rs.getString(13));
            	registrationdataPage.setExtesion(rs.getString(14));
            	registrationdataPage.setAccountnumber(rs.getString(15));
            	registrationdataPage.setTravelagencyid(rs.getString(16));
            	registrationdataPage.setUmlimitedBudgetNumber(rs.getString(17));
            	registrationdataPage.setIsCareyReward(getBoolValue(rs.getString(18)));
            	registrationdataPage.setRewardAddress(rs.getString(19));
            	registrationdataPage.setRewardCountry(rs.getString(20));
            	registrationdataPage.setRewardCity(rs.getString(21));
            	registrationdataPage.setRewardState(rs.getString(22));
            	registrationdataPage.setRewardZip(rs.getString(23));
            	registrationdataPage.setAdminpref(getBoolValue(rs.getString(24)));
            	registrationdataPage.setBookingconfirmationpref(getBoolValue(rs.getString(25)));
            	registrationdataPage.setBookingmodificationpref(getBoolValue(rs.getString(26)));
            	registrationdataPage.setProfilemodificationpref(getBoolValue(rs.getString(27)));
            	registrationdataPage.setPretrippref(getBoolValue(rs.getString(28)));
            	registrationdataPage.setChauffeurdetailpref(getBoolValue(rs.getString(29)));
            	registrationdataPage.setTripstatuspref(getBoolValue(rs.getString(30)));
            	registrationdataPage.setAdminpref_sms(getBoolValue(rs.getString(31)));
            	registrationdataPage.setPretrippref_sms(getBoolValue(rs.getString(32)));
            	registrationdataPage.setChauffeurdetailpref_sms(getBoolValue(rs.getString(33)));
            	registrationdataPage.setTripstatuspref_sms(getBoolValue(rs.getString(34)));
            	registrationdataPage.setAcceptTerms(getBoolValue(rs.getString(35)));
            	registrationdataPage.setScenarioType(rs.getString(36));
            	break;
            }
            dbConn.close();
        }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return registrationdataPage;
    }

    public static ReservationDataPage loadReservationData(String testcase, ReservationDataPage reservationdataPage)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	reservationdataPage.setDescription(rs.getString(2));
            	reservationdataPage.setIsExecuted(rs.getString(3));
            	reservationdataPage.setReservation_Type(rs.getString(4));
            	reservationdataPage.setIsMultiplePassenger((rs.getString(5)));
            	reservationdataPage.setMultiplePassengerCount(rs.getString(6));
            	reservationdataPage.setPax_Name(rs.getString(7));
            	reservationdataPage.setPax_Email(rs.getString(8));
            	reservationdataPage.setPax_mobile(rs.getString(9));
            	reservationdataPage.setPax_F_Name(rs.getString(10));
            	reservationdataPage.setPax_L_Name(rs.getString(11));
            	reservationdataPage.setPax_C_Name(rs.getString(12));
            	reservationdataPage.setPax_Title(rs.getString(13));
            	reservationdataPage.setPax_Work(rs.getString(14));
            	reservationdataPage.setPax_Ext(rs.getString(15));
            	reservationdataPage.setNum_Pax(rs.getString(16));
            	reservationdataPage.setNum_Bag(rs.getString(17));
            	reservationdataPage.setTrip_Type(rs.getString(18));
            	reservationdataPage.setPickup_date(rs.getString(19));
            	reservationdataPage.setPickup_month(rs.getString(20));
            	reservationdataPage.setPickup_year(rs.getString(21));
            	reservationdataPage.setPick_loc_Type(rs.getString(22));
            	reservationdataPage.setIsTrainPickupValidate(getBoolValue(rs.getString(23)));
            	reservationdataPage.setIsAirportPickupValidate(getBoolValue(rs.getString(24)));
            	reservationdataPage.setPick_Location(rs.getString(25));
            	reservationdataPage.setPAirLine_Name(rs.getString(26));	
            	reservationdataPage.setPFlight_No(rs.getString(27));
            	reservationdataPage.setPTCarrier_Name(rs.getString(28));
            	reservationdataPage.setPTrain_Number(rs.getString(29));
            	reservationdataPage.setPTArrival_Time(rs.getString(30));
            	reservationdataPage.setPTArrival_TimeFromat(rs.getString(31));
            	reservationdataPage.setPGPickup_Time(rs.getString(32));
            	reservationdataPage.setPGPickup_TimeFormat(rs.getString(33));
            	reservationdataPage.setIsAddStop(getBoolValue(rs.getString(34)));
            	reservationdataPage.setStopCount(rs.getString(35));
            	reservationdataPage.setStop1_Type(rs.getString(36));
            	reservationdataPage.setStop1_Location(rs.getString(37));
            	reservationdataPage.setStop2_Type(rs.getString(38));
            	reservationdataPage.setStop2_Location(rs.getString(39));
            	reservationdataPage.setStop3_Type(rs.getString(40));
            	reservationdataPage.setStop3_Location(rs.getString(41));
            	reservationdataPage.setDrop_Loc_Type(rs.getString(42));
            	reservationdataPage.setIsTrainDropoffValidate(getBoolValue(rs.getString(43)));
            	reservationdataPage.setIsAirportDropoffValidate((rs.getString(44)));
            	reservationdataPage.setDrop_Location(rs.getString(45));
            	reservationdataPage.setDAirLine_Number(rs.getString(46));
            	reservationdataPage.setDFlight_No(rs.getString(47));
            	reservationdataPage.setDTCarrier_Name(rs.getString(48));
            	reservationdataPage.setDTrain_Number(rs.getString(49));
            	reservationdataPage.setDTDeparture_Time(rs.getString(50));
            	reservationdataPage.setDTDeparture_TimeFormat(rs.getString(51));
            	reservationdataPage.setDropOff_Checked(getBoolValue(rs.getString(52)));
            	reservationdataPage.setTime_Or_Duration(rs.getString(53));
            	reservationdataPage.setDropOff_Time(rs.getString(54));
            	reservationdataPage.setDropOff_TimeFormat(rs.getString(55));
            	reservationdataPage.setIsNextDay(getBoolValue(rs.getString(56)));
            	reservationdataPage.setTrip_Duration(rs.getString(57));
            	reservationdataPage.setSpecial_Instruction(rs.getString(58));
            	reservationdataPage.setPayment_Type(rs.getString(59));
            	reservationdataPage.setPromo_Code(rs.getString(60));
            	reservationdataPage.setUser_Type(rs.getString(61));
            	reservationdataPage.setIsCreditCard(getBoolValue(rs.getString(62)));
            	reservationdataPage.setIsPaxCCaccount(getBoolValue(rs.getString(63)));
            	reservationdataPage.setIsBillAccount(getBoolValue(rs.getString(64)));
            	reservationdataPage.setIsAccountCC(getBoolValue(rs.getString(65)));
            	reservationdataPage.setAccountNumber(rs.getString(66));
            	reservationdataPage.setCarType(rs.getString(67));
            	reservationdataPage.setCardType(rs.getString(68));
            	reservationdataPage.setCardNumber(rs.getString(69));
            	reservationdataPage.setName_On_Card(rs.getString(70));
            	reservationdataPage.setExp_Month(rs.getString(71));
            	reservationdataPage.setExp_Year(rs.getString(72));
            	reservationdataPage.setCard_CVV(rs.getString(73));
            	reservationdataPage.setCard_Country(rs.getString(74));
            	reservationdataPage.setBilling_Address(rs.getString(75));
            	reservationdataPage.setCity(rs.getString(76));
            	reservationdataPage.setState(rs.getString(77));
            	reservationdataPage.setPostal_Code(rs.getString(78));
            	reservationdataPage.setIsSaveToProfile(getBoolValue(rs.getString(79)));
            	reservationdataPage.setLogin_user(rs.getString(80));
            	reservationdataPage.setLogin_password(rs.getString(81));
            	reservationdataPage.setGuestBookingFirstName(rs.getString(82));
            	reservationdataPage.setGuestBookingLastName(rs.getString(83));
            	reservationdataPage.setGuestBookingMobilenumber(rs.getString(84));
            	reservationdataPage.setScenarioType(rs.getString(86));
            	
            	break;
            }
            dbConn.close();
        }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return reservationdataPage;
    }
    
    public static PassengerMgtDataPage loadPassengerMgtData(String testcase, PassengerMgtDataPage paxmgrPage)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	paxmgrPage.setDescription(rs.getString(2));
            	paxmgrPage.setIsExecuted(rs.getString(3));
            	paxmgrPage.setIsImportPax(getBoolValue(rs.getString(4)));
            	paxmgrPage.setDeletePassenger(getBoolValue(rs.getString(5)));
            	paxmgrPage.setDeletedPassengerName(rs.getString(6));
            	paxmgrPage.setSerachEmailAddress(rs.getString(7));
            	paxmgrPage.setSearchCountry(rs.getString(8));
            	paxmgrPage.setSearchMobile(rs.getString(9));
            	paxmgrPage.setRequestAccess(rs.getString(10));
            	paxmgrPage.setFirstName(rs.getString(11));
            	paxmgrPage.setLastName(rs.getString(12));
            	paxmgrPage.setCompanyName(rs.getString(13));
            	paxmgrPage.setTitle(rs.getString(14));
            	paxmgrPage.setWorkNumber(rs.getString(15));
            	paxmgrPage.setExtension(rs.getString(16));
            	paxmgrPage.setIsNotificationEmailSame(getBoolValue(rs.getString(17)));
            	paxmgrPage.setNotificationEmail(rs.getString(18));	
            	paxmgrPage.setPassengerProfileUpadte(getBoolValue(rs.getString(19)));
            	paxmgrPage.setPassengerEmailID(rs.getString(20));
            	paxmgrPage.setChangeName(getBoolValue(rs.getString(21)));
            	paxmgrPage.setFirst_name(rs.getString(22));
            	paxmgrPage.setLast_name(rs.getString(23));
            	paxmgrPage.setChangeMobile(getBoolValue(rs.getString(24)));
            	paxmgrPage.setCountryName(rs.getString(25));
            	paxmgrPage.setMobileNumber(rs.getString(26));
            	paxmgrPage.setChangeCompany(getBoolValue(rs.getString(27)));
            	paxmgrPage.setCompany_name(rs.getString(28));
            	paxmgrPage.setChange_workno(getBoolValue(rs.getString(29)));
            	paxmgrPage.setWork_Number(rs.getString(30));
            	paxmgrPage.setExt(rs.getString(31));
            	paxmgrPage.setAdAccount(getBoolValue(rs.getString(32)));
            	paxmgrPage.setAccountno(rs.getString(33));
            	paxmgrPage.setDeleteAccount(getBoolValue(rs.getString(34)));
            	paxmgrPage.setDelAccountNo(rs.getString(35));
            	paxmgrPage.setAddCreditCard(getBoolValue(rs.getString(36)));
            	paxmgrPage.setCardType(rs.getString(37));
            	paxmgrPage.setCardNunber(rs.getString(38));
            	paxmgrPage.setNameOnCard(rs.getString(39));
            	paxmgrPage.setExpMonth(rs.getString(40));
            	paxmgrPage.setExpYear(rs.getString(41));
            	paxmgrPage.setCountryCode(rs.getString(42));
            	paxmgrPage.setBillingAddress(rs.getString(43));
            	paxmgrPage.setCity(rs.getString(44));
            	paxmgrPage.setState(rs.getString(45));
            	paxmgrPage.setPostalCode(rs.getString(46));
            	paxmgrPage.setDeleteCreditCard(getBoolValue(rs.getString(47)));
            	paxmgrPage.setCardName(rs.getString(48));
            	paxmgrPage.setAddRidePreferences(getBoolValue(rs.getString(49)));
            	paxmgrPage.setRideCity(rs.getString(50));
            	paxmgrPage.setRideValue(rs.getString(51));
            	paxmgrPage.setRideInput(rs.getString(52));
            	paxmgrPage.setDeletePreferences(getBoolValue(rs.getString(53)));
            	paxmgrPage.setDelPreferences(rs.getString(54));
            	paxmgrPage.setLoginEmail(rs.getString(55));
            	paxmgrPage.setLoginPassword(rs.getString(56));
            	paxmgrPage.setScenarioType(rs.getString(57));
            	break;
            }
            dbConn.close();
        }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return paxmgrPage;
    }
    
    public static smokedata smkdata(String testcase, smokedata smkdata)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	smkdata.setIsExecuted(rs.getString(2));
            	smkdata.setDescription(rs.getString(3));
            	
            }
            dbConn.close();
        }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return smkdata;
    }
    
    public static ManageReservationDataPage loadManageReservationData(String testcase, ManageReservationDataPage manageReservationdataPage) {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            while(rs.next()){
            	
            	manageReservationdataPage.setDescription(rs.getString(2));
                manageReservationdataPage.setExecuted(rs.getString(3));
                manageReservationdataPage.setManageReservation(rs.getString(4));
                manageReservationdataPage.setDateTimeChange(getBoolValue(rs.getString(5)));
                manageReservationdataPage.setPULocationChange(getBoolValue(rs.getString(6)));
                manageReservationdataPage.setDOLocationChange(getBoolValue(rs.getString(7)));
                manageReservationdataPage.setTripTypeChange(getBoolValue(rs.getString(8)));
                manageReservationdataPage.setVehicleTypeChange(getBoolValue(rs.getString(9)));
                manageReservationdataPage.setTimePeriodChange(getBoolValue(rs.getString(10)));
                manageReservationdataPage.setPaymentTypeChange(getBoolValue(rs.getString(11)));
                manageReservationdataPage.setReservationId(rs.getString(12));
                manageReservationdataPage.setNum_Pax(rs.getString(13));
                manageReservationdataPage.setNum_Bag(rs.getString(14));
                manageReservationdataPage.setTrip_Type(rs.getString(15));
                manageReservationdataPage.setPickup_date(rs.getString(16));
                manageReservationdataPage.setPickup_month(rs.getString(17));
                manageReservationdataPage.setPickup_year(rs.getString(18));
                manageReservationdataPage.setPick_loc_Type(rs.getString(19));
                manageReservationdataPage.setIsTrainPickupValidate(getBoolValue(rs.getString(20)));
                manageReservationdataPage.setIsAirportPickupValidate(getBoolValue(rs.getString(21)));
                manageReservationdataPage.setPick_Location(rs.getString(22));
                manageReservationdataPage.setPAirLine_Name(rs.getString(23)); 
                manageReservationdataPage.setPFlight_No(rs.getString(24));
                manageReservationdataPage.setPTCarrier_Name(rs.getString(25));
                manageReservationdataPage.setPTrain_Number(rs.getString(26));
                manageReservationdataPage.setPTArrival_Time(rs.getString(27));
                manageReservationdataPage.setPTArrival_TimeFromat(rs.getString(28));
                manageReservationdataPage.setPGPickup_Time(rs.getString(29));
                manageReservationdataPage.setPGPickup_TimeFormat(rs.getString(30));
                manageReservationdataPage.setIsAddStop(getBoolValue(rs.getString(31)));
                manageReservationdataPage.setStopCount(rs.getString(32));
                manageReservationdataPage.setStop1_Type(rs.getString(33));
                manageReservationdataPage.setStop1_Location(rs.getString(34));
                manageReservationdataPage.setStop2_Type(rs.getString(35));
                manageReservationdataPage.setStop2_Location(rs.getString(36));
                manageReservationdataPage.setStop3_Type(rs.getString(37));
                manageReservationdataPage.setStop3_Location(rs.getString(38));
                manageReservationdataPage.setDrop_Loc_Type(rs.getString(39));
                manageReservationdataPage.setIsTrainDropoffValidate(getBoolValue(rs.getString(40)));
                manageReservationdataPage.setIsAirportDropoffValidate(getBoolValue(rs.getString(41)));
                manageReservationdataPage.setDrop_Location(rs.getString(42));
                manageReservationdataPage.setDAirLine_Number(rs.getString(43));
                manageReservationdataPage.setDFlight_No(rs.getString(44));
                manageReservationdataPage.setDTCarrier_Name(rs.getString(45));
                manageReservationdataPage.setDTrain_Number(rs.getString(46));
                manageReservationdataPage.setDTDeparture_Time(rs.getString(47));
                manageReservationdataPage.setDTDeparture_TimeFormat(rs.getString(48));
                manageReservationdataPage.setDropOff_Checked(getBoolValue(rs.getString(49)));
                manageReservationdataPage.setTime_Or_Duration(rs.getString(50));
                manageReservationdataPage.setDropOff_Time(rs.getString(51));
                manageReservationdataPage.setDropOff_TimeFormat(rs.getString(52));
                manageReservationdataPage.setIsNextDay(getBoolValue(rs.getString(53)));
                manageReservationdataPage.setTrip_Duration(rs.getString(54));
                manageReservationdataPage.setSpecial_Instruction(rs.getString(55));
                manageReservationdataPage.setPayment_Type(rs.getString(56));
                manageReservationdataPage.setPromo_Code(rs.getString(57));
                manageReservationdataPage.setUser_Type(rs.getString(58));
                manageReservationdataPage.setIsCreditCard(getBoolValue(rs.getString(59)));
                manageReservationdataPage.setIsPaxCCaccount(getBoolValue(rs.getString(60)));
                manageReservationdataPage.setIsBillAccount(getBoolValue(rs.getString(61)));
                manageReservationdataPage.setIsAccountCC(getBoolValue(rs.getString(62)));
                manageReservationdataPage.setAccount_Number(rs.getString(63));
                manageReservationdataPage.setCarType(rs.getString(64));
                manageReservationdataPage.setCardType(rs.getString(65));
                manageReservationdataPage.setCardNumber(rs.getString(66));
                manageReservationdataPage.setName_On_Card(rs.getString(67));
                manageReservationdataPage.setExp_Month(rs.getString(68));
                manageReservationdataPage.setExp_Year(rs.getString(69));
                manageReservationdataPage.setCard_CVV(rs.getString(70));
                manageReservationdataPage.setCard_Country(rs.getString(71));
                manageReservationdataPage.setBilling_Address(rs.getString(72));
                manageReservationdataPage.setCity(rs.getString(73));
                manageReservationdataPage.setState(rs.getString(74));
                manageReservationdataPage.setPostal_Code(rs.getString(75));
                manageReservationdataPage.setIsSaveToProfile(getBoolValue(rs.getString(76)));
                manageReservationdataPage.setLogin_user(rs.getString(77));
                manageReservationdataPage.setLogin_password(rs.getString(78));
                manageReservationdataPage.setScenarioType(rs.getString(79));
            }
            dbConn.close();
    
    }catch(Exception e)
    	{
		e.printStackTrace();
	}
    	return manageReservationdataPage;
    }
    
    public static CareyRewardsDataPage loadRewardsData(String testcase, CareyRewardsDataPage CareyRewards)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	CareyRewards.setDescription(rs.getString(2));
            	CareyRewards.setRegister(getBoolValue(rs.getString(4)));
            	CareyRewards.setUpdate(getBoolValue(rs.getString(5)));
            	CareyRewards.setOptout(getBoolValue(rs.getString(6)));
            	CareyRewards.setCountryName(rs.getString(7));
            	CareyRewards.setAddress(rs.getString(8));
            	CareyRewards.setStateName(rs.getString(9));
            	CareyRewards.setCityName(rs.getString(10));
            	CareyRewards.setZipCode(rs.getString(11));
            	CareyRewards.setWorkNumber(rs.getString(12));
            	CareyRewards.setEmailId(rs.getString(13));
            	CareyRewards.setUsername(rs.getString(14));
            	CareyRewards.setPassword(rs.getString(15));
            	CareyRewards.setScenarioType(rs.getString(16));
            }
            
            dbConn.close();
    	}
            catch(Exception e)
        	{
    		e.printStackTrace();
    	}
        	return CareyRewards;
        }
    
    public static AdminReceiptsDataPage loadAdminReceipt(String testcase, AdminReceiptsDataPage AdminReceipt)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	AdminReceipt.setDescription(rs.getString(2));
            	AdminReceipt.setBothTabDisplayed(getBoolValue(rs.getString(4)));
            	AdminReceipt.setHelpIconVerbiage(getBoolValue(rs.getString(5)));
            	AdminReceipt.setSearchingMyReceiptRecord(getBoolValue(rs.getString(6)));
            	AdminReceipt.setMyReceipt_TravelDate(rs.getString(7));
            	AdminReceipt.setMyReceipt_ServiceArea(rs.getString(8));
            	AdminReceipt.setMyReceipt_PaxFirstName(rs.getString(9));
            	AdminReceipt.setMyReceipt_PaxLastName(rs.getString(10));
            	AdminReceipt.setMyReceipt_ReservationID(rs.getString(11));
            	AdminReceipt.setVerifiedSettingIconOptions_MyReceipt(getBoolValue(rs.getString(12)));
            	AdminReceipt.setViewReceipt_MyReceipt(getBoolValue(rs.getString(13)));
            	AdminReceipt.setIsVerifiedSettingIconOptions_ViewReceipt_MyReceipt(getBoolValue(rs.getString(14)));
            	AdminReceipt.setSearchingOthersReceiptRecord(getBoolValue(rs.getString(15)));
            	AdminReceipt.setOthersReceipt_TravelDate(rs.getString(16));
            	AdminReceipt.setOthersReceipt_ServiceArea(rs.getString(17));
            	AdminReceipt.setOthersReceipt_PaxFirstName(rs.getString(18));
            	AdminReceipt.setOthersReceipt_PaxLastName(rs.getString(19));
            	AdminReceipt.setOthersReceipt_ReservationID(rs.getString(20));
            	AdminReceipt.setOthersReceipt_CCAccount(rs.getString(21));
            	AdminReceipt.setOthersReceipt_ExpMonth(rs.getString(22));
            	AdminReceipt.setOthersReceipt_ExpYear(rs.getString(23));
            	AdminReceipt.setOthersReceipt_NameOnCard(rs.getString(24));
            	AdminReceipt.setIsVerifiedSettingIconOptions_OthersReceipt(getBoolValue(rs.getString(25)));
            	AdminReceipt.setIsViewReceipts_OthersReceipt(getBoolValue(rs.getString(26)));
            	AdminReceipt.setIsVerifiedSettingIconOptions_ViewReceipt_OthersReceipt(getBoolValue(rs.getString(27)));
            	AdminReceipt.setLogin_iD(rs.getString(28));
            	AdminReceipt.setLogin_Password(rs.getString(29));
            	AdminReceipt.setScenarioType(rs.getString(30));
            }
            dbConn.close();
    	}
        catch(Exception e)
        {
    		e.printStackTrace();
    	}
        	return AdminReceipt;
        }
    
    public static AdminAccountUsersDataPage loadAdminAccount(String testcase, AdminAccountUsersDataPage AdminAccount)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	AdminAccount.setDescription(rs.getString(2));
            	AdminAccount.setEnvironment(rs.getString(3));
            	AdminAccount.setVerifyingAccountUserPage(getBoolValue(rs.getString(4)));
            	AdminAccount.setIsverifyingHelpIcon(getBoolValue(rs.getString(5)));
            	AdminAccount.setSearchedRecord(getBoolValue(rs.getString(6)));
            	AdminAccount.setFirstName(rs.getString(7));
            	AdminAccount.setLastName(rs.getString(8));
            	AdminAccount.setRole(rs.getString(9));
            	AdminAccount.setStatus(rs.getString(10));
            	AdminAccount.setAccount(rs.getString(11));
            	AdminAccount.setLoginEmail(rs.getString(12));
            	AdminAccount.setLoginPassword(rs.getString(13));
            	AdminAccount.setScenario(rs.getString(14));
            }
            dbConn.close();
        }
    	catch(Exception e)
        {
    		e.printStackTrace();
        }
        	return AdminAccount;
    	
    }
    
    public static AdminAccountReservationsDataPage loadAdminAccountReservations(String testcase, AdminAccountReservationsDataPage AdminAccountReservations)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	AdminAccountReservations.setDescription(rs.getString(2));
            	AdminAccountReservations.setEnvironment(rs.getString(3));
            	AdminAccountReservations.setSearchingRecordCompletedTab(getBoolValue(rs.getString(4)));
            	AdminAccountReservations.setVerifyingHelpIcon(getBoolValue(rs.getString(5)));
            	AdminAccountReservations.setSearchingRecordUpcomingTab(getBoolValue(rs.getString(6)));
            	AdminAccountReservations.setDateFromUpcomingTab(rs.getString(7));
            	AdminAccountReservations.setDateToUpcomingTab(rs.getString(8));
            	AdminAccountReservations.setAccountUpcomingTab(rs.getString(9));
            	AdminAccountReservations.setViewReservationUpcomingTab(getBoolValue(rs.getString(10)));
            	AdminAccountReservations.setSearchingRecordCompletedTab(getBoolValue(rs.getString(11)));
            	AdminAccountReservations.setDateFromCompletedTab(rs.getString(12));
            	AdminAccountReservations.setDateToCompletedTab(rs.getString(13));
            	AdminAccountReservations.setAccountCompletedTab(rs.getString(14));
            	AdminAccountReservations.setViewReservationCompletedTab(getBoolValue(rs.getString(15)));
            	AdminAccountReservations.setLoginEmail(rs.getString(16));
            	AdminAccountReservations.setLoginPassword(rs.getString(17));
            	AdminAccountReservations.setScenario(rs.getString(18));
            	
            	
            }
            dbConn.close();
        }
    	catch(Exception e)
        {
    		e.printStackTrace();
        }
        	return AdminAccountReservations;
    	
    }
    
    public static AdminInvoiceDataPage loadAdminInvoice(String testcase, AdminInvoiceDataPage AdminInvoiceDt)
    {
    	try
    	{
    		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	AdminInvoiceDt.setDescription(rs.getString(2));
            	AdminInvoiceDt.setEnvironment(rs.getString(3));
            	AdminInvoiceDt.setVerifyingInvoicePage(getBoolValue(rs.getString(4)));
            	AdminInvoiceDt.setHelpIconVerbiage(getBoolValue(rs.getString(5)));
            	AdminInvoiceDt.setisSearchingInvoice(getBoolValue(rs.getString(6)));
            	AdminInvoiceDt.setInvoiceFrom_TravelDate(rs.getString(7));
            	AdminInvoiceDt.setInvoiceTo_TravelDate(rs.getString(8));
            	AdminInvoiceDt.setInvoiceNum(rs.getString(9));
            	AdminInvoiceDt.setAccountNum(rs.getString(10));
            	AdminInvoiceDt.setReservationNum(rs.getString(11));
            	AdminInvoiceDt.setVerifyingSettingsIcon(getBoolValue(rs.getString(12)));
            	AdminInvoiceDt.setViewInvoice(getBoolValue(rs.getString(13)));
            	AdminInvoiceDt.setUserName(rs.getString(14));
            	AdminInvoiceDt.setPassword(rs.getString(15));
            	AdminInvoiceDt.setScenario(rs.getString(16));
            }
            
            dbConn.close();
        }catch(Exception e)
    	{
    		e.printStackTrace();
    	}{
        	return AdminInvoiceDt;
    	}
    	
    }

    public static AdminManagePrivilegeDataPage loadAdminManagePrivilegeDataPage(String testcase,AdminManagePrivilegeDataPage AdminManDt)
    {
    	try
    
	{
		
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
        
        {
        	AdminManDt.setDescription(rs.getString(2));
        	AdminManDt.setEnvironment(rs.getString(3));
        	AdminManDt.setVerifyingManagePrivTab(getBoolValue(rs.getString(4)));
        	AdminManDt.setVerifyingHelpIcon(getBoolValue(rs.getString(5)));
        	AdminManDt.setVerfyingTab(getBoolValue(rs.getString(6)));
        	//AdminManDt.setVerifyingViewRequestPage(getBoolValue(rs.getString(7)));
        	AdminManDt.setisRequestInvoiceAccess(getBoolValue(rs.getString(7)));
        	AdminManDt.setrequestedPrivAccountNum(rs.getString(8));
        	AdminManDt.setrequestedPrivType(rs.getString(9));
        	AdminManDt.setArrangerOrManagerCheck(rs.getString(10));
        	AdminManDt.setDeniedAccess(getBoolValue(rs.getString(11)));
        	AdminManDt.setApprovedAccountRequest(getBoolValue(rs.getString(12)));
        	AdminManDt.setRevokedAccountRequest(getBoolValue(rs.getString(13)));
        	AdminManDt.setExtPrvUserFirstName(rs.getString(14));
        	AdminManDt.setExtPrvUserLastName(rs.getString(15));
        	AdminManDt.setisSearchingRecords(getBoolValue(rs.getString(16)));
        	AdminManDt.setAccountNum(rs.getString(17));
        	AdminManDt.setAccountName(rs.getString(18));
        	AdminManDt.setRequestType(rs.getString(19));
        	AdminManDt.setRequestStatus(rs.getString(20));
        	//AdminManDt.setVerifyingRequestToMeTab(getBoolValue(rs.getString(13)));
        	//AdminManDt.setVerifyingExistingPrivilegesTab(getBoolValue((rs.getString(14))));
        	//AdminManDt.setAccountUpcomingTab(rs.getString(9));
        	//AdminManDt.setViewReservationUpcomingTab(getBoolValue(rs.getString(10)));
        	AdminManDt.setUserName(rs.getString(21));
        	AdminManDt.setPassword(rs.getString(22));
        	AdminManDt.setScenario(rs.getString(23));
        }
            dbConn.close();
    }catch(Exception e)
	{
		e.printStackTrace();
	}
    	return AdminManDt;
    

}	
    public static AdminRoleDelegationDataPage loadAdminRoleDelegationData(String testcase,AdminRoleDelegationDataPage AdminRoleDt)
    {
    	try
    	{
    		DataBase dbConn = new DataBase();
    	    dbConn.getStatement();
    	    ResultSet rs = dbConn
    				.getData("Select * from champs_new_db.tbl_getreceipt where TestCase_ID ='" + testcase +"';");
    	            
            while(rs.next())
           
            {
            	AdminRoleDt.setDescription(rs.getString(2));
            	AdminRoleDt.setEnvironment(rs.getString(3));
            	AdminRoleDt.setVerifyingRoleDelegationPage(getBoolValue(rs.getString(4)));
            	AdminRoleDt.setVerifyingHelpIcon(getBoolValue(rs.getString(5)));
            	AdminRoleDt.setAssigningRoleDelegation(getBoolValue(rs.getString(6)));
            	AdminRoleDt.setAccessType(rs.getString(7));
            	AdminRoleDt.setAccountType(rs.getString(8));
            	AdminRoleDt.setEmailID(rs.getString(9));
            	AdminRoleDt.setFinalEmailID(rs.getString(10));
            	AdminRoleDt.setRevokeDelegateResposibilty(getBoolValue(rs.getString(11)));
            	AdminRoleDt.setLoginEmail(rs.getString(12));
            	AdminRoleDt.setLoginPassword(rs.getString(13));
            	AdminRoleDt.setScenario(rs.getString(14));
            	
            	
            }
            dbConn.close();
        }catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        	return AdminRoleDt;
        

    }     

    
    
    private static boolean getBoolValue(String property) 
    {
 	   //property = property.trim();
 	   if (property != null && property.equalsIgnoreCase("Yes")) {
 	     return true;
 	   } else {
 	     return false;
 	   }
 	 }

}
