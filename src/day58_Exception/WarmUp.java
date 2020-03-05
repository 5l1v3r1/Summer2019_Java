package day58_Exception;

import java.io.FileInputStream;
import java.util.Properties;

/*
  1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
            parameters: double seconds
            return-type: void
            Thread.sleep();
       Note: Exceptions MUST be handled within the methods
    
    2. write a method called "getData" that can retrieve the data from properties files
            parameters: String Key, String FilePath
            return-type: String
        Note: Exceptions MUST be handled within the methods
 */
public class WarmUp {
	
	public static void main(String[] args) {
		Wait(3);
		System.out.println("batch 12");
		
		
		 Properties property = new Properties();
			
			String path = "C:\\Users\\meamj\\Desktop\\Data.properties";
			
			try {
				FileInputStream file = new FileInputStream(path);
				property.load(file);
			} catch (Exception e) {
				
			}
			
			String Name = property.getProperty("ID");
			System.out.println(Name);
			
			System.out.println(getData("Name","C:\\\\Users\\\\meamj\\\\Desktop\\\\Data.properties"));
		
			
		String Age1 = getData("Age", "TestData.properties"); // ayni projectin icinde oldugumuz icin pathin hepsini vermedik
		System.out.println(Age1); // 19 will appear from the TestData file
		
		String URL = getData("URL","files\\TestData2.properties"); // baska bir folderin icinde oldugundan sadece dosyanin adini yazamazsin, hangi dosyada oldugu da belli olmali
		System.out.println(URL);
	}
	
	public static void Wait(double seconds) {
		
		try{
			Thread.sleep((long)(seconds*1000));
		}catch (Exception e) {
			System.out.println("unchecked exception");
		}
		
	}
	
	public static String getData(String key, String FilePath) {
		String data = "";
		
        Properties property = new Properties();
	
		try {
			FileInputStream file = new FileInputStream(FilePath);
			property.load(file);
		} catch (Exception e) {
			
		}
		
		data = property.getProperty(key);
		
	
		return data;
	}

}
