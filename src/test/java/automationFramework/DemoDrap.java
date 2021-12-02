package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDrap {

	public static void main(String[] args) {
		String chromedrive = "D:\\\\Company-workspace\\\\AutomationTraning\\\\src\\\\test\\\\resources\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrive);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		System.out.println("Tooltip web Page Displayed");
		
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
//		builder.dragAndDrop(from, to).perform();
//		
//		String textTo = to.getText();
//		if(textTo.equals("Dropped!")) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("False");
//		}
//		driver.close();
		
		// Su dung offset
		int xOffset1 = from.getLocation().getX();
		int yOffset1 = from.getLocation().getY();
		System.out.println("XOffset1: "+ xOffset1 + " YOffset1"+ yOffset1);
		
		int xOffset = to.getLocation().getX();
		int yOffset = to.getLocation().getY();
		System.out.println("Xoffset: "+xOffset+ " YOffset: "+ yOffset);
		xOffset = (xOffset - xOffset1)+ 10;
		yOffset = (yOffset - yOffset1)+ 20;
		builder.dragAndDropBy(from, xOffset, yOffset).perform();
		String textTo = to.getText();
		if(textTo.equals("Dropped!")) {
			System.out.println("Pass");
		} else {
			System.out.println("False");
		}
		driver.close();
 	}

}
