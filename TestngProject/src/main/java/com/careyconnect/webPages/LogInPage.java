package com.careyconnect.webPages;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {

	WebDriver driver;

	SimpleDateFormat dateformat = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");

	By usernameLocator = By.id("okta-signin-username");   
	By passwordLocator = By.xpath("//*[@id='okta-signin-password']");
	By loginButtonLocator = By.xpath("//*[@id='okta-signin-submit']");
	By assertElementLocator = By.id("myProfileTips");
	By smsRemindMeLater = By.id("remindMeLater");

	public LogInPage(WebDriver driver) {

		this.driver = driver;

	}

	public void setUserName(String user) throws Exception {
	
		driver.findElement(usernameLocator).clear();
		driver.findElement(usernameLocator).sendKeys(user);

	}

	public void setPassword(String password) throws Exception {

		driver.findElement(passwordLocator).clear();
		driver.findElement(passwordLocator).sendKeys(password);

	}

	public void clickLoginButton() throws Exception {

		driver.findElement(loginButtonLocator).click();

	}

	public void checkSMSRemindMeLater() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SMSSetup']")));
			if (driver.findElement(By.xpath("//*[@id='SMSSetup']")).isDisplayed()) {
				System.out.println("SMS popup present");
				driver.findElement(smsRemindMeLater).click();
			}
		} catch (Exception e) {
			System.out.println("SMS popup not present");
		}

		Thread.sleep(5000);

	}

	public void assertUserLogin() throws Exception {
		try
		{driver.findElement(assertElementLocator);
		System.out.println("Assertion Passed -- Positive Test Scenario");
		}
				catch (Exception e)
				{System.out.println("Negative Test Scenario");}
		}

	}


