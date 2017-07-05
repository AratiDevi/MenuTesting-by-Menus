package java_MenusList;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;

public class KPImenuList extends RW
{	
private static ExtentReports report;
    
    public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
        if (report == null) {
            report = new ExtentReports(path.concat("Report\\KPImenu.html")); //Path of generating report
            
            report
                .addSystemInfo("Host Name", "AratiD") //Environment Setup
                .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }
    
    // PI List
    
	@SuppressWarnings("unused")
	public String PIList(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu
				
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
	    Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 3, 2))).click(); // Click PI List
		
		Thread.sleep(100);
		
		String ExpectedTitle=data.getData(13,3,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
        SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url
	
	
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------
		
		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 3, 4, Result);
		
		return null;
					
	}
	
	//KPI List
	
	@SuppressWarnings("unused")
	public String KPIList(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu
				
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 4, 2))).click(); // Click KPI List
		
		Thread.sleep(100);
		
		String ExpectedTitle=data.getData(13,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
	    String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
							
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 4, 4, Result);

		return null;
			
	}
		
	// KPI Library
	
	@SuppressWarnings("unused")
	public String KPILibrary(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 5, 2))).click(); // Click KPI Library
		
		Thread.sleep(100);
		
		String ExpectedTitle=data.getData(13,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------
		
		
		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 5, 4, Result);

		return null;		
	}
		
	// KPI Consolidated
	
	@SuppressWarnings("unused")
	public String KPIConsolidated(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 6, 2))).click(); // Click KPI Consolidated
		
		Thread.sleep(100);
		
		String ExpectedTitle=data.getData(13,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
					
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url

	
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------	

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 6, 4, Result);

		return null;
			
	}
	
	// PI Details
	
	@SuppressWarnings("unused")
	public String PIDetails(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 7, 2))).click(); // Click PI Details
		
		String ExpectedTitle=data.getData(13,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url

	//  --------------------- Page LoadingTime------------------------------------------------------------------------------	
		
		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 7, 4, Result);

		return null;
				
	}
	
	// Crew Retention
	
	@SuppressWarnings("unused")
	public String CrewRetention(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 8, 2))).click(); // Click Crew Retention
		
		String ExpectedTitle=data.getData(13,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 8, 4, Result);

		return null;
	
	}
	
	// TMSA Auto Report
	
	@SuppressWarnings("unused")
	public String TMSAAutoReport(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 9, 2))).click(); // Click TMSA Auto Report
		
		String ExpectedTitle=data.getData(13,9,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	    // driver.get(Dashboard);// if the page is not executed then it will open this url
																				
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 9, 4, Result);

		return null;
		
	}
	
	// PMS Overdue
	
	@SuppressWarnings("unused")
	public String PMSOverdue(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 10, 2))).click(); // Click PMS Overdue																		

	    String ExpectedTitle=data.getData(13,10,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
      	SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 10, 4, Result);

		return null;
						
	}
		
	// Crew Retention1
	
	@SuppressWarnings("unused")
	public String CrewRetention1(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath(data.getData(13, 11, 2))).click(); // Click Crew Retention

		String ExpectedTitle=data.getData(13,11,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
			
		// driver.get(Dashboard);// if the page is not executed then it will open this url	
																	
		
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 11, 4, Result);

		return null;
			
	}
	
	// Crew Retention New
	
	@SuppressWarnings("unused")
	public String CrewRetentionNew(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 12, 2))).click(); // Click Crew Retention New
		
		String ExpectedTitle=data.getData(13,12,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	   // driver.get(Dashboard);// if the page is not executed then it will open this url


	//  --------------------- Page LoadingTime------------------------------------------------------------------------------
		
		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 12, 4, Result);

		return null;
			
	}
	
	// Vetting KPIs
	
	@SuppressWarnings("unused")
	public String VettingKPIs(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(13, 2, 2))); // Click On KPI menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(13, 13, 2))).click(); // Click Vetting KPIs

		String ExpectedTitle=data.getData(13,13,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
	    SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
	
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url

		
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(13, 13, 4, Result);

		return null;

	}

	public String SShot(String actual1, String title1, WebDriver driver1) throws IOException {

		String actual = actual1;
		String title = title1;
		WebDriver driver = driver1;

		if (title.contentEquals(actual)) {
			System.out.println(title + " page is open.\n");
		} else {

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File(path.concat("ScreenShot\\KPIMenus\\" + driver.getTitle().trim()+ "_" + System.currentTimeMillis() + ".jpg")));


			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not executed then it will open this url
			

		}

		return (null);

	}
}
