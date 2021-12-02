package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseAndKeyboard {

	public static void main(String[] args) {
		String chromedrive = "D:\\\\Company-workspace\\\\AutomationTraning\\\\src\\\\test\\\\resources\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrive);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/menu/");
		System.out.println("Tooltip web Page Displayed");
		
		Actions action = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]"));
		action.moveToElement(menuOption).perform();
		System.out.println("Done");
		
		WebElement subOption = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]"));
		action.moveToElement(subOption).perform();
		System.out.println("Done");
		
		WebElement selectOptin = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]"));
		selectOptin.click();
		System.out.println("Select ");
		
		//driver.close();
	}

}
