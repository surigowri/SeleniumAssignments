package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mob_Text 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    WebElement mobiles_text = driver.findElement(By.xpath("//a[.='Mobiles']"));
	    mobiles_text.click();
	    driver.close();
	}

}
