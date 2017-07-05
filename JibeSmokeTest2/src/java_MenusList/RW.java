package java_MenusList;

import common_Function.ExcelRead;
import common_Function.WriteExcel;

public class RW {

	public ExcelRead data = new ExcelRead("C:\\Users\\Arati\\workspace\\JibeTesting\\Excel\\ReadWrite.xlsx"); // Read excel path

	public WriteExcel write_data = new WriteExcel("C:\\Users\\Arati\\workspace\\JibeTesting\\Excel\\ReadWrite.xlsx");



	public String url = data.getData(0, 1, 1); // get the url from excel sheet

	public String Dashboard = data.getData(0, 2, 1); // Comman page when any error oc




}
