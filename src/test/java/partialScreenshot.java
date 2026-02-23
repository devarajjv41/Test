import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialScreenshot {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//take screenshot of specific webElement
		WebElement Name=driver.findElement(By.name("name"));
		Name.sendKeys("Hello");
		File file=Name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./test-output/name.png"));
		
		//get height and width of web element
		// hels for UI testing.
		
		int height = Name.getRect().getDimension().getHeight();
		int width = Name.getRect().getDimension().getWidth();
		
		System.out.println("Height "+ height + " and width "+width+" of Web element");


	}

}
