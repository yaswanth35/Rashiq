package CommonMehodspak;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import org.apache.commons.io.FileUtils;

public class ScreenShotClass {
	
	WebDriver driver;
	
	public ScreenShotClass(WebDriver driver) {
		this.driver=driver;
	}
	
public void screenshotMethod() throws IOException {
	CommonMehods cm=new CommonMehods();
	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc,new File(cm.propmethod("screenshotPath")+ cm.datepicker() +"screen.png"));
		
	}

public void windowHand() throws InterruptedException {
	Set<String> window = driver.getWindowHandles();
	Iterator<String> i = window.iterator();
	 i.next();
	Thread.sleep(5000);
	String child = (String) i.next();
	driver.switchTo().window(child);
}


}
