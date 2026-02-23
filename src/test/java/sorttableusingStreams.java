import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class sorttableusingStreams {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//click on column
		driver.findElement(By.xpath("//th[1]")).click();
		//get all web elements to list
		List<WebElement> webelementlist=driver.findElements(By.xpath("//tr//td[1]"));
		//get all text into the list
		List<String> originallist = webelementlist.stream().map(list->list.getText()).collect(Collectors.toList());
		//sort the list
		List<String> sortedList = originallist.stream().sorted().collect(Collectors.toList());
		//compare the list
		Assert.assertTrue(originallist.equals(sortedList));
		
		List<String> prices = webelementlist.stream().filter(s->s.getText().contains("Beans")).map(a->getprices(a)).collect(Collectors.toList());
		prices.forEach(a->System.out.println(a));
		
		
		
		//Pagination concept.
		List<String> item;
		do {
			List<WebElement> items=driver.findElements(By.xpath("//tr//td[1]"));
			item=items.stream().filter(s->s.getText().contains("Rice")).map(a->getprices(a)).collect(Collectors.toList());
			
			item.forEach(a->System.out.println("value= "+a));
			
			if(item.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				
			}
			
		}while(item.size()<1);
		

	}
	
	public static String getprices(WebElement x) {
		
		String price=x.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
		
		
	}

}
