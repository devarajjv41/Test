import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[.='Nested Frames']")).click();
		WebElement ele = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(ele);
		WebElement ele2 = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(ele2);
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
