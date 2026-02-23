import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class filtersearchusingStream {

	public static void main(String[] args) {
	
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String item = "Rice";
		driver.findElement(By.id("search-field")).sendKeys(item);
		List<WebElement>products= driver.findElements(By.xpath("//tr//td[1]"));
		List<WebElement> product=products.stream().filter(s->s.getText().equals(item)).collect(Collectors.toList());
		Assert.assertEquals(products.size(), product.size());
		
		
		
		

	}

}
