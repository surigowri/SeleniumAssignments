package launch_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTM_Drag_Drop 
{
	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement postman = driver.findElement(By.xpath("//img[@id='drag7']"));
		WebElement drop_box = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(postman, drop_box).perform();
//		a1.doubleClick().perform();
		Thread.sleep(3000);
	//	Actions a2 = new Actions(driver);
		a1.dragAndDrop(drop_box, postman).perform();
//		a2.doubleClick().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
