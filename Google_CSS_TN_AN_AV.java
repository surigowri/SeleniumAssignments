package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_CSS_TN_AN_AV 
{
	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.cssSelector("#APjFqb"));
		search.sendKeys("gro tech minds");
		search.sendKeys(Keys.ENTER);
		WebElement dots = driver.findElement(By.cssSelector("span[class='z1asCe SaPW2b']"));
		dots.click();
		Thread.sleep(2000);
		driver.close();
	}

}
