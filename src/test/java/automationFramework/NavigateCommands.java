package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromedriver = "D:\\Company-workspace\\AutomationTraning\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
		
		String appUrl = "http://automationpractice.com/index.php";
		driver.get(appUrl);
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to(appUrl);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
