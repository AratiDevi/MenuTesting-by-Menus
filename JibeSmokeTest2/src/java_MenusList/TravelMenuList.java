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

public class TravelMenuList extends RW {
	
private static ExtentReports report;
    
    public synchronized static ExtentReports getReporter(String filePath) { ////allow only one thread to access the shared resource,To prevent thread interference.
        if (report == null) {
            report = new ExtentReports(path.concat("Report\\Travelmenu.html")); //Path of generating report
            
            report
                .addSystemInfo("Host Name", "AratiD") //Environment Setup
                .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }
	
	// Travel
	// Admin link

	@SuppressWarnings("unused")
	public String TravelQtnUserAssignment(WebDriver driver1) throws Exception 
	{
		Thread.sleep(100);
		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2)));  // Click On Travel menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
			    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(9, 3, 2))); // Click
		
		Thread.sleep(100);
	
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(9, 4, 2))).click();// Click
		
		Thread.sleep(100);
		
		String ExpectedTitle=data.getData(9,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
		 
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
						 
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		 // driver.get(Dashboard);// if the page is not executed then it will open this url
		
	//  --------------------- Page Loading Time------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(9, 4, 4, Result);
		return null;
	
	
	}
	
	// New Travel Request

	@SuppressWarnings("unused")
	public String NewTravelRequest(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2))); // Click On Travel menu
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(9, 5, 2))).click();// Click New Travel Request
		
		Thread.sleep(100);
			
		String ExpectedTitle=data.getData(9,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
			
		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
			
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url
	
		
	//  --------------------- Page Loading Time------------------------------------------------------------------------------
		
		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(9, 5, 4, Result);
		return null;
	
		
	}

	// Travel Request Index

	@SuppressWarnings("unused")
	public String TravelRequestIndex(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2))); // Click On Travel menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
			    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(9, 6, 2))).click();// Click Travel Request Index 
		
		Thread.sleep(100);
				  
		String ExpectedTitle=data.getData(9,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder
				
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		
	//  --------------------- Page Loading Time------------------------------------------------------------------------------

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(9, 6, 4, Result);
		return null;
		
	}

	// Refund List

	@SuppressWarnings("unused")
	public String RefundList(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(9, 2, 2))); // Click On Travel menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(9, 7, 2))).click();// Click Refund List
		
		Thread.sleep(100);
		  
		String ExpectedTitle=data.getData(9,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		  		 			
		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot n store in folder	
		  
		Assert.assertEquals(ExpectedTitle, ActualTitle);
				
		// driver.get(Dashboard);// if the page is not executed then it will open this url
	
		
	//  --------------------- Page Loading Time------------------------------------------------------------------------------	

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);
		
		write_data.writedata(9, 7, 4, Result);
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

			FileUtils.copyFile(scrFile, new File(path.concat("ScreenShot\\TravelMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg")));


			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not executed then it will open this url
			

		}

		return (null);

	}

}
