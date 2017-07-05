package common_Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class WebDriverPass extends RW
{

 public static WebDriver driver;

 loginpage L = new loginpage(); //

 @BeforeSuite
 public void initialioseBrowser() throws Exception 
 {

		String chrome = path + "src\\object\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chrome);

		driver = new ChromeDriver();

		Thread.sleep(1000);

		driver.get(url);
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();

		L.Login(driver);

		Thread.sleep(4000);

	}
 
 @AfterSuite
 public void closeBrowser()
 {

  driver.quit();
 
 }

}