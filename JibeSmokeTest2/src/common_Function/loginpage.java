package common_Function;



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




public class loginpage extends RW
{

	/* protected ExcelRead data = new ExcelRead("C:\\Work\\JibeTesting\\Excel\\ReadWrite.xlsx"); // Read  excel path

	 protected WriteExcel write_data = new WriteExcel("C:\\Work\\JibeTesting\\Excel\\ReadWrite.xlsx");	//Write on Excel
	 */
	// @SuppressWarnings("unused")

	public String Login(WebDriver driver1) throws Exception
	{
		 WebDriver driver=driver1;

	     driver.findElement(By.id(data.getData(2, 1, 2))).sendKeys(data.getData(1,1,0));  // Read username from excelsheet

		 driver.findElement(By.id(data.getData(2, 2, 2))).sendKeys(data.getData(1,1,1)); //   Read Password from excelsheet

	     driver.findElement(By.id(data.getData(2, 3, 2))).click(); 				    //  Read login button  from excelsheet
		
	     String title = driver.getTitle().trim();
	     

	   //Get the page load Time
	     long LoagingStart = System.currentTimeMillis();

		  List<WebElement> allLinks = driver.findElements(By.xpath("//*"));

		  long Loadingstop = System.currentTimeMillis();

		  double TotalTime = (Loadingstop-LoagingStart);

		  String Result  =  Double.toString(TotalTime);

		  System.out.println(driver.getTitle().trim()+"Pageloading time is "+ TotalTime + " Milisec ");

		  write_data.writedata(1,1,2,Result);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		  Thread.sleep(100);

	      return(title);


	}
		public String SShot (String actual1, String title1, WebDriver driver1) throws IOException
		{

			String actual = actual1;
			String title = title1;
			WebDriver driver = driver1;


			if(title.contentEquals(actual))
			{
				System.out.println(title+ " page is open" );
			}
			else
			{

					File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

					FileUtils.copyFile(scrFile, new File("C:\\Users\\Arati\\workspace\\JibeTesting\\ScreenShot\\Login\\"+ driver.getTitle().trim()+"_"+System.currentTimeMillis()+".jpg"));

					driver.close();
			}

			return(null);


		}
		
		/*
		public String MenuPage (String actual1, String title1, WebDriver driver1) throws IOException
		{

			String actual = actual1;
			String title = title1;
			WebDriver driver = driver1;


			if(title.contentEquals(actual))
			{
				System.out.println(title+ " Menu Access Available" );
			}
			else
			{
				
				System.out.println(title+ " Menu Access not Available" );

			}

			return(null);


		}*/
		
		

}
