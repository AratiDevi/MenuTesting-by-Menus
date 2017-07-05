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

public class CrewMenuList extends RW {
	
private static ExtentReports report;
    
    public synchronized static ExtentReports getReporter(String filePath) { ////allow only one thread to access the shared resource,To prevent thread interference.
        if (report == null) {
            report = new ExtentReports("C:\\Users\\Arati\\workspace\\JibeTesting\\Report 2.41.2\\JIBE\\menu.html", false); //Path of generating report
            
            report
                .addSystemInfo("Host Name", "AratiD") //Environment Setup
                .addSystemInfo("Environment", "QA");
        }
        
        return report;
    }
    
    // Admin
    // Rank category
	 
	@SuppressWarnings("unused")
	public String Rankcategory(WebDriver driver1) throws Exception {

		Thread.sleep(100);
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	  	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 4, 2))).click(); // Click Rank Category
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 4, 4, Result);
	
		return (title);
	}
	
	// Crew Ranks

	@SuppressWarnings("unused")
	public String CrewRanks(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 5, 2))).click(); // Click Crew Ranks
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 5, 4, Result);

		return (title);

	}
	
	// Joining Type

	@SuppressWarnings("unused")
	public String JoiningType(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 6, 2))).click(); // Click Joining Type
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 6, 4, Result);
		
		return (title);
	}
	
	//Document Group

	@SuppressWarnings("unused")
	public String DocumentGroup(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 65, 2))).click(); // Click Document Group		

		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 65, 4, Result);
		
		return (title);
	}
	
		// Document Types
	
	@SuppressWarnings("unused")
	public String DocumentTypes(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.xpath(data.getData(4, 7, 2))).click(); // Click on Document Type
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 7, 4, Result);
	
		return (title);
	}
	
	// Crew Sign off Reason
	
	@SuppressWarnings("unused")
	public String CrewSignoffReason(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 8, 2))).click(); // Click Crew Signoff Reason
		
		Thread.sleep(100);
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 8, 4, Result);

		return (title);
	}
	
	// Training Types

	@SuppressWarnings("unused")
	public String TrainingTypes(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 9, 2))).click(); // Click Training Types
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 9, 4, Result);
	
		return (title);
	}
	
	// Crew Welfare Library

	@SuppressWarnings("unused")
	public String CrewWelfareLibrary(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.xpath(data.getData(4, 10, 2))).click(); // Click on Crew Welfare Library
		
		Thread.sleep(100);
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 10, 4, Result);
		
		return (title);
	}
	
	// OnBoard Staff Limit

	@SuppressWarnings("unused")
	public String OnBoardStaffLimit(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 11, 2))).click(); // Click OnBoard Staff Limit
		
		Thread.sleep(100);
													
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 11, 4, Result);
		
		return (title);
	}
	
	//Company Seniority Reward
	
	@SuppressWarnings("unused")
	public String CompanySeniorityReward(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 66, 2))).click(); // Click Company Seniority Reward

		Thread.sleep(100);
																		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 66, 4, Result);

		return (title);
	}
	
	 //Seniority Settings
	
	@SuppressWarnings("unused")
	public String SenioritySettings(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 67, 2))).click(); // Click Seniority Settings

		Thread.sleep(100);
		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 67, 4, Result);

		return (title);
	}
	
	// Contract Type

	@SuppressWarnings("unused")
	public String ContractType(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 12, 2))).click(); // Click Contract Type

		Thread.sleep(100);
		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 12, 4, Result);
		
		return (title);
	}
	
	// Crew Rank Scale
	
	@SuppressWarnings("unused")
	    public String CrewRankScale(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 61, 2))).click(); // Click Crew Rank Scale

		Thread.sleep(100);
		
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 61, 4, Result);
	
		return (title);
	}
	
	// HandOver Question

	@SuppressWarnings("unused")
	public String HandOverQuestion(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 13, 2))).click(); // Click HandOver Question
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 13, 4, Result);

		return (title);
	}
	
	// Crew Contract Period

	@SuppressWarnings("unused")
	public String CrewContractPeriod(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 14, 2))).click(); // Click Crew Contract Period
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 14, 4, Result);
	
		return (title);
	}
	
	// Cash Advance Limit

	@SuppressWarnings("unused")
	public String CashAdvanceLimit(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 15, 2))).click();// Click Cash Advance Limit
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 15, 4, Result);
		
	    return (title);
	}
	
	// Allotment flag mail settings

	@SuppressWarnings("unused")
	public String Allotmentflagmailsettings(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 16, 2))).click(); // Click Allotment flag mail settings
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 16, 4, Result);
		
		return (title);
	}
	
	//Crew Contract Templates
	
	@SuppressWarnings("unused")
	public String CrewContractTemplates(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 68, 2))).click(); // Click Crew Contract Templates
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 68, 4, Result);
		
		return (title);
	}
	
	// Crew Joining Seniority

	@SuppressWarnings("unused")
	public String CrewJoiningSeniority(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 17, 2))).click(); // Click Crew Joining Seniority
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 17, 4, Result);
		
		return (title);
	}
	
	// Document Types1

	@SuppressWarnings("unused")
	public String DocumentTypes1(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.xpath(data.getData(4, 18, 2))).click(); // Click on DocumentTypes1
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 18, 4, Result);

		return (title);
	}
	
	// Initialize Portage Bill
	
	@SuppressWarnings("unused")
	public String InitializePortageBill(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 62, 2))).click(); // Click on Initialize Portage Bill
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 62, 4, Result);

		return (title);
	}
	
	// Crew Card Approvers

	@SuppressWarnings("unused")
	public String CrewCardApprovers(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	     
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 19, 2))).click();// Click Crew Card Approvers
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 19, 4, Result);
	
		return (title);
	}
	
	// Crew Status Library
	
	@SuppressWarnings("unused")
	public String CrewStatusLibrary(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 63, 2))).click(); // Click Crew Status Library
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 63, 4, Result);
			
		return (title);
	}
	
	// Crew Status Mapping
	
	@SuppressWarnings("unused")
	public String CrewStatusMapping(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(1000);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 64, 2))).click();// Click Crew Status Mapping
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 64, 4, Result);
		
		return (title);
	}
	
	//LeaveWage Withhold Rule 
	
	@SuppressWarnings("unused")
	public String LeaveWageWithholdRule(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
			
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin
		
		Thread.sleep(1000);

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.xpath(data.getData(4, 69, 2))).click();// Click LeaveWage Withhold Rule 
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 69, 4, Result);

		return (title);
	}
		
	//Oil Majors
	
	@SuppressWarnings("unused")
	public String OilMajors(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 70, 2))).click(); // Click Oil Majors 
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 70, 4, Result);
	
		return (title);
	}
			
		//Crew Matrix Config
		
	@SuppressWarnings("unused")
	public String CrewMatrixConfig(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 71, 2))).click();// Click Crew Matrix Config 
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 71, 4, Result);
	
		return (title);
	}
				
		//Oil Majors Rule Mapping
			
	@SuppressWarnings("unused")
	public String OilMajorsRuleMapping(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 72, 2))).click(); // Click Oil Majors Rule Mapping
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 72, 4, Result);
			
		return (title);
	}
		
	//Oil Majors Rule Group
	
	@SuppressWarnings("unused")
	public String OilMajorsRuleGroup(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
			
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 73, 2))).click(); // Click  Oil Majors Rule Group 
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 73, 4, Result);
	
		return (title);
	}
	
	//Oil Majors Rules
	
	@SuppressWarnings("unused")
	public String OilMajorsRules(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 74, 2))).click(); // Click  Oil Majors Rules 
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
			
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 74, 4, Result);
	
		return (title);
	}
		
	//Rank Configuration

	@SuppressWarnings("unused")
	public String RankConfiguration(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin
																					
		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 75, 2))).click(); // Click Rank Configuration
																	
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 75, 4, Result);

		return (title);
	}
				
	//Crew Details Configuration
	
	@SuppressWarnings("unused")
	public String CrewDetailsConfiguration(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 76, 2))).click(); // Click  Crew Details Configuration 
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();
						
		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 76, 4, Result);
		
		return (title);
	}
	
	//Union And Union Book

	@SuppressWarnings("unused")
	public String UnionAndUnionBook(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin
																					 
		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 77, 2))).click(); // Click Union And Union Book
																	
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 77, 4, Result);

		return (title);
	}
			
    //Schools
	
	@SuppressWarnings("unused")
	public String Schools(WebDriver driver1) throws Exception {
		
	    WebDriver driver = driver1;
	
	    WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
	    
	    Thread.sleep(100); 

	    Actions action = new Actions(driver);

	    action.moveToElement(menu).build().perform();
	    
	    Thread.sleep(100);
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
	    WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin

	    action.moveToElement(submenu).build().perform();
	    
	    Thread.sleep(100);
	
        driver.findElement(By.linkText(data.getData(4, 78, 2))).click();// Click Schools
        
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

		write_data.writedata(4, 78, 4, Result);
		
		return (title);
	}
	
	//Race And Veteran Status
	
	@SuppressWarnings("unused")
	public String RaceAndVeteranStatus(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.xpath(data.getData(4, 3, 2))); // Click Admin
																					
		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 79, 2))).click();// Click Race And Veteran Status
																		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 79, 4, Result);

		return (title);
	}			

	// Crew Index

	@SuppressWarnings("unused")
	public String CrewIndex(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 20, 2))).click(); // Click Crew Index
		
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

		write_data.writedata(4, 20, 4, Result);

		return (title);

	}
	
	// Add New Crew

	@SuppressWarnings("unused")
	public String AddNewCrew(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 21, 2))).click();// Click Add New Crew
		
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

		write_data.writedata(4, 21, 4, Result);
	
		return (title);
	}

	// Interview

	@SuppressWarnings("unused")
	public String CreateInterviewSheet(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;


		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100); 

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 22, 2))); // Click Crew Interview

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 23, 2))).click(); // Click Create Interview Sheet
		
		Thread.sleep(100);
	 
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 23, 4, Result);

		return (title);

	}
	
	// Categories and Grades

	@SuppressWarnings("unused")
	public String CategoriesandGrades(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 22, 2))); // Click Crew Interview

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 24, 2))).click(); // Click Categories and Grades
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 24, 4, Result);
		
		return (title);

	}
	
	// Interview Question Bank

	@SuppressWarnings("unused")
	public String InterviewQuestionBank(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 22, 2))); // Click Crew Interview

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 25, 2))).click(); // Click Interview Question Bank
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 25, 4, Result);
		
		return (title);

	}

	// plan Interview

	@SuppressWarnings("unused")
	public String PlanInterview(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 26, 2))).click(); // Click Plan Interview
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 26, 4, Result);
	
		return (title);

	}

	// Crew Planning

	@SuppressWarnings("unused")
	public String CrewPlanning(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 81, 2))).click(); // Click Crew Planning
																	
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 81, 4, Result);

		return (title);

	}
	
	// Event Planner

	@SuppressWarnings("unused")
	public String EventPlanner(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 27, 2))).click(); // Click Event Planner
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 27, 4, Result);
	
		return (title);

	}
	
	// Event Index

	@SuppressWarnings("unused")
	public String EventIndex(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 28, 2))).click(); // Click Event Index
		
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

		write_data.writedata(4, 28, 4, Result);

		return (title);

	}

	// Evaluation Schedules

	@SuppressWarnings("unused")
	public String EvaluationSchedules(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 30, 2))).click(); // Click Evaluation Schedules
		
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

		write_data.writedata(4, 30, 4, Result);
	
		return (title);

	}
	
	// Evaluation Planning

	@SuppressWarnings("unused")
	public String EvaluationPlanning(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click Crew Evaluation

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 31, 2))).click(); // Click Evaluation Planning
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 31, 4, Result);

		return (title);
	}
	
	// Library

	@SuppressWarnings("unused")
	public String Library(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click Crew Evaluation

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 32, 2))).click();// Click Library
		
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

		write_data.writedata(4, 32, 4, Result);

		return (title);
	}
	
	// Question Bank

	@SuppressWarnings("unused")
	public String QuestionBank(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click Crew Evaluation

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 33, 2))).click(); // Click Question Bank
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 33, 4, Result);
	
		return (title);
	}
	
	//EvaluationConfiguration
	
	@SuppressWarnings("unused")
	public String EvaluationConfiguration(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click Crew Evaluation

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 84, 2))).click(); // Click Evaluation Configuration
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 84, 4, Result);

		return (title);
	}
		
	//Evaluation Snippet Settings

	@SuppressWarnings("unused")
	public String EvaluationSnippetSettings(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 29, 2))); // Click Crew Evaluation
																					
		action.moveToElement(submenu).build().perform();

		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 85, 2))).click(); // Click Evaluation Snippet Settings
																	
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 85, 4, Result);

		return (title);
	}
	
	// Crew Accounts
	// Portage Bill
	
	@SuppressWarnings("unused")
	public String PortageBill(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 35, 2))).click(); // Click Portage Bill
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 35, 4, Result);

		return (title);

	}
	
	// Salary by Wire Transfer

	@SuppressWarnings("unused")
	public String SalarybyWireTransfer(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 36, 2))).click(); // Click Salary by Wire Transfer
		
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

		write_data.writedata(4, 36, 4, Result);
	
		return (title);

	}
	
	// CTM Index

	@SuppressWarnings("unused")
	public String CTMIndex(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 37, 2))).click(); // Click CTM Index
		
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

		write_data.writedata(4, 37, 4, Result);
	
		return (title);

	}

	// Vessel Minumum CTM
	
	@SuppressWarnings("unused")
	public String VesselMinumumCTM(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 38, 2))).click(); // Click Vessel Minumum CTM
		
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

		write_data.writedata(4, 38, 4, Result);
	
		return (title);

	}
	
	// Rank Wage Contract

	@SuppressWarnings("unused")
	public String RankWageContract(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts 

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 39, 2))).click(); // Click Rank Wage Contract
		
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

		write_data.writedata(4, 39, 4, Result);
	
		return (title);

	}
	
	// eCard Kitty

	@SuppressWarnings("unused")
	public String eCardKitty(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 40, 2))).click(); // Click eCard-Kitty
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 40, 4, Result);
		
		return (title);

	}
	
	// e-Card Request

	@SuppressWarnings("unused")
	public String eCardRequest(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 41, 2))).click(); // Click e-Card Request
		
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

		write_data.writedata(4, 41, 4, Result);
	
		return (title);

	}
	
	// e-Card Report

	@SuppressWarnings("unused")
	public String eCardReport(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 42, 2))).click(); // Click e-Card Report
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 42, 4, Result);

		return (title);

	}
	
	// Crew Welfare Library1

	@SuppressWarnings("unused")
	public String CrewWelfareLibrary1(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(1000);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 43, 2))).click(); // Click Crew Welfare Library1
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 43, 4, Result);
	
		return (title);

	}
	
	// Approve Rejoining Bonus

	@SuppressWarnings("unused")
	public String ApproveRejoiningBonus(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 44, 2))).click(); // Click Approve Rejoining Bonus
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 44, 4, Result);
	
		return (title);

	}
	
	// Company Seniority Reward1

	@SuppressWarnings("unused")
	public String CompanySeniorityReward1(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 34, 2))); // Click Crew Accounts

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 45, 2))).click();// Click Company Seniority Reward1
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 45, 4, Result);

		return (title);

	}

	// Crew Agency Fee
	// Crew Agency Fee Library

	@SuppressWarnings("unused")
	public String CrewAgencyFeeLibrary(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 46, 2))); // Click Crew Agency Fee

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 47, 2))).click();// Click Crew Agency Fee Library
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 47, 4, Result);

		return (title);
	}
	
	// Crew Agency Fee Report

	@SuppressWarnings("unused")
	public String CrewAgencyFeeReport(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 46, 2))); // Click Crew Agency Fee

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 48, 2))).click();// Click Crew Agency Fee Report
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(100);

		write_data.writedata(4, 48, 4, Result);
	
		return (title);
	}
	
	// Crew Card Index

	@SuppressWarnings("unused")
	public String CrewCardIndex(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 49, 2))).click(); // Click Crew Card Index
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 49, 4, Result);

		return (title);
	}
	
	// Crew List History

	@SuppressWarnings("unused")
	public String CrewListHistory(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 50, 2))).click(); // Click Crew List History
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 50, 4, Result);

		return (title);
	}

	// Crew Mail System
	// Crew Mail Index

	@SuppressWarnings("unused")
	public String CrewMailSystem(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	     
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 51, 2))); // Click Crew Mail System

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 52, 2))).click();// Click Crew Mail Index
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 52, 4, Result);
	
		return (title);
	}
	
	// Crew Mail Admin

	@SuppressWarnings("unused")
	public String CrewMailAdmin(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 51, 2))); // Click Crew Mail System

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 53, 2))).click(); // Click Crew Mail Admin
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 53, 4, Result);

		return (title);
	}
	
	// Reports
	// Crew Feedback Viewer

	@SuppressWarnings("unused")
	public String CrewFeedbackViewer(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
		
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);
	
		driver.findElement(By.linkText(data.getData(4, 55, 2))).click();// Click Crew Feedback Viewer
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 55, 4, Result);

		return (title);
	}
	
	// Crew Medical History Viewer

	@SuppressWarnings("unused")
	public String CrewMedicalHistoryViewer(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 56, 2))).click();// Click Crew Medical History Viewer
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 56, 4, Result);
	
		return (title);
	}
	
	// Crew Missing Data Report
	
	@SuppressWarnings("unused")
	public String CrewMissingDataReport(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 57, 2))).click();// Click Crew Missing Data Report
		
		Thread.sleep(100);

		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 57, 4, Result);

		return (title);
	}
		
	//Crew Retention Rate
	
	@SuppressWarnings("unused")
	public String CrewRetentionRate(WebDriver driver1) throws Exception {
		
		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2)));  // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	     
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement submenu = driver.findElement(By.linkText(data.getData(4, 54, 2))); // Click Reports

		action.moveToElement(submenu).build().perform();
		
		Thread.sleep(100);

		driver.findElement(By.linkText(data.getData(4, 58, 2))).click();// Click Crew Retention Rate
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 58, 4, Result);

		return (title);
	}
	
	// Hand Over Reports

	@SuppressWarnings("unused")
	public String HandOverReports(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
		Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();

		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 87, 2))).click(); // Click HandOver Reports
																		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() + " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 87, 4, Result);

		return (title);

	}

	// Crew admin

	@SuppressWarnings("unused")
	public String Crewadmin(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;
	
		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
	    Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 88, 2))).click(); // Click Crew admin
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 88, 4, Result);

		return (title);

	}
		
	// Crew Matrix

	@SuppressWarnings("unused")
	public String CrewMatrix(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;

		WebElement menu = driver.findElement(By.linkText(data.getData(4, 2, 2))); // Click On Crew menu
		
	    Thread.sleep(100);

		Actions action = new Actions(driver);

		action.moveToElement(menu).build().perform();
		
		Thread.sleep(100);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText(data.getData(4, 89, 2))).click(); // Click Crew Matrix
		
		Thread.sleep(100);
	
		String title = driver.getTitle().trim();

		long LoagingStart = System.currentTimeMillis();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		long Loadingstop = System.currentTimeMillis();

		double TotalTime = (Loadingstop - LoagingStart);

		String Result = Double.toString(TotalTime);

		System.out.println(driver.getTitle().trim() +  " Pageloading time is " + TotalTime + " Milisec");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(100);

		write_data.writedata(4, 89, 4, Result);
	
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

			FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\CrewMenus\\"+ driver.getTitle().trim() + "_" + System.currentTimeMillis() + ".jpg"));


			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(Dashboard); // if the page is not executed then it will open this url
									
		}

		return (null);

	}

}
