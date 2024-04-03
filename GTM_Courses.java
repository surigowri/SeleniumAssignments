package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTM_Courses 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement courses = driver.findElement(By.linkText("Courses"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(courses).perform();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
