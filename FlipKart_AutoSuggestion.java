package launch_Selenium;
import java.util.List;

// not yet completed
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_AutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search_tf = driver.findElement(By.name("q"));
		search_tf.sendKeys("laptop");
		search_tf.sendKeys(Keys.ENTER);
//		WebElement fourthSuggestion = driver.findElement(By.xpath("(//a[@class='_3izBDY'])[4]"));//div/form/ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li
//	    fourthSuggestion.click();
	    WebElement autosuggestions = driver.findElement(By.xpath("(//div[@class='lrtEPN _17d0yO'])[4]"));
		Thread.sleep(1000);
//	    autosuggestions.click();
	    WebElement fourthsuggestion = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	    fourthsuggestion.click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
