import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddingVegiesetoCart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String[] vegies = {"Brocolli","Tomato","Potato"};
		int count=0;
		List<String> itemList = Arrays.asList(vegies);
		List<WebElement> listofVegies = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<listofVegies.size();i++) {
			
			String vegitable = listofVegies.get(i).getText();
			String[] items = vegitable.split("-");
			String item = items[0].trim();
			if(itemList.contains(item)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				count++;
				if(count==vegies.length) {
					break;
				}
			}
			
			
			
		}
		

	}

}
