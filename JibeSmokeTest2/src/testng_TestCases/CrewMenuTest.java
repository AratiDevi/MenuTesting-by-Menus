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
import java_MenusList.CrewMenuList;

public class CrewMenuTest extends WebDriverPass
{
	
	ExtentReports report;
	ExtentTest test;
	
	CrewMenuList Crl=new CrewMenuList();
	
	@Test(groups="Crew",priority=52)
	
	 public void Rankcategory() throws Exception
	  {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew--> Admin-->Rank category");

		Crl.Rankcategory(driver);

		Assert.assertTrue(true);

	 	test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   
		  String ExpectedTitle=data.getData(4,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	  }
	
	@Test(groups="Crew",priority=53)
	 public void CrewRanks() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("CrewRanks");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewRanks(driver);	
		   
		  String ExpectedTitle=data.getData(4,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=54)
	 public void JoiningType() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("JoiningType");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.JoiningType(driver);	
		   
		  String ExpectedTitle=data.getData(4,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=55)
	 public void DocumentGroup() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("DocumentGroup");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		 Crl.DocumentGroup(driver);	
		   
		  String ExpectedTitle=data.getData(4,65,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=56)
	 public void DocumentTypes() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 	
		 
		 test=report.startTest("DocumentTypes");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.DocumentTypes(driver);	
		   
		  String ExpectedTitle=data.getData(4,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=57)
	 public void CrewSignoffReason() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("CrewSignoffReason");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewSignoffReason(driver);	
		   
		  String ExpectedTitle=data.getData(4,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=58)
	 public void TrainingTypes() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("TrainingTypes");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		 Crl.TrainingTypes(driver);	
		   
		  String ExpectedTitle=data.getData(4,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=59) 
	public void CrewWelfareLibrary() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("CrewWelfareLibrary");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewWelfareLibrary(driver);	
		   
		  String ExpectedTitle=data.getData(4,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=60)
	 public void OnBoardStaffLimit() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("OnBoardStaffLimit");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.OnBoardStaffLimit(driver);

		  String ExpectedTitle=data.getData(4,11,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=61)
	 public void CompanySeniorityReward() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CompanySeniorityReward");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CompanySeniorityReward(driver);

		  String ExpectedTitle=data.getData(4,66,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=62)
	 public void SenioritySettings() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("SenioritySettings");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.SenioritySettings(driver);
  
		  String ExpectedTitle=data.getData(4,67,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=63)
	 public void ContractType() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("ContractType");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.ContractType(driver);
 
		  String ExpectedTitle=data.getData(4,12,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=64)
	 public void CrewRankScale() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewRankScale");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewRankScale(driver);
 
		  String ExpectedTitle=data.getData(4,61,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
			
	@Test(groups="Crew",priority=65)
	public void HandOverQuestion() throws Exception
	 {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("HandOverQuestion");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.HandOverQuestion(driver);
   
		  String ExpectedTitle=data.getData(4,13,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=66)
	 public void CrewContractPeriod() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewContractPeriod");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewContractPeriod(driver);
  
		  String ExpectedTitle=data.getData(4,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=67)
	 public void CashAdvanceLimit() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CashAdvanceLimit");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CashAdvanceLimit(driver);

		  String ExpectedTitle=data.getData(4,15,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=68)
	 public void Allotmentflagmailsettings() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Allotmentflagmailsettings");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.Allotmentflagmailsettings(driver);
 
		  String ExpectedTitle=data.getData(4,16,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=69)
	 public void CrewContractTemplates() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewContractTemplates");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewContractTemplates(driver);
   
		  String ExpectedTitle=data.getData(4,68,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=70)
	 public void CrewJoiningSeniority() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewJoiningSeniority");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewJoiningSeniority(driver);
   
		  String ExpectedTitle=data.getData(4,17,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }	
	
	@Test(groups="Crew",priority=71)
	 public void DocumentTypes1() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("DocumentTypes1");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.DocumentTypes1(driver);
   
		  String ExpectedTitle=data.getData(4,18,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=72)
	 public void InitializePortageBill() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("InitializePortageBill");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.InitializePortageBill(driver);
  
		  String ExpectedTitle=data.getData(4,62,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=73)
	 public void CrewCardApprovers() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewCardApprovers");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewCardApprovers(driver);

		  String ExpectedTitle=data.getData(4,19,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }	
		
	@Test(groups="Crew",priority=74)
	 public void CrewStatusLibrary() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewStatusLibrary");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewStatusLibrary(driver);
 
		  String ExpectedTitle=data.getData(4,63,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=75)
	 public void CrewStatusMapping() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewStatusMapping");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewStatusMapping(driver);
 
		  String ExpectedTitle=data.getData(4,64,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=76)
	 public void LeaveWageWithholdRule() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("LeaveWageWithholdRule");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.LeaveWageWithholdRule(driver);
  
		  String ExpectedTitle=data.getData(4,69,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=77)
	 public void OilMajors() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("OilMajors");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.OilMajors(driver);
  
		  String ExpectedTitle=data.getData(4,70,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=78)
	 public void CrewMatrixConfig() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewMatrixConfig");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewMatrixConfig(driver);
   
		  String ExpectedTitle=data.getData(4,71,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
			 
	  }
		
	@Test(groups="Crew",priority=79)
	 public void OilMajorsRuleMapping() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("OilMajorsRuleMapping");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.OilMajorsRuleMapping(driver);
   
		  String ExpectedTitle=data.getData(4,72,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
		
	@Test(groups="Crew",priority=80)
	 public void OilMajorsRuleGroup() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("OilMajorsRuleGroup");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.OilMajorsRuleGroup(driver);
	   
		  String ExpectedTitle=data.getData(4,73,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
		
	@Test(groups="Crew",priority=81)
	 public void OilMajorsRules() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("OilMajorsRules");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.OilMajorsRules(driver);
   
		  String ExpectedTitle=data.getData(4,74,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
		
	@Test(groups="Crew",priority=82)
	 public void RankConfiguration() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("RankConfiguration");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.RankConfiguration(driver);
  
		  String ExpectedTitle=data.getData(4,75,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
		
	@Test(groups="Crew",priority=83)
	 public void CrewDetailsConfiguration() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewDetailsConfiguration");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewDetailsConfiguration(driver);
  
		  String ExpectedTitle=data.getData(4,76,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	
	@Test(groups="Crew",priority=84)
	 public void UnionAndUnionBook() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("UnionAndUnionBook");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.UnionAndUnionBook(driver);
 
		  String ExpectedTitle=data.getData(4,77,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	
	@Test(groups="Crew",priority=85)
	 public void Schools() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Schools");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.Schools(driver);
   
		  String ExpectedTitle=data.getData(4,78,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	
	@Test(groups="Crew",priority=86)
	 public void RaceAndVeteranStatus() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("RaceAndVeteranStatus");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.RaceAndVeteranStatus(driver);
   
		  String ExpectedTitle=data.getData(4,79,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
	}
		
	
	@Test(groups="Crew",priority=87)
	 public void CrewIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew Index");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewIndex(driver);
  
		  String ExpectedTitle=data.getData(4,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=88)
	 public void AddNewCrew() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Add New Crew");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.AddNewCrew(driver);
  
		  String ExpectedTitle=data.getData(4,21,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
	}
	
	
	//Interview
	@Test(groups="Crew",priority=89)
	 public void CreateInterviewSheet() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew Interview -->Create Interview Sheet");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CreateInterviewSheet(driver);
 
	    String ExpectedTitle=data.getData(4,23,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
	    String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url

		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(100);
 
	  }
	
	@Test(groups="Crew",priority=90)
	 public void CategoriesandGrades() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CategoriesandGrades");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CategoriesandGrades(driver);
 
		  String ExpectedTitle=data.getData(4,24,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Thread.sleep(100);
	}
	

	@Test(groups="Crew",priority=91)
	 public void InterviewQuestionBank() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("InterviewQuestionBank");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.InterviewQuestionBank(driver);
  
		  String ExpectedTitle=data.getData(4,25,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	//Plan Interview
	@Test(groups="Crew",priority=92)
	 public void PlanInterview() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Plan Interview");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.PlanInterview(driver);
   
		  String ExpectedTitle=data.getData(4,26,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=93)
	 public void CrewPlanning() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew Planning");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewPlanning(driver);
   
		  String ExpectedTitle=data.getData(4,81,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	
	
	//Event Planner
	@Test(groups = "Crew", priority = 94)
	public void EventPlanner() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Event Planner");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.EventPlanner(driver);
	   
		  String ExpectedTitle=data.getData(4,27,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	//Event Index
	@Test(groups="Crew",priority=95)
	 public void EventIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Event Index");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.EventIndex(driver);
   
		  String ExpectedTitle=data.getData(4,28,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
//Crew Evaluation	
	
	@Test(groups="Crew",priority=96)
	 public void EvaluationSchedules() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100);
		 
		 test=report.startTest("Crew-->Crew Evaluation -->Evaluation Schedules");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.EvaluationSchedules(driver);	
		   
		  String ExpectedTitle=data.getData(4,30,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=97)
	 public void EvaluationPlanning() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("Evaluation Planning");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.EvaluationPlanning(driver);	
		   
		  String ExpectedTitle=data.getData(4,31,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=98)
	 public void Library() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("Library");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		 Crl.Library(driver);	
		   
		  String ExpectedTitle=data.getData(4,32,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=99)
	 public void QuestionBank() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest("QuestionBank");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		 Crl.QuestionBank(driver);	
		   
		  String ExpectedTitle=data.getData(4,33,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=100)
	 public void EvaluationConfiguration() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Evaluation Configuration");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.EvaluationConfiguration(driver);
   
		  String ExpectedTitle=data.getData(4,84,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
		
	@Test(groups="Crew",priority=101)
	 public void EvaluationSnippetSettings() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100); 
		 
		 test=report.startTest(">Evaluation Snippet Settings");
			
		 Assert.assertTrue(true);
		 
		 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.EvaluationSnippetSettings(driver);	
		   
		  String ExpectedTitle=data.getData(4,85,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
			 
	  }	

//	Crew Accounts	
	@Test(groups="Crew",priority=102)
	 public void PortageBill() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew Accounts -->Portage Bill");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.PortageBill(driver);

		  String ExpectedTitle=data.getData(4,35,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
		
	  }
	@Test(groups="Crew",priority=103)
	 public void SalarybyWireTransfer() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("SalarybyWireTransfer");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.PortageBill(driver);

		Crl.SalarybyWireTransfer(driver);
  
		  String ExpectedTitle=data.getData(4,36,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
			 
	  }

	@Test(groups="Crew",priority=104)
	 public void CTMIndex() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CTMIndex");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CTMIndex(driver);
   
		  String ExpectedTitle=data.getData(4,37,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=105)
	 public void VesselMinumumCTM() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Vessel Minumum CTM");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.VesselMinumumCTM(driver);
   
		  String ExpectedTitle=data.getData(4,38,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=106)
	 public void RankWageContract() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("RankWageContract");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.RankWageContract(driver);
   
		  String ExpectedTitle=data.getData(4,39,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
	  }
	
	@Test(groups="Crew",priority=107)
	 public void eCardKitty() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("eCardKitty");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.eCardKitty(driver);
   
		  String ExpectedTitle=data.getData(4,40,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=108)
	 public void eCardRequest() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("eCardRequest");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.eCardRequest(driver);
   
		  String ExpectedTitle=data.getData(4,41,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=109)
	 public void eCardReport() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("eCardReport");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.eCardReport(driver);

		  String ExpectedTitle=data.getData(4,42,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=110)
	 public void CrewWelfareLibrary1() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewWelfareLibrary1");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewWelfareLibrary1(driver);
	   
		  String ExpectedTitle=data.getData(4,43,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=111)
	 public void ApproveRejoiningBonus() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("ApproveRejoiningBonus");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.ApproveRejoiningBonus(driver);
   
		  String ExpectedTitle=data.getData(4,44,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=112)
	 public void CompanySeniorityReward1() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CompanySeniorityReward1");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CompanySeniorityReward1(driver);
   
		  String ExpectedTitle=data.getData(4,45,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
//	CrewAgencyFee
	
	@Test(groups="Crew",priority=113)
	 public void CrewAgencyFeeLibrary() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew Agency Fee -->Crew Agency Fee Library");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewAgencyFeeLibrary(driver);
  
		  String ExpectedTitle=data.getData(4,47,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=114)
	 public void CrewAgencyFeeReport() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewAgencyFeeReport");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewAgencyFeeReport(driver);
   
		  String ExpectedTitle=data.getData(4,48,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);
			 
	  }
	
	//Card Index
	@Test(groups="Crew",priority=115)
	 public void CrewCardIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->CrewCardIndex");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewCardIndex(driver);
  
		  String ExpectedTitle=data.getData(4,49,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=116)
	 public void CrewListHistory() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->CrewListHistory");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewListHistory(driver);
   
		  String ExpectedTitle=data.getData(4,50,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	// Crew Mail System
	
	@Test(groups="Crew",priority=117)
	 public void CrewMailSystem() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew Mail System -->Crew Mail Index");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewMailSystem(driver);
   
		  String ExpectedTitle=data.getData(4,52,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=118)
	 public void CrewMailAdmin() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew Mail Admin");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewMailAdmin(driver);
   
		  String ExpectedTitle=data.getData(4,53,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=119)
	 public void CrewFeedbackViewer() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Reports -->Crew Feedback Viewer");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewFeedbackViewer(driver);
	   
		  String ExpectedTitle=data.getData(4,55,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	

	@Test(groups="Crew",priority=120)
	 public void CrewMedicalHistoryViewer() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewMedicalHistoryViewer");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewMedicalHistoryViewer(driver);
   
		  String ExpectedTitle=data.getData(4,56,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=121)
	 public void CrewMissingDataReport() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewMissingDataReport");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewMissingDataReport(driver);
   
		  String ExpectedTitle=data.getData(4,57,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	@Test(groups="Crew",priority=122)
	 public void CrewRetentionRate() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CrewRetentionRate");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewRetentionRate(driver);
	   
		  String ExpectedTitle=data.getData(4,58,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	
	@Test(groups="Crew",priority=123)
	 public void HandOverReports() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->HandOver Reports");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.HandOverReports(driver);
   
		  String ExpectedTitle=data.getData(4,87,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
	  }
	
	
	 @Test(groups="Crew",priority=124)
	 public void Crewadmin() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew admin");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.Crewadmin(driver);
   
		  String ExpectedTitle=data.getData(4,88,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100); 
			 
	  }
	 	 
	 @Test(groups="Crew",priority=125)
	 public void CrewMatrix() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Crew-->Crew Matrix");

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		Crl.CrewMatrix(driver);
 
		  String ExpectedTitle=data.getData(4,89,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			Crl.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
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
