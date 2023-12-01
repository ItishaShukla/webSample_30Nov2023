package webSample_30Nov2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
//		WebElement srcBox=driver.findElement(By.name("Search"));
//		action.contextClick(srcBox).perform();
		
		WebElement Menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav>li:nth-child(3)"));
		//action.moveToElement(Menu).perform();
		
		WebElement menuitem = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(),Monitors (2)')]"));
		action.moveToElement(Menu).click(menuitem).build().perform();
		
	}

}
