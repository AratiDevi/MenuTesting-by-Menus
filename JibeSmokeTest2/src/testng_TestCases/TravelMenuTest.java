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
import java_MenusList.TravelMenuList;

public class TravelMenuTest extends WebDriverPass
{
		
	ExtentReports report;
	ExtentTest test;
	TravelMenuList Tml= new TravelMenuList();
	
	//Travel
				
	@Test(groups="Travel_Menu",priority=152)
	 public void TravelQtnUserAssignment() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 				 
		 test=report.startTest("Travel-->Admin-->Travel Qtn User Assignment");
		 
		 Tml.TravelQtnUserAssignment(driver);
		 
		 Assert.assertTrue(true);
		 
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");
		   	     
	  }
	
//		New Travel Request
	 			
	@Test(groups = "Travel_Menu", priority = 153)
	public void NewTravelRequest() throws Exception  
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("Travel-->NewTravelRequest");

		Tml.NewTravelRequest(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
  	
	 }
	//  Travel Request Index
	 		 		
	@Test(groups="Travel_Menu",priority=154)
	 public void TravelRequestIndex() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Travel-->TravelRequestIndex");

		Tml.TravelRequestIndex(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");
	  	
	  }
	
//		Refund List
	
	@Test(groups="Travel_Menu",priority=155)
	 public void RefundList() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("Travel-->RefundList");

		Tml.RefundList(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");
	 			
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
	      report = TravelMenuList.getReporter(path.concat("Report\\Travelmenu.html"));
	  }
	  
	
}
