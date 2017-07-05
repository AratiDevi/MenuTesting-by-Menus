package java_MenusList;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;

public class HelpMenuList extends RW
{
	
private static ExtentReports report;

   public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
        if (report == null) {
            report = new ExtentReports(path.concat("Report\\Helpmenu.html")); //Path of generating report
            
            report
                .addSystemInfo("Host Name", "AratiD") //Environment Setup
                .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }
	
	// MainMenus HelpCenter	
	//Data building
    
	@SuppressWarnings("unused")
	public String Databuilding(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;		

		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2))); // Click On Help menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);	
		
		driver.findElement(By.linkText(data.getData(12, 7, 2))).click(); // Click Data building
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					  
	    String ExpectedTitle=data.getData(12,7,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
	    String ActualTitle=driver.getTitle().trim();  // taking the actual title name by the web site.

		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
	    
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    
		Thread.sleep(100);
		
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

		write_data.writedata(12, 7, 4, Result);
				 
		return null;
				
	}
		
	// Sub-Menus Support Desk555
	
	@SuppressWarnings("unused")
	public String SupportDesk555(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2))); // Click On Help menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText(data.getData(12, 8, 2))).click(); // Click Support Desk555
		
		Thread.sleep(100);
				   
		String ExpectedTitle=data.getData(12,8,3).trim(); // It will taking the Expected Title name from the excel sheet.
			
		String ActualTitle=driver.getTitle().trim();  // taking the actual title name by the web site.
		
		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
							
		// driver.get(Dashboard);// if the page is not executed then it will open this url
				 
	//  --------------------- Page LoadingTime------------------------------------------------------------------------------	
																			
		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(12, 8, 4, Result);
		
		return null;	
		
	}
	
	// Sub-Menus Training Videos
	
	@SuppressWarnings("unused")
	public String TrainingVideos(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2))); // Click On Help menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 4, 2))).click(); // Click on Training Videos
				
		Thread.sleep(100);
				   
		String ExpectedTitle=data.getData(12,4,3).trim(); // It will taking the Expected Title name from the excel sheet.
				 
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

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(12, 4, 4, Result);
		
		return null;
		
	}

	// Sub-Menus FAQ
	
	@SuppressWarnings("unused")
	public String FAQ(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2))); // Click On Help menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(12, 5, 2))).click(); // Click FAQ
			
		Thread.sleep(100);
		   
		String ExpectedTitle=data.getData(12,5,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
		String ActualTitle=driver.getTitle().trim();		// taking the actual title name by the web site.
		
		SShot(ExpectedTitle, ActualTitle, driver); // if Title is not matching they it will take screen shot and store in folder
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		// driver.get(Dashboard);// if the page is not executed then it will open this url
		
	//  --------------------- Page Loading Time------------------------------------------------------------------------------
										
		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(12, 5, 4, Result);
	
		return null   ;
		
	}

	// Sub-Menus FAQTopic
	@SuppressWarnings("unused")
	public String FAQTopic(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(12, 2, 2))); // Click On Help menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText(data.getData(12, 6, 2))).click(); // Click on FAQTopic
		
		Thread.sleep(2000);
		
		// Switching to Alert        
	    Alert alert1=driver.switchTo().alert();  	
	    @SuppressWarnings("unused")
		String alertMessage1=driver.switchTo().alert().getText();  	 
	    System.out.println(alertMessage1);   
	    Thread.sleep(1000);  
	    alert1.accept();
					    
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		   
		String ExpectedTitle=data.getData(12,6,3).trim(); // It will taking the Expected Title name from the excel sheet.
				
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

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec ");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(12, 6, 4, Result);
		
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

			FileUtils.copyFile(scrFile, new File(path.concat("ScreenShot\\HelpMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg")));

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not executed then it will open this url
		
		}

		return (null);

	}
	
	
}
