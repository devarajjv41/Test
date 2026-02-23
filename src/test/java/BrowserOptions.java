import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.setAcceptInsecureCerts(true); // accepting the certification when browser says "Your connection is not private"
		opt.addExtensions(new File("/path/extention.exe")); // adding extention to the browser when automating the site
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:portnumber");//setting the proxy 
		opt.setCapability("proxy", proxy); // passing the proxy object.
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disbale-popup-blocking")); // block location when application opened
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("download.default_directory", "/directory/path"); // path the location
		opt.setExperimentalOption("prefs",prefs); // setting default path to download any file downloading from chrome
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://expired.badssl.com/");

	}

}
