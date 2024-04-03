package launch_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_RightClick 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       WebElement continue_login = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
       continue_login.click();
       WebElement uname = driver.findElement(By.cssSelector("#username"));
       uname.sendKeys("Ram");
       WebElement pword = driver.findElement(By.cssSelector("#label2"));
       pword.sendKeys("ramu@123");
       Thread.sleep(10000);
       WebElement loginbtn = driver.findElement(By.cssSelector("#Button2"));
       loginbtn.click();
       Thread.sleep(2000);
       String title = driver.getTitle();
       System.out.println(title);
   //    Thread.sleep(2000);
	   driver.quit();
		
	}

}
