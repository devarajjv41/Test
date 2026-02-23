import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;

public class ScrollInTable {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		jse.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");//tbl scroll
		List<WebElement> tablevalues = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		System.out.println(tablevalues.size());
		int sum=0;
		for(int j=0;j<tablevalues.size();j++) {
			
			sum=sum+Integer.parseInt(tablevalues.get(j).getText());
		}
		
		System.out.println(sum);
		String totalamount=driver.findElement(By.cssSelector(".totalAmount")).getText();
		String ttlam[]=totalamount.split(":");
		String amt=ttlam[1].trim();
		int amtt=Integer.parseInt(amt);
		if(sum==amtt) {
		System.out.println("Amount matching");
		}
		
	}

}
