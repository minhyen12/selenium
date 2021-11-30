package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromedriver = "D:\\Company-workspace\\AutomationTraning\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/browser-windows/";
		driver.get(url);
		driver.findElement(By.id("New Browser Window")).click();
		driver.quit();
	}

}
