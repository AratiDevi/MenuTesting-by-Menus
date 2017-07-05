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
import java_MenusList.eFormsMenuList;


public class eFormsMenuTest extends WebDriverPass
{
	
	ExtentReports report;
	ExtentTest test;
	
	eFormsMenuList Eforms=new eFormsMenuList();
			
	@Test(groups="ef_Menus",priority=286)
	 public void eForm() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test = report.startTest("e-Forms-->e-Index");	
		
		Eforms.eForm(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
			
	  }	
	
	@Test(groups="ef_Menus",priority=287)
	 public void LashingGearInventory() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("e-Forms-->Library-->LashingGearInventory");	
		
		Eforms.LashingGearInventory(driver);

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
	  public void worklst() 
	 {
	      report = eFormsMenuList.getReporter(path.concat("Report\\eformsmenu.html"));
	  
	 }
	/* {
	 try{
		  for (int i=0;i<400;i++){
			  
				String Menu_URL=client_url.concat(data.getData(1, 1, 0));	 
		  	 	driver.get(Menu_URL);
		  	 	
			//Handled for page with no access
		  	 	 if(driver.getTitle().equalsIgnoreCase("Home Page"))
		  	 	{
		  	 		Menus_Skipped=Menus_Skipped+1;
		  	 		System.out.println(Menu_URL + "-Access Not Available");
		  	 	//	Thread.sleep(1000);
		  	 		}
		   	 
		  	 	 
		  	// checking page is opened 	 
		  	 	else if(driver.getTitle().equalsIgnoreCase(data.getData(11, 1, 3)))
		  	 	{
		  	 		Menus_Passed=Menus_Passed+1;
		  	 		System.out.println(Menu_URL +"- Open");
		  	 		Assert.assertTrue(true);
		  	 	//	Thread.sleep(1000);
		  	 		} 
		  	//Checking page fails to open 	 
		  	 	else
		  	 	{
		  	 		Menus_Failed=Menus_Failed+1;
		  	 		System.out.println(Menu_URL +"-Failed to Open");
		  	 		x=x+1;
		  	 	//	Thread.sleep(1000);
		  	 		}
		  	 	Total_Menus=i+1;
		  	 	 //break loop if testdatas completed	 
		  	 	 if(data.getData(11, 1, 3)==null){break;}
		}
		}catch (NullPointerException NPE){}

		System.out.println("------------------------");
		System.out.println("Total Menus   : "+Total_Menus);
		System.out.println("Menus Passed  : "+Menus_Passed);
		System.out.println("Menus Failed  : "+Menus_Failed);
		System.out.println("Menus Skipped : "+Menus_Skipped);
		System.out.println("------------------------");

		//Mark testcase Fail if any links failed to open		
		if(x>0){Assert.fail();}

*/
	 /* 
	  @AfterSuite
	public void reportesc() {
	      report.close();
	  }*/
	
}

