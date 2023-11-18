package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream  fileInputStream=new FileInputStream("./Testdata/data.properties");
		
		Properties property=new Properties();
		property.load(fileInputStream);
		
		String value = property.getProperty("url");
		
		
		System.out.println(value);	
		
	}

}
