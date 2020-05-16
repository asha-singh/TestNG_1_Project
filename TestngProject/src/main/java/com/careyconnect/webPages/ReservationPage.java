package com.careyconnect.webPages;


	

	import java.awt.Rectangle;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.List;
	import com.careyconnect.util.MyStringRandomGen;

	import javax.imageio.ImageIO;

	import org.junit.Assert;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

import com.careyconnect.dataBase.DataBase;
import com.careyconnect.dataPage.PassengerMgtDataPage;
import com.careyconnect.dataPage.ReservationDataPage;
import com.mysql.jdbc.Statement;

	/**********************This is PageObject class - This contains all the 
	 * screens of a particular flow and this reduces refactoring
	 *  as all the locators are in this class only , 
	 * so any change in UI can be rectified here *********************** */

	public  class ReservationPage
	{
		
		WebDriver driver;
		
		By quickquoteLocator=By.cssSelector("#viewQuote > span");
		
		By newReservationbuttonLocator=By.id("newReservation");
		
		//By nxtGenPopUp= By.xpath("//*[@id='reservationTypePopUp']");
		
		By nxtGenPopUp= By.xpath("//*[@id='immediateOrFutureNewResTitle']");
		
		//By immediatePickup = By.id("clickingOnSubmitButtonImmediatePickUp");
		By immediatePickup = By.xpath("//*[@id='clickingOnSubmitButtonImmediatePickup']");
		By FutureTrip = By.xpath("//*[@id='clickingOnSubmitButtonFutureTrip']");
		By bookForGuestLocator=By.id("BookForGuest");
		
		By searchPassengerLocator=By.xpath("html/body/div[1]/div[15]/form/div[1]/div[2]/section[3]/div[1]/ul/li[*]/label/span[2]");
		By choosePassengerLocator=By.id("checkboxForPassengerName*");
		By saveAndClickButtonLocator=By.cssSelector("#saveAndContinueDiv > input.blue-btn-big");
		By noOfPassengerLocator=By.id("noOfPaxID");
		By noOfBagsLocator=By.id("noOfBagsID");
		By dateLocator=By.id("dateID");
		By monthLocator=By.id("monthID");
		By yearLocator=By.id("yearID");
		By transferTripLocator=By.id("pointToPointButton");
		By asDirectedTripLocator=By.id("asDirectedButton");
		
		//multiple Passenger
		
		By yesButtonMultiplePassengerPopup=By.id("yesButtonOfMultiPlePassengerBox");
		By noButtonMultiplePassengerPopup=By.id("noButtonOfMultiPlePassengerBox");
		By bookForNextPassengerLink=By.partialLinkText("Book For Next Passenger");

		//Guest Booking
		By guestBookingFirstNameLocator=By.id("guestBookingFirstName");
		By guestBookingLastNameLocator=By.id("guestBookingLastName");
		By guestBookingNameSaveButton=By.id("saveAddPaxButton");
		By guestBookingMobileLocator=By.id("guestBookingMobileNumberTextBoxId");
		By guestBookingMobileSavebutton=By.xpath(".//*[@id='guestMobPaxEditPopUp']/table/tbody/tr/td[2]/input");
		//By guest
		
		//Add passenger
		
		By addPassengerLocator=By.cssSelector("input.fright.grey-btn-big");
		By resIdLocator=By.id("submitPassengerNewResID");
		
		//Ground Location_Locators
		By groundEnterPickupLinkLocator=By.linkText("Enter Pickup Location");  
		By changePickupLinkLocator=By.id("pickUpAddrLine1");
		By groundSerachBoxPickUpLocation=By.id("enterLocation");
		By groundPickupSearchResultLocator=By.cssSelector("#SugGreyStarId0 > td.rightBorder");
		
		By groundPickupTime=By.id("pickUpTime");
		By groundPickupTimeFormatAMLocator=By.linkText("AM");
		By groundPickupTimeFormatPMLocator=By.linkText("PM");
		
		By groundEnterDropoffLinkLocator=By.linkText("Enter Dropoff Location");
		By groundEnterDropoffLinkLocatorAD=By.xpath(".//*[@id='dropoffLocationHeading2']/a");
		By changeDropOffLinkLocator=By.id("dropOffAddrLine1");
		By groundSerachBoxDropoffLocation=By.id("enterLocation");
		By groundDropoffSearchResultLocator=By.cssSelector("#SugGreyStarId0 > td.rightBorder");
		//
		
		//Airport Location Locators
		By airlinePickuplocator=By.id("enterAnAirlineText");
		By airlinePickupClickLocator=By.cssSelector("#airlineInfoId9 > span.padding-left30");
		By flightNumberPickupLocator=By.id("flightNumberTextBox");
		By verifyFlightpickupButtonLocator=By.cssSelector("#verifyFlightInformationButton > input.blue-btn-big2");
		By cancelPickupFlightInformationButtonLocator=By.id("verifyFlightInformationCross");
		
		By airlineDropofflocator=By.id("enterAnAirlineText");
		By airlineDropoffClickLocator=By.cssSelector("#airlineInfoId9 > span.padding-left30");
		By flightNumberDropoffLocator=By.id("flightNumberTextBox");
		By verifyFlightDropoffButtonLocator=By.cssSelector("#verifyFlightInformationButton > input.blue-btn-big2");
		By skipDropoffFlightInformationButtonLocator=By.id("verifyFlightCancelButton");
		//
		
		//Train station Location Locators
		By trainPickupCarrierNameLocator=By.id("carrierName");
		By trainPickupTrainNumberLocator=By.id("trainNumber");
		By trainPickupTime=By.id("trainTime");
		By trainPickupTimeFormatAMLocator=By.id("periodAMTrain");
		//By trainPickupTimeFormatAMLocator=By.linkText("periodAMTrain");
		By trainPickupTimeFormatPMLocator=By.id("periodPMTrain");
		//By trainPickupTimeFormatPMLocator=By.linkText("periodPMTrain");
		By trainPickupOriginationLocator=By.id("trainOriginDestination");
		By trainPickupEnterOriginationLocator=By.id("enterLocationForTrainStation");
		By trainPickupOriginationSearchResultLocator= By.cssSelector("p > strong");
		By trainPickupClickContinueButtonLocator=By.id("proceedPopUpTrainInfo");
		By trainPickupClickCancelButtonLocator=By.id("cancelPopUpTrainInfo");
		
		By trainDropoffCarrierNameLocator=By.id("carrierName");
		By trainDropoffTrainNumberLocator=By.id("trainNumber");
		By trainDropoffTime=By.id("trainTime");
		By trainDropoffTimeFormatAMLocator=By.id("periodAMTrain");
		By trainDropoffTimeFormatPMLocator=By.id("periodPMTrain");
		By trainDropoffDestinationLocator=By.id("trainOriginDestination");
		By trainDropoffEnterDestinationLocator=By.id("enterLocationForTrainStation");
		By trainDropoffDestinationSearchResultLocator= By.cssSelector("p > strong");
		By trainDropoffClickContinueButtonLocator=By.id("proceedPopUpTrainInfo");
		By trainPickupClickSkipButtonLocator=By.id("cancelPopUpTrainInfo");
		//
		
		//Private av
		By privateAviationPickupCheckbox=By.id("puPrivateAviation");
		By privateAviationPickupClickLocator=By.cssSelector("#airlineInfoId1 > span.padding-left30");
		By privateAviationPickupSave=By.cssSelector("#privateAviationSaveButton > input.blue-btn-big2");
		By privateAviationPickupSkip=By.cssSelector("input.blue-btn-big2.margin-left10"); 
		
		
		By privateAviationDropoffCheckbox=By.id("doPrivateAviation");
		By privateAviationDropoffClickLocator=By.cssSelector("#airlineInfoId1 > span.padding-left30");
		By privateAviationDropoffSave=By.cssSelector("#privateAviationSaveButton > input.blue-btn-big2");
		By privateAviationDropoffSkip=By.cssSelector("input.blue-btn-big2.margin-left10");
		
		By isDropoffChecked=By.id("isDropOffChecked");
		By isDropoffTimeChecked=By.id("isDropOffTimeChecked");
		By isDropoffDurationChecked= By.id("isDropOffDurationChecked");
		By SetDropoffTime= By.id("dropOffTimeGround");
		By setDropoffTimeAMFormat = By.id("dropOffPeriodGroundAM");
		By setDropoffTimePMFormat = By.id("dropOffPeriodGroundPM");
		By SetDropoffDuration= By.id("dropOffdurationGround");
		
		By setIsNextDay= By.id("isDropOffNextDayChecked");
		
		By clickAddStopLink=By.id("addStopLink");
		
		
		By specialInstructionLocator=By.name("specialInstruction");
		
		//QuickQuotePricesAssertion(Flat and Hourly)
		
		By tripDetailShowLink=By.id("tripDetailsShowLink");
		By TripDetail=By.xpath("//div[@id='tripDetailsShow']/div[2]/dl/dd[2]");
		
		//Account section
		By accountlinkLocator=By.id("accountNumberLink");
		By userDropdownLocator=By.id("acctUserName");
		By accountDropdownLocator=By.id("accountName");
		//
		
		//Promo code section
		By promocodelinkLocator=By.id("promoCodeLink");
		By enterPromocodeLocator=By.id("promoCodeText");
		By enterPromocodeApplyButtonLocator=By.id("promoCodeButton");
		//
		
		//Add Account Section
		By addAccountLinkLocator=By.id("addAccountLink");
		By enterAccountNumberLocator=By.id("accountNumber");
		By saveButtonClickLocator=By.id("saveAddAccountButton");
		//
		
		By embVehicle=By.id("carImageVehicleEmb0");
		By executiveSedanVehicle=By.id("careyCarImage0");
		By luxurySedan=By.id("careyCarImage1");
		By sportUtilityVehicle=By.id("careyCarImage2");
		By executiveVan=By.id("careyCarImage3");
		
		By viewQuoteButtonClickLocator=By.id("viewQuotesButtonId");
		By vehicleClickLocator=By.id("careyCarImage0");
		By enterPaymentInfoButtonClickLocator=By.cssSelector("#enterPaymentInfoButton > input.blue-btn-big2");
		By rateDisclaimerButtonClick=By.id("paymentRateDsclmerBttn");
		
		//ACCOUNT/PROMOCODE Payment Method on Payment Method Pop-up
		By accountRadioButtonLocator=By.id("accountRadioButton");
		//
		
		//Credit Card Payment Method
		By creditCardRadioButtonLocator=By.id("creditCardRadioButton");
		By selectCreditCardLocator=By.id("creditCardDropDown");
		//
		
		By submitPaymentInfoButtonLocator=By.id("submitPaymentInfo");
		
		//Credit Card Token screen
		
		By cardTypeLocator=By.id("cardType");
		By cardNumberLocator=By.id("cardNumber");
		By cardHolderName=By.id("cardHolder");
		By monthNameLocator=By.id("ccExpMon");
		By yearNameLocator=By.id("ccExpYr");
		By cvvLocator=By.id("cvv");
		By countryLocator=By.id("ccCountry");
		By addressNameLocator=By.id("address");
		By cityNameLocator=By.id("city");
		By stateNameLocator=By.id("stateSel");
		By zipLocator=By.id("zip");
		By saveToProfile=By.id("saveToProf1");
		By savebuttonLocator=By.cssSelector("input[type='button']");
		By cancelButtonLocator=By.xpath("//input[@value='Cancel']");
		//
		
		By reservationConfirmedLocator=By.id("clickToCloseId");
		
		By resID=By.id("resrNumber");
					
		
		
		public ReservationPage(WebDriver driver) {
			this.driver = driver;
		}

		public void clickReservationButton() throws Exception
		{
			
				driver.findElement(newReservationbuttonLocator).click();
			
		}
		
		 public void switchToPopUp() throws Exception
		{
			
				driver.findElement(nxtGenPopUp).click();
		
		} 
		
		public void clickImmediatePickUpButton() throws Exception
		{
				
				driver.findElement(immediatePickup).click();
				
		}
		
		public void clickFutureTripButton() throws Exception
		{
			
				driver.findElement(FutureTrip).click();
	
		}
		
		public void clickGuestBookingButton() throws Exception
		{
				
				driver.findElement(bookForGuestLocator).click();
			
		}
		
		public void clickQuickQuoteButton() throws Exception
		{
				
				driver.findElement(quickquoteLocator).click();
			
		}
		
		public int enterPassengerName(String paxName,int flag) throws Exception
		{
			
				int index=0;
				List <WebElement> list=driver.findElements(searchPassengerLocator);
				for(WebElement web:list)
				{
				
					index++;
									
					if(web.getText().contains(paxName) || web.getText().equalsIgnoreCase(paxName) )
					{
						flag=1;
						break;		
					}
					
				}
				
				if(flag==1)
				{
					
					driver.findElement(By.xpath("html/body/div[1]/div[15]/form/div[1]/div[2]/section[3]/div/ul/li["+index+"]/label/span[2]")).click();
				}
			
			
			return flag;
		}
		
		public void clickSaveButton() throws Exception
		{
			
				driver.findElement(saveAndClickButtonLocator).click();
		
		}
		
		public void clickddPassengerbutton() throws Exception
		{
			
				driver.findElement(addPassengerLocator).click();
			
		}
		public void clickResIDbutton() throws Exception
		{
			
				driver.findElement(resIdLocator).click();
	
		}
		public void setNoOfPax(String paxNumber) throws Exception
		{
	
				driver.findElement(noOfPassengerLocator).clear();
				driver.findElement(noOfPassengerLocator).sendKeys(paxNumber);
			
		}
		public void setNoOfBags(String bagNumber) throws Exception
		{
	
				driver.findElement(noOfBagsLocator).clear();
				driver.findElement(noOfBagsLocator).sendKeys(bagNumber);
		
		}
		public void setPickupDate(String puDate) throws Exception
		{
		
				new Select(driver.findElement(dateLocator)).selectByVisibleText(puDate);
			
		}
		public void setmonth(String month) throws Exception
		{
				
				new Select(driver.findElement(monthLocator)).selectByVisibleText(month);}
			
		public void setyear(String year) throws Exception
		{
			
				new Select(driver.findElement(yearLocator)).selectByVisibleText(year);}
				
		
		public void clickTransferTrip() throws Exception
		{
				
				driver.findElement(transferTripLocator).click();
			
		}
		public void clickAsDirectedTrip() throws Exception
		{
		
				driver.findElement(asDirectedTripLocator).click();
		
		}
		
		//Ground Location Method
		
		public void clickEnterPickupLink() throws Exception
		{
				
				Thread.sleep(5000);
				driver.findElement(groundEnterPickupLinkLocator).click();}
			
		
		public void clickChangePickupLink() throws Exception
		{
				
				Thread.sleep(5000);
				driver.findElement(changePickupLinkLocator).click();
				
		}
		
		public void clickChangeDropOffLink() throws Exception
		{
			
				Thread.sleep(5000);
				driver.findElement(changeDropOffLinkLocator).click();
		
		}
		public void setPickupLocation(String puLocation) throws Exception
		{
				
				driver.findElement(groundSerachBoxPickUpLocation).clear();
				driver.findElement(groundSerachBoxPickUpLocation).sendKeys(puLocation);
		
		}
		public void clickPickupSearchedFilterLocation() throws Exception
		{
			
				driver.findElement(groundPickupSearchResultLocator).click();
				Thread.sleep(500);
		}
		public void setPickupTime(String puTime) throws Exception
		{
			
				driver.findElement(groundPickupTime).clear();
				driver.findElement(groundPickupTime).sendKeys(puTime);
		
		}
		public void setPickupTimeAMFormat() throws Exception
		{
			
				driver.findElement(groundPickupTimeFormatAMLocator).click();
			
				
		}
		public void setPickupTimePMFormat() throws Exception
		{
		
				driver.findElement(groundPickupTimeFormatPMLocator).click();
			
		}
		public void clickEnterDropoffLink() throws Exception
		{
			
			JavascriptExecutor jsee1 = (JavascriptExecutor) driver;
			jsee1.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(2000);
				if(ReservationDataPage.getTrip_Type().contains("AD")){
					driver.findElement(groundEnterDropoffLinkLocatorAD).click();
				}else{
					driver.findElement(groundEnterDropoffLinkLocator).click();
				}
				Thread.sleep(4000);
				
		}
		public void setDropoffLocation(String doLocation) throws Exception
		{
				
				
				driver.findElement(groundSerachBoxDropoffLocation).clear();
				driver.findElement(groundSerachBoxDropoffLocation).sendKeys(doLocation);
				Thread.sleep(4000);
		}
		public void clickDropoffSearchedFilterLocation() throws Exception
		{
				
				
				driver.findElement(groundDropoffSearchResultLocator).click();
				Thread.sleep(4000);
		}
		
		public void setAirlinePikcupLocation(String airline) throws Exception
		{
				
				
				driver.findElement(airlinePickuplocator).clear();
				driver.findElement(airlinePickuplocator).sendKeys(airline);
				Thread.sleep(4000);
		}
		
		public void clickAirlinePickupSearchedFilterLocation() throws Exception
		{
			
				driver.findElement(airlinePickupClickLocator).click();
				Thread.sleep(4000);
		}	
		public void setFlightNumberPickupLocation(String flightnumber) throws Exception
		{
	
				driver.findElement(flightNumberPickupLocator).clear();
				driver.findElement(flightNumberPickupLocator).sendKeys(flightnumber);
				Thread.sleep(4000);
		}
		public void clickflightPickupbutton() throws Exception
		{
			
				driver.findElement(verifyFlightpickupButtonLocator).click();
			Thread.sleep(4000);
		}
		public void clickflightPickupCancelButton() throws Exception
		{
			
				driver.findElement(cancelPickupFlightInformationButtonLocator).click();
				Thread.sleep(4000);

		}
		//	
		public void setAirlineDropoffLocation(String airline) throws Exception
		{
			
				driver.findElement(airlineDropofflocator).clear();
				driver.findElement(airlineDropofflocator).sendKeys(airline);
				Thread.sleep(4000);
		
		}
		public void clickAirlineDropoffSearchedFilterLocation() throws Exception
		{

				driver.findElement(airlineDropoffClickLocator).click();
				Thread.sleep(4000);
	
		}
		public void setFlightNumberDropoffLocation(String flightnumber) throws Exception
		{
			
				driver.findElement(flightNumberDropoffLocator).clear();
				driver.findElement(flightNumberDropoffLocator).sendKeys(flightnumber);
				Thread.sleep(4000);}
			
		public void clickflightDropoffbutton() throws Exception
		{
	
				Thread.sleep(4000);
				driver.findElement(verifyFlightDropoffButtonLocator).click();
				Thread.sleep(4000);
			
		}
		public void clickflightDropoffSkipButton() throws Exception
		{

				driver.findElement(skipDropoffFlightInformationButtonLocator).click();
				Thread.sleep(4000);
		
		}
		
		//Train Station Location Method
		
		public void selectTrainPickupCarrierName(String carrierName) throws Exception
		{
			
				new Select(driver.findElement(trainPickupCarrierNameLocator)).selectByVisibleText(carrierName);
				Thread.sleep(4000);

		}
		public void setTrainPickupNumber(String trainNumber) throws Exception
		{
	
				driver.findElement(trainDropoffTrainNumberLocator).clear();
				driver.findElement(trainDropoffTrainNumberLocator).sendKeys(trainNumber);
				Thread.sleep(4000);
			
		}
		public void setTrainPickupTime(String trainArrivalTime) throws Exception
		{
			
				driver.findElement(trainPickupTime).sendKeys(trainArrivalTime);
				Thread.sleep(4000);
			
		}
		public void setTrainPickupTimeAMFormat() throws Exception
		{
			
				driver.findElement(trainPickupTimeFormatAMLocator).click();
				Thread.sleep(4000);
		
		}
		public void setTrainPickupTimePMFormat() throws Exception
		{
			
				driver.findElement(trainPickupTimeFormatPMLocator).click();
				Thread.sleep(4000);
				
		}
		public void clickOrigination() throws Exception
		{
			
				driver.findElement(trainPickupOriginationLocator).click();
				Thread.sleep(4000);
		
		}
		public void setTrainOrigination(String trainOrigination) throws Exception
		{
	
				driver.findElement(trainPickupEnterOriginationLocator).clear();
				driver.findElement(trainPickupEnterOriginationLocator).sendKeys(trainOrigination);
				Thread.sleep(4000);
		
		}
		public void clickOriginationSerachedLocation() throws Exception
		{

				driver.findElement(trainPickupOriginationSearchResultLocator).click();
				Thread.sleep(4000);
		
		}
		public void clickPickupTrainContinueButton() throws Exception
		{

				driver.findElement(trainPickupClickContinueButtonLocator).click();
				Thread.sleep(4000);
	
		}
		public void clickPickupTrainCancelButton() throws Exception
		{
		
				driver.findElement(trainPickupClickCancelButtonLocator).click();
				Thread.sleep(4000);

		}
		//
		public void selectTrainDropoffCarrierName(String carrierName) throws Exception
		{
			
				new Select(driver.findElement(trainDropoffCarrierNameLocator)).selectByVisibleText(carrierName);
				Thread.sleep(4000);
	

		}
		public void setTrainDropoffNumber(String trainNumber) throws Exception
		{

				driver.findElement(trainDropoffTrainNumberLocator).sendKeys(trainNumber);
				Thread.sleep(4000);

		}
		public void setTrainDropoffTime(String trainDepartureTime) throws Exception
		{

				driver.findElement(trainDropoffTime).clear();
				driver.findElement(trainDropoffTime).sendKeys(trainDepartureTime);
				Thread.sleep(4000);
	
		}
		public void setTrainDropoffTimeAMFormat() throws Exception
		{

				driver.findElement(trainDropoffTimeFormatAMLocator).click();
				Thread.sleep(4000);

		}
		public void setTrainDropoffTimePMFormat() throws Exception
		{

				driver.findElement(trainDropoffTimeFormatPMLocator).click();
				Thread.sleep(4000);
		
		}
		public void clickDestination() throws Exception
		{
			
				driver.findElement(trainDropoffDestinationLocator).click();
				Thread.sleep(4000);}
	
		public void setTrainDestination(String trainDestination) throws Exception
		{
			
				driver.findElement(trainDropoffEnterDestinationLocator).clear();
				driver.findElement(trainDropoffEnterDestinationLocator).sendKeys(trainDestination);
				Thread.sleep(4000);
			
		}
		public void clickDestinationSerachedLocation() throws Exception
		{
			
				driver.findElement(trainPickupOriginationSearchResultLocator).click();
				Thread.sleep(4000);
	
		}
		public void clickDropoffTrainContinueButton() throws Exception
		{
				
				driver.findElement(trainDropoffClickContinueButtonLocator).click();
				Thread.sleep(4000);
				
		}
		public void clickDropoffTrainSkipButton() throws Exception
		{
			
				driver.findElement(trainPickupClickSkipButtonLocator).click();
				Thread.sleep(4000);
	
		}
		//
		
		public void clickIsDropoffChecked() throws Exception
		{
			
				driver.findElement(isDropoffChecked).click();
				Thread.sleep(4000);
			
		}
		
		public void clickisDropoffTimeChecked() throws Exception
		{
			
				Thread.sleep(4000);
				driver.findElement(isDropoffTimeChecked).click();
				Thread.sleep(4000);
			
		}
		
		public void clickisDropoffDurationChecked() throws Exception
		{

				
				driver.findElement(isDropoffDurationChecked).click();
				Thread.sleep(4000);
	
		}
		
		public void setDropoffTime(String Time) throws Exception
		{

				
				driver.findElement(SetDropoffTime).clear();
				driver.findElement(SetDropoffTime).sendKeys(Time);
				Thread.sleep(4000);
		}
		
		public void clickDropoffTimeAM() throws Exception
		{
			
				
				driver.findElement(setDropoffTimeAMFormat).click();
				Thread.sleep(4000);
			
		}
		
		public void clickDropoffTimePM() throws Exception
		{
		
				
				driver.findElement(setDropoffTimePMFormat).click();
				Thread.sleep(4000);
			
		}
		
		public void setDropoffDuration(String duration) throws Exception
		{
	
				
				driver.findElement(SetDropoffDuration).clear();
				driver.findElement(SetDropoffDuration).sendKeys(duration);
				Thread.sleep(4000);
		}
		
		public void clickIsNextDay() throws Exception
		{
	
				Thread.sleep(4000);
				driver.findElement(setIsNextDay).click();
				Thread.sleep(4000);
	
			
		}
		
		public void clickStopslink() throws Exception
		{



				driver.findElement(clickAddStopLink).click();
				Thread.sleep(4000);
	
		}
		//Private Aviation
		public void clickPrivateAviationPickupcheckbox() throws Exception
		{
		
				driver.findElement(privateAviationPickupCheckbox).click();
				Thread.sleep(4000);
		
		}
		
		public void clickPrivateAviationSearchedFilterPULocation() throws Exception
		{
			
				driver.findElement(privateAviationPickupClickLocator).click();
				Thread.sleep(4000);
			
		}
		public void clickPrivateAviationPickupSave() throws Exception
		{
		
				driver.findElement(privateAviationPickupSave).click();
				Thread.sleep(4000);
		
		}
		public void clickPrivateAviationPickupSkip() throws Exception
		{
		
				driver.findElement(privateAviationPickupSkip).click();
				Thread.sleep(4000);
;
		}
		
		public void clickPrivateAviationDropoffcheckbox() throws Exception
		{

				driver.findElement(privateAviationDropoffCheckbox).click();
				Thread.sleep(4000);
			
		}
		
		public void clickPrivateAviationSearchedFilterDOLocation() throws Exception
		{
		
				driver.findElement(privateAviationDropoffClickLocator).click();
				Thread.sleep(4000);
	
		}
		public void clickPrivateAviationDropoffSave() throws Exception
		{

				driver.findElement(privateAviationDropoffSave).click();
				Thread.sleep(4000);
		
		}
		public void clickPrivateAviationDropoffSkip() throws Exception
		{
		
				driver.findElement(privateAviationDropoffSkip).click();
				Thread.sleep(4000);
		
		}
		public void setSpecialInstruction(String specialInstruction) throws Exception
		{

				Thread.sleep(4000);
				driver.findElement(specialInstructionLocator).clear();
				driver.findElement(specialInstructionLocator).sendKeys(specialInstruction);
				Thread.sleep(4000);
		}
		
		//QuickQuoteValidation (Flat and Hourly)
		
		public void QuickQuoteShowLink() throws Exception
		{
				Thread.sleep(4000);
			
					driver.findElement(tripDetailShowLink).click();
					Thread.sleep(4000);
			
		}
		
		public void assertQuickQuoteTripDetails(String TripType) throws Exception
		{
				Thread.sleep(4000);
				
				int flag=0;
			;
			
				
				if(TripType.equalsIgnoreCase("PP"))
				{
					for(int i=1;i<=10;i++)
					{
						String var=driver.findElement(By.xpath("//div[@id='tripDetailsShow']/div[2]/dl/dd["+i+"]")).getText();
						if(var.equalsIgnoreCase("FLAT"))
						{
						
							flag=1;
							break;
						}
					}
				
				}
				else if(TripType.equalsIgnoreCase("AD"))
				{
					for(int i=1;i<=10;i++)
					{
						String var=driver.findElement(By.xpath("//div[@id='tripDetailsShow']/div[2]/dl/dd["+i+"]")).getText();
						if(var.equalsIgnoreCase("HOURLY"))
						{
	
							flag=1;
							break;
						}
					}
				
				}
				
		
			
		}
		
		//Account Method Section
		
		public void clickAccountButton() throws Exception
		{
	
				Thread.sleep(4000);
				driver.findElement(accountlinkLocator).click();
				Thread.sleep(4000);
	
		}
		
		public void selectUserDropDown(String userValue) throws Exception
		{
	
				Thread.sleep(4000);
				new Select(driver.findElement(userDropdownLocator)).selectByVisibleText(userValue);
				Thread.sleep(4000);
	
		}
		public void selectAccountDropDown(String accountNumber) throws Exception
		{

				Thread.sleep(4000);
				new Select(driver.findElement(accountDropdownLocator)).selectByVisibleText(accountNumber);
				Thread.sleep(4000);
	
		}
		//
		//Promo Code Method Section
		public void clickPromoCodeButton() throws Exception
		{

				Thread.sleep(4000);
				driver.findElement(promocodelinkLocator).click();
				Thread.sleep(4000);
			
		}
		
		public void setPromoCodeNumber(String promoCode) throws Exception
		{

				Thread.sleep(4000);
				driver.findElement(enterPromocodeLocator).clear();
				driver.findElement(enterPromocodeLocator).sendKeys(promoCode);
				Thread.sleep(4000);
		}
		public void clickPromoCodeApplyButton() throws Exception
		{
		
				Thread.sleep(4000);
				driver.findElement(enterPromocodeApplyButtonLocator).click();
				Thread.sleep(4000);
			
		}
	
		public void clickAddAccountButton() throws Exception
		{
	
				driver.findElement(addAccountLinkLocator).click();
				Thread.sleep(4000);
		
		}
		public void setAddAccountNumber(String account) throws Exception
		{
	
				driver.findElement(enterAccountNumberLocator).clear();
				driver.findElement(enterAccountNumberLocator).sendKeys(account);
		
		}
		public void clickAddAccountSaveButton() throws Exception
		{

				driver.findElement(saveButtonClickLocator).click();
				Thread.sleep(4000);
			
		}
		public void clickViewQuoteButton() throws Exception
		{
		
				Thread.sleep(6000);
				driver.findElement(viewQuoteButtonClickLocator).click();
				Thread.sleep(4000);
		}
		
		public void assertionViewQuoteButton_PUAirportNotValidated() throws Exception
		{

					String var=driver.findElement(By.cssSelector("#verifyFlightErrorDiv > p.fleft")).getText();
					System.out.println(var);}
				
		
		public void assertionViewQuoteButton_PUTrainNotValidated() throws Exception
		{
				
				String var=driver.findElement(By.cssSelector("#verifyTrainErrorDiv > p.fleft")).getText();
				System.out.println(var);
				
			
		}
		
		public void clickVehicleSelection(String vehicle) throws Exception
		{ 
			
				Thread.sleep(4000);

				switch(vehicle)
				{
				
				case "Fuel Efficient Sedan":
					
					driver.findElement(embVehicle).click();
	
					break;
				case "Executive Sedan":
					Thread.sleep(4000);
					driver.findElement(executiveSedanVehicle).click();

					break;
				case "Luxury Sedan":
					Thread.sleep(4000);
					driver.findElement(luxurySedan).click();
		
					break;
				case "Sport Utility Vehicle":
					Thread.sleep(4000);
					driver.findElement(sportUtilityVehicle).click();
	
					break;
				case "Executive Van":
					Thread.sleep(4000);
					driver.findElement(executiveVan).click();
		
					break;
				}
			
			
		}
		
		public void clickPaymentInfoButton() throws Exception
		{
	
				Thread.sleep(4000);
				driver.findElement(enterPaymentInfoButtonClickLocator).click();
				Thread.sleep(4000);

		}
		public void clickRateDisclaimerButton() throws Exception
		{

				Thread.sleep(4000);
				driver.findElement(rateDisclaimerButtonClick).click();
				Thread.sleep(4000);

		}
		
		public void clickAccountRadioButton() throws Exception
		{
	
				Thread.sleep(4000);
				driver.findElement(accountRadioButtonLocator).click();
				Thread.sleep(4000);
	
		}
		public void clickCreditCardRadioButton() throws Exception
		{

				driver.findElement(creditCardRadioButtonLocator).click();
				Thread.sleep(4000);

		}
		public void selectCreditCardDropDown(String val) throws Exception
		{
			
				new Select(driver.findElement(selectCreditCardLocator)).selectByVisibleText(val);
		
		}
		public void clickSubmitPaymentButton() throws Exception
		{
	
				driver.findElement(submitPaymentInfoButtonLocator).click();
				Thread.sleep(4000);
		
		}
		
	
		
		public void selectCreditCardType(String val) throws Exception
		{
	
				new Select(driver.findElement(cardTypeLocator)).selectByVisibleText(val);

		}
		public void setCreditCardNumber(String CCNumber) throws Exception
		{

				driver.findElement(cardNumberLocator).sendKeys(CCNumber);

		}
		public void setCreditCardName(String name) throws Exception
		{

				driver.findElement(cardHolderName).clear();
				driver.findElement(cardHolderName).sendKeys(name);

		}
		public void selectCreditCardDate(String date) throws Exception
		{

				new Select(driver.findElement(monthNameLocator)).selectByVisibleText(date);
				
		}
		public void selectCreditCardyear(String year) throws Exception
		{
			
				new Select(driver.findElement(yearNameLocator)).selectByVisibleText(year);
	
		}
		public void setCVVNumber(String CVV) throws Exception
		{

				driver.findElement(cvvLocator).clear();
				driver.findElement(cvvLocator).sendKeys(CVV);

		}
		public void selectCreditCardCountry(String country) throws Exception
		{
	
				new Select(driver.findElement(countryLocator)).selectByVisibleText(country);
			
		}
		public void setCreditCardAddress(String address ) throws Exception
		{

	
		
				driver.findElement(addressNameLocator).clear();
				driver.findElement(addressNameLocator).sendKeys(address);
				
		}
		public void setCreditCardCity(String city) throws Exception
		{
				
				
				driver.findElement(cityNameLocator).clear();
				driver.findElement(cityNameLocator).sendKeys(city);
				
		}
		public void selectCreditCardState(String state) throws Exception
		{
	
				new Select(driver.findElement(stateNameLocator)).selectByVisibleText(state);
	
		}
		public void setCreditCardZip(String zip) throws Exception
		{
			
		
				driver.findElement(zipLocator).clear();
				driver.findElement(zipLocator).sendKeys(zip);

		}
		
		public void setToProfile() throws Exception
		{
			
				driver.findElement(saveToProfile).click();
				Thread.sleep(4000);
			
			
		}
		
		public void clickVerifyCardButton() throws Exception
		{
			
				driver.findElement(savebuttonLocator).click();
				Thread.sleep(4000);
			
		}
		
		public void clickCancelButton() throws Exception
		{
			;
				driver.findElement(cancelButtonLocator).click();
				Thread.sleep(4000);
				
		}
		public void clickReservationConfirmedButton() throws Exception
		{
		
	
				driver.findElement(reservationConfirmedLocator).click();
				Thread.sleep(4000);
	
		}
		public void clickReservationType(String rType) throws Exception
		{
				
				if(rType==null)
				{
			;
					driver.findElement(quickquoteLocator).click();
					Thread.sleep(4000);
		
				}
				else
				{
					
					if(rType.contains("New_Reservation"))
					{
						
						driver.findElement(newReservationbuttonLocator).click();
						Thread.sleep(4000);
						
					}
					else
	
						driver.findElement(quickquoteLocator).click();
					
					}
				}
		
		
		public void guestBookingFirstName(String firstName) throws Exception
		{
		
				if(firstName!=null)
				{
	
					driver.findElement(guestBookingFirstNameLocator).clear();
					driver.findElement(guestBookingFirstNameLocator).sendKeys(firstName);}

				
		}
			public void guestBookingLastName(String lastName) throws Exception
			{
	
					if( lastName!=null)
					{
					
	
						driver.findElement(guestBookingLastNameLocator).clear();
						driver.findElement(guestBookingLastNameLocator).sendKeys(lastName);
	
					}
			}
		
			public void clickGuestBookingNameSave() throws Exception
			{

					driver.findElement(guestBookingNameSaveButton).click();
		

			}
			
			public void guestBookingmobile(String mobile) throws Exception
			{
				
					if (mobile!=null) {
				
				
						driver.findElement(guestBookingMobileLocator).clear();
						driver.findElement(guestBookingMobileLocator).sendKeys(mobile);}


			}
			
			public void clickGuestBookingMobileSave() throws Exception
			{
					
					driver.findElement(guestBookingMobileSavebutton).click();
		
			}
			
			
			
			public void saveResID(String testcase) throws Exception 
			{
				try
				{
					
					String manageReservationTC= "";
					String resid=driver.findElement(resID).getText();
					System.out.println("ResID:  " + resid);
					
					DataBase dbConn = new DataBase();
					//Connection conn = dbConn.getStatement();
					//java.sql.Statement stmt = dbConn.();
					String updateQuery=("Update champs_new_db.tbl_reservation set Reservation_ID='"+resid+"' where TestCase_Name='"+testcase+"';");
					System.out.println(updateQuery);
					dbConn.getStatement();
					dbConn.insertData(updateQuery);
					
					if (testcase.contains("CW_Reservation_New_SYSTest_") && (testcase.contains("1")||testcase.contains("2")||testcase.contains("3")||testcase.contains("4")||testcase.contains("5")
							||testcase.contains("6")||testcase.contains("7")||testcase.contains("8")||testcase.contains("9")||testcase.contains("10")||testcase.contains("11")||testcase.contains("12") ))
					{
						try {
						manageReservationTC=testcase.replace("CW_Reservation_New_SYSTest_", "CW_Managereservation_SYSTest_");
						String sqlQuery1 = ("Update champs_new_db.tbl_managereservation set Reservation_Number='" + resid + "' where TestCase_Name='" + manageReservationTC + "';");
						//System.out.println("Query for manage Reservation: " + sqlQuery1);
						//PreparedStatement stmt1 = conn.prepareStatement(sqlQuery1);
						
						dbConn.insertData(sqlQuery1);
						dbConn.close();
						}catch(Exception exception) {
							
						}
					}
					System.out.println(testcase + "  --------- TEST PASSED");
					System.out.println("  ------------------------------------------------------------------------");
					System.out.println();}
				catch(Exception e)
				{
					System.out.println(e);
					System.out.println(testcase + "  --------- TESTFAILED");
					System.out.println("  ------------------------------------------------------------------------");
			}}
			
			public void setPickupGroundLocation(String pickupLocation, String pick_loc_Type, String PGPickup_Time, String PGPickup_TF) throws Exception
			{
				clickEnterPickupLink();
				setPickupLocation(pickupLocation);
				clickPickupSearchedFilterLocation();
				if(!pick_loc_Type.contains("AIRP") || pick_loc_Type.contains("Train"))
				{
					setPickupTime(PGPickup_Time);
					if(PGPickup_TF.contains("AM"))
					{
						setPickupTimeAMFormat();
					}
					else if(PGPickup_TF.contains("PM"))
					{
						setPickupTimePMFormat();
					}
				}
				
			}
			
			public void setChangePickupGroundLocation(String pickupLocation, String pick_loc_Type, String PGPickup_Time, String PGPickup_TF) throws Exception
			{
				clickChangePickupLink();
				setPickupLocation(pickupLocation);
				clickPickupSearchedFilterLocation();
				if(!pick_loc_Type.contains("AIRP") || pick_loc_Type.contains("Train"))
				{
					setPickupTime(PGPickup_Time);
					if(PGPickup_TF.contains("AM"))
					{
						setPickupTimeAMFormat();
					}
					else if(PGPickup_TF.contains("PM"))
					{
						setPickupTimePMFormat();
					}
				}
				
			}
			
			public void setDropoffGroundLocation(String dropoff_Loc) throws Exception
			{
				clickEnterDropoffLink();
				setDropoffLocation(dropoff_Loc);
				clickDropoffSearchedFilterLocation();
			}
			
			public void setChangeDropoffGroundLocation(String dropoff_Loc) throws Exception
			{
				clickChangeDropOffLink();
				setDropoffLocation(dropoff_Loc);
				clickDropoffSearchedFilterLocation();
			}
			
			public void setPickupAirportLocation(String pick_loc, String AirLine_Name, String Flight_No, Boolean isAirportValidate) throws Exception
			{
				clickEnterPickupLink();
				setPickupLocation(pick_loc);
				Thread.sleep(4000);
				clickPickupSearchedFilterLocation();
				Thread.sleep(15000);
				setAirlinePikcupLocation(AirLine_Name);
				clickAirlinePickupSearchedFilterLocation();
				setFlightNumberPickupLocation(Flight_No);
				if(isAirportValidate)
				{
					clickflightPickupbutton();
				}
				else
				{
					clickflightPickupCancelButton();
				}
				Thread.sleep(4000);
			}
			
			public void setChangePickupAirportLocation(String pick_loc, String AirLine_Name, String Flight_No, Boolean isAirportValidate) throws Exception
			{
				clickChangePickupLink();
				setPickupLocation(pick_loc);
				clickPickupSearchedFilterLocation();
				setAirlinePikcupLocation(AirLine_Name);
				clickAirlinePickupSearchedFilterLocation();
				setFlightNumberPickupLocation(Flight_No);
				if(isAirportValidate)
				{
					clickflightPickupbutton();
				}
				else
				{
					clickflightPickupCancelButton();
				}
				Thread.sleep(4000);
			}
			
			public void setDropoffAirportLocation(String drop_Loc, String AirLine_No, String Flight_No, Boolean airportValidate) throws Exception
			{
				
				clickEnterDropoffLink();
				setDropoffLocation(drop_Loc);
				Thread.sleep(1000);
				
				clickDropoffSearchedFilterLocation();
				
				Thread.sleep(15000);
				
				setAirlineDropoffLocation(AirLine_No);
				
				Thread.sleep(4000);
				
				clickAirlineDropoffSearchedFilterLocation();
				Thread.sleep(4000);
				setFlightNumberDropoffLocation(Flight_No);
				Thread.sleep(4000);
				if(airportValidate)
				{
					clickflightDropoffbutton();
					Thread.sleep(4000);
				}
				else
				{
					clickflightDropoffSkipButton();
					Thread.sleep(4000);
				}
				Thread.sleep(4000);
			}
			
			public void setChangeDropoffAirportLocation(String drop_Loc, String AirLine_No, String Flight_No, String airportValidate) throws Exception
			{
				clickChangeDropOffLink();
				setDropoffLocation(drop_Loc);
				clickDropoffSearchedFilterLocation();
				setAirlineDropoffLocation(AirLine_No);
				Thread.sleep(4000);
				clickAirlineDropoffSearchedFilterLocation();
				Thread.sleep(4000);
				setFlightNumberDropoffLocation(Flight_No);
				Thread.sleep(4000);
				if(airportValidate.contains("Yes"))
				{
					clickflightDropoffbutton();
					Thread.sleep(4000);
				}
				else
				{
					clickflightDropoffSkipButton();
					Thread.sleep(4000);
				}
				Thread.sleep(4000);
			}
			
			public void setPickupTrainLocation(String pick_loc, String Carrier_Name, String train_no, String arrival_Time, String ArrTF, Boolean IsValidate) throws Exception
			{
				clickEnterPickupLink();
				setPickupLocation(pick_loc);
				clickPickupSearchedFilterLocation();
				Thread.sleep(4000);
				selectTrainDropoffCarrierName(Carrier_Name);
				setTrainDropoffNumber(train_no);
				setTrainDropoffTime(arrival_Time);
				if(ArrTF.contains("AM"))
				{
					setTrainDropoffTimeAMFormat();
				}
				else if(ArrTF.contains("PM"))
				{
					setTrainDropoffTimePMFormat();
				}
				if(IsValidate)
				{
					clickPickupTrainContinueButton();
				}
				else
				{
					clickPickupTrainCancelButton();
				}
				
			}
			
			public void setChangePickupTrainLocation(String pick_loc, String Carrier_Name, String train_no, String arrival_Time, String ArrTF, Boolean IsValidate) throws Exception
			{
				clickChangePickupLink();
				setPickupLocation(pick_loc);
				clickPickupSearchedFilterLocation();
				Thread.sleep(4000);
				selectTrainDropoffCarrierName(Carrier_Name);
				setTrainDropoffNumber(train_no);
				setTrainDropoffTime(arrival_Time);
				if(ArrTF.contains("AM"))
				{
					setTrainDropoffTimeAMFormat();
				}
				else if(ArrTF.contains("PM"))
				{
					setTrainDropoffTimePMFormat();
				}
				if(IsValidate)
				{
					clickPickupTrainContinueButton();
				}
				else
				{
					clickPickupTrainCancelButton();
				}
				
			}
			
			public void setDropoffTrainLocation(String drop_Loc, String C_Name, String T_No, String Dep_Time, String Dep_TF, Boolean isValidate) throws Exception
			{
				clickEnterDropoffLink();
				setDropoffLocation(drop_Loc);
				clickDropoffSearchedFilterLocation();
				Thread.sleep(4000);
				selectTrainDropoffCarrierName(C_Name);
				setTrainDropoffNumber(T_No);
				setTrainDropoffTime(Dep_Time);
				
				if(Dep_TF.contains("AM"))
				{
					setTrainDropoffTimeAMFormat();
				}
				else if(Dep_TF.contains("PM"))
				{
					setTrainDropoffTimePMFormat();
				}
				if(isValidate)
				{
					clickDropoffTrainContinueButton();
				}
				else
				{
					clickDropoffTrainSkipButton();
				}
			}
			
			public void setChangeDropoffTrainLocation(String drop_Loc, String C_Name, String T_No, String Dep_Time, String Dep_TF, Boolean isValidate) throws Exception
			{
				clickChangeDropOffLink();
				setDropoffLocation(drop_Loc);
				clickDropoffSearchedFilterLocation();
				Thread.sleep(4000);
				selectTrainDropoffCarrierName(C_Name);
				setTrainDropoffNumber(T_No);
				setTrainDropoffTime(Dep_Time);
				
				if(Dep_TF.contains("AM"))
				{
					setTrainDropoffTimeAMFormat();
				}
				else if(Dep_TF.contains("PM"))
				{
					setTrainDropoffTimePMFormat();
				}
				if(isValidate)
				{
					clickDropoffTrainContinueButton();
				}
				else
				{
					clickDropoffTrainSkipButton();
				}
			}
			
			public void setPrivateAviationPickup(String pick_loc, String AirLine_Name, String Flight_No, Boolean isValidate) throws Exception
			{
				clickEnterPickupLink();
				clickPrivateAviationPickupcheckbox();
				setPickupLocation(pick_loc);
				clickPickupSearchedFilterLocation();
				setAirlinePikcupLocation(AirLine_Name);
				clickPrivateAviationSearchedFilterPULocation();
				setFlightNumberPickupLocation(Flight_No);
				if(isValidate)
				{
					clickPrivateAviationPickupSave();
				}
				else
				{
					clickPrivateAviationPickupSkip();
				}
			}
			
			public void setPrivateAviationDropoff(String drop_loc, String AirLine_no, String Flight_No, Boolean isValidate) throws Exception
			{
				clickEnterDropoffLink();
				clickPrivateAviationDropoffcheckbox();
				setDropoffLocation(drop_loc);
				clickDropoffSearchedFilterLocation();
				setAirlineDropoffLocation(AirLine_no);
				clickPrivateAviationSearchedFilterDOLocation();
				setFlightNumberDropoffLocation(Flight_No);
				
				if(isValidate)
				{
					clickPrivateAviationDropoffSave();
				}
				else
				{
					clickPrivateAviationDropoffSkip();
				}
				
			}
			
			public void PassengerSelectionFunction(String Pax_Name, String Pax_Email, String Pax_mobile, String Pax_F_Name, String Pax_L_Name, String Pax_C_Name, String Pax_Title,String Pax_Work, String Pax_Ext  ) throws Exception
			{
				int resflag=0;
				if(enterPassengerName(Pax_Name,resflag)==0)
				{
					int flag1=0;
					PassengerMgtDataPage paxmgtdatapage=new PassengerMgtDataPage();
					PassengerMangementPage paxmgt=new PassengerMangementPage(driver);
					clickddPassengerbutton();
					paxmgt.setEmailAddress(Pax_Email);
					paxmgt.setMobileNumber(Pax_mobile);
					if(paxmgt.verifyPassenger(Pax_Email,flag1)==1)
					{	
						flag1=0;
						//System.out.println("Already added in arranger's profile");
						paxmgt.clickContinutButton();
						paxmgt.assertDuplicatePaxAdd();
						
					}
					else
					{
						
						paxmgt.clickContinutButton();
						String var=driver.findElement(By.xpath("//div[@id='profileExist']/p")).getText();
						if(var.contains("A matching passenger profile is found in the system"))
						{
							paxmgt.clickConfirmButton();
						}
						else
						{
							paxmgt.setFirstName(Pax_F_Name);
							paxmgt.setLastName(Pax_L_Name);
							paxmgt.setCompanyName(Pax_C_Name);
							paxmgt.setTitleName(Pax_Title);
							paxmgt.setWorkNumber(Pax_Work);
							paxmgt.setExtension(Pax_Ext);
							paxmgt.clickCompletePassenger();
							Thread.sleep(5000);
						}
					    //Request Access
						paxmgt.clickNoThanksAccess();
						
					}
					Thread.sleep(3000);
					clickResIDbutton();
					
				}
				else
				{
					Thread.sleep(500);
					clickSaveButton();
					Thread.sleep(3000);
				}
			}
			
			public int noPassenger(String Pax_Email, String Pax_mobile, String Pax_F_Name, String Pax_L_Name, String Pax_C_Name, String Pax_Title,String Pax_Work, String Pax_Ext)
			{
				int flag=1;
				try
				{
					String txt=driver.findElement(By.id("messagErr")).getText();
					if(txt.contains("Visit the Passenger Management page to add new passenger profiles for reservations"))
					{
						PassengerMangementPage paxmgtpage=new PassengerMangementPage(driver);
						paxmgtpage.clickPassengerMgtTab();
						paxmgtpage.clickAddPassengerButton();
						paxmgtpage.setEmailAddress(Pax_Email);
						paxmgtpage.setMobileNumber(Pax_mobile);
						paxmgtpage.clickContinutButton();
						String var=driver.findElement(By.xpath("//div[@id='profileExist']/p")).getText();
						if(var.contains("A matching passenger profile is found in the system"))
						{
							paxmgtpage.clickConfirmButton();
						}
						else
						{
							paxmgtpage.setFirstName(Pax_F_Name);
							paxmgtpage.setLastName(Pax_L_Name);
							paxmgtpage.setCompanyName(Pax_C_Name);
							paxmgtpage.setTitleName(Pax_Title);
							paxmgtpage.setWorkNumber(Pax_Work);
							paxmgtpage.setExtension(Pax_Ext);
							paxmgtpage.clickCompletePassenger();
							Thread.sleep(5000);
						}
						paxmgtpage.clickNoThanksAccess();
						
						Thread.sleep(3000);
						clickResIDbutton();
					
					}
					else
					{
						flag=0;
					}	
				}
				catch(Exception e)
				{
					//	
				}
				return flag;
			}
			
			public Boolean checkMessageForPending() throws Exception
			{
				try
				{
					String txt=driver.findElement(By.xpath(".//*[@id='errMsg']")).getText();
					if((txt.contains("currently pending approval")) || (txt.contains("credit card is required")))
					{
						
						return false;	
					}
					else
					{
	
						return true;
					}
					
				}
				catch(Exception e)
				{
					
		   		    
		   		    return true;
				}
				
			}
			
			
			
			public void specialInput()
			{
				try
				{
					String val="0";
					List<WebElement> list=driver.findElements(By.xpath("//li[@class='width82P']"));
					//System.out.println(list.size());
					if(list.size()>0)
					{
						for(int i=0;i<list.size();i++)
						{
							String placeHolder=driver.findElement(By.id("specialInputLabelVal"+i+"")).getAttribute("placeholder");
							//System.out.println(placeHolder);
							int count=0;
							for(int j=1;j<=15;j++)
							{
								if(Character.isDigit(placeHolder.charAt(j)))
								{
									j++;
									val=placeHolder.substring((j-1),j);
									break;
								}
								else
								{
									count++;
								}
							}
							String str=new MyStringRandomGen().generateRandomString(Integer.parseInt(val));
							driver.findElement(By.id("specialInputLabelVal"+i+"")).sendKeys(str);
						}
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			
			public void multiplePassengerSelection(int count) throws Exception
			{
				try
				{
					for(int i=0;i<count;i++)
					{
						driver.findElement(By.id("checkboxForPassengerName"+i+"")).click();
					}
					driver.findElement(By.xpath(".//*[@id='saveAndContinueDiv']/input")).click();
					Thread.sleep(4000);
				}
				catch(Exception e)
				{
					throw new IllegalStateException();
				}
			}
			
			public void selectYesMutilplePassenger() throws Exception
			{
					Thread.sleep(4000);



					driver.findElement(yesButtonMultiplePassengerPopup).click();

			}
			
			public void clickBookForNextPassenger() throws Exception
			{
					Thread.sleep(4000);

					driver.findElement(bookForNextPassengerLink).click();

		
			}


}
