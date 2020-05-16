package com.careyconnect.webPages;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.careyconnect.dataBase.DataBase;
import com.careyconnect.dataPage.LogInDataPage;
import com.careyconnect.webPages.BaseClass;
import com.careyconnect.webPages.LogInPage;


public class LoginTest extends BaseClass {

	

	SimpleDateFormat dateformat = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");

	public void setUp() {

		Launchsite_Chrome();

	}

	@DataProvider(name = "MySQL-provider")
	public String[][] mySQL_Data() {
		// Connect to the database.

		int rowCount = 0;
		int columnCount = 0;
		String myData[][] = null;

		try {
			DataBase dataBase = new DataBase();
			dataBase.getStatement();
			ResultSet rs = dataBase.getData("SELECT * FROM champs_new_db.tbl_login where Environment = 'SYSTest';");

			// Get Column count
			ResultSetMetaData resultSet_metaData = rs.getMetaData();
			columnCount = resultSet_metaData.getColumnCount();

			// Get Row Count
			while (rs.next())
				rowCount++;

			// Initialize data structure
			myData = new String[rowCount][columnCount];

			rs.beforeFirst();

			// populate data structure
			for (int row = 0; row < rowCount; row++) {
				rs.next();

				for (int col = 1; col <= columnCount; col++)
					myData[row][col - 1] = rs.getString(col);
				
					
					
			}

			dataBase.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return myData;

	}
	
	
	

	@Test (dataProvider ="MySQL-provider", alwaysRun = true)
	public void testLogin(String testcase, String description, String emvironment, String userName, String password, String scenario) {

		try

		{
			//Launchsite_Chrome();
			parallelExecution();
			LogInDataPage logindataPage = new LogInDataPage();	
			logindataPage.setDescription(testcase);
        	logindataPage.setIsExecuted(description);
        	logindataPage.setUsername(userName);
        	logindataPage.setPassword(password);
        	logindataPage.setScenarioType(scenario);
        	System.out.println(logindataPage.getUsername());
			//System.out.println("driver = " + driver);
			LogInPage loginPage = new LogInPage(driver);
			loginPage.setUserName(logindataPage.getUsername());
			loginPage.setPassword(logindataPage.getPassword());
			loginPage.clickLoginButton();
			loginPage.checkSMSRemindMeLater();
			loginPage.assertUserLogin();
			System.out.println("----------------Test Passed-----------------");

		}

		catch (Exception e) {
			System.out.println(e);
			System.out.println("----------------Test Failed-----------------");
		}

		tearDown();
	}
	
	
	public void tearDown() {
		
		driver.close();
	}

}
