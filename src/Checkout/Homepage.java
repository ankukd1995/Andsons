package Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Homepage home = new Homepage();
		home.animation(driver);

	}

	public void animation(WebDriver driver) throws InterruptedException {

		//driver.get("https://andsons-dev.myshopify.com/");
		//driver.manage().window().maximize();
		Thread.sleep(7000);

		// clicking on the hamberger menu
		driver.findElement(By.xpath("//a[@class='js-burger']")).click();
		Thread.sleep(2000);

		// Clicking on the About page
		driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		Thread.sleep(4000);

		// SCROLL DOWN at the bottom of the page
		Actions action = new Actions(driver);
		int i=0;
		while(i<5)
		{
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		i++;
		}
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='modal-header d-none d-md-block']//img")).click();
		  		  	  		  
		   // Clicking on the contact us page and giving input
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='js-burger']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//input[@id='contact_fname']")).sendKeys("Ankush");
		  driver.findElement(By.xpath("//input[@id='contact_lname']")).sendKeys("Pawar"); 
		  driver.findElement(By.xpath("//input[@id='contact_email']")).sendKeys("ankush@gmail.com");
		  Thread.sleep(2000); 
		  Select a = new  Select(driver.findElement(By.xpath("//select[@id='contact_reason']")));
		  a.selectByVisibleText("Press");
		  driver.findElement(By.xpath("//textarea[@id='contact_message']")).sendKeys("This is for the test"); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[contains(text(),'send message')]")).click(); 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id=\"thankuModal\"]/div/div/div/div/button")).click();
		  
		  // Click on the down arrow 1, 2 and 3 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//a[@class='nxt-page-link js-nxtpage-link1']//img")).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath("//a[@class='nxt-page-link js-nxtpage-link2']//img")).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath("//a[@class='nxt-page-link js-nxtpage-link3']//img")).click();
		  Thread.sleep(3000);
		  
		  // click on the About popup model 
		  driver.findElement( By.xpath("//div[@class='alllink-inner']//a[@href='javascript:void(0)'][contains(text(),'About')]")) .click();
		  
		  for (int j = 0; j <= 5; j++)
		  { 
			  driver.findElement(By.xpath("//div[@class='swiper-button-next chefbox-next next-common']")).click(); 
			  Thread.sleep(2500); 
			  }
		  
		  // Closing the About model 
		  driver.findElement(By.xpath("//div[@id='chefsmodal']//div[@class='modal-header']//img")).click();
		  Thread.sleep(2000);
		  
		  // Clicking on The choclates model 
		  driver.findElement(By.xpath("//div[@class='alllink-inner']//a[@href='javascript:void(0)'][contains(text(),'The Chocolates')]")).click();
		  Thread.sleep(2000);
		  
		 // Closing the choclate model 
		  driver.findElement(By.xpath("//div[@class='modal-header d-none d-sm-block']//img")).click();
		  
		  // Clicking on The Box model 
		  Thread.sleep(2000);
		  driver.findElement( By.xpath("//div[@class='alllink-inner']//a[@href='javascript:void(0)'][contains(text(),'The Box')]")).click(); 
		  Thread.sleep(2000); 
		  for (int k = 0; k <= 3; k++) {
		  driver.findElement(By.xpath("//div[@class='swiper-button-next artby-next next-common']")).click();
		  Thread.sleep(2500); 
		  } 
		  driver.findElement(By.xpath("//div[@id='artby']//div[@class='modal-header']//img")).click();
		  
		  // Navigating from one pop up model to other pop model
		 // About us pop up model
		  Thread.sleep(3000);
		  driver.findElement( By.xpath("//div[@class='alllink-inner']//a[@href='javascript:void(0)'][contains(text(),'About')]")) .click();
		  Actions action1 = new Actions(driver);
			int l=0;
			while(l<5)
			{
			action1.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			l++;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"chefsmodal\"]/div/div/div[3]/div/div[3]/div/div/a")).click();
			Thread.sleep(2000);
			// 24 confections
			Actions action2 = new Actions(driver);
			int m=0;
			while(m<3)
			{
			action1.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			m++;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mordern-confection-modal\"]/div/div/div[3]/div[3]/div[2]/div/a")).click();
			Thread.sleep(2000);
			
			// The box
			Actions action3 = new Actions(driver);
			int n=0;
			while(n<3)
			{
			action1.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			n++;
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"artby\"]/div/div/div[3]/div/div[3]/div[2]/div/a")).click();
			Thread.sleep(2000);
			// closing the window
			driver.findElement(By.xpath("//*[@id=\"chefsmodal\"]/div/div/div[2]/button")).click();

	}

}
