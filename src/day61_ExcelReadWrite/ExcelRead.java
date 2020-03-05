package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\meamj\\Desktop\\TestData.xlsx";
		String sheetname = "Sayfa1"; // name of the sheet
		
		FileInputStream file = new FileInputStream(filePath); // reads a file
		
		Workbook excelFile = WorkbookFactory.create(file); // specially designed for excel files
	//	XSSFWorkbook  excelFile2 = new XSSFWorkbook(); // does the same thing
		
		Sheet sheet = excelFile.getSheet(sheetname); // gets the specific spread sheet from excel file
		
		Cell cell = sheet.getRow(0).getCell(0); // retrieves specific cell from spread sheet
		
		String cellData = cell.getStringCellValue(); // converts the cell' value to String data
		
		System.out.println(cellData);
		
	}

}
