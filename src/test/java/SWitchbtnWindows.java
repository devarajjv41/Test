import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SWitchbtnWindows {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[.='Multiple Windows']")).click();
		driver.findElement(By.xpath("//div[@id='content']//a")).click();
		
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> it = wins.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
//		driver.switchTo().window(parentid);
		driver.switchTo().defaultContent(); //switch to parent window
		System.out.println(driver.findElement(By.tagName("h3")).getText());
	}

}
