import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class movetoElement {

	public static void main(String[] args) throws Exception {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("United");
		Thread.sleep(2000);
		for(int i=0;i<=3;i++) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);	
		}
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

	}

}