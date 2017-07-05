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
import java_MenusList.TrainingMenuList;


public class TrainingMenuTest extends WebDriverPass
{
	
	ExtentReports report;
	ExtentTest test;
	
	TrainingMenuList Trlist=new TrainingMenuList();
	
//MainMenus	Training
	
//	Sub-Menus	TrainingPrograms
	
	@Test(groups="Training_Menu",priority=282)
	 public void TrainingPrograms() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		test = report.startTest("Training--> Training Programs");
		
		Trlist.TrainingPrograms(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
	
	  }	
	
//	Sub-Menus	ItemList
	
	@Test(groups="Training_Menu",priority=283)
	 public void ItemList() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("Training--> Item List");
		
		Trlist.ItemList(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");		

		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		  } 
	
//	Sub-Menus	ScheduledProgramList
	
	@Test(groups="Training_Menu",priority=284)
	 public void ScheduledProgramList() throws Exception
	  {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 
         test=report.startTest("Training-->Scheduled Program List");
         
         Trlist.ScheduledProgramList(driver);	
		 
		 Assert.assertTrue(true);
		 
	 	 test.log(LogStatus.PASS, "Assert pass as condtion is true");

		// driver.get(Dashboard);// if the page is not executed then it will open this url
		 	 
	  } 
	
//	Sub-Menus	ProgramSyncInfo
	
	@Test(groups="Training_Menu",priority=285)
	 public void ProgramSyncInfo() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
        test=report.startTest("Training-->Program Sync Info");
        
        Trlist.ProgramSyncInfo(driver);	
		 
		Assert.assertTrue(true);
		
	 	test.log(LogStatus.PASS, "Assert pass as condtion is true");

		// driver.get(Dashboard);// if the page is not executed then it will open this url
	 	
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
	      report = TrainingMenuList.getReporter(path.concat("Report\\trainingmenu.html"));
	  }
	
}
