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
import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class PurchaseMenuList extends RW {
	
private static ExtentReports report;
    
    public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
        if (report == null) {
            report = new ExtentReports("C:\\Users\\Arati\\workspace\\JibeTesting\\Report 2.41.2\\JIBE\\menu.html", false); //Path of generating report
            
            report
                .addSystemInfo("Host Name", "AratiD") //Environment Setup
                .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }

     //Admin
	 //LO Testing Lab List
    
	@SuppressWarnings("unused")
	public String LOTestingLabList(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin 

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(7, 49, 2))).click(); // Click on LO Testing Lab List
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(7, 49, 4, Result);
	
		return (title);

	}

	// Location
	
	@SuppressWarnings("unused")
	public String Location(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin 

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.xpath(data.getData(7, 4, 2))).click();// Click on Location
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(7, 4, 4, Result);
	
		return (title);

	}

	// Catalogue Items
	
	@SuppressWarnings("unused")
	public String CatalogueItems(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 5, 2))).click(); // Click Catalogue Items
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(7, 5, 4, Result);
		
		return (title);

	}

	// Set Items MinMax Qty
	
	@SuppressWarnings("unused")
	public String SetItemsMinMaxQty(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(7, 6, 2))).click(); // Click Set Items Min Max Qty
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		Thread.sleep(100);

		write_data.writedata(7, 6, 4, Result);
	
		return (title);

	}

	// Unit Packings
	
	@SuppressWarnings("unused")
	public String UnitPackings(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(7, 7, 2))).click();// Click Unit Packings
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		Thread.sleep(100);

		write_data.writedata(7, 7, 4, Result);
	
		return (title);

	}
			
	// Purchase Questionnaire
	
	@SuppressWarnings("unused")
	public String PurchaseQuestionnaire(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On purchase menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin
																					
		action.moveToElement(submenu).build().perform();
		   
		Thread.sleep(1100);
		
		driver.findElement(By.linkText(data.getData(7, 41, 2))).click(); // Click on Purchase Questionnaire
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(7, 41, 4, Result);
	
		return (title);

	}
		
	// Email Template
	
	@SuppressWarnings("unused")
	public String EmailTemplate(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On purchase menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin
																					
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 42, 2))).click(); // Click Email Template
																		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(7, 42, 4, Result);

		return (title);

	}
		
	// PurchaseSettings
	
	@SuppressWarnings("unused")
	public String PurchaseSettings(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(7, 8, 2))).click(); // Click Purchase Settings
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		Thread.sleep(100);

		write_data.writedata(7, 8, 4, Result);
	
		return (title);

	}
			
	// Approval Setting
	
	@SuppressWarnings("unused")
	public String ApprovalSetting(WebDriver driver1) throws Exception {

		Thread.sleep(100);

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On purchase menu

		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(7, 3, 2))); // Click Admin
																				
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
		
		driver.findElement(By.linkText(data.getData(7, 43, 2))).click(); // Click Approval Setting
																		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(7, 43, 4, Result);

		return (title);

	}

	// Create New Reqsn
	// CreateNewReqsn
	
	@SuppressWarnings("unused")
	public String CreateNewReqsn(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(7, 9, 2))).click(); // Click Create New Reqsn
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 9, 4, Result);

		return (title);
		
	}

	// Purchase Process
	// PurchaseProcess
	
	@SuppressWarnings("unused")
	public String PurchaseProcess(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath(data.getData(7, 10, 2))).click();// Click Purchase Process
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 10, 4, Result);
	
		return (title);
		
	}

	// Reports
	// ViewReqsnSummary
	
	@SuppressWarnings("unused")
	public String ViewReqsnSummary(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(7, 12, 2))).click(); // Click View Reqsn Summary
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 12, 4, Result);
	
		return (title);
		
	}

	// View Reqsn Attachments
	
	@SuppressWarnings("unused")
	public String ViewReqsnAttachments(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 13, 2))).click();// Click View Reqsn Attachments
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 13, 4, Result);
		
		return (title);
		
	}

	// ViewReqsnOnholdHistory
	
	@SuppressWarnings("unused")
	public String ViewReqsnOnholdHistory(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(7, 14, 2))).click(); // Click View Reqsn On hold History
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 14, 4, Result);
	
		return (title);
		
	}

	// InventoryDetails
	
	@SuppressWarnings("unused")
	public String InventoryDetails(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 15, 2))).click(); // Click Inventory Details
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 15, 4, Result);
		
		return (title);
		
	}

	// MachineryListing
	
	@SuppressWarnings("unused")
	public String MachineryListing(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 16, 2))).click(); // Click Machinery Listing
		
		Thread.sleep(100);
	 
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		write_data.writedata(7, 16, 4, Result);
	
		return (title);
		
	}

	// PurchaseReport
	
	@SuppressWarnings("unused")
	public String PurchaseReport(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 17, 2))).click(); // Click Purchase Report
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 17, 4, Result);
	
		return (title);

	}
		
	// Invoice Summary Report

	@SuppressWarnings("unused")
	public String InvoiceSummaryReport(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click Purchase menu
																					
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports
																					
		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(7, 46, 2))).click(); // Click Invoice Summary Report
																			 
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(100);

		write_data.writedata(7, 46, 4, Result);

		return (title);

	}

	// StalePOReport
	@SuppressWarnings("unused")
	public String StalePOReport(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 11, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 18, 2))).click(); // Click Stale PO Report
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 18, 4, Result);
	
		return (title);
		
	}

	// LogisticPO
	// CreateLogisticPO

	@SuppressWarnings("unused")
	public String CreateLogisticPO(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 19, 2))); // Click Logistic PO submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(7, 20, 2))).click(); // Click Create Logistic PO
		
		Thread.sleep(100);
	 
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 20, 4, Result);
	
		return (title);
		
	}

	// ViewLogisticPO
	
	@SuppressWarnings("unused")
	public String ViewLogisticPO(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 19, 2))); // Click Logistic PO submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	  
		driver.findElement(By.linkText(data.getData(7, 21, 2))).click(); // Click View Logistic PO
																		
		Thread.sleep(100);
	 
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 21, 4, Result);
	    
		return (title);
		
	}

	// ContractPricing
	// Create new Contract
	
	@SuppressWarnings("unused")
	public String ContractPricing(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 22, 2))); // Click Contract Pricing submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 23, 2))).click(); // Click Create new Contract

		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 23, 4, Result);
	    
		return (title);
		
	}

	// ContractList
	
	@SuppressWarnings("unused")
	public String ContractList(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 22, 2))); // Click Contract Pricing submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(7, 24, 2))).click(); // Click Contract List

		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 24, 4, Result);
	    
		return (title);
		
	}

	// Non Contract items
	
	@SuppressWarnings("unused")
	public String NonContractitems(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 22, 2))); // Click Contract Pricing submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(7, 25, 2))).click(); // Click Non Contract items

		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 25, 4, Result);
	  
		return (title);
		
	}

	// CopyContract
	
	@SuppressWarnings("unused")
	public String CopyContract(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 22, 2))); // Click Contract Pricing submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(7, 26, 2))).click(); // Click Copy Contract

		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 26, 4, Result);
	
		return (title);
		
	}
		
	// Lube Oil Samples
	
	@SuppressWarnings("unused")
	public String LubeOilSamples(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(7, 47, 2))).click(); // Click Lube Oil Samples
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 47, 4, Result);
	
		return (title);
		
	}

	// Bulk Purchase
	// BulkPurchaseIndex
	/*@SuppressWarnings("unused")
	public String BulkPurchaseIndex(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 27, 2))); // Click

		action.moveToElement(submenu).build().perform();

		driver.findElement(By.linkText(data.getData(7, 28, 2))).click();// Click

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(7, 28, 4, Result);
		return (title);
	}*/
	

	// ASL	
	// Supplier List
	
	@SuppressWarnings("unused")
	public String SupplierList(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click ASL submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 34, 2))).click(); // Click Supplier List
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 34, 4, Result);
		
		return (title);
		
	}
		
	// SupplierGroup
	
	@SuppressWarnings("unused")
	public String SupplierGroup(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click ASL submenu

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(7, 30, 2))).click(); // Click Supplier Group
		
		Thread.sleep(100);
	 
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 30, 4, Result);
	
		return (title);
		
	}

	// SupplierApprover
	
	@SuppressWarnings("unused")
	public String SupplierApprover(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click ASL submenu
																						
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 31, 2))).click(); // Click Supplier Approver

		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 31, 4, Result);
		
		return (title);
		
	}
		
	// Manage Contacts
	
	@SuppressWarnings("unused")
	public String ManageContacts(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click ASL Menu
																						 
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 35, 2))).click(); // Click Manage Contacts
																		
		Thread.sleep(100);
	  
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 35, 4, Result);
	
		return (title);
		
	}

	// UserTypeRelationship
	
	@SuppressWarnings("unused")
	public String UserTypeRelationship(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click ASL submenu
																					
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 32, 2))).click(); // Click User Type Relationship

		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 32, 4, Result);
	
		return (title);
		
	}
		
	// Email Template1
	
	@SuppressWarnings("unused")
	public String EmailTemplate1(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click ASL submenu
																						
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(7, 36, 2))).click(); // Click Email Template1

		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 36, 4, Result);
	
		return (title);
		
	}
	
	// Supplier Fields Group
	
	@SuppressWarnings("unused")
	public String SupplierFieldsGroup(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2))); // Click On Purchase menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click ASL submenu
																						
		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(7, 37, 2))).click(); // Click Supplier Fields Group

		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(7, 37, 4, Result);
	
		return (title);
		
	}
	
	/*// Evaluation History
	@SuppressWarnings("unused")
	public String EvaluationHistory(WebDriver driver1) throws Exception {
		WebDriver driver = driver1;
		
		logger=report.startTest("ASL");

		WebElement menu = driver.findElement(By.linkText(data.getData(7, 2, 2)));
		Thread.sleep(100); // Click On Technical menu

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(1000);
	    logger.log(LogStatus.INFO, "Purchase menu");
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(7, 29, 2))); // Click
																						

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(1000);
	    logger.log(LogStatus.INFO, "ASL submenu");

		driver.findElement(By.linkText(data.getData(7, 38, 2))).click();// Click Evaluation History
		
		Thread.sleep(1000);
	    logger.log(LogStatus.INFO, "Evaluation History");																

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(7, 38, 4, Result);
		
		report.endTest(logger);
	    report.flush();

		return (title);
	}*/
	
	

	public String SShot(String actual1, String title1, WebDriver driver1) throws IOException {

		String actual = actual1;
		String title = title1;
		WebDriver driver = driver1;

		if (title.contentEquals(actual)) {
			System.out.println(title + " page is open.\n");
		} else {

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\PurchaseMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not executed then it will open this url
			
		}

		return (null);

	}

}
