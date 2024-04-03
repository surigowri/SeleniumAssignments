package launch_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_Jsam__Absolute_Xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/learningHTML1.html");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement u_name = driver.findElement(By.xpath("(/html/body/input)[1]"));
		u_name.sendKeys("Manu");
		
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("Juno");
		
		WebElement p_word = driver.findElement(By.xpath("(/html/body/input)[3]"));
		p_word.sendKeys("Manu@123");
		
		WebElement f_name = driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		f_name.sendKeys("Manu");
		
//	disabled	WebElement l_name = driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]"));
//		l_name.sendKeys("Sri");
		
		WebElement submit_btn = driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]"));
		submit_btn.click();
		
		Thread.sleep(2000);
		WebElement boy = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		boy.click();
		
		WebElement submit_btn1 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]"));
		submit_btn1.click();
		
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		
		WebElement relocate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		relocate.click();
		
		WebElement link = driver.findElement(By.xpath("/html/body/a"));
		link.click();
		
		WebElement religion = driver.findElement(By.xpath("(/html/body/select/option)[1]"));
		religion.click();
		
		WebElement signup = driver.findElement(By.xpath("(/html/body/input)[7]"));
		signup.click();
		
		Thread.sleep(2000);
	    driver.close();
	}

}
