import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class calendarDateSelection {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement calendar=driver.findElement(By.id("form-field-travel_comp_date"));
		WebElement calendar1=driver.findElement(By.id("form-field-travel_comp_language"));
		int x=calendar1.getLocation().getX();
		int y=calendar1.getLocation().getY();	
		jse.executeScript("window.scrollBy(0,900)");	
		jse.executeScript("arguments[0].click()", calendar);
	
//		Actions actions = new Actions(driver);
//		actions.moveToElement(calendar).click().perform();	
		List<WebElement> days = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		for(int i=0;i<days.size();i++) {
			String date=days.get(i).getText();
			if(date.equalsIgnoreCase("25")) {
				days.get(i).click();
				break;
			}
		}

	}

	
}
