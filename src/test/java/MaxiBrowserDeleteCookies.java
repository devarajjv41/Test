import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaxiBrowserDeleteCookies {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteCookieNamed("cookieName");//delete the specific cookie by name
		driver.manage().deleteAllCookies();//Delete All the cooky this will results in application logout 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://expired.badssl.com/");

	}

}
