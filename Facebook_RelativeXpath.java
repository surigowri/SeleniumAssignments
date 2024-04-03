package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_RelativeXpath
{

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys("gowri@gmail.com");
	    
	    WebElement pword = driver.findElement(By.xpath("//input[@id='pass']"));
	    pword.sendKeys("gowri@123");
	    
	    WebElement login_btn = driver.findElement(By.xpath("//button[@name='login']"));
	    login_btn.click();
	    
	    Thread.sleep(2000);
	    driver.close();
	}

}
