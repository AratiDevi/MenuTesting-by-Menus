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
import java_MenusList.TechnicalMenuList;

public class TechnicalMenuTest extends WebDriverPass 
{
	
	ExtentReports report;
	ExtentTest test;
	
	TechnicalMenuList Tech =new TechnicalMenuList();
	
	// SurveyandCertificateSettings	
	
		@Test(groups="Techincal_Menu",priority=227)
		 public void SurveyandCertificateSettings() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			 test=report.startTest("Technical--> Admin -->Survey and Certificate Settings");
			 
			 Assert.assertTrue(true);
		 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Tech.SurveyandCertificateSettings(driver);	
			   
			  String ExpectedTitle=data.getData(8,64,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not executed then it will open this url
				
				Assert.assertEquals(ExpectedTitle, ActualTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
		  }
		
	
	// ERLogThreshold
		
	@Test(groups="Techincal_Menu",priority=228)
	 public void ERLogThreshold() throws Exception
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		test=report.startTest("ERLog Threshold");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.ERLogThreshold(driver);	
					   
		  String ExpectedTitle=data.getData(8,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
						
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
						
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
						
			// driver.get(Dashboard);// if the page is not executed then it will open this url
						
			Assert.assertEquals(ExpectedTitle, ActualTitle);
						
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	
// ERLogThreshold	
	@Test(groups="Techincal_Menu",priority=229)
	 public void EquipmentList() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		test=report.startTest("Equipment List");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.EquipmentList(driver);	
		   
		  String ExpectedTitle=data.getData(8,71,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }				
	
//	WorklistAssignorList
	
	@Test(groups="Techincal_Menu",priority=230)
	 public void WorklistAssignorList() throws Exception
	  {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Worklist Assignor List");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.WorklistAssignorList(driver);	
		   
		  String ExpectedTitle=data.getData(8,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }
	
//	WorklistAccessRights
	
	@Test(groups="Techincal_Menu",priority=231)
	 public void WorklistAccessRights() throws Exception
	  {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Worklist Access Rights");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.WorklistAccessRights(driver);	
		   
		  String ExpectedTitle=data.getData(8,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);  
	  }
	
//	InspectionType
	
	@Test(groups="Techincal_Menu",priority=232)
	 public void InspectionType() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		test=report.startTest("Inspection Type");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.InspectionType(driver);	
		   
		  String ExpectedTitle=data.getData(8,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }	
	
//	SuperAttendingVessel
	
	@Test(groups="Techincal_Menu",priority=233)
	 public void SuperAttendingVessel() throws Exception
	  {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Super Attending Vessel");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.SuperAttendingVessel(driver);	
		   
		  String ExpectedTitle=data.getData(8,65,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
		
//	InspVesselAssignment
	
	@Test(groups="Techincal_Menu",priority=234)
	 public void InspVesselAssignment() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Insp Vessel Assignment");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.InspVesselAssignment(driver);	
		   
		  String ExpectedTitle=data.getData(8,11,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	AlarmUnit
	
	@Test(groups="Techincal_Menu",priority=235)
	 public void AlarmUnit() throws Exception
	  {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Alarm Unit");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.AlarmUnit(driver);	
		   
		  String ExpectedTitle=data.getData(8,13,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);  
	  }
	
//	AlarmEffect
	
	@Test(groups="Techincal_Menu",priority=236)
	 public void AlarmEffect() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Alarm Effect");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.AlarmEffect(driver);	
		   
		  String ExpectedTitle=data.getData(8,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);  
	  }
	
//	PMSAccess
	
	@Test(groups="Techincal_Menu",priority=237)
	 public void PMSAccess() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("PMS Access");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.PMSAccess(driver);	
		   
		  String ExpectedTitle=data.getData(8,66,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);  
	  }
	
//	FunctionLibrary
	
	@Test(groups="Techincal_Menu",priority=238)
	 public void FunctionLibrary() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Function Library");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.FunctionLibrary(driver);	
		   
		  String ExpectedTitle=data.getData(8,67,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);  
	  }	
	
// PMS Menus----------------------------------	
	
//	Jobs Status
	
	@Test(groups="Technical_menu",priority=239)
	 public void JobsStatus() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Technical-->PMS-->Jobs Status");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.JobsStatus(driver);	
		   
		  String ExpectedTitle=data.getData(8,16,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	Jobs History
	
	@Test(groups="Technical_menu",priority=240)
	 public void JobsHistory() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		test=report.startTest("Jobs History");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.JobsHistory(driver);	
		   
		  String ExpectedTitle=data.getData(8,17,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	Jobs Library
	
	@Test(groups="Technical_menu",priority=241)
	 public void JobsLibrary() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Jobs Library");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.JobsLibrary(driver);	
		   
		  String ExpectedTitle=data.getData(8,18,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	Job Change Request
	
	@Test(groups="Technical_menu",priority=242)
	 public void JobChangeRequest() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Job Change Request");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.JobChangeRequest(driver);	
		   
		  String ExpectedTitle=data.getData(8,19,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	Machinery Change Request
	
	@Test(groups="Technical_menu",priority=243)
	 public void MachineryChangeRequest() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Machinery Change Request");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.MachineryChangeRequest(driver);	
		   
		  String ExpectedTitle=data.getData(8,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
//	Jobs updating Detailed status
	
	@Test(groups="Technical_menu",priority=244)
	 public void JobsupdatingDetailedstatus() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Jobs updating Detailed status");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.JobsupdatingDetailedstatus(driver);	
		   
		  String ExpectedTitle=data.getData(8,21,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
//	Jobs updating Daily progress
	
	@Test(groups="Technical_menu",priority=245)
	 public void JobsupdatingDailyprogress() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Jobs updating Daily progress");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.JobsupdatingDailyprogress(driver);	
		   
		  String ExpectedTitle=data.getData(8,22,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	UnPlannned Job Details
	
	@Test(groups="Technical_menu",priority=246)
	 public void UnPlannnedJobDetails() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("UnPlannned Job Details");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.UnPlannnedJobDetails(driver);	
		   
		  String ExpectedTitle=data.getData(8,23,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
//	Equipment Statistics
	
	@Test(groups="Technical_menu",priority=247)
	 public void EquipmentStatistics() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Equipment Statistics");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.EquipmentStatistics(driver);	
		   
		  String ExpectedTitle=data.getData(8,24,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	Critical Equipments
	
	@Test(groups="Technical_menu",priority=248)
	 public void CriticalEquipments() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Critical Equipments");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.CriticalEquipments(driver);	
		   
		  String ExpectedTitle=data.getData(8,25,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	Equipment Repl History
	
	@Test(groups="Technical_menu",priority=249)
	 public void EquipmentReplHistory() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Equipment Repl History");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.EquipmentReplHistory(driver);	
		   
		  String ExpectedTitle=data.getData(8,26,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
//	Machinery Running Hours
	
	@Test(groups="Technical_menu",priority=250)
	 public void MachineryRunningHours() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Machinery Running Hours");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.MachineryRunningHours(driver);	
		   
		  String ExpectedTitle=data.getData(8,27,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	Manage System
	
	@Test(groups="Technical_menu",priority=251)
	 public void ManageSystem() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		test=report.startTest("Manage System");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.ManageSystem(driver);	
		   
		  String ExpectedTitle=data.getData(8,28,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
			 
	  }
	
//	Copy Run Hour	
	
	@Test(groups="Technical_menu",priority=252)
	 public void CopyRunHour() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Copy Run Hour");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.CopyRunHour(driver);	
		   
		  String ExpectedTitle=data.getData(8,29,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//  EngineLogBookIndex
	
	@Test(groups="Technical_menu",priority=253)
	 public void EngineLogBookIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Technical-->Engine LogBook Index");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.EngineLogBookIndex(driver);	
		   
		  String ExpectedTitle=data.getData(8,30,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
			 
	  }
	
	// Worklist
		
		// WorklistIndex
	
	@Test(groups="Technical_menu",priority=254)
	 public void WorklistIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Technical-->Worklist-->Worklist Index");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.WorklistIndex(driver);	
		   
		  String ExpectedTitle=data.getData(8,32,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
		// WorklistCalendar
	
	@Test(groups="Technical_menu",priority=255)
	 public void WorklistCalendar() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Worklist Calendar");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.WorklistCalendar(driver);	
		   
		  String ExpectedTitle=data.getData(8,33,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder	
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);		
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
			 
			 driver.get(Dashboard);// if the page is not executed then it will open this url
	  }
	
		// PSCSIRE
	
	@Test(groups="Technical_menu",priority=256)
	 public void PSCSIRE() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("PSC SIRE");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.PSCSIRE(driver);	
		   
		  String ExpectedTitle=data.getData(8,34,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
			 
	  }
	
	// WorklistUsageReport
	
	@Test(groups="Technical_menu",priority=257)
	 public void WorklistUsageReport() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Technical-->Worklist Usage Report");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.WorklistUsageReport(driver);	
		   
		  String ExpectedTitle=data.getData(8,35,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	// SurveyList
	
	@Test(groups="Technical_menu",priority=258)
	 public void SurveyList() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		test=report.startTest("Technical-->Survey/Certificates-->Survey List");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.SurveyList(driver);	
		   
		  String ExpectedTitle=data.getData(8,37,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  } 
	
	// Vessel Inspection
			// InspectionIndex
	
	@Test(groups="Technical_menu",priority=259)
	 public void InspectionIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Technical-->Vessel Inspection-->Inspection Index");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.InspectionIndex(driver);	
		   
		  String ExpectedTitle=data.getData(8,39,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
			 
	  }
	
		// InspectionCalendar
	
	@Test(groups="Technical_menu",priority=260)
	 public void InspectionCalendar() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Inspection Calendar");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.InspectionCalendar(driver);	
		   
		  String ExpectedTitle=data.getData(8,40,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
		// AttendanceCalendar
	
	@Test(groups="Technical_menu",priority=261)
	 public void AttendanceCalendar() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Attendance Calendar");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.AttendanceCalendar(driver);	
		   
		  String ExpectedTitle=data.getData(8,41,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
		// Questionbank
	
	@Test(groups="Technical_menu",priority=262)
	 public void Questionbank() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Question bank");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.Questionbank(driver);	
		   
		  String ExpectedTitle=data.getData(8,42,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
		// ChecklistType
	
	@Test(groups="Technical_menu",priority=263)
	 public void ChecklistType() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Checklist Type");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.ChecklistType(driver);	
		   
		  String ExpectedTitle=data.getData(8,43,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
		// Checklist
	
	@Test(groups="Technical_menu",priority=264)
	 public void Checklist() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Checklist");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.Checklist(driver);	
		   
		  String ExpectedTitle=data.getData(8,44,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
		// ChecklistCreation
	
	@Test(groups="Technical_menu",priority=265)
	 public void ChecklistCreation() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Checklist Creation");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.ChecklistCreation(driver);	
		   
		  String ExpectedTitle=data.getData(8,45,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	// InspectionYearlySummary
	
		@Test(groups="Technical_menu",priority=266)
		 public void InspectionYearlySummary() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			test=report.startTest("Inspection Yearly Summary");
			 
			 Assert.assertTrue(true);
		 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Tech.InspectionYearlySummary(driver);	
			   
			  String ExpectedTitle=data.getData(8,69,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
			  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not executed then it will open this url
				
				Assert.assertEquals(ExpectedTitle, ActualTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
				 Thread.sleep(100); 
		  }
			
	//TrendAnalysis
		
	@Test(groups="Technical_menu",priority=267)
	 public void TrendAnalysis() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Technical-->TrendAnalysis");
		 
		 Assert.assertTrue(true);
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Tech.TrendAnalysis(driver);	
		   
		  String ExpectedTitle=data.getData(8,46,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
		
	 @Test(groups="Technical_menu",priority=268)
	  public void PMSOverdue() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Technical-->Reports-->PMS Overdue");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.PMSOverdue(driver);	
		   
		  String ExpectedTitle=data.getData(8,54,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	      
	      Thread.sleep(100);   
	  }
	  
	  @Test(groups="Technical_menu",priority=269)
	  public void NearMisses() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Near Misses");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.NearMisses(driver);	
		   
		  String ExpectedTitle=data.getData(8,55,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	      
	      Thread.sleep(100);   
	  }
	  
	  @Test(groups="Technical_menu",priority=270)
	  public void IncidentsPersonnel() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Incidents Personnel");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.IncidentsPersonnel(driver);	
		   
		  String ExpectedTitle=data.getData(8,56,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      Thread.sleep(100);   
	  }
	    
	  @Test(groups="Technical_menu",priority=271)
	  public void IncidentswithInjury() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  test=report.startTest("Incidents with Injury");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.IncidentswithInjury(driver);	
		   
		  String ExpectedTitle=data.getData(8,57,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      Thread.sleep(100);   
	  }
	  
	  @Test(groups="Technical_menu",priority=272)
	  public void IncidentswithDeath() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Incidents with Death");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.IncidentswithDeath(driver);	
		   
		  String ExpectedTitle=data.getData(8,58,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	      
	      Thread.sleep(100);   
	  }
	  
	  @Test(groups="Technical_menu",priority=273)
	  public void IncidentsPollution() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Incidents Pollution");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.IncidentsPollution(driver);	
		   
		  String ExpectedTitle=data.getData(8,59,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	    
	  @Test(groups="Technical_menu",priority=274)
	  public void InternalInspections() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Internal Inspections");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.InternalInspections(driver);	
		   
		  String ExpectedTitle=data.getData(8,60,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      Thread.sleep(100);   
	  }
	  
	  @Test(groups="Technical_menu",priority=275)
	  public void PortStateControlDeficiencies() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  test=report.startTest("Port State Control Deficiencies");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.PortStateControlDeficiencies(driver);	
		   
		  String ExpectedTitle=data.getData(8,61,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      Thread.sleep(100);   
	  }
	  
	  @Test(groups="Technical_menu",priority=276)
	  public void VettingReports() throws Exception
	  
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Vetting Reports");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.VettingReports(driver);	
		   
		  String ExpectedTitle=data.getData(8,62,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      Thread.sleep(100);   
	  }
	  		
	@Test(groups="Technical_menu",priority=277)
	  public void VettingPlanner() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  test=report.startTest("Technical-->Vetting-->Vetting Reports");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.VettingPlanner(driver);	
		   
		  String ExpectedTitle=data.getData(8,48,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  	  
	  @Test(groups="Technical_menu",priority=278)
	  public void VettingIndex() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Vetting Index");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.VettingIndex(driver);	
		   
		  String ExpectedTitle=data.getData(8,49,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
	  }
	  
	  
	  @Test(groups="Technical_menu",priority=279)
	  public void ObservationIndex() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  test=report.startTest("Observation Index");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.ObservationIndex(driver);	
		   
		  String ExpectedTitle=data.getData(8,50,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      Thread.sleep(100);   
	  }
	  
	  @Test(groups="Technical_menu",priority=280)
	  public void VettingQuestionnaire() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  
		  test=report.startTest("Vetting Questionnaire");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.VettingQuestionnaire(driver);	
		   
		  String ExpectedTitle=data.getData(8,51,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
			
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      Thread.sleep(100);   
	  }
	  	  
	  @Test(groups="Technical_menu",priority=281)
	  public void VettingLibrary() throws Exception
	  	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  test=report.startTest("Vetting Library");
			 
		   Assert.assertTrue(true);
		   test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  Tech.VettingLibrary(driver);	
		   
		  String ExpectedTitle=data.getData(8,52,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		  Tech.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
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

	