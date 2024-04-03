package launch_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class GTM_DD_Options 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://grotechminds.com/dropdown");
      driver.manage().window().maximize();
      
      WebElement choice1 = driver.findElement(By.xpath("(//select[@id='Choice1'])[1]"));
	  Select s1 = new Select(choice1);
	  s1.selectByIndex(2);
	  
	  WebElement choice2 = driver.findElement(By.xpath("(//select[@id='Choice2'])[1]"));
	  Select s2 = new Select(choice2);
	  s2.selectByValue("practice1");
	  
	  WebElement choice3 = driver.findElement(By.xpath("(//select[@id='Choice3'])[1]"));
	  Select s3 = new Select(choice3);
	  s3.selectByVisibleText("Power2");
	  
	  WebElement choice4 = driver.findElement(By.xpath("(//select[@id='Choice4'])[1]"));
	  Select s4 = new Select(choice4);
	  s4.selectByIndex(3);
	  
	  WebElement choice5 = driver.findElement(By.xpath("(//select[@id='Choice5'])[1]"));
	  Select s5 = new Select(choice5);
	  s5.selectByValue("Day5");
	  
	  WebElement choice6 = driver.findElement(By.xpath("(//select[@id='Choice6'])[1]"));
	  Select s6 = new Select(choice6);
	  s6.selectByVisibleText("Night4");
	  
	  WebElement choice7 = driver.findElement(By.xpath("(//select[@id='Choice7'])[1]"));
	  Select s7 = new Select(choice7);
	  s7.selectByVisibleText("Night6");
	  
	  WebElement choice8 = driver.findElement(By.xpath("(//select[@id='Choice7'])[1]"));
	  Select s8 = new Select(choice8);
	  s8.selectByIndex(7);
	  	  
	  WebElement choice9 = driver.findElement(By.xpath("(//select[@id='Choice8'])[1]"));
	  Select s9 = new Select(choice9);
	  s9.selectByVisibleText("QTP8");
	  
	  WebElement choice10 = driver.findElement(By.xpath("(//select[@id='Choice9'])[1]"));
	  Select s10 = new Select(choice10);
	  s10.selectByIndex(9);
	  
	  WebElement choice11 = driver.findElement(By.xpath("(//select[@id='Choice10'])[1]"));
	  Select s11 = new Select(choice11);
	  s11.selectByIndex(5);
	  Thread.sleep(3000);
	  
	  List <WebElement> list = s1.getOptions();
	  int count = list.size();
	  System.out.println(count);
	  
	  TakesScreenshot tss = driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\user\\eclipse-workspace\\Selenium_JavaProject\\Screenshot\\One"+new GTM_DD_Options().getClass() +".png");
		FileHandler.copy(source, destination);
	  driver.close();
	}

}
