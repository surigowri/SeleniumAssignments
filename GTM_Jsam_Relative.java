package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_Jsam_Relative 
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement u_name = driver.findElement(By.xpath("(//input[1])[1]"));
		u_name.sendKeys("Manu");
		
		WebElement hint = driver.findElement(By.xpath("(//input[2])[1]"));
		hint.sendKeys("Juno");
		
		WebElement p_word = driver.findElement(By.xpath("(//input[3])[1]"));
		p_word.sendKeys("Manu@123");
		
		WebElement f_name = driver.findElement(By.xpath("(//input[1])[2]"));
		f_name.sendKeys("Manu");
		
//		WebElement l_name = driver.findElement(By.xpath("(//input[2])[2]"));
//		l_name.sendKeys("Sri");
		
		WebElement submit_btn = driver.findElement(By.xpath("(//input[3])[2]"));
		submit_btn.click();
		
		Thread.sleep(2000);
//		WebElement boy = driver.findElement(By.xpath("(//input[1])[3]"));
//		boy.click();
		
//		WebElement submit_btn1 = driver.findElement(By.xpath("(//input[4])[1]"));
//		submit_btn1.click();
		
		WebElement female = driver.findElement(By.xpath("//input[5]"));
		female.click();
		
		WebElement locate = driver.findElement(By.xpath("//input[6]"));
		locate.click();
		
		WebElement link = driver.findElement(By.xpath("//a[1]"));
		link.click();
		
		
		Thread.sleep(2000);
	    driver.close();
		
	}

}
