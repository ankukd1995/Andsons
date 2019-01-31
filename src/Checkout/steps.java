package Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class steps {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		steps step = new steps();
		try {
			step.execute(driver);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public void execute(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		// Entering the URL on to the browser
		driver.get("https://andsons-dev.myshopify.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		// Click on the order button to place the order
		driver.findElement(By.xpath("//span[@class='d-none d-md-block']")).click();
		Thread.sleep(2000);
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

		// Step3- Adding the payment details
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("4242424242424242");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ReviewOrder']")).click();

		// Step4- Review order
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id='complete_order']")).click();

		// Back to Homepage
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@alt='andSons logo']")).click();

	}

}
