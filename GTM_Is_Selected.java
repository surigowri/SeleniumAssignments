package launch_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GTM_Is_Selected
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement relocate_chbox = driver.findElement(By.id("relocate"));
		relocate_chbox.click();	
		if(relocate_chbox.isDisplayed()==true && relocate_chbox.isSelected()==true)
		{
			System.out.println("Relocate checkbox is Selected");
		}
//		 WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
//		 assertTrue(w1.until(ExpectedConditions.elementToBeSelected(relocate_chbox)));
		
		driver.close();
	}

}
