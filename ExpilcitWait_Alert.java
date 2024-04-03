package launch_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpilcitWait_Alert 
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/learningHTML1%20(1).html");
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		WebElement u_name = driver.findElement(By.xpath("(//input[1])[1]"));
		u_name.sendKeys("Manu");
		
		WebElement hint = driver.findElement(By.xpath("(//input[2])[1]"));
		hint.sendKeys("Juno");
		Thread.sleep(2000);
		driver.close();
	}

}
