package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestClick {

	public static void main(String[] args) {
		String chromedrive = "D:\\\\Company-workspace\\\\AutomationTraning\\\\src\\\\test\\\\resources\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrive);
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		System.out.println("demoqa webpage displayed");

		// Instantiate Action Class
		Actions actions = new Actions(driver);

		// Retrieve WebElement to perform right click
		WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

		// Right Click the button to display Context Menu&nbsp;
		actions.contextClick(btnElement).perform();
		System.out.println("Right click Context Menu displayed");

		// Following code is to select item from context menu which gets open up on
		// right click, this differs
		// depending upon your application specific test case:
		// Select and click 'Copy me' i.e. 2nd option in Context menu
		WebElement elementOpen = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		elementOpen.click();

		// Accept the Alert
		driver.switchTo().alert().accept();
		System.out.println("Right click Alert Accepted");

		// Close the main window
		driver.close();

	}

}
