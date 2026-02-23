import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CheckboxCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("RahulShetty");
		driver.findElement(By.name("email")).sendKeys("RahulShetty@test.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("RahulShetty");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement element = driver.findElement(By.id("exampleFormControlSelect1"));
		element.click();

		Select slt = new Select(element);
		slt.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("1", Keys.ARROW_RIGHT, "02", Keys.ARROW_RIGHT,
				"1993");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		// input[@name='bday']
	}

}
