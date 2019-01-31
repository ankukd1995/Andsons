package Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class profile {
	// execute(driver);

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		profile profile = new profile();
		try {
			profile.execute(driver);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public void execute(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		// driver.get("https://andsons-dev.myshopify.com/");
		// driver.manage().window().maximize();
		Thread.sleep(4000);
		// Click on hamberger menu
		driver.findElement(By.xpath("//a[@class='js-burger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CustomerEmail']")).sendKeys("apawar@cemtrexlabs.com");
		driver.findElement(By.xpath("//input[@id='CustomerPassword']")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='sign in']")).click();
		// Profile
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Profile')]")).click();
		Thread.sleep(2000);
		// Edit name
		driver.findElement(By.xpath("//a[@href='https://andsons-dev.myshopify.com/pages/edit-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='first_name']")).clear();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Ankush");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last_name']")).clear();
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Pawar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='update name']")).click();
		Thread.sleep(2000);
		// Update Phone Number
		driver.findElement(By.xpath("//a[@href='https://andsons-dev.myshopify.com/pages/edit-phone']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Back to profile')]")).click();

		driver.findElement(By.xpath("//div[@class='action-control flex-row-reverse flex-md-row']//a")).click();
		// Order History
		driver.findElement(By.xpath("//span[contains(text(),'order history')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody//tr[1]//td[1]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='action-control mt-4']//a[@href='javascript:void(0)']")).click();
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,1800)", "");
		driver.findElement(By.xpath("//div[@class='action-control mt-4']//a")).click();
		// Address book
		driver.findElement(By.xpath("//span[contains(text(),'address book')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='action-control mt-3']//a[1]")).click();
		Thread.sleep(2000);
		// Stored Cards
		driver.findElement(By.xpath("//span[contains(text(),'stored cards')]")).click();
		Thread.sleep(2000);
		// Click on the add new cards
		driver.findElement(By.xpath("//a[contains(text(),'add a new credit card')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='creditcard']")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("//input[@id='expiry']")).sendKeys("0919");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("123");
		driver.findElement(By.cssSelector("#zipcode")).sendKeys("10001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='add address']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"show-cards-design\"]/div[1]/div/form/div[2]/a[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='action-control mt-3']//a[1]")).click();
		Thread.sleep(2000);
        
		// logout
		driver.findElement(By.xpath("//span[contains(text(),'log out')]")).click();
		Thread.sleep(2000);
	}

}
