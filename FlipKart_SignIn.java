package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart_SignIn 
{
	
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement login = driver.findElement(By.xpath("//span[.='Login']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(login).perform();
		a1.doubleClick().perform();
		WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys("7418015166");
		WebElement req_otp = driver.findElement(By.xpath("//button[.='Request OTP']"));
		req_otp.click();
		driver.close();
		
	}

}
