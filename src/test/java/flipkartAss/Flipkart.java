package flipkartAss;

import java.io.IOException;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonMehodspak.CommonMehods;
import CommonMehodspak.ScreenShotClass;
import PageObjects.PageObjectsClass;

public class Flipkart {

	@Test
	public void login() throws IOException, InterruptedException {
		CommonMehods cm = new CommonMehods();
		System.setProperty("webdriver.chrome.driver", cm.propmethod("Chromepath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.get(cm.propmethod("URL"));

		PageObjectsClass po = new PageObjectsClass(driver);
		try {
			po.CrossBtn().click();
		} catch (Exception e) {
			System.out.println("no login screen pop up");

		}

		// Moving to Electronics section
		Actions a = new Actions(driver);
		a.moveToElement(po.ElectronicLink()).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 100);

		// Selecting the Oppo link
		wait.until(ExpectedConditions.visibilityOfElementLocated(po.OppoLnk));
		po.OppoLink().click();

		// Selecting  View button in  mobile under 10k section
		wait.until(ExpectedConditions.elementToBeClickable(po.Viewb));
		po.ViewBtn().click();
		
		
		//selecting  OPPO A3s (Purple, 16 GB)
		wait.until(ExpectedConditions.elementToBeClickable(po.Oppomob));
		po.OppoMbl().click();
		
		
		//Handling Windows
		ScreenShotClass scl = new ScreenShotClass(driver);
		scl.windowHand();
		Thread.sleep(3000);
		
		//add to cart button
		wait.until(ExpectedConditions.elementToBeClickable(po.AddtoCar));
		
		// mobile image 
		wait.until(ExpectedConditions.visibilityOfElementLocated(po.mobleimg));
		
		//Add to cart button click
		po.AddtoCartBtn().click();
		//Thread.sleep(2000);
		
		//Click on flipkart main icon
		po.FlipkartMainIcon().click();
		
		//Click on cart 
		wait.until(ExpectedConditions.elementToBeClickable(po.cartlmg));
		po.CartLink().click();
        // cart mobile verification
		boolean b = po.cartmbilVerification().isDisplayed();
		Assert.assertTrue(b);
		
		//Click on place order button
		wait.until(ExpectedConditions.elementToBeClickable(po.placeorder));

		// placing order
		Thread.sleep(3000);
		po.PlaceOrderBtn().click();

		// signing up
		wait.until(ExpectedConditions.elementToBeClickable(po.username));
		po.UserName().sendKeys("muzzu339@gmail.com");
		po.UserName().sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(po.password));
		po.PassWord().sendKeys("king340");
		po.PassWord().sendKeys(Keys.ENTER);
		
        // Delivery button
		wait.until(ExpectedConditions.elementToBeClickable(po.Delivery));
		po.DeliveryBtn().click();
		
		
		// continue button
		wait.until(ExpectedConditions.elementToBeClickable(po.Continue));
		po.ContinueBtn().click();
		Thread.sleep(3000);
		
		// net banking
		 wait.until(ExpectedConditions.elementToBeClickable(po.netbanking));
		po.NetBankingRadio().click();
       
		// selecting corporation bank
		Select sec = new Select(po.CarporateBank());
		sec.selectByValue("CORPORATION");

		// payments
		wait.until(ExpectedConditions.elementToBeClickable(po.payment));
		po.PaymentBtn().click();
		
		// corporate bank
		wait.until(ExpectedConditions.elementToBeClickable(po.Coporatebankpa));

		// screenshot
		scl.screenshotMethod();
	}
}
