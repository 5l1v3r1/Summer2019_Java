package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	public static void main(String[] args) throws Exception{
		

		String filePath = "C:\\Users\\meamj\\Desktop\\TestData.xlsx";
		String sheetname = "Sayfa1"; // name of the sheet
		
		FileInputStream file = new FileInputStream(filePath); // reads a file
		
		Workbook excelFile = WorkbookFactory.create(file); // specially designed for excel files
	//	XSSFWorkbook  excelFile2 = new XSSFWorkbook(); // does the same thing
		
		Sheet sheet = excelFile.getSheet(sheetname); // gets the specific spread sheet from excel file
		
		Cell cell = sheet.getRow(1).getCell(0); // retrieves specific cell from spread sheet
		
		cell.setCellValue("Esra");
		
        String cellData = cell.toString(); // converts the cell' value to String data
		
		System.out.println(cellData);
		
		
		
	}

}
