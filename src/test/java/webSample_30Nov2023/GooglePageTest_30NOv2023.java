package webSample_30Nov2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest_30NOv2023 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com/");
		WebElement srcBox=driver.findElement(By.id("APjFqb"));
		//WebElement srcBox=driver.findElement(By.name("q"));
		//WebElement srcBox=driver.findElement(By.className("gLFyf"));
		//WebElement srcBox=driver.findElement(By.tagName("textarea"));
		srcBox.sendKeys("Java Tutorial");
		Thread.sleep(2000);
		
		List <WebElement> listitems=driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
		System.out.println("total items:" +listitems.size());
		for(int i=0;i<listitems.size();i++) {
			System.out.println(listitems.get(i).getText());
			if(listitems.get(i).getText().equalsIgnoreCase("java tutorial pdf")) {
			listitems.get(i).click();
			break;
			}
		}
	}

}
