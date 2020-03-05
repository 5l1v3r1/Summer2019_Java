package day61_ExcelReadWrite;

public class TestExcelReadWrite {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\meamj\\Desktop\\TestData.xlsx";
		String sheetname = "Sayfa1";  // onlarda Sheet1 yaziyor ama benimki turce
		
		ExcelReadWrite obj = new ExcelReadWrite(path, sheetname);
		
		String data1 = obj.readData(1, 0);
		System.out.println(data1);
		
		obj.WriteData(1, 0, "Esra");  // bunu bir string e de assign yapabilirsin ama readData da sonuc olarak read yapiyo
		System.out.println(obj.readData(1, 0));
		
	}
}
