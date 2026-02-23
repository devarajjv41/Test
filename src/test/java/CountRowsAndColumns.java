import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountRowsAndColumns {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		List<WebElement> columnCount = driver.findElements(By.xpath("(//table[@id='product'])[1]//th"));
		System.out.println("Number of columns present in table="+columnCount.size());
		List<WebElement> rowCount = driver.findElements(By.xpath("(//table[@id='product'])[1]//tr"));
		System.out.println("Number of rows present in table="+rowCount.size());
		System.out.println(rowCount.get(2).getText());
	}

}
