package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("gowri@gmail.com");
	    
	    WebElement pword = driver.findElement(By.id("pass"));
	    pword.sendKeys("gowri@123");
	    
	    WebElement login_btn = driver.findElement(By.name("login"));
	    login_btn.click();
	    
	    Thread.sleep(2000);
	    driver.close();
	}

}
