package launch_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Navigate 
{
	public static void main(String[] args) throws InterruptedException
	{
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://www.google.com");
       Thread.sleep(2000);
	   driver.navigate().back();
	   Thread.sleep(2000);
	   driver.navigate().forward();
	   Thread.sleep(2000);
	   driver.navigate().refresh();
	   Thread.sleep(2000);
	   driver.close();
		
	}

}
