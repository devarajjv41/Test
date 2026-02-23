import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkTest {

	public static void main(String[] args) throws Exception {
		//What is Broken link
		// a broken link is a web-page that can't be found or accessed by a user, for various reasons.
		// success code = 200 , any link return code 400 or above then its a broken link - 404 page not found
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//step 1 - Get all the link(URL's)
		//Step 2 - check the status code > 400 then url is not working - the link which is tied up to that url is broken
		//how to find the status code manually in Browser - console 
		//-- go to inspect element
		//-go to networks
		//--click on link
		//--console shows the status - 200 - success , 400 or above is fail
		
//		String url=driver.findElement(By.xpath("//a[.='REST API']")).getAttribute("href");//find the link need to be test
//		URL urls = new URL(url);
//		HttpURLConnection conn = (HttpURLConnection) urls.openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int code=conn.getResponseCode();
//		System.out.println(code);
		
		//verify all links present in web page
		SoftAssert sf = new SoftAssert();
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links) {
			String linkUrl=link.getAttribute("href");
			URL url = new URL(linkUrl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("HEAD");
			int respCode=conn.getResponseCode();
			System.out.println(respCode);
//			Assert.assertTrue(respCode<400, "the link with Link text " + link.getText() + " is broken with code = "+ respCode);		
//			sf.assertTrue(respCode<400, "the link with Link text " + link.getText() + " is broken with code = "+ respCode);
			if(respCode>=400) {
				System.out.println("the link with Link text " + link.getText() + " is broken with code = "+ respCode);
			}
			
		}
		
		sf.assertAll();	
	}

}
