package util;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Exceldataprovider {
	public static int rowcount =0;
	public static int colcount =0;
	public static String Cell = null;
	public static String projectpath = null;
	public static String sheet = null;


	@Test(dataProvider = "test1data")
	public void test1(String username , String Password) {

		System.out.println(username+ "|" +Password);
	}

	@DataProvider(name="test1data" )
	public 	Object[][] getdata() throws IOException{

		projectpath =  "C:\\Users\\abhi\\eclipse-workspace\\Startselenium\\Excel\\Book1.xlsx";
		Object data[][] = testdata(projectpath,"Sheet1");
		return data;
	}





	public static Object[][] testdata(String projectpath,String Sheet) throws IOException {

		Fetch exc = new Fetch(projectpath,Sheet);
		rowcount = exc.getrowcoun();
		colcount = exc.getcolcoun();
		Object data[][] = new Object[rowcount-1][colcount];

		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {

				String Cell = exc.getstringdata(i, j);	
				System.out.print(Cell+ " | ");
				data[i-1][j]= Cell;

			}
			System.out.println();

		}
		return data;
	}


}
