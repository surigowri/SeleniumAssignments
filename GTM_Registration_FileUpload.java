package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTM_Registration_FileUpload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement file_upload = driver.findElement(By.xpath("//input[@id='file']"));
		file_upload.sendKeys("C:\\Users\\user\\eclipse-workspace\\Selenium_JavaProject\\src\\launch_Selenium");
		Thread.sleep(2000);
		driver.close();
		
	}

}
