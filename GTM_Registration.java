package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTM_Registration 
{
	public static void main(String[] args) throws InterruptedException 
	{

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		driver.findElement(By.id("email")).sendKeys("gowri@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Gowri@123");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Present-Address")).sendKeys("Vivekandha 1st St");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Vivekandha 1st St");
		driver.findElement(By.id("relocate")).click();
		driver.findElement(By.id("Pincode")).sendKeys("600007");
		Thread.sleep(3000);
		driver.close();
	}

}
