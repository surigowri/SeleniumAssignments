package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_Jsam_Popup 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/learningHTML1%20(1).html");
		driver.switchTo().alert().accept();
		WebElement u_name = driver.findElement(By.xpath("(//input[1])[1]"));
		u_name.sendKeys("Manu");
		
		WebElement hint = driver.findElement(By.xpath("(//input[2])[1]"));
		hint.sendKeys("Juno");
		
		driver.close();
		
	}

}
