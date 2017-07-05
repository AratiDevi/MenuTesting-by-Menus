package common_Function;

import common_Function.ExcelRead;
import common_Function.WriteExcel;

public class RW {
	
	public static String path="C:\\Users\\Arati\\workspace\\JibeSmokeTest\\"; //Workspace excel path
		
    public ExcelRead data = new ExcelRead(path.concat("Excel\\ReadWrite.xlsx")); // Read excel path

    public WriteExcel write_data = new WriteExcel(path.concat("Excel\\ReadWrite.xlsx"));

	public String url = data.getData(0, 1, 1); // get the url from excel sheet

	public String Dashboard = data.getData(0, 2, 1); // Common page when any error occur



/*	public static void main(String args[]){  
		   try{  
		     // int data=50/0;  
		   }catch(ArithmeticException e){System.out.println(e);}  
		   System.out.println("rest of the code...");  
		}  */


}
