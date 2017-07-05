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
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.RW;

public class TechnicalMenuList extends RW {
	
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
	
	//Survey and Certificate Settings
	
     public String SurveyandCertificateSettings(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(1000); 

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	     
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(1000);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin 
		
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	    
		Thread.sleep(1000);

		driver.findElement(By.linkText(data.getData(8, 64, 2))).click(); // Click Survey and Certificate Settings
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);

		write_data.writedata(8, 64, 4, Result);
		
		return (title);
		
	}
		
	// ERLogThreshold

	@SuppressWarnings("unused")
	public String ERLogThreshold(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		
		WebDriver driver = driver1;
	
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(1000);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(8, 4, 2))).click(); // Click ERLog Threshold
		
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

		write_data.writedata(8, 4, 4, Result);
	
		return (title);
		
	}
	
	// Equipment List
	
	@SuppressWarnings("unused")
	public String EquipmentList(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		
		WebDriver driver = driver1;
	
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(1000);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 71, 2))).click(); // Click Equipment List
		
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

		write_data.writedata(8, 71, 4, Result);
	
		return (title);
		
	}
						
	// WorklistAssignorList
	
	@SuppressWarnings("unused")
	public String WorklistAssignorList(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin
		
		Thread.sleep(100);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(8, 8, 2))).click(); // Click Worklist Assignor List
		
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

		write_data.writedata(8, 8, 4, Result);
	
		return (title);
	}

	// WorklistAccessRights
	
	@SuppressWarnings("unused")
	public String WorklistAccessRights(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 9, 2))).click(); // Click Worklist Access Rights
		
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

		write_data.writedata(8, 9, 4, Result);
	
		return (title);
		
	}

	// InspectionType
	
	@SuppressWarnings("unused")
	public String InspectionType(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 10, 2))).click(); // Click Inspection Type
		
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

		write_data.writedata(8, 10, 4, Result);
	
		return (title);
		
	}
	
	// Super Attending Vessel
	
		@SuppressWarnings("unused")
		public String SuperAttendingVessel(WebDriver driver1) throws Exception
		{
			WebDriver driver = driver1;
		
			WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
			
			Thread.sleep(100);

			Actions action = new Actions(driver);

			action.moveToElement(menu).build().perform();
			
			Thread.sleep(100);
		    
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

			action.moveToElement(submenu).build().perform();
			
			Thread.sleep(100);
		    
			Thread.sleep(100);

			driver.findElement(By.linkText(data.getData(8, 65, 2))).click(); // Click Super Attending Vessel
			
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

			write_data.writedata(8, 10, 4, Result);
		
			return (title);
		}
	
	// InspVesselAssignment
		
	@SuppressWarnings("unused")
	public String InspVesselAssignment(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
				
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 11, 2))).click();// Click Insp Vessel Assignment
		
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

		write_data.writedata(8, 11, 4, Result);
	
		return (title);
		
	}
	
	// AlarmUnit
	
	@SuppressWarnings("unused")
	public String AlarmUnit(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 13, 2))).click();// Click Alarm Unit
		
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

		write_data.writedata(8, 13, 4, Result);
	
		return (title);
		
	}

	// AlarmEffect
	
	@SuppressWarnings("unused")
	public String AlarmEffect(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 14, 2))).click();// Click Alarm Effect
		
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

		write_data.writedata(8, 14, 4, Result);
	
		return (title);
		
	}	
		
	// PMS Access
	
	@SuppressWarnings("unused")
	public String PMSAccess(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 66, 2))).click(); // Click PMS Access

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

		write_data.writedata(8, 14, 4, Result);

		return (title);
		
	}
			
	// PMS Access
	
	@SuppressWarnings("unused")
	public String FunctionLibrary(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(8, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 67, 2))).click();// Click Function Library
		
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

		write_data.writedata(8, 14, 4, Result);
	
		return (title);
		
	}	

	// PMS MENUS 
	// Jobs Status
	
	@SuppressWarnings("unused")
	public String JobsStatus(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 16, 2))).click();// Click Jobs Status
		
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

		write_data.writedata(8, 16, 4, Result);

		
		return (title);
	}

	// Jobs History
	
	@SuppressWarnings("unused")
	public String JobsHistory(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 17, 2))).click();// Click  Jobs History
		
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

		write_data.writedata(8, 17, 4, Result);
	
		return (title);
		
	}

	// Jobs Library
	
	@SuppressWarnings("unused")
	public String JobsLibrary(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 18, 2))).click();// Click Jobs Library
		
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

		write_data.writedata(8, 18, 4, Result);
		
		return (title);
		
	}

	// Job Change Request
	
	@SuppressWarnings("unused")
	public String JobChangeRequest(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(8, 19, 2))).click();// Click Job Change Request
		
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

		write_data.writedata(8, 19, 4, Result);
			
		return (title);
		
	}

	// Machinery Change Request
	
	@SuppressWarnings("unused")
	public String MachineryChangeRequest(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 20, 2))).click(); // Click Machinery Change Request
		
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

		write_data.writedata(8, 20, 4, Result);
	
		return (title);
		
	}

	// Jobs updating Detailed status
	
	@SuppressWarnings("unused")
	public String JobsupdatingDetailedstatus(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 21, 2))).click();// Click Jobs updating Detailed status
		
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

		write_data.writedata(8, 21, 4, Result);
		
		return (title);
		
	}

	// Jobs updating Daily progress
	
	@SuppressWarnings("unused")
	public String JobsupdatingDailyprogress(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 22, 2))).click();// Click Jobs updating Daily progress
		
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

		write_data.writedata(8, 22, 4, Result);
	
		return (title);
		
	}

	// UnPlannned Job Details
	
	@SuppressWarnings("unused")
	public String UnPlannnedJobDetails(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 23, 2))).click(); // Click UnPlannned Job Details
		
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

		write_data.writedata(8, 23, 4, Result);
	
		return (title);
		
	}

	// Equipment Statistics
	
	@SuppressWarnings("unused")
	public String EquipmentStatistics(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 24, 2))).click(); // Click Equipment Statistics
		
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

		write_data.writedata(8, 24, 4, Result);
	
		return (title);
		
	}

	// Critical Equipments
	
	@SuppressWarnings("unused")
	public String CriticalEquipments(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 25, 2))).click(); // Click Critical Equipments
		
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

		write_data.writedata(8, 25, 4, Result);
	
		return (title);
		
	}

	// Equipment Repl History
	
	@SuppressWarnings("unused")
	public String EquipmentReplHistory(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;		
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 26, 2))).click();// Click Equipment Repl History
		
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

		write_data.writedata(8, 26, 4, Result);
	
		return (title);
		
	}

	// Machinery Running Hours
	
	@SuppressWarnings("unused")
	public String MachineryRunningHours(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 27, 2))).click(); // Click Machinery Running Hours
		
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

		write_data.writedata(8, 27, 4, Result);
	
		return (title);
		
	}

	// Manage System
	
	@SuppressWarnings("unused")
	public String ManageSystem(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 28, 2))).click(); // Click Manage System
		
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

		write_data.writedata(8, 28, 4, Result);
	
		return (title);
		
	}

	// Copy Run Hour

	@SuppressWarnings("unused")
	public String CopyRunHour(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 15, 2))); // Click PMS

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	 
		driver.findElement(By.linkText(data.getData(8, 29, 2))).click();// Click Copy Run Hour
		
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

		write_data.writedata(8, 29, 4, Result);
	
		return (title);
	}

	// EngineLogBookIndex

	@SuppressWarnings("unused")
	public String EngineLogBookIndex(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		driver.findElement(By.linkText(data.getData(8, 2, 2))).click();// Click

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath(data.getData(8, 30, 2))).click(); // Click on EngineLogBookIndex
		
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

		write_data.writedata(8, 30, 4, Result);
	
		return (title);
		
	}

	// Worklist
	// WorklistIndex
	
	@SuppressWarnings("unused")
	public String WorklistIndex(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 31, 2))); // Click Worklist

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 32, 2))).click();// Click
		
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

		write_data.writedata(8, 32, 4, Result);
	
		return (title);
		
	}

	// WorklistCalendar
	
	@SuppressWarnings("unused")
	public String WorklistCalendar(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 31, 2))); // Click Worklist

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(8, 33, 2))).click();// Click Worklist Calendar
		
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

		write_data.writedata(8, 33, 4, Result);
	
		return (title);
		
	}

	// PSC SIRE
	
	@SuppressWarnings("unused")
	public String PSCSIRE(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 31, 2))); // Click Worklist

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 34, 2))).click();// Click PSCSIRE
		
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

		write_data.writedata(8, 34, 4, Result);

		return (title);
	}

	// WorklistUsageReport
	
	@SuppressWarnings("unused")
	public String WorklistUsageReport(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath(data.getData(8, 35, 2))).click();// Click on Worklist Usage Report
		
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

		write_data.writedata(8, 35, 4, Result);
	
		return (title);
	}

	// Survey/Certificates
	// SurveyList
	
	@SuppressWarnings("unused")
	public String SurveyList(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 36, 2))); // Click Survey/Certificates

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 37, 2))).click();// Click Survey List
		
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

		write_data.writedata(8, 37, 4, Result);
	
		return (title);
	}

	// Vessel Inspection
	// InspectionIndex
	
	@SuppressWarnings("unused")
	public String InspectionIndex(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 39, 2))).click();// Click Inspection Index

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

		write_data.writedata(8, 39, 4, Result);
		
		return (title);
		
	}

	// InspectionCalendar
	
	@SuppressWarnings("unused")
	public String InspectionCalendar(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection 

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 40, 2))).click();// Click Inspection Calendar
		
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

		write_data.writedata(8, 40, 4, Result);
	
		return (title);
	}

	// AttendanceCalendar
	
	@SuppressWarnings("unused")
	public String AttendanceCalendar(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 41, 2))).click();// Click Attendance Calendar
		
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

		write_data.writedata(8, 41, 4, Result);
	
		return (title);
		
	}

	// Questionbank
	
	@SuppressWarnings("unused")
	public String Questionbank(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection 

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 42, 2))).click();// Click Question bank
		
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

		write_data.writedata(8, 42, 4, Result);
	
		return (title);
		
	}

	// ChecklistType
	
	@SuppressWarnings("unused")
	public String ChecklistType(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 43, 2))).click();// Click Checklist Type
		
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

		write_data.writedata(8, 43, 4, Result);
	
		return (title);
	}

	// Checklist
	
	@SuppressWarnings("unused")
	public String Checklist(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 44, 2))).click();// Click Checklist
		 
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

		write_data.writedata(8, 44, 4, Result);
	
		return (title);
	}

	// ChecklistCreation
	
	@SuppressWarnings("unused")
	public String ChecklistCreation(WebDriver driver1) throws Exception 
	{
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 45, 2))).click();// Click Checklist Creation
		
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

		write_data.writedata(8, 45, 4, Result);
	
		return (title);
	}
	
	
	// InspectionYearlySummary
	
	@SuppressWarnings("unused")
	public String InspectionYearlySummary(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 38, 2))); // Click Vessel Inspection

		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 69, 2))).click();// Click Inspection Yearly Summary

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

		write_data.writedata(8, 45, 4, Result);

		return (title);
	}
		
		
	// TrendAnalysis
	
	@SuppressWarnings("unused")
	public String TrendAnalysis(WebDriver driver1) throws Exception
	{
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(8, 46, 2))).click();// Click Trend Analysis

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

		write_data.writedata(8, 46, 4, Result);
	
		return (title);
	}
	
	// PMSOverdue

	public String PMSOverdue(WebDriver driver1) throws Exception {

		Thread.sleep(100);
		WebDriver driver = driver1;

		Actions action = new Actions(driver);

		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(1000);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
																						
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 54, 2))).click();// Click PMS Overdue

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

		// write_data.writedata(8, 4, 4, Result);
		
	    return (title);

	}
				
	// NearMisses

	public String NearMisses(WebDriver driver1) throws Exception {

		Thread.sleep(100);
		WebDriver driver = driver1;

		Actions action = new Actions(driver);

		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
																						
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(8, 55, 2))).click();// Click NearMisses
																		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// write_data.writedata(8, 4, 4, Result);
	
		return (title);

	}
		
		
	// IncidentsPersonnel

	public String IncidentsPersonnel(WebDriver driver1) throws Exception {

		Thread.sleep(100);
		WebDriver driver = driver1;

		Actions action = new Actions(driver);

		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports

		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 56, 2))).click();// Click Incidents Personnel
																		// 
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

		// write_data.writedata(8, 4, 4, Result);

		return (title);

	}
	
	  //IncidentswithInjury
		
	public String IncidentswithInjury(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
				
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 57, 2))).click(); // Click IncidentswithInjury
		
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

		//write_data.writedata(8, 4, 4, Result);
		
		return (title);
		
	}
	
	  //IncidentswithDeath

	public String IncidentswithDeath(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  //Technical
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(8, 58, 2))).click();// Click Incidents with Death
		
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

		//write_data.writedata(8, 4, 4, Result);
	
		return (title);
		
	}
		
	    //IncidentsPollution

	public String IncidentsPollution(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(8, 59, 2))).click();// Click IncidentsPollution
		
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

		//write_data.writedata(8, 4, 4, Result);
	
		return (title);
		
	}
	
	   //InternalInspections

	public String InternalInspections(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));   // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 60, 2))).click();// Click Internal Inspections
		
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

		//write_data.writedata(8, 4, 4, Result);
		
		return (title);
		
	}
	
	
	//PortStateControlDeficiencies

	public String PortStateControlDeficiencies(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 61, 2))).click();// Click Port State Control Deficiencies
		
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

		//write_data.writedata(8, 4, 4, Result);
		
		return (title);
		
	}
		
	//Vetting Reports

	public String VettingReports(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
		
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 53, 2))); // Click Reports 
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 62, 2))).click();// Click Vetting Reports
		
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

		//write_data.writedata(8, 4, 4, Result);
		
		return (title);
		
	}
	
	// Vetting Planner
						
	public String VettingPlanner(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
		
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 47, 2))); // Click Vetting 
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 48, 2))).click();// Click Vetting Planner
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoadingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoadingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//write_data.writedata(8, 4, 4, Result);
	
		return (title);
		
}
	
	// Vetting Index
		
	public String VettingIndex(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
	
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 47, 2))); // Click Vetting 
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 49, 2))).click();// Click Vetting Index
		
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

		//write_data.writedata(8, 4, 4, Result);
	
		return (title);
		
}
	
	// 
		
     public String ObservationIndex(WebDriver driver1) throws Exception {
		
		Thread.sleep(100);
		WebDriver driver = driver1;
		
		Actions action = new Actions(driver);
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
		
		Thread.sleep(100);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		WebElement submenu = driver.findElement(By.linkText(data.getData(8, 47, 2))); // Click Vetting 
		
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(8, 50, 2))).click();// Click Observation Index
		
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

		//write_data.writedata(8, 4, 4, Result);
	
		return (title);
		
}
     
     // Vetting Questionnaire
		
   public String VettingQuestionnaire(WebDriver driver1) throws Exception {
	
	Thread.sleep(100);
	WebDriver driver = driver1;
		
	Actions action = new Actions(driver);
	
	Thread.sleep(100);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2)));  // Click On Technical menu
	Thread.sleep(100);

	action.moveToElement(menu).build().perform();
	
	Thread.sleep(100);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(100);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 47, 2))); // Click Vetting 
	
	Thread.sleep(100);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();
	
	Thread.sleep(100);

	driver.findElement(By.linkText(data.getData(8, 51, 2))).click();// Click Vetting Questionnaire
	
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

	//write_data.writedata(8, 4, 4, Result);

	return (title);
	
}
   
   // Vetting Library

 public String VettingLibrary(WebDriver driver1) throws Exception {
	
	Thread.sleep(100);
	WebDriver driver = driver1;

	Actions action = new Actions(driver);
	
	Thread.sleep(100);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement menu = driver.findElement(By.linkText(data.getData(8, 2, 2))); // Click On Technical menu
	Thread.sleep(100);

	action.moveToElement(menu).build().perform();
	
	Thread.sleep(100);
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(100);

	WebElement submenu = driver.findElement(By.linkText(data.getData(8, 47, 2))); // Click Vetting 
	
	Thread.sleep(100);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	action.moveToElement(submenu).build().perform();
		
	Thread.sleep(100);

	driver.findElement(By.linkText(data.getData(8, 52, 2))).click();// Click Vetting Library
	
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

	//write_data.writedata(8, 4, 4, Result);

	return (title);
	
}
			
	public String SShot(String actual1, String title1, WebDriver driver1) throws IOException {

		String actual = actual1;
		String title = title1;
		WebDriver driver = driver1;

		if (title.contentEquals(actual)) {
			System.out.println(title + " page is open.\n");
		} else {

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\TechnicalMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not exceuted then it will
			// opne this url

		}

		return (null);

	}

}
