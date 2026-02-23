import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class relativeLocators {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		//get the label of the name field.
		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		WebElement belowelement=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(belowelement)).click();
		WebElement leftElement = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(leftElement)).click();
		WebElement rightElement = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rightElement)).getText());
		
	}

}
