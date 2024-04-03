package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTM_Registration_DD 
{
	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("gowri@gmail.com");
		WebElement pword = driver.findElement(By.id("password"));
		pword.sendKeys("Gowri@123");
		WebElement male = driver.findElement(By.id("male"));
		male.click();
		WebElement female = driver.findElement(By.id("Female"));
		female.click();
		WebElement skills_dd = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s1 = new Select(skills_dd);
		s1.selectByValue("select1");
		skills_dd.click();
		WebElement country_dd = driver.findElement(By.xpath("//select[@id='Country']"));
		Select s2 = new Select(country_dd);
		s2.selectByVisibleText("India ");
		country_dd.click();
		WebElement religion_dd = driver.findElement(By.xpath("//select[@id='Relegion']"));
		Select s3 = new Select(religion_dd);
		s3.selectByIndex(1);
		religion_dd.click();
		Thread.sleep(1000);
		WebElement present_add = driver.findElement(By.id("Present-Address"));
		present_add.sendKeys("Vivekandha 1st St");
		present_add.sendKeys(Keys.CONTROL+"a");
		present_add.sendKeys(Keys.CONTROL+"c");
		WebElement permanent_add = driver.findElement(By.id("Permanent-Address"));
		permanent_add.sendKeys("Vivekandha 1st St");
		permanent_add.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		
        driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
