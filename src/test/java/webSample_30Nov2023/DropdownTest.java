package webSample_30Nov2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	private static final String List = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singSel=new Select(driver.findElement(By.id("select-demo")));
		
		singSel.selectByValue("Tuesday");
		
		Select mulSel=new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(0);
			mulSel.selectByValue("Florida");
			mulSel.selectByVisibleText("Washington");
		}
		java.util.List<WebElement> items=mulSel.getAllSelectedOptions();
		System.out.println("Items Selected:" +items.size());
		mulSel.deselectByValue("Florida");	
	}

}
