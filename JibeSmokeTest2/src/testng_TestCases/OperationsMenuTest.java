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
import java_MenusList.OperationsMenuList;


public class OperationsMenuTest extends WebDriverPass
{
	
	ExtentReports report;
	ExtentTest test;
  
	OperationsMenuList Oml =new OperationsMenuList();
	 
	// Admin 
	//WaterInHoldTank
	
	@Test(groups="Operation_Menu",priority=126)
	 public void WaterInHoldTank() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Admin-->WaterInHoldTank");

		Oml.WaterInHoldTank(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	  String ExpectedTitle=data.getData(5,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
		
	  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		
	// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Thread.sleep(100); 
	  }
	
	
	@Test(groups="Operation_Menu",priority=127)
	 public void DeckLogBookThreshold() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("DeckLogBookThreshold");

		Oml.DeckLogBookThreshold(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	  String ExpectedTitle=data.getData(5,20,3).trim(); // It will taking the Expected Title name from the excel sheet.
		
	  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		
	// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100); 
	  }
	
	
	@Test(groups = "Operation_Menu", priority = 128)
	public void PiracyAlarmSettings() throws Exception 
	{		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("PiracyAlarmSettings");

		Oml.PiracyAlarmSettings(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

	  String ExpectedTitle=data.getData(5,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
		
	  String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		
	// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 Thread.sleep(100); 
	  }			
			
			//VslGeneralParameters
	@Test(groups = "Operation_Menu", priority = 129)
	public void VslGeneralParameters() throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("VslGeneralParameters");

		Oml.VslGeneralParameters(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 6, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
													
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will open this url
	
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	}		

	@Test(groups = "Operation_Menu", priority = 130)
	public void ReportsRankConfig() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("ReportsRankConfig");

		Oml.ReportsRankConfig(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 21, 3).trim(); // It will taking the Expected Title name from the excel sheet.
															
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will Open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	}

    //Sub-Menus	VoyageReports
    //DailyReportIndex

	@Test(groups = "Operation_Menu", priority = 131)
	public void DailyReportIndex() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		Thread.sleep(100);

		test = report.startTest("Operation-->VoyageReports-->DailyReportIndex");

		Oml.DailyReportIndex(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 23, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}

	@Test(groups = "Operation_Menu", priority = 132)
	public void ReportIndex() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("ReportIndex");

		Oml.ReportIndex(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

        String ExpectedTitle=data.getData(5,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
        String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	    Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
       // driver.get(Dashboard);// if the page is not executed then it will open this url
	
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    
	    Thread.sleep(100); 
	    
	  }			
					
	@Test(groups = "Operation_Menu", priority = 133)
	public void CPFiguresEntry() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("CPFiguresEntry");

		Oml.CPFiguresEntry(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

        String ExpectedTitle=data.getData(5,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
        String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
    	Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
       // driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	   Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	   
	   Thread.sleep(100); 
	   
	  }	

	@Test(groups = "Operation_Menu", priority = 134)
	public void BunkerReport() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("BunkerReport");

		Oml.BunkerReport(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 24, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will Open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
		
	@Test(groups = "Operation_Menu", priority = 135)
	public void PortReport() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("PortReport");

		Oml.PortReport(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 25, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}

	@Test(groups = "Operation_Menu", priority = 136)
	public void ReportIndexChemical() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("ReportIndexChemical");

		Oml.ReportIndexChemical(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 26, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
		
		// driver.get(Dashboard);// if the page is not executed then it will Open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
			
	// Sub-Menus BunkerSampleReports
	
	@Test(groups = "Operation_Menu", priority = 137)
	public void BunkerSampleReports() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Bunker Sample Reports");

		Oml.BunkerSampleReports(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 10, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will Open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}

	// Sub-Menus BunkerSampleReports
	
	@Test(groups = "Operation_Menu", priority = 138)
	public void BunkerSampleLab() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Bunker Sample Lab");

		Oml.BunkerSampleLab(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 27, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will Open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	  	
//Sub-Menus	BunkerAttachments
/*@Test(groups="Operation_Menu",priority=85)
	 public void BunkerAttachments() throws Exception
	  {
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 		

	Oml.BunkerAttachments(driver);	
   
  String ExpectedTitle=data.getData(5,11,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
  String ActuleTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	Oml.SShot(ExpectedTitle, ActuleTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
// driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	Assert.assertEquals(ExpectedTitle, ActuleTitle);
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Thread.sleep(100); 
	 
	 driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	  }	*/
	  
	  	
// Sub-Menus	DeckLogBook
	
	@Test(groups = "Operation_Menu", priority = 139)
	public void DeckLogBook() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Deck Log Book");

		Oml.DeckLogBook(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 12, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	}

	// DeckLogBookLibHoldTank
	@Test(groups = "Operation_Menu", priority = 140)
	public void DeckLogBookLibHoldTank() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Deck Log Book Lib Hold Tank");

		Oml.DeckLogBookLibHoldTank(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 28, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	}
		
//	 		Vessel Movement
		
	@Test(groups = "Operation_Menu", priority = 141)
	public void PortCallsNew() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Vessel Movement-->PortCallsNew");

		Oml.PortCallsNew(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

        String ExpectedTitle=data.getData(5,14,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
        String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	    Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
        // driver.get(Dashboard);// if the page is not executed then it will open this url
	
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	   
	   Thread.sleep(100); 
	  }			
			
	@Test(groups = "Operation_Menu", priority = 142)
	public void PortCalls() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("PortCalls");

		Oml.PortCalls(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

        String ExpectedTitle=data.getData(5,15,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
        String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	    Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
        // driver.get(Dashboard);// if the page is not exceuted then it will opne this url
	
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    Thread.sleep(100); 
	    
	  }

	@Test(groups = "Operation_Menu", priority = 143)
	public void PortCost() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("PortCost");

		Oml.PortCost(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 30, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will open this url
	
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}

	@Test(groups = "Operation_Menu", priority = 144)
	public void PortCallHistory() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("PortCallHistory");

		Oml.PortCallHistory(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 31, 3).trim(); // It will taking the Expected Title name from the excel sheet.																

		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
	}

			
	@Test(groups = "Operation_Menu", priority = 145)
	public void PortCallNotification() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("PortCallNotification");

		Oml.PortCallNotification(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

        String ExpectedTitle=data.getData(5,16,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
        String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	    Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
        // driver.get(Dashboard);// if the page is not executed then it will open this url
	
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    
	    Thread.sleep(100); 
	    
	  }	

	@Test(groups = "Operation_Menu", priority = 146)
	public void PortCalls1() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("PortCalls1");

		Oml.PortCalls1(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 37, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);
		
	}
	// Sub-Menus	DPLMap
	 				
	@Test(groups = "Operation_Menu", priority = 147)
	public void DPLMap() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->DPLMap");

		Oml.DPLMap(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 17, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		driver.get(Dashboard); // if the page is not executed then it will open this url
								
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	}
		// Sub-Menus	AddVoyageNumber
	 				
	@Test(groups = "Operation_Menu", priority = 148)
	public void AddVoyageNumber() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Add Voyage Number");

		Oml.AddVoyageNumber(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 18, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
		// driver.get(Dashboard);// if the page is not executed then it will open this url
	
		Assert.assertEquals(ExpectedTitle, ActualTitle);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

	}
		
	@Test(groups = "Operation_Menu", priority = 149)
	public void DeckLogBookThreshold1() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Deck LogBook Threshold1");

		Oml.DeckLogBookThreshold1(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

        String ExpectedTitle=data.getData(5,35,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
        String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	    Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
        // driver.get(Dashboard);// if the page is not executed then it will open this url
	
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    
	    Thread.sleep(100); 
 }

	@Test(groups = "Operation_Menu", priority = 150)
	public void Worklist() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->Worklist");

		Oml.Worklist(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

        String ExpectedTitle=data.getData(5,32,3).trim(); // It will taking the Expected Title name from the excel sheet.
	
        String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
	
	    Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
        // driver.get(Dashboard);// if the page is not executed then it will open this url
	
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    
	    Thread.sleep(100); 
 }



	@Test(groups = "Operation_Menu", priority = 151)
	public void LOSample() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		test = report.startTest("Operation-->LO Analysis-->LO Sample");

		Oml.LOSample(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

		String ExpectedTitle = data.getData(5, 34, 3).trim(); // It will taking the Expected Title name from the excel sheet.
																
		String ActualTitle = driver.getTitle().trim(); // taking the actual title name by the web site.
														
		Oml.SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
														
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
