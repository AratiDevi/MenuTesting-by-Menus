package testng_TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import java_MenusList.AdminMenuList;
import java_MenusList.QualityMenuList;
//import java_MenusList.eFormsManuList;


public class QualityMenuTest extends WebDriverPass
{
	
	ExtentReports report;
	ExtentTest test;
	
	QualityMenuList Qml=new QualityMenuList();
	
	/* //Admin
	  @Test(groups="Quality_Menu",priority=92)
	 public void Admin() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

			Qml.Admin(driver);	
			   
			  String ExpectedTitle=data.getData(6,3,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		
	  }*/
	
	@Test(groups="Quality_Menu",priority=156)
	 public void FormTypeLibrary() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality--> Admin-->Form Type Library");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.FormTypeLibrary(driver);
   
		String ExpectedTitle=data.getData(6,33,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		// driver.get(Dashboard);// if the page is not executed then it will open this url
					
		Assert.assertEquals(ExpectedTitle, ActualTitle);
					
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    Thread.sleep(100); 
	    
	  }
	
	@Test(groups="Quality_Menu",priority=157)
	 public void FBMReadAccess() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("FBM Read Access");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.FBMReadAccess(driver);
		   
		String ExpectedTitle=data.getData(6,34,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		// driver.get(Dashboard);// if the page is not executed then it will open this url
					
		Assert.assertEquals(ExpectedTitle, ActualTitle);
					
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
	}
		
	// QMS
		
	@Test(groups="Quality_Menu",priority=158)
	 public void QMSMain() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality-->QMS -->QMS Main");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.QMSMain(driver);
	   
	    String ExpectedTitle=data.getData(6,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		// driver.get(Dashboard);// if the page is not executed then it will open this url
					
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	  		
		@Test(groups="Quality_Menu",priority=159)
	     public void QMSFileApproval() throws Exception 
	 	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("QMS File Approval");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.QMSFileApproval(driver);
		   
	    String ExpectedTitle=data.getData(6,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	  }
	  		
		@Test(groups="Quality_Menu",priority=160)
	 public void QMSSyncApproval() throws Exception
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("QMS Sync Approval");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.QMSSyncApproval(driver);
   
		String ExpectedTitle=data.getData(6,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	  
	// EMS
	 	
	 	@Test(groups="Quality_Menu",priority=161)
	     public void EMS() throws Exception
	     {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality-->EMS");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.EMS(driver);
   
	    String ExpectedTitle=data.getData(6,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
	}
	  
	// SCM
		
		@Test(groups="Quality_Menu",priority=162)
	 public void SCMAbsentees() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality-->SCM-->SCM Absentees");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.SCMAbsentees(driver);
   
		String ExpectedTitle=data.getData(6,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	  }
	  		
	@Test(groups = "Quality_Menu", priority = 163)
	public void SCMOffResp() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("SCM Off Resp");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.SCMOffResp(driver);

		String ExpectedTitle=data.getData(6,11,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100); 
		
	  }
				
	@Test(groups="Quality_Menu",priority=164)
	 public void SCMReports() throws Exception
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("SCM Reports");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.SCMReports(driver);	
				   
		String ExpectedTitle=data.getData(6,36,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		// driver.get(Dashboard);// if the page is not executed then it will open this url
					
		 Assert.assertEquals(ExpectedTitle, ActualTitle);
					
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		  }
						  
    // FBM
	 	
	 	@Test(groups="Quality_Menu",priority=165)
	   public void FBM() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality-->FBM");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.FBM(driver);
	   
		String ExpectedTitle=data.getData(6,12,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100); 
		
	  }
	  
      //	Masters Review Assignment
	 	
	 	@Test(groups="Quality_Menu",priority=166)
	      public void MastersReviewAssignment() throws Exception
	       {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality-->Masters Review Assignment");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.MastersReviewAssignment(driver);
   
		String ExpectedTitle=data.getData(6,13,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    
	    Thread.sleep(100); 
	    
	  }
	 	
      //	MST Reviews Office Response

	@Test(groups = "Quality_Menu", priority = 167)
	public void MSTReviewsOfficeResponse() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality-->MST Reviews Office Response");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.MSTReviewsOfficeResponse(driver);
   
		String ExpectedTitle=data.getData(6,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100); 
		
	  }
	  
      //	SCM Off Resp Reps
	 	
	@Test(groups = "Quality_Menu", priority = 168)
	public void SCMOffRespReps() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Quality-->SCM Off Resp Reps");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.SCMOffRespReps(driver);
	   
		String ExpectedTitle=data.getData(6,15,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		Qml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	 	
	 	
	 @Test(groups="Quality_Menu",priority=169)
	 public void FleetDrillsStatus() throws Exception
	  {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
		  
		  test=report.startTest("Quality-->Fleet Drills Status");
			 
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.FleetDrillsStatus(driver);	
				   
			 String ExpectedTitle=data.getData(6,37,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	  
//		Rest Hours
		
		@Test(groups="Quality_Menu",priority=170)
	 public void RestHourIndex() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 	
			 
			 test=report.startTest("Quality-->Rest Hours-->RestHourIndex");
			 
			  Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.RestHourIndex(driver);	
			   
			  String ExpectedTitle=data.getData(6,17,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	  
		
		@Test(groups="Quality_Menu",priority=171)
	 public void Overtime() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			 
			 test=report.startTest("Overtime");
			 
			  Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.Overtime(driver);	
			   
			  String ExpectedTitle=data.getData(6,18,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }	
	  	
				
		@Test(groups="Quality_Menu",priority=172)
	 public void Rules() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			 
			 test=report.startTest("Rules");
			 
			  Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.Rules(driver);	
			   
			  String ExpectedTitle=data.getData(6,19,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	  
		
		@Test(groups="Quality_Menu",priority=173)
	 public void RestHourReport() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
			 
			 test=report.startTest("Rest Hour Report");
			 
			  Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.RestHourReport(driver);	
			   
			  String ExpectedTitle=data.getData(6,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
		
		
	@Test(groups="Quality_Menu",priority=174)
	 public void FMSMain() throws Exception
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		 
		 test=report.startTest("Quality-->FMS-->FMS Main");
		 
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.FMSMain(driver);	
				   
			  String ExpectedTitle=data.getData(6,39,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Quality_Menu",priority=175)
	 public void FMSFileApproval() throws Exception
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

		 test=report.startTest("FMS File Approval");
		 
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Assert pass as condtion is true");
		  
			Qml.FMSFileApproval(driver);	
				   
			  String ExpectedTitle=data.getData(6,40,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Quality_Menu",priority=176)
	 public void FMSOfficeApproval() throws Exception
	 {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		 
		 test=report.startTest("FMS Office Approval");
		 
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.FMSOfficeApproval(driver);	
				   
			  String ExpectedTitle=data.getData(6,41,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	
	
	
//		FMS
		
		@Test(groups="Quality_Menu",priority=177)
	 public void FMSFormType() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
			 
			 test=report.startTest("FMS Form Type");
			 
			  Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.FMSFormType(driver);	
			   
			  String ExpectedTitle=data.getData(6,22,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		
	  }
		
		@Test(groups="Quality_Menu",priority=178)
		 public void MailSettings() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
			test=report.startTest("Mail Settings");
			 
			  Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.MailSettings(driver);	
				   
			String ExpectedTitle=data.getData(6,42,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
	 }
		
//		Job Risk Assesment
		
		@Test(groups="Quality_Menu",priority=179)
		 public void RiskAssessment() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
			test=report.startTest("Quality-->Job Risk Assesment-->Risk Assessment");
			 
			 Assert.assertTrue(true);
			 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.RiskAssessment(driver);	
				   
			String ExpectedTitle=data.getData(6,44,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
	 }
		
		@Test(groups="Quality_Menu",priority=180)
		 public void RiskAssessmentDetails() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
			test=report.startTest("Risk Assessment Details");
			 
			 Assert.assertTrue(true);
			 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.RiskAssessmentDetails(driver);	
				   
			String ExpectedTitle=data.getData(6,45,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
	 }
		
		@Test(groups="Quality_Menu",priority=181)
		 public void JRATypes() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
			test=report.startTest("JRA Types");
			 
			 Assert.assertTrue(true);
			 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.JRATypes(driver);	
				   
			String ExpectedTitle=data.getData(6,46,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
	 }
		
		@Test(groups="Quality_Menu",priority=182)
		 public void RiskRatings() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
			
			test=report.startTest("Risk Ratings");
			 
			 Assert.assertTrue(true);
			 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.RiskRatings(driver);	
				   
			String ExpectedTitle=data.getData(6,47,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
	 }
		
		@Test(groups="Quality_Menu",priority=183)
		 public void SeverityConsequences() throws Exception
		  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
			
			test=report.startTest("Severity Consequences");
			 
			 Assert.assertTrue(true);
			 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.SeverityConsequences(driver);	
				   
			String ExpectedTitle=data.getData(6,48,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			
	 }

		
		/*@Test(groups="Quality_Menu",priority=120)
	 public void RiskAssessmentMatrix() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

			Qml.RiskAssessmentMatrix(driver);	
			   
			  String ExpectedTitle=data.getData(6,24,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }*/
		
	@Test(groups="Quality_Menu",priority=184)
	 public void WorkCategory() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);
		 
		 test=report.startTest("Work Category");
		 
		 Assert.assertTrue(true);
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.WorkCategory(driver);	
				   
			 String ExpectedTitle=data.getData(6,49,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
			 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			  Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Quality_Menu",priority=185)
	 public void HazardTemplate() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		
         test=report.startTest("Hazard Template");
		 
		 Assert.assertTrue(true);
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.HazardTemplate(driver);	
				   
		 String ExpectedTitle=data.getData(6,50,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
		 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			 Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Quality_Menu",priority=186)
	 public void ApprovalConfiguration() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		
		test=report.startTest("Approval Configuration");
		 
		 Assert.assertTrue(true);
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Qml.ApprovalConfiguration(driver);	
				   
		 String ExpectedTitle=data.getData(6,51,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
		 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
			 Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
		
		
//		Environmental KPI
	
	@Test(groups="Quality_Menu",priority=187)
	 public void CO2EFFICIENCY() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			 
			 test=report.startTest("Quality-->Environmental KPI-->CO2 EFFICIENCY");
			 
			 Assert.assertTrue(true);
			 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.CO2EFFICIENCY(driver);	
			   
			  String ExpectedTitle=data.getData(6,27,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
		
		@Test(groups="Quality_Menu",priority=188)
	 public void CO2EFFICIENCYBYVESSEL() throws Exception
	  {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
			 
             test=report.startTest("CO2 EFFICIENCY BY VESSEL");
			 
			 Assert.assertTrue(true);
			 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.CO2EFFICIENCYBYVESSEL(driver);	
			   
			  String ExpectedTitle=data.getData(6,26,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
			  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
				
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
		
		@Test(groups="Quality_Menu",priority=189)
		 public void NOxEFFICIENCY() throws Exception
		  {
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
				 
				 test=report.startTest("NOx EFFICIENCY");
				 
				 Assert.assertTrue(true);
				 test.log(LogStatus.PASS, "Assert pass as condtion is true");

				Qml.NOxEFFICIENCY(driver);	
				   
				  String ExpectedTitle=data.getData(6,28,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
				  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
					Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
				// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
					Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		  }
		

	@Test(groups="Quality_Menu",priority=190)
	 public void NOxEFFICIENCYBYVESSEL() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		 
		 test=report.startTest("NOx EFFICIENCY BY VESSEL");
		 
		 Assert.assertTrue(true);
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.NOxEFFICIENCYBYVESSEL(driver);	
				   
			  String ExpectedTitle=data.getData(6,29,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
				String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Quality_Menu",priority=191)
	 public void SOxEFFICIENCY() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		 
          test=report.startTest("SOx EFFICIENCY");
		 
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.SOxEFFICIENCY(driver);	
				   
			  String ExpectedTitle=data.getData(6,30,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
				String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Quality_Menu",priority=192)
	 public void SOxEFFICIENCYBYVESSEL() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
		 
		 test=report.startTest("SOx EFFICIENCY BY VESSEL");
		 
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Assert pass as condtion is true");

			Qml.SOxEFFICIENCYBYVESSEL(driver);	
				   
			  String ExpectedTitle=data.getData(6,31,3).trim(); // It will taking the Expected Title name from the excel sheet.
					
				String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
					
				Qml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
			// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
					
				Assert.assertEquals(ExpectedTitle, ActuleTitle);
					
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
		
		
		
	/*
	@Test(groups="Quality_Menu",priority=80)
	 public void QuestionBank() throws Exception
	  {
		
	  }*/
	
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
	  
	 /* @AfterSuite
	public void reportesc() {
	      report.close();
	  }*/

}
