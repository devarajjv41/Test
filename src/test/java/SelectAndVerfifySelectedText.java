import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectAndVerfifySelectedText {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement optCheckbox =driver.findElement(By.id("checkBoxOption2"));
		WebElement checkboxvalue = driver.findElement(By.xpath("//input[@id='checkBoxOption2']//.."));
		optCheckbox.click();
		String checkboxtxt=checkboxvalue.getText().trim();
		System.out.println("Checkbox value "+checkboxtxt);
		WebElement sltOpt = driver.findElement(By.id("dropdown-class-example"));
		sltOpt.click();
		Select slt = new Select(sltOpt);
		slt.selectByVisibleText(checkboxtxt);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(checkboxtxt);
		driver.findElement(By.id("alertbtn")).click();
		String alrtext=driver.switchTo().alert().getText();
		System.out.println(alrtext);
		if(alrtext.contains(checkboxtxt)) {
			System.out.println("Alert message contains selected options = " + checkboxtxt);
		}
		driver.quit();
		
		
	}

}
