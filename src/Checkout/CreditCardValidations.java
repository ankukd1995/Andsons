package Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreditCardValidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		CreditCardValidations card = new CreditCardValidations();
		try {
			card.execute(driver);
		} catch (InterruptedException ex) { 
			ex.printStackTrace();
		} 

	}

	public void execute(WebDriver driver) throws InterruptedException

	{

		driver.get("https://andsons-dev.myshopify.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// Click on the order button to place the order
		driver.findElement(By.xpath("//span[@class='d-none d-md-block']")).click();
		Thread.sleep(4000);
		// to increase the quantity
		// driver.findElement(By.xpath("//*[@class='qty-compo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='sbtbtn']")).click();

		// Step1 - Shipping address
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ankush");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("pawar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test716@mailinator.com");
		driver.findElement(By.xpath("//input[@id='sfirstname']")).sendKeys("Ankush");
		driver.findElement(By.xpath("//input[@id='slastname']")).sendKeys("pawar");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Cemtrexlabs");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("New York, NY, USA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='locality']")).sendKeys("New York");
		Thread.sleep(2000);

		// Selecting the state
		Select a = new Select(driver.findElement(By.xpath("//select[@id='administrative_area_level_1']")));
		a.selectByVisibleText("NY");
		Thread.sleep(2000);

		// Entering the zip code
		driver.findElement(By.cssSelector("#postal_code")).sendKeys("10001");
		driver.findElement(By.xpath("//div[@class='row no-gutters']//div[1]//div[1]//label[1]//span[1]")).click();
		driver.findElement(By.xpath("//button[@id='ContinueToShipping']")).click();

		// Step2- Selecting the delivery date
		Thread.sleep(5000);
		// driver.findElement(By.cssSelector("#ContinueToPay")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@id='1']//span[@class='checkmark']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#ContinueToPay")).click();

		// Step3- Adding the payment details- adding all the credit cards from the
		// stripe account

		// Visa card
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("4242424242424242");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Visa debit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("4000056655665556");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Master card

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();

		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("5555555555554444");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Master card 2-series

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("2223003122003222");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Master card debit

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("5200828282828210");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Master card prepaid

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("5105105105105100");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// American express

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("378282246310005");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// American express

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("371449635398431");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Discover

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("6011111111111117");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Discover

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("6011000990139424");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Dinners Club

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("30569309025904");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Dinners Club

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("38520000023237");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// JCB

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("3566002020360505");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

		// Union Pay

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).clear();
		driver.findElement(By.xpath("//input[@id='expiry']")).clear();
		driver.findElement(By.xpath("//input[@id='cvv']")).clear();
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("6200000000000005");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

}
