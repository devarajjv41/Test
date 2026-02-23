import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class TakeScreenShots {

	public static void main(String[] args) throws Exception {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
//		driver.manage().deleteCookieNamed("cookieName");//delete the specific cookie by name
//		driver.manage().deleteAllCookies();//Delete All the cooky this will results in application logout 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E://scr.jpng");
		FileUtils.copyFile(scr,dest);
		File path = dest.getAbsoluteFile();
		System.out.println(path);
		
		driver.quit();

	}

}
