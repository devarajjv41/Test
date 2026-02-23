import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebElement wb = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select slt = new Select(wb);
		slt.selectByVisibleText("Consultant");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']//p")));
		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']//p")).getText());
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		List<WebElement> add = driver.findElements(By.xpath("//button[.='Add ']"));
		for(WebElement ele:add) {
			ele.click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

}
