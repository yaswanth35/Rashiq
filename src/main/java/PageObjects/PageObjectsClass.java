package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsClass {
	
	WebDriver driver;

	public PageObjectsClass(WebDriver driver) {
		this.driver = driver;
	}

	// Corss button login popup
	By crosBtn = By.xpath("//button[@class='_2AkmmA _29YdH8']");

	public WebElement CrossBtn() {
		return driver.findElement(crosBtn);
	}

	// Electronics section

	By Electr = By.xpath("//span[contains(text(),'Electronic')]");

	public WebElement ElectronicLink() {
		return driver.findElement(Electr);
	}

	// Oppo Link
	public By OppoLnk = By.xpath("//a[@title='OPPO']");

	public WebElement OppoLink() {
		return driver.findElement(OppoLnk);
	}
	//View button

	public By Viewb = By.xpath("//div[@data-tracking-id='Oppo Mobiles under ₹10K']/parent::div//a[@class='_2AkmmA _1eFTEo']");

	public WebElement ViewBtn() {
		return driver.findElement(Viewb);
	}
	
	//Selecting mobile
	public By Oppomob = By.xpath("//div[contains(text(),'OPPO A3s (Purple, 16 GB)')]");

	public WebElement OppoMbl() {
		return driver.findElement(Oppomob);
	}
	
	//Add to Cart button
	public By AddtoCar = By.xpath("//li[@class='col col-6-12']/button");

	public WebElement AddtoCartBtn() {
		return driver.findElement(AddtoCar);
	}
	
	//mobile image dispaly
	
	public By mobleimg = By.xpath("//div[@class='_2rDnao']//img[@alt='OPPO A3s (Purple, 16 GB)']");

	public WebElement MobileImg() {
		return driver.findElement(mobleimg);
	}
	
	//Flipkart main icon
	
	public By flipkartIcn = By.xpath("//img[@title='Flipkart']");

	public WebElement FlipkartMainIcon() {
		return driver.findElement(flipkartIcn);
	}
	
	
	// cart image
	public By cartlmg = By.xpath("//a[@class='_3ko_Ud']");

	public WebElement CartLink() {
		return driver.findElement(cartlmg);
	}
	
	
	 // cart mobile
	public By cartmbil = By.xpath("//a[contains(text(),'OPPO A3s (Purple, 16 GB)')]");

	public WebElement cartmbilVerification() {
		return driver.findElement(cartmbil);
	}
	
	
	// place order button
	public By placeorder = By.xpath("//button/span[contains(text(),'Place Order')]");

	public WebElement PlaceOrderBtn() {
		return driver.findElement(placeorder);
	}
	// username 
	public By username = By.xpath("//input[@type='text']");

	public WebElement UserName() {
		return driver.findElement(username);
	}
	
	// password 
		public By password = By.xpath("//input[@type='password']");

		public WebElement PassWord() {
			return driver.findElement(password);
		}
		
		
		// delivery button
		public By Delivery = By.xpath("//div[@id='CNTCTF46F56FDC78743A2B2F60695A']//button");

		public WebElement DeliveryBtn() {
			return driver.findElement(Delivery);
		}
		// continue
		public By Continue = By.xpath("//button[contains(text(),'CONTINUE')]");

		public WebElement ContinueBtn() {
			return driver.findElement(Continue);
		}
		
		// net banking
		public By netbanking = By.xpath("//label[@for='NET_OPTIONS']");

		public WebElement NetBankingRadio() {
			return driver.findElement(netbanking);
		}
		
		// corporate bank
		
		public By corporate = By.xpath("//select[@class='_1CV081']");

		public WebElement CarporateBank() {
			return driver.findElement(corporate);
		}
		
		//payment button
		
		public By payment = By.xpath("//button[@type='button']");

		public WebElement PaymentBtn() {
			return driver.findElement(payment);
		}
		
		
		//corporate bank page
		public By Coporatebankpa = By.id("Sitemapfooter");

		public WebElement CorporateBankPage() {
			return driver.findElement(Coporatebankpa);
		}
		
		
		



}
