package launch_Selenium;
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
		WebElement fourthSuggestion = driver.findElement(By.xpath("(//a[@class='_3izBDY'])[4]"));
	    fourthSuggestion.click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
