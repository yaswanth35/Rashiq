package CommonMehodspak;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;



public class CommonMehods {

	
	
	
	public String propmethod(String text) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\Rashiq\\eclipse-workspace\\flipkartAssi\\src\\main\\resources\\PropetiesFile\\ResourProp.properties");
		
	    Properties pro= new Properties();
	    pro.load(fis);
	    String s=pro.getProperty(text);
	    return s;
	}
	
	public String datepicker() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
		
	}
	
	
}
