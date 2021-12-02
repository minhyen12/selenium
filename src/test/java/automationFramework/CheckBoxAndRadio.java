package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadio {

	public static void main(String[] args) {
		String chromedrive = "D:\\\\Company-workspace\\\\AutomationTraning\\\\src\\\\test\\\\resources\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrive);
		WebDriver driver = new ChromeDriver();
		
		String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
		driver.get(url);
		
		List<WebElement> rdBtn = driver.findElements(By.name("id_gender"));
		
		boolean bValue = false;
		bValue = rdBtn.get(0).isSelected();
		if(bValue == true) {
			rdBtn.get(1).click();
		} else {
			rdBtn.get(0).click();
		}
		
		List<WebElement> checkBox = driver.findElements(By.name("newsletter"));
		int isSize = checkBox.size();
		for (int i = 0; i < isSize; i++) {
			String valueBox = checkBox.get(i).getAttribute("value");
			if(valueBox.equalsIgnoreCase("1")) {
				checkBox.get(i).click();
				break;
			}
		}
	}

}
