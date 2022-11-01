import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	 static void aad() throws IOException {
		 
		 
		 File f =new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Write.xlsx");
		 FileInputStream excel =new FileInputStream(f);
		 XSSFWorkbook wb = new XSSFWorkbook(excel);
          XSSFSheet cs = wb.createSheet("DAY2");
        XSSFRow cr = cs.createRow(0);
        XSSFCell cc = cr.createCell(0);
        XSSFCell cc1 = cr.createCell(1);
        XSSFCell cc2 = cr.createCell(2);
        XSSFCell cc3 = cr.createCell(3);
        wb.getSheet("DAY2").getRow(0).getCell(0).setCellValue("username");
        wb.getSheet("DAY2").getRow(0).getCell(1).setCellValue("password");
        wb.getSheet("DAY2").getRow(0).getCell(2).setCellValue("kumar");
        wb.getSheet("DAY2").getRow(0).getCell(3).setCellValue("1234578");
        FileOutputStream ff = new FileOutputStream(f);
        wb.write(ff);
        System.out.println("sheet created");
        
       
}
	 public static void main(String[] args) throws IOException {
		aad();
	}
}