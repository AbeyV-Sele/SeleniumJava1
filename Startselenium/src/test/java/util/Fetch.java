package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fetch {


	static XSSFWorkbook WOrkbook = null;
	static XSSFSheet sheet = null;

	public Fetch(String path, String seet) throws IOException{

		WOrkbook = new XSSFWorkbook(path);
		sheet = WOrkbook.getSheet(seet);
	} 




	public int getrowcoun() {


		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows:" +rowcount);
		return rowcount;
	}

	public int getcolcoun() {
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns:" +colcount);
		return colcount;
	}

	public String getstringdata(int rownum, int colnum) {
		String celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return celldata;

	}

	public void getnumdata(int rownum, int colnum) {
		double numdata = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		System.out.println(numdata);

	}


}
