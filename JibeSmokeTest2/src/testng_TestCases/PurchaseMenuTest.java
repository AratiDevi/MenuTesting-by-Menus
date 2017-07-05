package testng_TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import java.util.concurrent.TimeUnit;

import common_Function.WebDriverPass;
import java_MenusList.AdminMenuList;
import java_MenusList.PurchaseMenuList;

public class PurchaseMenuTest extends WebDriverPass
{
	ExtentReports report;
	ExtentTest test;
	
	PurchaseMenuList PurchMenu =new PurchaseMenuList();
	
	 // Purchase
 	// admin

	@Test(groups="Purchase_menu",priority=193)
	 public void LOTestingLabList() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase-->Admin-->LO Testing Lab List");

		PurchMenu.LOTestingLabList(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,49,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }
	
	// Location
	@Test(groups = "Purchase_menu", priority = 194)
	public void Location() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("Location");

		PurchMenu.Location(driver);	
		
		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
		  String ExpectedTitle=data.getData(7,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }

	// Catalogue/Items
	
	@Test(groups = "Purchase_menu", priority = 195)
	public void CatalogueItems() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("CatalogueItems");

		PurchMenu.CatalogueItems(driver);
		
		Assert.assertTrue(true);
		
	    test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   
		  String ExpectedTitle=data.getData(7,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }

	// Set Item's Min Max Qty
	
	@Test(groups = "Purchase_menu", priority = 196)
	public void SetItemsMinMaxQty() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("SetItemsMinMaxQty");

		PurchMenu.SetItemsMinMaxQty(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
	
     //Unit Packings
	
	@Test(groups = "Purchase_menu", priority = 197)
	public void UnitPackings() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("UnitPackings");

		PurchMenu.UnitPackings(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }	
	
	//Purchase Questionnaire
	
	@Test(groups = "Purchase_menu", priority = 198)
	public void PurchaseQuestionnaire() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase Questionnaire");

		PurchMenu.PurchaseQuestionnaire(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
 
		  String ExpectedTitle=data.getData(7,41,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
		
	// Email Template

	@Test(groups = "Purchase_menu", priority = 199)
	public void EmailTemplate() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("EmailTemplate");

		PurchMenu.EmailTemplate(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
	    String ExpectedTitle=data.getData(7,42,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		 String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		 PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
			 Thread.sleep(100);   
		}
		
		//Purchase Settings
	
	@Test(groups = "Purchase_menu", priority = 200)
	public void PurchaseSettings() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("PurchaseSettings");

		PurchMenu.PurchaseSettings(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
  
		 String ExpectedTitle=data.getData(7,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		 String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		 PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		  AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
				
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
		  Thread.sleep(100);   
		  
	  }

	// ApprovalSetting

	@Test(groups = "Purchase_menu", priority = 201)
	public void ApprovalSetting() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("ApprovalSetting");

		PurchMenu.ApprovalSetting(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
	    String ExpectedTitle=data.getData(7,43,3).trim(); // It will taking the Expected Title name from the excel sheet.
						
		String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
						
		PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
						
		// driver.get(Dashboard);// if the page is not executed then it will open this url
						
		AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
						
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
					 
	    Thread.sleep(100);
	    
	  }
			
	// Create New Reqsn
	// Create New Reqsn
	
	@Test(groups = "Purchase_menu", priority = 202)
	public void CreateNewReqsn() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase-->Create New Reqsn");

		PurchMenu.CreateNewReqsn(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
  
		  String ExpectedTitle=data.getData(7,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
	
//	Purchase Process
	//Purchase Process
	
	@Test(groups="Purchase_menu",priority=203)
	 public void PurchaseProcess() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		test=report.startTest("Purchase-->PurchaseProcess");

		PurchMenu.PurchaseProcess(driver);
		
		Assert.assertTrue(true);
		
	    test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   
		  String ExpectedTitle=data.getData(7,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
	
	// Reports
	// View Reqsn Summary

	@Test(groups = "Purchase_menu", priority = 204)
	public void ViewReqsnSummary() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase-->Reports-->View Reqsn Summary");

		PurchMenu.ViewReqsnSummary(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,12,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }

	// View Reqsn Attachments
	@Test(groups = "Purchase_menu", priority = 205)
	public void ViewReqsnAttachments() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("ViewReqsnAttachments");

		PurchMenu.ViewReqsnAttachments(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,13,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
	
	// View Reqsn Onhold History

	@Test(groups = "Purchase_menu", priority = 206)
	public void ViewReqsnOnholdHistory() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("ViewReqsnOnholdHistory");

		PurchMenu.ViewReqsnOnholdHistory(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
	
	// Inventory Details
	
	@Test(groups = "Purchase_menu", priority = 207)
	public void InventoryDetails() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("InventoryDetails");

		PurchMenu.InventoryDetails(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
 
		  String ExpectedTitle=data.getData(7,15,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100); 
			 
	  }
	
	// Machinery Listing

	@Test(groups = "Purchase_menu", priority = 208, timeOut = 2000)
	public void MachineryListing() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		test = report.startTest("MachineryListing");

		PurchMenu.MachineryListing(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
		  String ExpectedTitle=data.getData(7,16,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		 driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }
	
	// Purchase Report

	@Test(groups = "Purchase_menu", priority = 209)
	public void PurchaseReport() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("PurchaseReport");

		PurchMenu.PurchaseReport(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
		  String ExpectedTitle=data.getData(7,17,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);
			 
	  }

	// InvoiceSummaryReport

	@Test(groups = "Purchase_menu", priority = 210)
	public void InvoiceSummaryReport() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("InvoiceSummaryReport");

		PurchMenu.InvoiceSummaryReport(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
 
		String ExpectedTitle=data.getData(7,46,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
	    String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
				
		AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
				
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		  }
				
	// Stale PO Report

	@Test(groups = "Purchase_menu", priority = 211)
	public void StalePOReport() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("StalePOReport");

		PurchMenu.StalePOReport(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
		  String ExpectedTitle=data.getData(7,18,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }
	
    // Logistic PO	
     // Create Logistic PO
	
	@Test(groups="Purchase_menu",priority=212)
	 public void CreateLogisticPO() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase-->Logistic PO-->CreateLogisticPO");

		PurchMenu.CreateLogisticPO(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
 
		  String ExpectedTitle=data.getData(7,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
	
	// View Logistic PO
	
	@Test(groups = "Purchase_menu", priority = 213)
	public void ViewLogisticPO() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("ViewLogisticPO");

		PurchMenu.ViewLogisticPO(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
		  String ExpectedTitle=data.getData(7,21,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }
	
	// Contract Pricing
	// Create new Contract
	
	@Test(groups = "Purchase_menu", priority = 214)
	public void ContractPricing() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase-->Contract Pricing-->Create new Contract");

		PurchMenu.ContractPricing(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,23,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }
	
	// Contract List

	@Test(groups = "Purchase_menu", priority = 215)
	public void ContractList() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("ContractList");

		PurchMenu.ContractList(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
		  String ExpectedTitle=data.getData(7,24,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);   
	  }

	// Non Contract items

	@Test(groups = "Purchase_menu", priority = 216)
	public void NonContractitems() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("NonContractitems");

		PurchMenu.NonContractitems(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
		  String ExpectedTitle=data.getData(7,25,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url

		AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	
	// Copy Contract
	
	@Test(groups="Purchase_menu",priority=217)
	 public void CopyContract() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("CopyContract");

		PurchMenu.CopyContract(driver);	
		
		Assert.assertTrue(true);
		
	    test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   
		  String ExpectedTitle=data.getData(7,26,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }

	// Lube Oil Samples

	@Test(groups = "Purchase_menu", priority = 218)
	public void LubeOilSamples() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase-->LubeOilSamples");

		PurchMenu.LubeOilSamples(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		  String ExpectedTitle=data.getData(7,47,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
		 }
			
 /*  //Bulk Purchase
   //Bulk Purchase Index
	@Test(groups="Purechase_menu",priority=179)
	 public void BulkPurchaseIndex() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		PurchMenu.BulkPurchaseIndex(driver);	
		   
		  String ExpectedTitle=data.getData(7,28,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder		
			
			AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
			
			driver.get(Dashboard);// if the page is not executed then it will open this url
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			  Thread.sleep(100);   
	  }*/
	// ASL

	// Supplier List
	
	@Test(groups = "Purchase_menu", priority = 219)
	public void SupplierList() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Purchase-->ASL-->SupplierList");

		PurchMenu.SupplierList(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
	   
		String ExpectedTitle=data.getData(7,34,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		 String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
				
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
			 
		  }
	
	//Supplier Group
	
	@Test(groups="Purchase_menu",priority=220)
	 public void SupplierGroup() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("SupplierGroup");

		PurchMenu.SupplierGroup(driver);
		
		Assert.assertTrue(true);
		
	    test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   
		  String ExpectedTitle=data.getData(7,30,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);
			 
	  }
		
	//Supplier Approver
	
	@Test(groups="Purchase_menu",priority=221)
	 public void SupplierApprover() throws Exception
	 
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("SupplierApprover");

		PurchMenu.SupplierApprover(driver);	
		
		Assert.assertTrue(true);
		
	    test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   
		  String ExpectedTitle=data.getData(7,31,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			 
			 Thread.sleep(100);
			 
	  }
		
	// ManageContacts

	@Test(groups = "Purchase_menu", priority = 222)
	public void ManageContacts() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("ManageContacts");

		PurchMenu.ManageContacts(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		 String ExpectedTitle=data.getData(7,35,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		 String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		 PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		 driver.get(Dashboard);// if the page is not executed then it will open this url
				
		 AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
				
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
		 
		  }
			
	//User-Type-Relationship
	
	@Test(groups="Purchase_menu",priority=223)
	 public void UserTypeRelationship() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test=report.startTest("UserTypeRelationship");

		PurchMenu.UserTypeRelationship(driver);
		
		Assert.assertTrue(true);
		
	    test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   
		  String ExpectedTitle=data.getData(7,32,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
			PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url
			
			AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Thread.sleep(100);   
	  }

	// Email Template1

	@Test(groups = "Purchase_menu", priority = 224)
	public void EmailTemplate1() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("EmailTemplate1");

		PurchMenu.EmailTemplate1(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	    String ExpectedTitle=data.getData(7,36,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				
		AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100); 
		
		  }

	// SupplierFieldsGroup

	@Test(groups = "Purchase_menu", priority = 225)
	public void SupplierFieldsGroup() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("SupplierFieldsGroup");

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		PurchMenu.SupplierFieldsGroup(driver);
		   
		 String ExpectedTitle=data.getData(7,37,3).trim(); // It will taking the Expected Title name from the excel sheet.
						
		 String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
						
		PurchMenu.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
						
		// driver.get(Dashboard);// if the page is not executed then it will open this url
						
		AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(100);
	}
		
		/*//SupplierFieldsGroup
		@Test(groups="Purechase_menu",priority=226)
		 public void EvaluationHistory() throws Exception
		 {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);

			PurchMenu.EvaluationHistory(driver);	
			Thread.sleep(1000);
			
			 String ExpectedTitle=data.getData(7,38,3).trim(); // It will taking the Expected Title name from the excel sheet.
								
			 String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
								
			 PurchMenu.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
								
			 driver.get(Dashboard);// if the page is not exceuted then it will opne this url
								
				AssertJUnit.assertEquals(ExpectedTitle, ActuleTitle);
								
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100);   
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
}
