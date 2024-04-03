package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CustomerService_PartialLink 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    WebElement customer_partial = driver.findElement(By.partialLinkText("Customer"));
	    customer_partial.click();
	    driver.close();
	}

}
