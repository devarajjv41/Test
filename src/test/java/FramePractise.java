import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FramePractise {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://jqueryui.com/draggable/");
		driver.findElement(By.xpath("//a[.='Droppable']")).click();
		WebElement ele = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ele);
		System.out.println(driver.findElement(By.xpath("//div[@id='draggable']//p")).getText());
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}

}
