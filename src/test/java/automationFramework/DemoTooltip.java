package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTooltip {

	public static void main(String[] args) {
		String chromedrive = "D:\\\\Company-workspace\\\\AutomationTraning\\\\src\\\\test\\\\resources\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrive);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/tooltip/");
		System.out.println("Tooltip web Page Displayed");
		
		driver.manage().window().maximize();
		WebElement ageTextBox = driver.findElement(By.id("age"));
		String tooltipText = ageTextBox.getAttribute("title");   
		System.out.println("Retrieved tooltip text as :"+tooltipText);

	}

}
