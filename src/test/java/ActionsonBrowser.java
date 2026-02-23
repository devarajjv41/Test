import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsonBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.com/");
		Actions act = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement ele1=driver.findElement(By.id("twotabsearchtextbox"));
		
		Thread.sleep(2000);
//		act.moveToElement(ele).keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
//		act.moveToElement(ele).contextClick().build().perform();
		act.moveToElement(ele1).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		

	}

}
