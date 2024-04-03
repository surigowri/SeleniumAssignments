package launch_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_Add_To_Cart 
{
	public static void main(String[] args) throws IOException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchtf = driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("Shoes");
		searchtf.sendKeys(Keys.ENTER);
		WebElement firstshoe = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		firstshoe.click();
		Set<String>  pc = driver.getWindowHandles();
		Iterator<String> i1 = pc.iterator();
		String parentwindow = i1.next();
		String childwindow = i1.next();
		driver.switchTo().window(childwindow);
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		TakesScreenshot tss = driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_JavaProject\\Screenshot\\One.png");
		FileHandler.copy(source, destination);
		driver.quit();
		
	}

}
