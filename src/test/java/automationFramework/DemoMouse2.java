package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouse2 {

	public static void main(String[] args) {
		String chromedrive = "D:\\\\Company-workspace\\\\AutomationTraning\\\\src\\\\test\\\\resources\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrive);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/slider/");
		System.out.println("demoqa webpage Displayed");
		
		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		actions.moveToElement(slider, 50, 0).perform();
		slider.click();
		
		driver.close();
	}

}
