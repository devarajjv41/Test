import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokeMultipleWinsOrTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.switchTo().newWindow(WindowType.TAB); // open new tab
		driver.switchTo().newWindow(WindowType.WINDOW);//open new window
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");

	}

}
