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
import java_MenusList.HelpMenuList;

public class HelpMenuTest extends WebDriverPass
{
	ExtentReports report;
	ExtentTest test;
    
	HelpMenuList Hml =new HelpMenuList();
		
	// MainMenus	
	//  HelpCenter		
		
	@Test(groups="Help",priority=288)
	 public void Databuilding() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
										
		test = report.startTest("Help Center-->Databuilding");
		
		Hml.Databuilding(driver);
		
        Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");		 
		 
	}
		
	@Test(groups="Help",priority=289)
	public void SupportDesk555() throws Exception
	 {
				
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 				 		
		 test=report.startTest("Help Center-->SupportDesk555");
		 
		 Hml.SupportDesk555(driver);
		 
		 Assert.assertTrue(true);
		 
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");	
	 	
	  }
		
	@Test(groups="Help",priority=290)
	 public void TrainingVideos() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 test=report.startTest("Help Center-->TrainingVideos");
		 
		 Hml.TrainingVideos(driver);

		 Assert.assertTrue(true);
		 
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");
	 			 	 	 		 	 		 							
     }
		
	@Test(groups="Help",priority=291)
	 public void FAQ() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 test=report.startTest("Help Center-->FAQ");
		 
		 Hml.FAQ(driver);

		 Assert.assertTrue(true);
		 
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");
	 	 			 	 	 	 
	  }
	
		//Sub-Menus	FAQTopic
	
	@Test(groups="Help",priority=292)
	 public void FAQTopic() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
		 test=report.startTest("Help Center-->FAQTopic");
		 
		 Hml.FAQTopic(driver);
		
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
      report = HelpMenuList.getReporter(path.concat("Report\\Helpmenu.html"));
  }
  
}
