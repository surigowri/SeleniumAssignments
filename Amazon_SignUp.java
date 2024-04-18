package launch_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_SignUp 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=14857061257826374150&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302563&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D365796860740093476%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9148530%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement hello_signin = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(hello_signin).perform();
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		//driver.close();
		
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("gowrineelu3@gmail.com");
		WebElement cont_btn = driver.findElement(By.id("continue"));
		cont_btn.click();
		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys("bjppmk@123");
		WebElement submit_btn = driver.findElement(By.id("signInSubmit"));
		submit_btn.click();
		driver.navigate().refresh();
		
		WebElement mobiles = driver.findElement(By.xpath("//a[.='Mobiles']"));
		mobiles.click();
		
		Set<String> pc = driver.getWindowHandles();
		Iterator<String> i1 = pc.iterator();
		String parentwindow = i1.next();
		String childwindow = i1.next();
		driver.switchTo().window(childwindow);
		
		WebElement add_wishlist = driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		add_wishlist.click();
		WebElement create_list = driver.findElement(By.xpath("(//span[.='Create List'])[4]"));		
		create_list.click();
		WebElement cont_shopping = driver.findElement(By.xpath("//button[.='Continue shopping']"));
		cont_shopping.click();
		
		WebElement addtocart = driver.findElement(By.xpath("(//input[@id ='add-to-cart-button'])[2]"));
		addtocart.click();
		
		WebElement cart = driver.findElement(By.xpath("    //span[@id='attach-sidesheet-view-cart-button-announce']"));
		cart.click();
		WebElement proceedtobuy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		proceedtobuy.click();
		WebElement usethisadd = driver.findElement(By.xpath("//span[@id='shipToThisAddressButton-announce']"));
		usethisadd.click();
		
		WebElement cc = driver.findElement(By.xpath("(//span[@class='pmts-indiv-issuer-image'])[1]"));
		cc.click();
		
				
	}

}
