package com.careyconnect.webPages;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class PassengerMangementPage {
	WebDriver driver;
	String path;
	SimpleDateFormat dateformat = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
	
	
	
	
	By paxMgtTabLocator=By.cssSelector("#passengerManagementLink > span");
	By importPassengerLinkLocator=By.id("importPassengersButton");
	By brsbtnLocator=By.id("fileField");
	By clickImportbtnLocator=By.cssSelector("li.fullWidth.padt20px > input.blue-btn-big3.width100P");
	By addPassengerLinkLocator=By.id("addPassengerButton");
	By assertPaxAddLoc=By.id("multiPxnUploadError");
	
	//SearchPassenger
	
	By searchPassenger=By.id("searchPassengerText1");
	
	//Add Single Passenger screen
	
	By emailAddressLocator=By.id("emailAddress");
	By countryCodeLocator=By.id("addPaxPhoneCodeValidate");
	By mobileNumberLocator=By.id("mobileNumberValidate");
	
	By clickContimueButton=By.id("savePassengerButton");
	
	//Existing Passenger
	
	By confirmButtonLocator=By.id("confirmExistingPassenger");
	By canceButtonLocator=By.id("cancelExistingPassenger");
	
	//New Passenger
	By firstNameLocator=By.id("firstName");
	By lastNameLocator=By.id("lastName");
	By compnayNameLocator=By.id("companyName");
	By titleLocator=By.id("title");
	By workNumberLocator=By.id("workNumber");
	By extLocator=By.id("extension");
	By notificationEmailCheckbox=By.id("sameAsLoginEmailId");
	By notificationEmail=By.id("notificationEmailAddress");
	By completePassengerProfile=By.id("completePassengerProfileButton");
	
	// Request Access
	By basicAccess=By.id("basicAccessLevelUpgradeCheckBoxId");
	By limitedAccess=By.id("limitedAccessLevelUpgradeCheckBoxId");
	By fullAccess=By.id("fullAccesslevelUpgradeCheckBoxId");
	
	By reuestAccessLocator=By.id("requestAccessUpgradeBtnExternal");
	By requestAccessNoThanks=By.id("upgradeAccessNoThanksBtnExternal");
	
	By deleteYesButton=By.id("clickingOnYesBtnPassenger");
	
	By assertDuplicatePax=By.id("messagErr");
	
	By assertLocator=By.xpath("//*[starts-with(@id, 'viewPassengerListSmall')]/tbody/tr[*]/td[3]/span");
	
	By deleteLocator=By.className("email_truncate");
	
	By changeNameLocator = By.cssSelector("#nameEditButton > img");
	By changeFirstNameLocator = By.id("nameFirstTextBox");
	By changeLastNameLocator = By.id("nameLastTextBox");
	By changeNameSaveLocator = By.id("nameSaveButton");
	
	By changeMobileNumberLocator =By.cssSelector("#mobileNumberEditButton > img");
	By mobileCountry=By.id("paxPhoneCode");
	By changeMobileNumberText= By.id("mobileNumberPassengerText");
	By changeMobileSaveLocator = By.id("mobileNumberSaveButton");

	
	By changeComNameLocator = By.cssSelector("#companyNameEditButton > img");
	
	By changeComNameTextLocator=By.id("companyNamePassengerText");
	By changeComSaveLocator = By.id("companyNameSaveButton");
	
	By changeWorkNumberLocator = By.cssSelector("#workNumberEditButton > img");
	By changeWorkNumberTextLocator= By.id("valueOfworkNumber");
	By changeExtTextLocator= By.id("valueOfExtension");
	By changeWorkNumberSaveLocator =By.id("workNumberSaveButton");
	
	// Credit Card details

	By creditCardLocator=By.xpath(".//*[@id='showcreditCard']");
	By creditCardRadioButtonLocator= By.xpath(".//*[@id='addCreditCardLink']");
	By cardTypeLocator = By.id("cardType");
	By cardNumberLocator= By.id("cardNumber");
	By cardHolderName= By.id("cardHolder");
	By monthNameLocator= By.id("ccExpMon");
	By yearNameLocator =By.id("ccExpYr");
	By addressNameLocator= By.id("address");
	By countryNameLocator=By.id("ccCountry");
	By cityNameLocator= By.id("city");
	By stateNameLocator=By.id("stateSel");
	By zipLocator=By.id("zip");
	By saveToProfile=(By.cssSelector("input[type=\"submit\"]"));
	By savebuttonLocator=By.xpath("//input[@type='submit']");
	By yesConfirmationCreditLocator=By.id("clickingOnCreditCardYesBtn");
	//Account
	
	By accountLocator=By.xpath(".//*[@id='paxProfileDetails']/div/ul/li[1]/a");
	By addAccountLink=By.xpath(".//*[@id='addAccountLink']");
	By accountNumberTextbox=By.id("accountNameofAccountNumber");
	By accountSaveBuutonLocator=By.id("saveAddAccountButton");
	By yesConfirmationLocator=By.id("clickingOnAccountYesBtn");
	
	// Ride preferences
	
	By ridePreferancesLocator =By.xpath(".//*[@id='showRiderPrefrences']");
	By ridePreferenceButton=By.xpath(".//*[@id='addRidePreferenceButton']");
	By ridePreferenceCity= By.id("ridePreferencesCity");
	By ridePreferenceValue=By.id("ridePreferencesSelectedValue");
	By ridePreferenceInput=By.id("preferencesLabelInput");
	By ridePreferenceSaveButton=By.id("addPreferencesSaveButton");
	By yesConfirmationRideLocator=By.id("riderPrefYesBtn");

	By serachPassengerBox=By.id("searchPassengerText2");
	
			
	public PassengerMangementPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public void clickPassengerMgtTab() throws Exception
	{
			
			driver.findElement(paxMgtTabLocator).click();
			
	}
	
	public void clickImportPassengerButton() throws Exception
	{
			
			driver.findElement(importPassengerLinkLocator).click();
			
	}
	
	public void clickBrowseBtn() throws Exception
	{
			
			driver.findElement(brsbtnLocator).click();
			
	}
	
	
	
	public void clickImport() throws Exception
	{
			
			driver.findElement(clickImportbtnLocator).click();}
			
	
	public void assertAddition() throws Exception
	{
		try
		{
			String txt=driver.findElement(assertPaxAddLoc).getAttribute("style");
			if(txt.length()<1)
			{
				throw new IllegalStateException("Attribute not found");
			}
		
		}
		catch(Exception e)
		{
			throw new IllegalStateException("Attribute not found");
		}
		
	}
	
	public void clickAddPassengerButton() throws Exception
	{
			
			driver.findElement(addPassengerLinkLocator).click();
			
	}
	
	public void setEmailAddress(String email) throws Exception
	{
			
			if(email!=null)
			
			driver.findElement(emailAddressLocator).clear();
			driver.findElement(emailAddressLocator).sendKeys(email);
			
		
	}
	
	public void selectcountyName(String country) throws Exception
	{
			
			new Select(driver.findElement(countryCodeLocator)).selectByVisibleText(country);
	}
	
	public void setMobileNumber(String mobile) throws Exception
	{
			
			Thread.sleep(1000);
			if(mobile!=null) {
		
			driver.findElement(mobileNumberLocator).clear();
			driver.findElement(mobileNumberLocator).sendKeys(mobile);}
			
	}
	
	public void clickContinutButton() throws Exception
	{


			driver.findElement(clickContimueButton).click();


	}
	
	//New Passenger
	public void setFirstName(String fname) throws Exception
	{
		
			Thread.sleep(1000);
		
			driver.findElement(firstNameLocator).clear();
			driver.findElement(firstNameLocator).sendKeys(fname);
		
	}
	
	public void setLastName(String lname) throws Exception
	{
			
			Thread.sleep(1000);


			driver.findElement(lastNameLocator).clear();
			driver.findElement(lastNameLocator).sendKeys(lname);


	}
	
	public void setCompanyName(String company) throws Exception
	{


			driver.findElement(compnayNameLocator).clear();
			driver.findElement(compnayNameLocator).sendKeys(company);

	}
	public void setTitleName(String title) throws Exception
	{

			
	
			driver.findElement(titleLocator).clear();
			driver.findElement(titleLocator).sendKeys(title);

	}
	
	public void setWorkNumber(String work) throws Exception
	{

			driver.findElement(workNumberLocator).clear();
			driver.findElement(workNumberLocator).sendKeys(work);

	}
	
	public void setExtension(String ext) throws Exception
	{
	
			driver.findElement(extLocator).clear();
			driver.findElement(extLocator).sendKeys(ext);
	
	}
	
	public void setNotificationcheckbox(Boolean val) throws Exception
	{
	
			if(val)
			{
				driver.findElement(notificationEmailCheckbox).click();
			}

	}
	public void setNotificationEmail(String notificationemail) throws Exception
	{
	
		
			driver.findElement(notificationEmail).clear();
			driver.findElement(notificationEmail).sendKeys(notificationemail);
	
	}
	
	public void clickCompletePassenger() throws Exception
	{

			driver.findElement(completePassengerProfile).click();
	
	}
	
	//Existing Passenger
	
	public void clickConfirmButton() throws Exception
	{

			Thread.sleep(2000);
			driver.findElement(confirmButtonLocator).click();

	}
	public void clickCancelButton() throws Exception
	{

			driver.findElement(canceButtonLocator).click();

	}
	
	public void clickRequestAccessButton() throws Exception
	{

			driver.findElement(reuestAccessLocator).click();

	}
	
	public void clickbacisAccess() throws Exception
	{

			driver.findElement(basicAccess).click();
	
	}
	public void clicklimitedAccess() throws Exception
	{

			driver.findElement(limitedAccess).click();
	}
	public void clickFullAccess() throws Exception
	{

			driver.findElement(fullAccess).click();


	}
	public void clickNoThanksAccess() throws Exception
	{

			driver.findElement(requestAccessNoThanks).click();

	}	
	
	public int verifyPassenger(String email,int flag1)
	{
		List <WebElement> elements =driver.findElements(By.xpath("//*[starts-with(@id, 'viewPassengerListSmall')]/tbody/tr[*]/td[3]/span"));
		System.out.println("size:"+elements .size());
		for(WebElement ele : elements)
		{
            System.out.println(ele.getText());
            if(ele.getText().equalsIgnoreCase(email))
            {
            	flag1=1;
            	break;
            }
		}
		return flag1;
	}
	
	public void deletePassenger(String email) throws Exception
	{
			int flag=0;

			List <WebElement> elements =driver.findElements(deleteLocator);
			System.out.println("size:"+elements .size());
			int index=1;
			for(WebElement ele : elements)
			{
	            if(ele.getText().equalsIgnoreCase(email))
	            {
	            	System.out.println(ele.getText());
	            	driver.findElement(By.xpath("(//img[@alt='Remove'])["+index+"]")).click();
	            	Thread.sleep(1000);
	            	driver.findElement(deleteYesButton).click();
	   
	            	flag=1;
	            	break;
	            }  	
	            index++;
			}
			if(flag==0)
			{
				throw new IllegalStateException("Passenger Not Found");	
			}
			
	}
	
	public void assertionverifyPassenger(String email) throws Exception
	{
			int flag=0;
	
			List <WebElement> elements =driver.findElements(assertLocator);
			System.out.println("size:"+elements .size());

			if(flag==0)
			{
				throw new IllegalStateException("New");	
			}
	}
	public void assertDuplicatePaxAdd() throws Exception
	{
		
			String var=driver.findElement(assertDuplicatePax).getText();
			if(var.contains("Another passenger profile with same email is already associated with you. Duplicate profile's data will be consolidated."))
			{
		
			}
	
			
	}	
	
	public void clickchangeNameLocator() throws Exception 
    {
  
    		driver.findElement(changeNameLocator).click();
    		Thread.sleep(2000);

    }

	public void clickchangeNameSaveLocator() throws Exception
    {

    		driver.findElement(changeNameSaveLocator).click();
    		Thread.sleep(3000);


    }

	public void clickchangeComNameLocator() throws Exception 
    {

    		driver.findElement(changeComNameLocator).click();
    		Thread.sleep(2000);
    	

    }

	public void setchangeworknoLocator(Object work_Number) {
		// TODO Auto-generated method stub
		
	}

	public void setchangeworkextLocator(Object work_Number) {
		// TODO Auto-generated method stub
		
	}

	public void assertChangeCompanyName() {
		// TODO Auto-generated method stub
		
	}

	public void setchangeFirstNameLocator(Object first_name) 
	{
		// TODO Auto-generated method stub
		
	}

	public void setchangeLastNameLocator(Object last_Name) {
		// TODO Auto-generated method stub
		
	}

	public void assertChangeName() {
		// TODO Auto-generated method stub
		
	}
	
	public void setchangeFirstNameLocator(String firstname) throws Exception
    {
 
    
    		driver.findElement(changeFirstNameLocator).clear();
    		driver.findElement(changeFirstNameLocator).sendKeys(firstname);
  
    	
    }
    
    public void setchangeLastNameLocator(String lastname) throws Exception
    {
  
    		driver.findElement(changeLastNameLocator).clear();
    		driver.findElement(changeLastNameLocator).sendKeys(lastname);
    

    }
	
	public void setchangeComTextLocator(String comName) throws Exception
    {
 
    		driver.findElement(changeComNameTextLocator).clear();
    		driver.findElement(changeComNameTextLocator).sendKeys(comName);
    	

    }

    public void clickchangeworkSaveLocator() throws Exception
    {

    		driver.findElement(changeWorkNumberSaveLocator).click();
    		Thread.sleep(3000);


    }
    
    
    public void clickRidePreferencesLocator() throws Exception
    {


    		driver.findElement(ridePreferancesLocator).click();
    		Thread.sleep(3000);


    }
    
    public void clickAddRidePrefButton() throws Exception
    {

    		driver.findElement(ridePreferenceButton).click();
    		Thread.sleep(3000);


    }
    
    public void selectRidePrefCity(String val) throws Exception
	{

			new Select(driver.findElement(ridePreferenceCity)).selectByVisibleText(val);


	}
    
    public void selectRidePrefValue(String val) throws Exception
	{

	
			new Select(driver.findElement(ridePreferenceValue)).selectByVisibleText(val);


	}
    
    public void selectRidePrefInput(String val) throws Exception
   	{



   			driver.findElement(ridePreferenceInput).clear();
   			driver.findElement(ridePreferenceInput).sendKeys(val);


   	}
    
    public void clickAddRidePrefSaveButton() throws Exception
    {

    		driver.findElement(ridePreferenceSaveButton).click();
    		Thread.sleep(1000);

    		
 
    }
   /* 
    public void assertChangeWorkNo() throws Exception
    {
    	try
    	{
    		Reporting.totalCount++;
    		Thread.sleep(2000);
    		Reporting.addToData("NULL");
    		Reporting.addToFinder(By.id("valueOfworkNumber"));
    		Reporting.addToAction("Assert");
    		String txt=driver.findElement(By.id("valueOfworkNumber")).getAttribute("class");
    		if(!(txt.contains("width100P edit-error")))
    		{
    			Reporting.passCount++;
    			Reporting.addToScreenshot("N");
    		}
    		else
    		{
    			setException();
    		}
    		Thread.sleep(2000);
    		
    	}
    	catch(Exception e)
    	{
    		setException();
    	}
    }
    */
    
    public void clickchangeworkLocator() throws Exception
    {	

    		driver.findElement(changeWorkNumberLocator).click();
    		Thread.sleep(2000);


    }
public void clickchangeComSaveLocator() throws Exception
{

		driver.findElement(changeComSaveLocator).click();
		Thread.sleep(3000);

}
public void searchPassenger(String passengerID) throws Exception
{


	List <WebElement> passengerId= driver.findElements(By.className("email_truncate"));
	int count=0, flag=0;
	for(int i=0;i<passengerId.size();i++)
	{
		System.out.println(passengerId.get(i).getText());
		if(passengerId.get(i).getText().equals(passengerID))
		{
			count=i;
			count++;
			driver.findElement(By.xpath("//table[@id='viewPassengerList']/tbody/tr["+count+"]/td[6]/a/img")).click();

			flag=1;
			break;
		}
		
	}
	if(flag==0)
	{
		throw new IllegalStateException();
	}

	Thread.sleep(2000);
}

public void setchangeworknoLocator(String work) throws Exception
{

		driver.findElement(changeWorkNumberTextLocator).clear();
		driver.findElement(changeWorkNumberTextLocator).sendKeys(work);


}

public void setchangeworkextLocator(String ext) throws Exception
{

		driver.findElement(changeExtTextLocator).clear();
		driver.findElement(changeExtTextLocator).sendKeys(ext);

}

public void clickMobileLocator() throws Exception
{	

		driver.findElement(changeMobileNumberLocator).click();
		Thread.sleep(2000);
		

}

public void setchangeCountryLocator(String country) throws Exception
{

		new Select(driver.findElement(mobileCountry)).selectByVisibleText(country);
	
}

public void setchangeMobileLocator(String mobile) throws Exception
{

		Thread.sleep(1000);
		
		driver.findElement(changeMobileNumberText).clear();
		driver.findElement(changeMobileNumberText).sendKeys(mobile);
		
}

public void clickSaveMobileLocator() throws Exception
{	
		
		driver.findElement(changeMobileSaveLocator).click();
		Thread.sleep(1000);
		

}

//Account Setup in Passenger Profile

public void clickAccountLocator() throws Exception
{	
		
		driver.findElement(accountLocator).click();
		Thread.sleep(2000);
		

}

public void clickAddAccountLink() throws Exception
{	
		
		driver.findElement(addAccountLink).click();
		Thread.sleep(2000);
		

}

public void setAccountNumber(String account) throws Exception
{
		
		driver.findElement(accountNumberTextbox).clear();
		driver.findElement(accountNumberTextbox).sendKeys(account);
		
}

public void clickSaveAccountLocator() throws Exception
{	
		
		driver.findElement(accountSaveBuutonLocator).click();
		Thread.sleep(2000);
		
}

public void deleteAccountNumber(String account) throws Exception
{
		
		
		List<WebElement> webElements=driver.findElements(By.xpath("//table[@id='passangersdetailsAccountsList']/tbody/tr[*]/td[2]/i"));
		int count=0,flag=0;
		
		for(int i=0;i<webElements.size();i++)
		{
			//System.out.println(webElements.get(i).getText());
			if(webElements.get(i).getText().contains(account))
			{
				count=i+1;
				driver.findElement(By.xpath("//table[@id='passangersdetailsAccountsList']/tbody/tr["+count+"]/td[3]/a/img")).click();
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			throw new IllegalStateException();
		}
	
}

public void clickYesConfirmationLocator() throws Exception
{	
		
		Thread.sleep(2000);
		
		driver.findElement(yesConfirmationLocator).click();
		Thread.sleep(1000);
		
		Thread.sleep(4000);

}
	
//Adding Credit Card in Passenger Profile

public void clickCreditCardLocator() throws Exception
{	
		
		Thread.sleep(2000);
		
		driver.findElement(creditCardLocator).click();
		Thread.sleep(2000);
		

}

public void clickCreditCardLink() throws Exception
{	
		
		Thread.sleep(2000);
		
		driver.findElement(creditCardRadioButtonLocator).click();
		Thread.sleep(2000);
	

}

public void setCardType(String cardtype) throws Exception
{
		
		Thread.sleep(1000);
		if(cardtype==null)
		
		
		
		new Select(driver.findElement(cardTypeLocator)).selectByVisibleText(cardtype);
		
}

public void setCardNumber(String cardNumber) throws Exception
{
		
		Thread.sleep(1000);
		if(cardNumber==null)
		
		driver.findElement(cardNumberLocator).clear();
		driver.findElement(cardNumberLocator).sendKeys(cardNumber);
	
}

public void setNameOnCard(String name) throws Exception
{
		
		Thread.sleep(1000);
		
		driver.findElement(cardHolderName).clear();
		driver.findElement(cardHolderName).sendKeys(name);
		
}

public void setExpMonth(String month) throws Exception
{
		
		Thread.sleep(1000);
		
		
		
		new Select(driver.findElement(monthNameLocator)).selectByVisibleText(month);
		
}

public void setExpYear(String year) throws Exception
{
	
	
		
		new Select(driver.findElement(yearNameLocator)).selectByVisibleText(year);
		
}

public void setCountry(String country) throws Exception
{
		
		
		new Select(driver.findElement(countryNameLocator)).selectByVisibleText(country);
	
}

public void setBillAddress(String address) throws Exception
{
		
		
		driver.findElement(addressNameLocator).clear();
		driver.findElement(addressNameLocator).sendKeys(address);
}

public void setCity(String city) 
{
		
	
		driver.findElement(cityNameLocator).clear();
		driver.findElement(cityNameLocator).sendKeys(city);}
		

public void setState(String state) 
{
		
		
		new Select(driver.findElement(stateNameLocator)).selectByVisibleText(state);}
	


public void setPostalCode(String code) throws InterruptedException 

{
		
		Thread.sleep(1000);
	
		
		driver.findElement(zipLocator).clear();
		driver.findElement(zipLocator).sendKeys(code);
	
}
public void clickSaveCreditCardLocator() throws Exception
{	
		
		Thread.sleep(2000);
	
		driver.findElement(savebuttonLocator).click();
		Thread.sleep(2000);
		
		
}

public void assertCreditCard(String cardName) throws Exception
{	
		int flag=0;
		
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='passangersdetailsCreditCardsList']/tbody/tr[*]/td[1]"));
		System.out.println(list.get(0).getText());
		for(WebElement element:list)
		{
			if(element.getText().equals(cardName))
			{
				flag=1;
				break;
			}
		}
		
		
		Thread.sleep(3000);
}


public void deleteCreditCardNumber(String name) throws Exception
{
		
		Thread.sleep(1000);
		
		
		List<WebElement> webElements=driver.findElements(By.xpath("//table[@id='passangersdetailsCreditCardsList']/tbody/tr[*]/td[1]"));
		int count=0,flag=0;
		
		for(int i=0;i<webElements.size();i++)
		{
			System.out.println(webElements.get(i).getText());
			if(webElements.get(i).getText().contains(name))
			{
				count=i+1;
				driver.findElement(By.xpath("//table[@id='passangersdetailsCreditCardsList']/tbody/tr["+count+"]/td[4]/a/img")).click();
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			throw new IllegalStateException();
		}
	
}

public void clickYesConfirmationCreditLocator() throws Exception
{	
		
		Thread.sleep(2000);
		
		driver.findElement(yesConfirmationCreditLocator).click();
		Thread.sleep(4000);
		
}

public void deleteRidePreferences(String ride) throws Exception
{
	
	Thread.sleep(2000);
	
	List <WebElement> elements=driver.findElements(By.xpath("//table[@id='passangersdetailsRidePreferencesList']/tbody/tr[*]/td[1]"));
	int count=0,flag=0;
	for(int i=0;i<elements.size();i++)
	{
		System.out.println(elements.get(i).getText());
		if(elements.get(i).getText().equals(ride))
		{
			count=i+1;
			driver.findElement(By.xpath("//table[@id='passangersdetailsRidePreferencesList']/tbody/tr["+count+"]/td[5]/a/img")).click();
			flag=1;
			break;
		}
	}
	
	if(flag==0)
	{
		throw new IllegalStateException();
	}
	
}

public void clickYesConfirmationRideLocator() throws Exception
{	
	
	
	
	driver.findElement(yesConfirmationRideLocator).click();
	Thread.sleep(1000);
	
	
}

}
