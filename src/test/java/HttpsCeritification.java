import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;

public class HttpsCeritification {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.setAcceptInsecureCerts(true);
//		FirefoxOptions opt1 = new FirefoxOptions();
//		opt1.setAcceptInsecureCerts(true);
//		EdgeOptions opt2 = new EdgeOptions();
//		opt2.setAcceptInsecureCerts(true);s
//		SafariOptions opt3 = new SafariOptions();
//		opt3.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
