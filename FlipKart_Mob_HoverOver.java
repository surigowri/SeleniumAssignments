package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart_Mob_HoverOver 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement electronics = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(electronics).perform();
		WebElement mobiles = driver.findElement(By.xpath("//a[.='Mobiles']"));
		mobiles.click();
		driver.close();
	}

}
