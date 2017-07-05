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
import java_MenusList.KPImenuList;



public class KpiMenuTest extends WebDriverPass 
{
	
	ExtentReports report;
	ExtentTest test;
	
	KPImenuList Kml=new KPImenuList();
	
	@Test(groups="KPILIST",priority=293)
	 public void PIList() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("KPI-->PIList");

		Kml.PIList(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");
  	
	  }	
	
	@Test(groups="KPILIST",priority=294)
	 public void KPIList() throws Exception
	  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test = report.startTest("KPI-->KPIList");

		Kml.KPIList(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");
  		
	  }
	
	@Test(groups="KPILIST",priority=295)
	 public void KPILibrary() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test = report.startTest("KPI-->KPILibrary");

		Kml.KPILibrary(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");
				
	  }
	
	@Test(groups="KPILIST",priority=296)
	 public void KPIConsolidated() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test = report.startTest("KPI-->KPIConsolidated");

		Kml.KPIConsolidated(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");
  		
	  }
	
	@Test(groups="KPILIST",priority=297)
	 public void PIDetails() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test = report.startTest("KPI-->PIDetails");

		Kml.PIDetails(driver);

		Assert.assertTrue(true);

		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   
			
	  }
	
	@Test(groups="KPILIST",priority=298)
	 public void CrewRetention() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		test = report.startTest("KPI-->CrewRetention");

		Kml.CrewRetention(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");

			
	  }
	
	@Test(groups="KPILIST",priority=299)
	 public void TMSAAutoReport() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("KPI-->TMSAAutoReport");

		Kml.TMSAAutoReport(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   				
	  }
	
	@Test(groups="KPILIST",priority=300)
	 public void PMSOverdue() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("KPI-->PMSOverdue");

		Kml.PMSOverdue(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
 			
	  }
	
	@Test(groups="KPILIST",priority=301)
	 public void CrewRetention1() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("KPI-->CrewRetention1");

		Kml.CrewRetention1(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
   		
	  }
	
	@Test(groups="KPILIST",priority=302)
	 public void CrewRetentionNew() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		test = report.startTest("KPI-->CrewRetentionNew");

		Kml.CrewRetentionNew(driver);

		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condtion is true");
  			
	  }
	
	@Test(groups="KPILIST",priority=303)
	 public void VettingKPIs() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		test = report.startTest("KPI-->VettingKPIs");

		Kml.VettingKPIs(driver);

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
	      report = KPImenuList.getReporter(path.concat("Report\\KPImenu.html"));
	  }
	  
	 @AfterSuite
	public void reportesc() {
	      report.close();
	  }
}
