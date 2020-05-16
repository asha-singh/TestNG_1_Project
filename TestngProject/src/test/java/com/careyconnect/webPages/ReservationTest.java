package com.careyconnect.webPages;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.careyconnect.dataBase.DataBase;
import com.careyconnect.dataPage.ReservationDataPage;

import com.careyconnect.webPages.ReservationPage;

//import com.home.testsuiteObjects.reservationDataPage;

/**************
 * The main execution takes place here and coding is done as per scenarios
 ************************/

public class ReservationTest extends BaseClass {

	ReservationDataPage reservationDataPage;
	ReservationPage reservationPage;
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
			ResultSet rs = dataBase
					.getData("SELECT * FROM champs_new_db.tbl_reservation where Environment = 'SYSTest';");

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

	@Test(dataProvider = "MySQL-provider")
	public void testreservationtest(String testcase, String a, String b, String c, String d, String e, String f, String g, String h, String i,
			String j, String k, String l, String m, String n, String o, String p, String q, String r, String s, String t, String u, String v,
			String w, String x, String y, String z, String a1, String b1, String c1, String d1, String e1, String f1, String g1, String h1, String i1,
			String j1, String k1, String l1, String m1, String n1, String o1, String p1, String q1, String r1, String s1, String t1, String u1, String v1,
			String w1, String x1, String y1, String z1, String a2, String b2, String c2, String d2, String e2, String f2, String g2, String h2, String i2,
			String j2, String k2, String l2, String m2, String n2, String o2, String p2, String q2, String r2, String s2, String t2, String u2, String v2,
			String w2, String x2, String y2, String z2, String a3, String b3, String c3, String d3, String e3, String f3, String g3) {
		setUp();
		reservationDataPage = new ReservationDataPage();
		//reservationDataPage.setTestCase(testcase);
		reservationDataPage.setDescription(a);
    	reservationDataPage.setIsExecuted(b);
    	reservationDataPage.setReservation_Type(c);
    	reservationDataPage.setIsMultiplePassenger(d);
    	reservationDataPage.setMultiplePassengerCount(e);
    	reservationDataPage.setPax_Name(f);
    	reservationDataPage.setPax_Email(g);
    	reservationDataPage.setPax_mobile(h);
    	reservationDataPage.setPax_F_Name(i);
    	reservationDataPage.setPax_L_Name(j);
    	reservationDataPage.setPax_C_Name(k);
    	reservationDataPage.setPax_Title(l);
    	reservationDataPage.setPax_Work(m);
    	reservationDataPage.setPax_Ext(n);
    	reservationDataPage.setNum_Pax(o);
    	reservationDataPage.setNum_Bag(p);
    	reservationDataPage.setTrip_Type(q);
    	reservationDataPage.setPickup_date(r);
    	reservationDataPage.setPickup_month(s);
    	reservationDataPage.setPickup_year(t);
    	reservationDataPage.setPick_loc_Type(u);
    	reservationDataPage.setIsTrainPickupValidate(getBoolValue(v));
    	reservationDataPage.setIsAirportPickupValidate(getBoolValue(w));
    	reservationDataPage.setPick_Location(x);
    	reservationDataPage.setPAirLine_Name(y);	
    	reservationDataPage.setPFlight_No(z);
    	reservationDataPage.setPTCarrier_Name(a1);
    	reservationDataPage.setPTrain_Number(b1);
    	reservationDataPage.setPTArrival_Time(c1);
    	reservationDataPage.setPTArrival_TimeFromat(d1);
    	reservationDataPage.setPGPickup_Time(e1);
    	reservationDataPage.setPGPickup_TimeFormat(f1);
    	reservationDataPage.setIsAddStop(getBoolValue( g1));
    	reservationDataPage.setStopCount(h1);
    	reservationDataPage.setStop1_Type(i1);
    	reservationDataPage.setStop1_Location(j1);
    	reservationDataPage.setStop2_Type(k1);
    	reservationDataPage.setStop2_Location(l1);
    	reservationDataPage.setStop3_Type(m1);
    	reservationDataPage.setStop3_Location(n1);
    	reservationDataPage.setDrop_Loc_Type(o1);
    	reservationDataPage.setIsTrainDropoffValidate(getBoolValue(p1));
    	reservationDataPage.setIsAirportDropoffValidate(q1);
    	reservationDataPage.setDrop_Location(r1);
    	reservationDataPage.setDAirLine_Number(s1);
    	reservationDataPage.setDFlight_No(t1);
    	reservationDataPage.setDTCarrier_Name(u1);
    	reservationDataPage.setDTrain_Number(v1);
    	reservationDataPage.setDTDeparture_Time(w1);
    	reservationDataPage.setDTDeparture_TimeFormat(x1);
    	reservationDataPage.setDropOff_Checked(getBoolValue(y1));
    	reservationDataPage.setTime_Or_Duration(z1);
    	reservationDataPage.setDropOff_Time(a2);
    	reservationDataPage.setDropOff_TimeFormat(b2);
    	reservationDataPage.setIsNextDay(getBoolValue(c2));
    	reservationDataPage.setTrip_Duration(d2);
    	reservationDataPage.setSpecial_Instruction(e2);
    	reservationDataPage.setPayment_Type(f2);
    	reservationDataPage.setPromo_Code(g2);
    	reservationDataPage.setUser_Type(h2);
    	reservationDataPage.setIsCreditCard(getBoolValue(i2));
    	reservationDataPage.setIsPaxCCaccount(getBoolValue(j2));
    	reservationDataPage.setIsBillAccount(getBoolValue(k2));
    	reservationDataPage.setIsAccountCC(getBoolValue(l2));
    	reservationDataPage.setAccountNumber(m2);
    	reservationDataPage.setCarType(n2);
    	reservationDataPage.setCardType(o2);
    	reservationDataPage.setCardNumber(p2);
    	reservationDataPage.setName_On_Card(q2);
    	reservationDataPage.setExp_Month(r2);
    	reservationDataPage.setExp_Year(s2);
    	reservationDataPage.setCard_CVV(t2);
    	reservationDataPage.setCard_Country(u2);
    	reservationDataPage.setBilling_Address(v2);
    	reservationDataPage.setCity(w2);
    	reservationDataPage.setState(x2);
    	reservationDataPage.setPostal_Code(y2);
    	reservationDataPage.setIsSaveToProfile(getBoolValue(z2));
    	reservationDataPage.setLogin_user(a3);
    	reservationDataPage.setLogin_password(b3);
    	reservationDataPage.setGuestBookingFirstName(c3);
    	reservationDataPage.setGuestBookingLastName(d3);
    	reservationDataPage.setGuestBookingMobilenumber(e3);
    	reservationDataPage.setScenarioType(g3);

		
		reservationPage = new ReservationPage(driver);
		LogInPage loginPage = new LogInPage(driver);
		
		try {

			System.out.println("Test Description:  " + reservationDataPage.getDescription());
			System.out.println("Test Scenario:  " + reservationDataPage.getScenarioType());
			loginPage.setUserName(reservationDataPage.getLogin_user());
			loginPage.setPassword(reservationDataPage.getLogin_password());
			loginPage.clickLoginButton();
			loginPage.checkSMSRemindMeLater();
			loginPage.assertUserLogin();

			// multiple Passenger reservation
			if (reservationDataPage.getIsMultiplePassenger().equalsIgnoreCase("YES")) {
				int number = Integer.parseInt(reservationDataPage.getMultiplePassengerCount());

				reservationPage.clickReservationButton();

				Thread.sleep(4000);
				reservationPage.switchToPopUp();

				Thread.sleep(4000);
				reservationPage.clickFutureTripButton();
				// reservationPage.clickImmediatePickUpButton();
				Thread.sleep(5000);

				reservationPage.multiplePassengerSelection(number);
				reservationPage.selectYesMutilplePassenger();
				Thread.sleep(4000);
				for (int no = 1; no <= number; no++) {
					reservationPage.setNoOfPax(reservationDataPage.getNum_Pax());
					reservationPage.setNoOfBags(reservationDataPage.getNum_Bag());
					reservationPage.setPickupDate(reservationDataPage.getPickup_date());
					reservationPage.setmonth(reservationDataPage.getPickup_month());
					reservationPage.setyear(reservationDataPage.getPickup_year());
					// Trip Type Point to Point
					if (ReservationDataPage.getTrip_Type().contains("PP")) {
						reservationPage.clickTransferTrip();
					} else {
						reservationPage.clickAsDirectedTrip();
					}

					// Set Pickup Location
					if (reservationDataPage.getPick_loc_Type().contains("GR")) {
						reservationPage.setPickupGroundLocation(reservationDataPage.getPick_Location(),
								reservationDataPage.getPick_loc_Type(), reservationDataPage.getPGPickup_Time(),
								reservationDataPage.getPGPickup_TimeFormat());
					} else if (reservationDataPage.getPick_loc_Type().contains("AIRP")) {
						reservationPage.setPickupAirportLocation(reservationDataPage.getPick_Location(),
								reservationDataPage.getPAirLine_Name(), reservationDataPage.getPFlight_No(),
								reservationDataPage.getIsAirportPickupValidate());
					} else if (reservationDataPage.getPick_loc_Type().contains("Train")) {
						reservationPage.setPickupTrainLocation(reservationDataPage.getPick_Location(),
								reservationDataPage.getPTCarrier_Name(), reservationDataPage.getPTrain_Number(),
								reservationDataPage.getPTArrival_Time(), reservationDataPage.getPTArrival_TimeFromat(),
								reservationDataPage.getIsTrainPickupValidate());
					} else if (reservationDataPage.getPick_loc_Type().contains("Private Aviation")) {
						reservationPage.setPrivateAviationPickup(reservationDataPage.getPick_Location(),
								reservationDataPage.getPAirLine_Name(), reservationDataPage.getPFlight_No(),
								reservationDataPage.getIsAirportPickupValidate());
					}
					Thread.sleep(5000);
					// Set Drop off Location
					if (reservationDataPage.getDrop_Loc_Type().contains("GR")) {
						reservationPage.setDropoffGroundLocation(reservationDataPage.getDrop_Location());
					} else if (reservationDataPage.getDrop_Loc_Type().contains("AIRP")) {
						reservationPage.setDropoffAirportLocation(reservationDataPage.getDrop_Location(),
								reservationDataPage.getDAirLine_Number(), reservationDataPage.getDFlight_No(),
								reservationDataPage.getIsAirportDropoffValidate().contains("Yes"));
					} else if (reservationDataPage.getDrop_Loc_Type().contains("Train")) {
						reservationPage.setDropoffTrainLocation(reservationDataPage.getDrop_Location(),
								reservationDataPage.getDTCarrier_Name(), reservationDataPage.getDTrain_Number(),
								reservationDataPage.getDTDeparture_Time(),
								reservationDataPage.getDTDeparture_TimeFormat(),
								reservationDataPage.getIsTrainDropoffValidate());
					} else if (reservationDataPage.getDrop_Loc_Type().contains("Private Aviation")) {
						reservationPage.setPrivateAviationDropoff(reservationDataPage.getDrop_Location(),
								reservationDataPage.getDAirLine_Number(), reservationDataPage.getDFlight_No(),
								reservationDataPage.getIsAirportDropoffValidate().contains("Yes"));
					}

					// Adding Stops
					if (reservationDataPage.getIsAddStop()) {
						int count = Integer.parseInt(reservationDataPage.getStopCount());
						List<String> list = new ArrayList<String>();
						list.add(reservationDataPage.getStop1_Location());
						list.add(reservationDataPage.getStop2_Location());
						list.add(reservationDataPage.getStop3_Location());

						for (int i11 = 0; i11 < count; i11++) {
							Thread.sleep(2000);
							reservationPage.clickStopslink();
							reservationPage.setPickupLocation((String) list.get(i11));
							reservationPage.clickPickupSearchedFilterLocation();
						}
					}

					if (reservationDataPage.getTrip_Type().contains("AD")) {
						Thread.sleep(5000);
						JavascriptExecutor jsee1 = (JavascriptExecutor) driver;
						jsee1.executeScript("window.scrollBy(0,350)", "");
						Thread.sleep(5000);
						// Drop off time or Trip duration
						if (reservationDataPage.getDropOff_Checked()) {
							if (reservationDataPage.getTime_Or_Duration().contains("DropoffTime")) {
								reservationPage.clickisDropoffTimeChecked();
								reservationPage.setDropoffTime(reservationDataPage.getDropOff_Time());
								if (reservationDataPage.getDropOff_TimeFormat().contains("AM")) {
									reservationPage.clickDropoffTimeAM();
								} else if (reservationDataPage.getDropOff_TimeFormat().contains("PM")) {
									reservationPage.clickDropoffTimePM();
								}
							} else if (reservationDataPage.getTime_Or_Duration().contains("Duration")) {
								reservationPage.clickisDropoffDurationChecked();
								reservationPage.setDropoffDuration(reservationDataPage.getTrip_Duration());
							}
						} else if (!reservationDataPage.getDropOff_Checked()) {
							reservationPage.clickIsDropoffChecked();
						}

						if (reservationDataPage.getIsNextDay()) {
							reservationPage.clickIsNextDay();
						}
					}
					reservationPage.setSpecialInstruction(reservationDataPage.getSpecial_Instruction());

					// Payment Method

					if (reservationDataPage.getPayment_Type().contains("Account")) {
						Thread.sleep(5000);
						JavascriptExecutor jsee1 = (JavascriptExecutor) driver;
						jsee1.executeScript("window.scrollBy(0,350)", "");
						Thread.sleep(5000);

						reservationPage.clickAccountButton();
						reservationPage.selectUserDropDown(reservationDataPage.getUser_Type());
						Thread.sleep(1000);
						if (reservationDataPage.getIsBillAccount()) {
							reservationPage.selectAccountDropDown(reservationDataPage.getAccountNumber());
						} else if (reservationDataPage.getIsPaxCCaccount()) {
							reservationPage.selectAccountDropDown(reservationDataPage.getAccountNumber());
						} else if (reservationDataPage.getIsAccountCC()) {
							reservationPage.selectAccountDropDown(reservationDataPage.getAccountNumber());
						}

					} else if (reservationDataPage.getPayment_Type().contains("Promocode")) {
						reservationPage.clickPromoCodeButton();
						reservationPage.setPromoCodeNumber(reservationDataPage.getPromo_Code());
						reservationPage.clickPromoCodeApplyButton();

					}
					// else if(reservationDataPage.getPayment_Type().contains("Credit Card"))
					{
						// reservationPage.selectUserDropDown(reservationDataPage.getUser_Type());
						// reservationPage.selectAccountDropDown("Please select");
					}

					reservationPage.clickViewQuoteButton();

					if (reservationDataPage.getPick_loc_Type().contains("AIRP")) {
						if (!reservationDataPage.getIsAirportPickupValidate())
							reservationPage.assertionViewQuoteButton_PUAirportNotValidated();
					}
					if (reservationDataPage.getPick_loc_Type().contains("Train")) {
						if (!reservationDataPage.getIsTrainPickupValidate())
							reservationPage.assertionViewQuoteButton_PUTrainNotValidated();
					}

					// Vehicle selection
					reservationPage.clickVehicleSelection(reservationDataPage.getCarType());
					//

					if (reservationDataPage.getReservation_Type().contains("Quick_Quote")) {
						reservationPage.PassengerSelectionFunction(reservationDataPage.getPax_Name(),
								reservationDataPage.getPax_Email(), reservationDataPage.getPax_mobile(),
								reservationDataPage.getPax_F_Name(), reservationDataPage.getPax_L_Name(),
								reservationDataPage.getPax_C_Name(), reservationDataPage.getPax_Title(),
								reservationDataPage.getPax_Work(), reservationDataPage.getPax_Ext());

						// reservationPage.QuickQuoteShowLink();
						// reservationPage.assertQuickQuoteTripDetails(reservationDataPage.getTrip_Type());

					}

					reservationPage.clickPaymentInfoButton();
					reservationPage.clickRateDisclaimerButton();
					reservationPage.specialInput();

					Boolean flag = reservationPage.checkMessageForPending();

					if (reservationDataPage.getPayment_Type().contains("Account")) {
						if (flag == false) {
							reservationPage.clickCreditCardRadioButton();
							reservationPage.selectCreditCardDropDown("Pay using new credit card");
							reservationPage.clickSubmitPaymentButton();
							reservationPage.selectCreditCardType(reservationDataPage.getCardType());
							reservationPage.setCreditCardNumber(reservationDataPage.getCardNumber());
							reservationPage.setCreditCardName(reservationDataPage.getName_On_Card());
							reservationPage.selectCreditCardDate(reservationDataPage.getExp_Month());
							reservationPage.selectCreditCardyear(reservationDataPage.getExp_Year());
							boolean val = driver.findElement(By.id("cvv")).isDisplayed();
							if (val) {
								reservationPage.setCVVNumber(reservationDataPage.getCard_CVV());
							}
							reservationPage.selectCreditCardCountry(reservationDataPage.getCard_Country());
							reservationPage.setCreditCardAddress(reservationDataPage.getBilling_Address());
							reservationPage.setCreditCardCity(reservationDataPage.getCity());
							reservationPage.selectCreditCardState(reservationDataPage.getState());
							reservationPage.setCreditCardZip(reservationDataPage.getPostal_Code());
							reservationPage.clickVerifyCardButton();
						} else {
							if (reservationDataPage.getIsBillAccount()) {
								reservationPage.clickAccountRadioButton();
								reservationPage.clickSubmitPaymentButton();
							} else if (reservationDataPage.getIsAccountCC()) {
								reservationPage.clickAccountRadioButton();
								reservationPage.clickSubmitPaymentButton();
							} else if (reservationDataPage.getIsPaxCCaccount()) {
								reservationPage.clickCreditCardRadioButton();
								reservationPage.selectCreditCardDropDown("Pay using new credit card");
								reservationPage.clickSubmitPaymentButton();
								reservationPage.selectCreditCardType(reservationDataPage.getCardType());
								reservationPage.setCreditCardNumber(reservationDataPage.getCardNumber());
								reservationPage.setCreditCardName(reservationDataPage.getName_On_Card());
								reservationPage.selectCreditCardDate(reservationDataPage.getExp_Month());
								reservationPage.selectCreditCardyear(reservationDataPage.getExp_Year());
								reservationPage.selectCreditCardCountry(reservationDataPage.getCard_Country());
								reservationPage.setCreditCardAddress(reservationDataPage.getBilling_Address());
								reservationPage.setCreditCardCity(reservationDataPage.getCity());
								reservationPage.selectCreditCardState(reservationDataPage.getState());
								reservationPage.setCreditCardZip(reservationDataPage.getPostal_Code());
								if (!reservationDataPage.getIsSaveToProfile()) {
									reservationPage.setToProfile();
								}
								reservationPage.clickVerifyCardButton();
							}
						}

					} else if (reservationDataPage.getPayment_Type().contains("Promocode")) {
						reservationPage.clickAccountRadioButton();
						reservationPage.clickSubmitPaymentButton();
					} else if (reservationDataPage.getPayment_Type().contains("Credit Card") || (flag == false)) {
						reservationPage.clickCreditCardRadioButton();
						reservationPage.selectCreditCardDropDown("Pay using new credit card");
						reservationPage.clickSubmitPaymentButton();
						reservationPage.selectCreditCardType(reservationDataPage.getCardType());
						reservationPage.setCreditCardNumber(reservationDataPage.getCardNumber());
						reservationPage.setCreditCardName(reservationDataPage.getName_On_Card());
						reservationPage.selectCreditCardDate(reservationDataPage.getExp_Month());
						reservationPage.selectCreditCardyear(reservationDataPage.getExp_Year());
						reservationPage.setCVVNumber(reservationDataPage.getCard_CVV());
						reservationPage.selectCreditCardCountry(reservationDataPage.getCard_Country());
						reservationPage.setCreditCardAddress(reservationDataPage.getBilling_Address());
						reservationPage.setCreditCardCity(reservationDataPage.getCity());
						reservationPage.selectCreditCardState(reservationDataPage.getState());
						reservationPage.setCreditCardZip(reservationDataPage.getPostal_Code());
						if (!reservationDataPage.getIsSaveToProfile()) {
							reservationPage.setToProfile();
						}
						reservationPage.clickVerifyCardButton();
					}
					reservationPage.saveResID(testcase);
					if (no < number) {
						reservationPage.clickBookForNextPassenger();
						Thread.sleep(4000);
					}
				}
			}
			// Single Reservation
			else {

				if (reservationDataPage.getReservation_Type().contains("Guest_Booking")) {

					reservationPage.clickGuestBookingButton();
					Thread.sleep(4000);

					// reservationPage.clickFutureTripButton();
					// reservationPage.clickImmediatePickUpButton();

					reservationPage.guestBookingFirstName(reservationDataPage.getGuestBookingFirstName());
					reservationPage.guestBookingLastName(reservationDataPage.getGuestBookingLastName());
					reservationPage.clickGuestBookingNameSave();
					reservationPage.guestBookingmobile(reservationDataPage.getGuestBookingMobilenumber());
					reservationPage.clickGuestBookingMobileSave();
				}
				if (reservationDataPage.getReservation_Type().contains("New_Reservation")) {

					Thread.sleep(4000);
					reservationPage.clickReservationButton();
					// Thread.sleep(5000);

					// reservationPage.switchToPopUp();

					// Thread.sleep(4000);
					// reservationPage.clickFutureTripButton();
					// reservationPage.clickImmediatePickUpButton();
					Thread.sleep(5000);

					if (reservationPage.noPassenger(reservationDataPage.getPax_Email(),
							reservationDataPage.getPax_mobile(), reservationDataPage.getPax_F_Name(),
							reservationDataPage.getPax_L_Name(), reservationDataPage.getPax_C_Name(),
							reservationDataPage.getPax_Title(), reservationDataPage.getPax_Work(),
							reservationDataPage.getPax_Ext()) != 1)
						reservationPage.PassengerSelectionFunction(reservationDataPage.getPax_Name(),
								reservationDataPage.getPax_Email(), reservationDataPage.getPax_mobile(),
								reservationDataPage.getPax_F_Name(), reservationDataPage.getPax_L_Name(),
								reservationDataPage.getPax_C_Name(), reservationDataPage.getPax_Title(),
								reservationDataPage.getPax_Work(), reservationDataPage.getPax_Ext());

				}

				if (reservationDataPage.getReservation_Type().contains("Quick_Quote")) {
					reservationPage.clickQuickQuoteButton();
					Thread.sleep(5000);
					reservationPage.switchToPopUp();

					Thread.sleep(4000);
					reservationPage.clickFutureTripButton();
					// reservationPage.clickImmediatePickUpButton();
					Thread.sleep(5000);
				}

				reservationPage.setNoOfPax(reservationDataPage.getNum_Pax());
				reservationPage.setNoOfBags(reservationDataPage.getNum_Bag());
				reservationPage.setPickupDate(reservationDataPage.getPickup_date());
				reservationPage.setmonth(reservationDataPage.getPickup_month());
				reservationPage.setyear(reservationDataPage.getPickup_year());
				// Trip Type Point to Point
				if (reservationDataPage.getTrip_Type().contains("PP")) {
					reservationPage.clickTransferTrip();
				} else {
					reservationPage.clickAsDirectedTrip();
				}

				// Set Pickup Location
				if (reservationDataPage.getPick_loc_Type().contains("GR")) {
					reservationPage.setPickupGroundLocation(reservationDataPage.getPick_Location(),
							reservationDataPage.getPick_loc_Type(), reservationDataPage.getPGPickup_Time(),
							reservationDataPage.getPGPickup_TimeFormat());
				} else if (reservationDataPage.getPick_loc_Type().contains("AIRP")) {
					reservationPage.setPickupAirportLocation(reservationDataPage.getPick_Location(),
							reservationDataPage.getPAirLine_Name(), reservationDataPage.getPFlight_No(),
							reservationDataPage.getIsAirportPickupValidate());
				} else if (reservationDataPage.getPick_loc_Type().contains("Train")) {
					reservationPage.setPickupTrainLocation(reservationDataPage.getPick_Location(),
							reservationDataPage.getPTCarrier_Name(), reservationDataPage.getPTrain_Number(),
							reservationDataPage.getPTArrival_Time(), reservationDataPage.getPTArrival_TimeFromat(),
							reservationDataPage.getIsTrainPickupValidate());
				} else if (reservationDataPage.getPick_loc_Type().contains("Private Aviation")) {
					reservationPage.setPrivateAviationPickup(reservationDataPage.getPick_Location(),
							reservationDataPage.getPAirLine_Name(), reservationDataPage.getPFlight_No(),
							reservationDataPage.getIsAirportPickupValidate());
				}
				Thread.sleep(2000);

				// Set Drop off Location
				if (reservationDataPage.getDrop_Loc_Type().contains("GR")) {
					reservationPage.setDropoffGroundLocation(reservationDataPage.getDrop_Location());
				} else if (reservationDataPage.getDrop_Loc_Type().contains("AIRP")) {
					reservationPage.setDropoffAirportLocation(reservationDataPage.getDrop_Location(),
							reservationDataPage.getDAirLine_Number(), reservationDataPage.getDFlight_No(),
							reservationDataPage.getIsAirportDropoffValidate().contains("Yes"));
				} else if (reservationDataPage.getDrop_Loc_Type().contains("Train")) {
					reservationPage.setDropoffTrainLocation(reservationDataPage.getDrop_Location(),
							reservationDataPage.getDTCarrier_Name(), reservationDataPage.getDTrain_Number(),
							reservationDataPage.getDTDeparture_Time(), reservationDataPage.getDTDeparture_TimeFormat(),
							reservationDataPage.getIsTrainDropoffValidate());
				} else if (reservationDataPage.getDrop_Loc_Type().contains("Private Aviation")) {
					reservationPage.setPrivateAviationDropoff(reservationDataPage.getDrop_Location(),
							reservationDataPage.getDAirLine_Number(), reservationDataPage.getDFlight_No(),
							reservationDataPage.getIsAirportDropoffValidate().contains("Yes"));
				}

				// Adding Stops
				if (reservationDataPage.getIsAddStop()) {
					int count = Integer.parseInt(reservationDataPage.getStopCount());
					List list = new ArrayList();
					list.add(reservationDataPage.getStop1_Location());
					list.add(reservationDataPage.getStop2_Location());
					list.add(reservationDataPage.getStop3_Location());

					for (int i11 = 0; i11 < count; i11++) {
						Thread.sleep(2000);
						reservationPage.clickStopslink();
						reservationPage.setPickupLocation((String) list.get(i11));
						reservationPage.clickPickupSearchedFilterLocation();
					}
				}

				if (reservationDataPage.getTrip_Type().contains("AD")) {
					Thread.sleep(5000);
					JavascriptExecutor jsee2 = (JavascriptExecutor) driver;
					jsee2.executeScript("window.scrollBy(0,350)", "");
					Thread.sleep(5000);
					// Drop off time or Trip duration
					if (reservationDataPage.getDropOff_Checked()) {
						if (reservationDataPage.getTime_Or_Duration().contains("DropoffTime")) {
							reservationPage.clickisDropoffTimeChecked();
							reservationPage.setDropoffTime(reservationDataPage.getDropOff_Time());
							if (reservationDataPage.getDropOff_TimeFormat().contains("AM")) {
								reservationPage.clickDropoffTimeAM();
							} else if (reservationDataPage.getDropOff_TimeFormat().contains("PM")) {
								reservationPage.clickDropoffTimePM();
							}
						} else if (reservationDataPage.getTime_Or_Duration().contains("Duration")) {
							reservationPage.clickisDropoffDurationChecked();
							reservationPage.setDropoffDuration(reservationDataPage.getTrip_Duration());
						}
					} else if (!reservationDataPage.getDropOff_Checked()) {
						reservationPage.clickIsDropoffChecked();
					}

					if (reservationDataPage.getIsNextDay()) {
						reservationPage.clickIsNextDay();
					}
				}
				reservationPage.setSpecialInstruction(reservationDataPage.getSpecial_Instruction());
				// Payment Method

				if (reservationDataPage.getPayment_Type().contains("Account")) {
					Thread.sleep(5000);
					JavascriptExecutor jsee2 = (JavascriptExecutor) driver;
					jsee2.executeScript("window.scrollBy(0,350)", "");
					Thread.sleep(5000);
					reservationPage.clickAccountButton();
					reservationPage.selectUserDropDown(reservationDataPage.getUser_Type());
					Thread.sleep(1000);
					if (reservationDataPage.getIsBillAccount()) {
						reservationPage.selectAccountDropDown(reservationDataPage.getAccountNumber());
					} else if (reservationDataPage.getIsPaxCCaccount()) {
						reservationPage.selectAccountDropDown(reservationDataPage.getAccountNumber());
					} else if (reservationDataPage.getIsAccountCC()) {
						reservationPage.selectAccountDropDown(reservationDataPage.getAccountNumber());
					}

				} else if (reservationDataPage.getPayment_Type().contains("Promocode")) {
					reservationPage.clickPromoCodeButton();
					reservationPage.setPromoCodeNumber(reservationDataPage.getPromo_Code());
					reservationPage.clickPromoCodeApplyButton();

				}
				/*
				 * else if(reservationDataPage.getPayment_Type().contains("Credit Card")) {
				 * reservationPage.selectUserDropDown(reservationDataPage.getUser_Type());
				 * reservationPage.selectAccountDropDown("Please select"); }
				 */
				Thread.sleep(4000);
				JavascriptExecutor jsee2 = (JavascriptExecutor) driver;
				jsee2.executeScript("window.scrollBy(0,350)", "");
				Thread.sleep(5000);

				reservationPage.clickViewQuoteButton();
				if (reservationDataPage.getPick_loc_Type().contains("AIRP")) {
					if (!reservationDataPage.getIsAirportPickupValidate())
						reservationPage.assertionViewQuoteButton_PUAirportNotValidated();
				}
				if (reservationDataPage.getPick_loc_Type().contains("Train")) {
					if (!reservationDataPage.getIsTrainPickupValidate())
						reservationPage.assertionViewQuoteButton_PUTrainNotValidated();
				}
				Thread.sleep(4000);
				// Vehicle selection
				reservationPage.clickVehicleSelection(reservationDataPage.getCarType());
				//

				if (reservationDataPage.getReservation_Type().contains("Quick_Quote")) {
					reservationPage.PassengerSelectionFunction(reservationDataPage.getPax_Name(),
							reservationDataPage.getPax_Email(), reservationDataPage.getPax_mobile(),
							reservationDataPage.getPax_F_Name(), reservationDataPage.getPax_L_Name(),
							reservationDataPage.getPax_C_Name(), reservationDataPage.getPax_Title(),
							reservationDataPage.getPax_Work(), reservationDataPage.getPax_Ext());

					// reservationPage.QuickQuoteShowLink();
					// reservationPage.assertQuickQuoteTripDetails(reservationDataPage.getTrip_Type());

				}

				Thread.sleep(3000);
				reservationPage.clickPaymentInfoButton();
				Thread.sleep(3000);
				reservationPage.clickRateDisclaimerButton();
				Thread.sleep(3000);
				reservationPage.specialInput();

				Boolean flag = reservationPage.checkMessageForPending();

				if (reservationDataPage.getPayment_Type().contains("Account")) {
					if (flag == false) {
						reservationPage.clickCreditCardRadioButton();
						reservationPage.selectCreditCardDropDown("Pay using new credit card");
						reservationPage.clickSubmitPaymentButton();
						reservationPage.selectCreditCardType(reservationDataPage.getCardType());
						reservationPage.setCreditCardNumber(reservationDataPage.getCardNumber());
						reservationPage.setCreditCardName(reservationDataPage.getName_On_Card());
						reservationPage.selectCreditCardDate(reservationDataPage.getExp_Month());
						reservationPage.selectCreditCardyear(reservationDataPage.getExp_Year());
						boolean val = driver.findElement(By.id("cvv")).isDisplayed();
						if (val) {
							reservationPage.setCVVNumber(reservationDataPage.getCard_CVV());
						}
						reservationPage.selectCreditCardCountry(reservationDataPage.getCard_Country());
						reservationPage.setCreditCardAddress(reservationDataPage.getBilling_Address());
						reservationPage.setCreditCardCity(reservationDataPage.getCity());
						reservationPage.selectCreditCardState(reservationDataPage.getState());
						reservationPage.setCreditCardZip(reservationDataPage.getPostal_Code());
						reservationPage.clickVerifyCardButton();
					} else {
						if (reservationDataPage.getIsBillAccount()) {
							reservationPage.clickAccountRadioButton();
							reservationPage.clickSubmitPaymentButton();
						} else if (reservationDataPage.getIsAccountCC()) {
							reservationPage.clickAccountRadioButton();
							reservationPage.clickSubmitPaymentButton();
						} else if (reservationDataPage.getIsPaxCCaccount()) {
							reservationPage.clickCreditCardRadioButton();
							reservationPage.selectCreditCardDropDown("Pay using new credit card");
							reservationPage.clickSubmitPaymentButton();
							reservationPage.selectCreditCardType(reservationDataPage.getCardType());
							reservationPage.setCreditCardNumber(reservationDataPage.getCardNumber());
							reservationPage.setCreditCardName(reservationDataPage.getName_On_Card());
							reservationPage.selectCreditCardDate(reservationDataPage.getExp_Month());
							reservationPage.selectCreditCardyear(reservationDataPage.getExp_Year());
							reservationPage.selectCreditCardCountry(reservationDataPage.getCard_Country());
							reservationPage.setCreditCardAddress(reservationDataPage.getBilling_Address());
							reservationPage.setCreditCardCity(reservationDataPage.getCity());
							reservationPage.selectCreditCardState(reservationDataPage.getState());
							reservationPage.setCreditCardZip(reservationDataPage.getPostal_Code());
							if (!reservationDataPage.getIsSaveToProfile()) {
								reservationPage.setToProfile();
							}
							reservationPage.clickVerifyCardButton();
						}
					}

				} else if (reservationDataPage.getPayment_Type().contains("Promocode")) {
					reservationPage.clickAccountRadioButton();
					reservationPage.clickSubmitPaymentButton();
				} else if (reservationDataPage.getPayment_Type().contains("Credit Card") || (flag == false)) {
					reservationPage.clickCreditCardRadioButton();
					reservationPage.selectCreditCardDropDown("Pay using new credit card");
					reservationPage.clickSubmitPaymentButton();
					reservationPage.selectCreditCardType(reservationDataPage.getCardType());
					reservationPage.setCreditCardNumber(reservationDataPage.getCardNumber());
					reservationPage.setCreditCardName(reservationDataPage.getName_On_Card());
					reservationPage.selectCreditCardDate(reservationDataPage.getExp_Month());
					reservationPage.selectCreditCardyear(reservationDataPage.getExp_Year());
					reservationPage.setCVVNumber(reservationDataPage.getCard_CVV());
					reservationPage.selectCreditCardCountry(reservationDataPage.getCard_Country());
					reservationPage.setCreditCardAddress(reservationDataPage.getBilling_Address());
					reservationPage.setCreditCardCity(reservationDataPage.getCity());
					reservationPage.selectCreditCardState(reservationDataPage.getState());
					reservationPage.setCreditCardZip(reservationDataPage.getPostal_Code());

					reservationPage.clickVerifyCardButton();
				}

				reservationPage.clickReservationConfirmedButton();

				// reservationPage.assertReservation();
				reservationPage.saveResID(testcase);
				if (reservationDataPage.getReservation_Type().contains("Quick_Quote")) {
					reservationPage.QuickQuoteShowLink();
					reservationPage.assertQuickQuoteTripDetails(reservationDataPage.getTrip_Type());

				}
			}

		} catch (Exception e111) {
			
			System.out.println(e111);
			System.out.println("----------- Test Failed----------------");
		}
		tearDown();
	}
	
	public void tearDown() {
		driver.quit();
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
