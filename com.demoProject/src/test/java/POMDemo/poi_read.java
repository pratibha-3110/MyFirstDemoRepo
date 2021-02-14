package POMDemo;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import org.testng.annotations.Test;


public class poi_read {

	@Test
	public void readDat() throws Exception{
		
		FileInputStream fis = new FileInputStream("LoginData.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheet("login");
		int rows = sh.getLastRowNum();
		int col= sh.getRow(rows).getPhysicalNumberOfCells();
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				HSSFCell cell = sh.getRow(i).getCell(j);
				String data=cell.toString();
				System.out.println("Xcel data "+ data);
		
			}
		}
	}

	
}
