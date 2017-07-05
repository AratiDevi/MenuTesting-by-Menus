package common_Function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;




public class WriteExcel {
	XSSFWorkbook wb;

	XSSFSheet sheet1;

	XSSFCell Cell;


	public WriteExcel(String excelpath) {

		try {
			// get the Excel Path

			File src = new File(excelpath);


			  FileInputStream fis = new FileInputStream(src);

			  wb = new XSSFWorkbook(fis);

		  Workbook wb = Workbook.getWorkbook(fis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// get the excel Sheet row and column number

	public void writedata(int sheetnumber, int row, int col, String value) throws Exception {

		File src = new File("C:\\Users\\Arati\\workspace\\JibeTesting\\Excel\\ReadWrite.xlsx");

		/*FileInputStream fis = new FileInputStream(src);

		wb = new XSSFWorkbook(fis);*/

		sheet1 = wb.getSheetAt(sheetnumber);

		sheet1.getRow(row).createCell(col).setCellValue(value);

		FileOutputStream fout = new FileOutputStream(src);

		wb.write(fout);

		fout.flush();

		fout.close();

	}

}
