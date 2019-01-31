package Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndsonsCheckoutTest {
	public static void main(String args[]) {
		try {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			steps step = new steps();
			step.execute(driver);

			profile profileTest = new profile(); 
			profileTest.execute(driver);

			Homepage home = new Homepage();
			home.animation(driver);
			
			CreditCardValidations card = new CreditCardValidations();
			card.execute(driver);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
