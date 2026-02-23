import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkCount {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement ele = driver.findElement(By.xpath("//div[@id='gf-BIG']//tr//td[1]")); //limiting the webdriver scope using webelement
		System.out.println(ele.findElements(By.tagName("a")).size());
		
		for(int i=1;i<ele.findElements(By.tagName("a")).size();i++) {
			
			String clickonlinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ele.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
			
		}
		Set<String> links = driver.getWindowHandles();
		Iterator<String> it = links.iterator();
		while(it.hasNext()) {
			System.out.println(driver.switchTo().window(it.next()).getTitle());
		}
		}
		
	

}
