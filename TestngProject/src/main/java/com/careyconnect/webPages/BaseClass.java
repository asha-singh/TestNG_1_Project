package com.careyconnect.webPages;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static String baseUrl = "";
	private LinkedList<Object> dbParamList = new LinkedList<Object>();
	private ResultSet resultSet;
	public static int basewait;
	public static boolean assertflag = false;
	public static String Date;
	public static String Month;
	public static String Year;
	public WebDriver driver;

	public static void setWait(int s) {
		basewait = s;
	}

	public WebDriver Launchsite_Firefox(WebDriver m_driver)

	{
		m_driver = new FirefoxDriver();
		m_driver.manage().timeouts().implicitlyWait(basewait, TimeUnit.SECONDS);
		m_driver.manage().window().maximize();
		return m_driver;

	}

	public WebDriver Launchsite_IE(WebDriver m_driver) {
		try {
			System.setProperty("webdriver.ie.driver",
					new File(".").getCanonicalPath() + "\\Drivers\\IEDriverServer.exe");
			m_driver = new InternetExplorerDriver();
			m_driver.manage().timeouts().implicitlyWait(basewait, TimeUnit.SECONDS);
			m_driver.manage().timeouts().setScriptTimeout(3000, TimeUnit.SECONDS);
			m_driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return m_driver;
	}

	public void Launchsite_Chrome() {
		try {

			System.setProperty("webdriver.chrome.driver",
					new File(".").getCanonicalPath() + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(basewait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Utility utility = new Utility();
			driver.manage().timeouts().pageLoadTimeout(utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("https://cessys.carey.com/CorpWeb_v2/");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void parallelExecution() {
		try {
			String nodeURL = "http://localhost:5555/wd/hub";
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);

			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\careyconnect\\Drivers\\chromedriver.exe");
			driver = new RemoteWebDriver(new URL(nodeURL), cap);
			driver.manage().timeouts().implicitlyWait(basewait, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Utility utility = new Utility();
			driver.manage().timeouts().pageLoadTimeout(utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(utility.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("https://cessys.carey.com/CorpWeb_v2/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebDriver Launchsite_Opera(WebDriver m_driver) {
		try {
			System.setProperty("webdriver.opera.driver", new File(".").getCanonicalPath() + "\\Drivers\\opera.exe");
			m_driver = new OperaDriver();
			m_driver.manage().timeouts().implicitlyWait(basewait, TimeUnit.SECONDS);
			m_driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return m_driver;
	}

	public WebDriver Launchsite_Safari(WebDriver m_driver) {

		// System.setProperty("webdriver.safari.noinstall", "true"); //To stop uninstall
		// each time
		m_driver = new SafariDriver();
		// m_driver = new SafariDriver();
		m_driver.manage().timeouts().implicitlyWait(basewait, TimeUnit.SECONDS);
		m_driver.manage().window().maximize();

		return m_driver;

	}

	public LinkedList<Object> getDbParamList() {
		return dbParamList;
	}

	public void setDbParamList(LinkedList<Object> dbParamList) {
		this.dbParamList = dbParamList;
	}

	public ResultSet getResultSet() {
		return resultSet;
	}

	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	public static WebElement getElement(String finder, String finder_str, WebDriver driver) {
		List<WebElement> element = null;
		try {
			if (finder.equalsIgnoreCase("CLASS")) {
				element = driver.findElements(By.className(finder_str));
			} else if (finder.equalsIgnoreCase("ID")) {
				element = driver.findElements(By.id(finder_str));
			} else if (finder.equalsIgnoreCase("CSS")) {
				element = driver.findElements(By.cssSelector(finder_str));
			} else if (finder.equalsIgnoreCase("LINK")) {
				element = driver.findElements(By.linkText(finder_str));
			} else if (finder.equalsIgnoreCase("NAME")) {
				element = driver.findElements(By.name(finder_str));
			} else if (finder.equalsIgnoreCase("PARTIALLINK")) {
				element = driver.findElements(By.partialLinkText(finder_str));
			} else if (finder.equalsIgnoreCase("TAG")) {
				element = driver.findElements(By.tagName(finder_str));
			} else if (finder.equalsIgnoreCase("XPATH")) {
				element = driver.findElements(By.xpath(finder_str.toLowerCase()));
			} else if (finder.equalsIgnoreCase("TEXT_Y_VT")) {
				finder_str = "//*[@*='" + finder_str + "']";
				element = driver.findElements(By.xpath(finder_str));
			} else if (finder.equalsIgnoreCase("TEXT_N_VT")) {
				finder_str = "//input[@*='" + finder_str + "']";
				element = driver.findElements(By.xpath(finder_str));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element != null && element.size() > 0 ? element.get(0) : null;
	}

	public static void PerformAction(String action, String data_val, String finder, String finder_str, WebDriver driver)
			throws Exception {
		List<WebElement> elementList = null;
		WebElement element = null;
		try {
			if (finder.equalsIgnoreCase("CLASS")) {
				elementList = driver.findElements(By.className(finder_str));
			} else if (finder.equalsIgnoreCase("ID")) {
				elementList = driver.findElements(By.id(finder_str));
			} else if (finder.equalsIgnoreCase("CSS")) {
				elementList = driver.findElements(By.cssSelector(finder_str));
			} else if (finder.equalsIgnoreCase("LINK")) {
				elementList = driver.findElements(By.linkText(finder_str));
			} else if (finder.equalsIgnoreCase("NAME")) {
				elementList = driver.findElements(By.name(finder_str));
			} else if (finder.equalsIgnoreCase("PARTIALLINK")) {
				elementList = driver.findElements(By.partialLinkText(finder_str));
			} else if (finder.equalsIgnoreCase("TAG")) {
				elementList = driver.findElements(By.tagName(finder_str));
			} else if (finder.equalsIgnoreCase("XPATH")) {
				elementList = driver.findElements(By.xpath(finder_str.toLowerCase()));
			} else if (finder.equalsIgnoreCase("TEXT_Y_VT")) {
				finder_str = "//*[@*='" + finder_str + "']";
				elementList = driver.findElements(By.xpath(finder_str));
			} else if (finder.equalsIgnoreCase("Text")) {
				elementList = driver.findElements(By.tagName(finder_str));
			} else if (finder.equalsIgnoreCase("TEXT_N_VT")) {
				finder_str = "//input[@*='" + finder_str + "']";
				elementList = driver.findElements(By.xpath(finder_str));
			}
		} catch (Exception e) {
			// JOptionPane.showMessageDialog (null, "Exception occurred: "+e.getMessage(),
			// "Exception", JOptionPane.ERROR_MESSAGE);
		}
		if (elementList != null && elementList.size() > 0) {
			element = elementList.get(0);
		}
		if (data_val == null)
			data_val = "";

		if (action.equalsIgnoreCase("Open")) {
			try {
				driver.get(data_val);
				driver.manage().window().maximize();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Exception occurred: " + e.getMessage(), "Exception",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (action.equalsIgnoreCase("Select")) {
			try {
				data_val = data_val.trim();
				if (!data_val.startsWith("#")) {
					if (data_val.contains("=")) {
						String temp[] = data_val.split("=");
						new Select(element).selectByVisibleText(temp[1]);
					} else {
						element.sendKeys(data_val);
					}

				} else {
					data_val = data_val.substring(1);
					Select dropdown = ((Select) element);
					try {
						int dropdownIndex = Integer.parseInt(data_val);
						dropdown.selectByIndex(dropdownIndex);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				}
			} catch (IndexOutOfBoundsException e) {
				// JOptionPane.showMessageDialog (null, "Exception occurred: "+e.getMessage(),
				// "Exception", JOptionPane.ERROR_MESSAGE);
			} catch (Exception e) {
				// JOptionPane.showMessageDialog (null, "Exception occurred: "+e.getMessage(),
				// "Exception", JOptionPane.ERROR_MESSAGE);
			}

		}
		if (action.equalsIgnoreCase("HITTAB")) {

			element.sendKeys(Keys.ENTER);

		}
		if (action.equalsIgnoreCase("HITBACKSPACE")) {

			element.sendKeys(Keys.BACK_SPACE);

		}
		if (action.equalsIgnoreCase("HITEND")) {

			element.sendKeys(Keys.END);

		}
		if (action.equalsIgnoreCase("HITDELETE")) {

			element.sendKeys(Keys.DELETE);

		}
		if (action.equalsIgnoreCase("Close")) {
			try {
				driver.close();
			} catch (Exception e) {
				// JOptionPane.showMessageDialog (null, "Exception occurred: "+e.getMessage(),
				// "Exception", JOptionPane.ERROR_MESSAGE);
			}
		}
		if (action.equalsIgnoreCase("Click")) {
			try {
				element.click();
			} catch (StaleElementReferenceException ex) {

			} catch (Exception e) {
				Thread.sleep(10000);
				// driver.findElement(By.id("dd3")).click();
				element.click();
			}

		} else if (action.equalsIgnoreCase("Wait")) {

			// System.out.println("Thread");
			Thread.sleep(Long.parseLong(finder_str));

		} else if (action.equalsIgnoreCase("sendKeys")) {
			try {
				element.clear();
				element.sendKeys(data_val);
				Thread.sleep(3000);
				element.sendKeys(Keys.TAB);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else if (action.equalsIgnoreCase("HOVER")) {

			driver.manage().window().maximize();
			Robot robot = new Robot();
			robot.mouseMove(0, 0);
			Actions builder = new Actions(driver);
			builder.moveToElement(element).build().perform();
			Thread.sleep(4000);

		} else if (action.equalsIgnoreCase("Clear")) {

			element.clear();

		} else if (action.equalsIgnoreCase("CAB")) {

			driver.close();

		} else if (action.equalsIgnoreCase("DAC")) {

			driver.manage().deleteAllCookies();

		} else if (action.equalsIgnoreCase("Submit")) {

			element.submit();

		} else if (action.equalsIgnoreCase("AcceptAlert")) {

			driver.switchTo().alert().accept();

		}

		else if (action.equalsIgnoreCase("DismissAlert")) {

			driver.switchTo().alert().dismiss();

		} else if (action.equalsIgnoreCase("SwitchToDefault")) {

			driver.switchTo().defaultContent();

		} else if (action.equalsIgnoreCase("SwitchToFrame")) {

			driver.switchTo().frame(element);

		}

	}

}
