package launch_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSS_SubString
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement electronics = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(electronics).perform();
		WebDriverWait w1 = new  WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class^='_1UgUY']"))).click();
		driver.close();
	}

}
