package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestElement {

	public static void main(String[] args) {
		
		String chromedriver = "D:\\Company-workspace\\AutomationTraning\\src\\test\\resources\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
		WebDriver driver = new ChromeDriver();
		
		String appUrl = "http://toolsqa.com/Automation-practice-form/";
		driver.get(appUrl);

		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/a"));
		element.click();
		System.out.println("Partial Link Test Pass");  
		
		String sClass = driver.findElements(By.tagName("button")).toString();  
		System.out.println(sClass); 
		
		driver.findElement(By.linkText("Link Test")).click();  
		System.out.println("Link Test Pass");  

	}

}
