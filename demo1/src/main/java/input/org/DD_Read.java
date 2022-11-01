package input.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class DD_Read {
	
	
	public static void Rank() throws IOException {

		File ref = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\try.xlsx");

		FileInputStream xl = new FileInputStream(ref);

		XSSFWorkbook wbook = new XSSFWorkbook(xl);
		
		
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		
		System.out.println(cellType);
        int nRows = sheet.getPhysicalNumberOfRows();
        System.out.println( nRows);
      int numberOfCells = row.getPhysicalNumberOfCells();   
      
        for(int i =0;i<=nRows;i++) {
			XSSFRow row2 = sheet.getRow(i);
     	
			int pncel = row2.getPhysicalNumberOfCells();
			System.out.println();
			
			
			for (int k=0;k<=pncel;k++) {
				XSSFCell cell2 = row2.getCell(k);
				System.out.print(cell2+  " "+ "        ");
			}
			}
		}
        
        
		
//		System.out.println( numberOfCells);
//		if (cellType.equals(cellType.STRING)) {
//			String svalue = cell.getStringCellValue();
//			System.out.println(svalue);
//
//		} else if (cellType.equals(cellType.NUMERIC)) {
//			double nValue = cell.getNumericCellValue();
//			int j = (int) nValue;
//			System.out.println(j);
//		}
//	}

	public static void main(String[] args) throws IOException {

Rank();
	}
}
