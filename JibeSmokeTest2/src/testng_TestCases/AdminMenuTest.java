package testng_TestCases;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import java_MenusList.AdminMenuList;

public class AdminMenuTest extends WebDriverPass
{
	
	ExtentReports report;
	ExtentTest test;

	AdminMenuList Adl=new AdminMenuList();
	
	@Test(groups="Admin",priority=0)  

	 public void CreateUser() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  			 
		  test=report.startTest("Admin-->User Management-->CreateUser");

		  Adl.CreateUser(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");
		
	  }

	@Test(groups="Admin",priority=1)  
	
	 public void UserList() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 			 
		 test=report.startTest("UserList");

		 Adl.UserList(driver);
		  
		 Assert.assertTrue(true);
		 
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");		 
    
	  }
	
	@Test(groups = "Admin", priority=2)

	public void UserVesselAssignment() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		test = report.startTest("UserVesselAssignment");

		Adl.UserVesselAssignment(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	}

	@Test(groups="Admin",priority=3)  

	 public void MenuManagement() throws Exception
	  {
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	      	   
		 
		  test=report.startTest("Admin-->Menu Management-->Create Menu");

		  Adl.MenuManagement(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");
	     
	  }


	@Test(groups = "Admin", priority = 4)

	public void UserMenuRelationship() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("UserMenuRelationship");

		Adl.UserMenuRelationship(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
 
	}
	
	@Test(groups = "Admin", priority = 5)

	public void AsyncUserMenuAssignment() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(100);

		test = report.startTest("AsyncUserMenuAssignment");

		Adl.AsyncUserMenuAssignment(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	}

	@Test(groups = "Admin", priority = 6) 

	public void AccessRightsChanges() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("AccessRightsChanges");

		Adl.AccessRightsChanges(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	}

	@Test(groups = "Admin", priority = 7)

	public void Company() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Admin-->Library-->Company");

		Adl.Company(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		
	}

	@Test(groups = "Admin", priority = 8) 

	public void Fleet() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Fleet");

		Adl.Fleet(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	}

	@Test(groups = "Admin", priority = 9)

	public void Vessels() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Vessels");

		Adl.Vessels(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	}

	@Test(groups = "Admin", priority = 10)

	public void Country() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("Country");

		Adl.Country(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
		
	}

	@Test(groups="Admin",priority=11)  

	 public void Port() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 test=report.startTest("Port");

		 Adl.Port(driver);
		  
		 Assert.assertTrue(true);
		  
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");
		
	  }


	@Test(groups="Admin",priority=12)  

	 public void Airport() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		 test=report.startTest("Airport");
		 
		  Adl.Airport(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		
	  }


	@Test(groups="Admin",priority=13) 

	 public void Currency() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		 test=report.startTest("Currency");

		  Adl.Currency(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,16,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=14) 

	 public void OfficeDepartment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("OfficeDepartment");

		  Adl.OfficeDepartment(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,17,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=15)  

	 public void ShipDepartment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("ShipDepartment");

		  Adl.ShipDepartment(driver);
		  
		  Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,18,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=16)

	 public void VesselFlag() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("VesselFlag");

		  Adl.VesselFlag(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,19,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=17) 

	 public void Timezones() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Timezones");

		  Adl.TimeZones(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,20,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=18)   

	 public void VesselType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("VesselType");

		  Adl.VesselType(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,21,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=19)   

	 public void TradingZones() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("TradingZones");

		  Adl.TradingZones(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,64,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=20)   

	 public void VesselVideos() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("VesselVideos");

		  Adl.VesselVideos(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,65,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=21)  

	 public void BunkerTestingLab() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("BunkerTestingLab");

		  Adl.BunkerTestingLab(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,22,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=22)   

	 public void VesselEEDI() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("VesselEEDI");

		  Adl.VesselEEDI(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,66,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=23)  

	 public void VesselUser() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  Thread.sleep(100);
		 
		  test=report.startTest("VesselUser");

		  Adl.VesselUser(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,67,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

		  Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

		  //driver.get(Dashboard); // if the page is not executed then it will open this url

		  Assert.assertEquals(ExpectedTitle, ActualTitle);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		  Thread.sleep(100);

	  }
	
	/*@Test(groups="Admin",priority=23)   //(groups="CreateUser",priority=26)

	 public void TestMenu() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.TestMenu(driver);

		  String ExpectedTitle=data.getData(3,67,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }*/




	@Test(groups="Admin",priority=24)  

	 public void AlertsandNotifications() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Admin-->AlertsandNotifications");

		  Adl.AlertsandNotifications(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,23,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }


	@Test(groups="Admin",priority=25)   

	 public void UserSnippetAccess() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Admin-->UserSnippetAccess");

		  Adl.UserSnippetAccess(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,24,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }


	// sub menu on Board Setting

	@Test(groups="Admin",priority=26)   

	 public void MenuAssignment() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  
		  Thread.sleep(100);
		  
		  test=report.startTest("Admin-->on Board Setting-->Menu Assignment");

		  Adl.MenuAssignment(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,26,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);
	  }

	@Test(groups="Admin",priority=27)  

	 public void ProjectMgmt() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  
		  Thread.sleep(100);
		  
		  test=report.startTest("ProjectMgmt");

		  Adl.ProjectMgmt(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,27,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=28)  

	 public void NavigationProjectMgmt() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Thread.sleep(100);
		  
		  test=report.startTest("NavigationProjectMgmt");

		  Adl.NavigationProjectMgmt(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,28,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

	      Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder

		  //driver.get(Dashboard); // if the page is not executed then it will open this url

		  Assert.assertEquals(ExpectedTitle, ActualTitle);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		  Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=29) 

	 public void LicenseKeyGeneration() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Thread.sleep(100);
		  
		  test=report.startTest("LicenseKeyGeneration");

		  Adl.LicenseKeyGeneration(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,29,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=30)   

	 public void HelpFileSettings() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Thread.sleep(100);
		  
		  test=report.startTest("HelpFileSettings");

		  Adl.HelpFileSettings(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,30,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }
	
	/*public void SystemParameters() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.HelpFileSettings(driver);

		  String ExpectedTitle=data.getData(3,42,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  } */
	
	@Test(groups="Admin",priority=31)  

	 public void DashboardSnippets() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Admin-->OfficeSettings-->DashboardSnippets");

		  Adl.DashboardSnippets(driver);
		  
		  Assert.assertTrue(true);
		  		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,43,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

		  Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

		 //driver.get(Dashboard); // if the page is not executed then it will open this url

		  Assert.assertEquals(ExpectedTitle, ActualTitle);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		  Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=32)  

	 public void UserType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("UserType");

		  Adl.UserType(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,44,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=33)  

	 public void CompanyRelationships() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("CompanyRelationships");

		  Adl.CompanyRelationships(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,45,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=34)  

	 public void UploadFileSize() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("UploadFileSize");

		  Adl.UploadFileSize(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,46,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=35)  

	 public void MailActionSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("MailActionSettings");

		  Adl.MailActionSettings(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,47,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=36) 

	 public void OfficeSyncSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("OfficeSyncSettings");

		  Adl.OfficeSyncSettings(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,48,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }
	
	
	/*@Test(groups="Admin",priority=37)   //(groups="CreateUser",priority=26)

	 public void OfficeAttachmentRule() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.OfficeAttachmentRule(driver);

		  String ExpectedTitle=data.getData(3,49,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }*/
	
	
	@Test(groups="Admin",priority=38, timeOut= 1000)   

	 public void ExceptionList() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("ExceptionList");

		  Adl.ExceptionList(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,50,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=39)   

	 public void CrewSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("CrewSettings");

		  Adl.CrewSettings(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,51,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	
	

	@Test(groups="Admin",priority=40)  

	 public void SalaryStructure() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("SalaryStructure");

		  Adl.SalaryStructure(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,32,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	
	@Test(groups="Admin",priority=41)   

	 public void VesselAttachmentRule() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("VesselAttachmentRule");

		  Adl.VesselAttachmentRule(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,52,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=42)   

	 public void CrewJoiningTypes() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("CrewJoiningTypes");

		  Adl.CrewJoiningTypes(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,33,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=43)   

	 public void StaffRemarkCategory() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("StaffRemarkCategory");

		  Adl.StaffRemarkCategory(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,34,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=44)  

	 public void ApprovalType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("ApprovalType");

		  Adl.ApprovalType(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,35,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=45)   

	 public void ApprovalGroup() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("ApprovalGroup");

		  Adl.ApprovalGroup(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,36,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }

	@Test(groups="Admin",priority=46)  

	 public void ApprovalLimit() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("ApprovalLimit");

		  Adl.ApprovalLimit(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,37,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=47)   

	 public void Department() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Department");

		  Adl.Department(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,38,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	@Test(groups="Admin",priority=48)   

	 public void MenuHelpSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
		 
		 test=report.startTest("MenuHelpSettings");

		  Adl.MenuHelpSettings(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,39,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }
	/*@Test(groups="Admin",priority=49)   //(groups="CreateUser",priority=26)

	 public void TechnicalSettings() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

		  Adl.TechnicalSettings(driver);

		  String ExpectedTitle=data.getData(3,40,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not exceuted then it will opne this url

			Assert.assertEquals(ExpectedTitle, ActuleTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);

	  }*/
	
	
	@Test(groups="Admin",priority=50)   

	 public void UserVesselAssignment1() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Admin-->UserVesselAssignment1");

		  Adl.UserVesselAssignment1(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,69,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }
	
	@Test(groups="Admin",priority=51)   

	 public void AccessRightsReport() throws Exception
	  {

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Admin-->Reports-->Access Rights Report");

		  Adl.AccessRightsReport(driver);
		  
		  Assert.assertTrue(true);
		  
	 	  test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(3,71,3).trim(); // It will taking the Expected Title name from the excel sheet.

		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.

			Adl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder

			//driver.get(Dashboard); // if the page is not executed then it will open this url

			Assert.assertEquals(ExpectedTitle, ActualTitle);

			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);

	  }

	 @AfterMethod
		public void afterMethod(ITestResult result) {
		    if (result.getStatus() == ITestResult.FAILURE) {
		        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
		    } else if (result.getStatus() == ITestResult.SKIP) {
		        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
		    } else {
		        test.log(LogStatus.PASS, "Test passed");
		    }

		    report.endTest(test);
		    report.flush();


	 }
	 
	 @BeforeSuite
	  public void worklst() {
	      report = AdminMenuList.getReporter("C:\\Users\\Arati\\workspace\\JibeTesting\\Report 2.41.2\\JIBE\\menu.html");
	  }

}
