package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		String chromedrive = "D:\\\\Company-workspace\\\\AutomationTraning\\\\src\\\\test\\\\resources\\\\executables\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrive);
		WebDriver driver = new ChromeDriver();
		
		String url = "http://automationpractice.com/index.php?id_product=1&controller=product";
		driver.get(url);
		
		String valueTd = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr[1]/td[1]")).getText();
		System.out.println(valueTd);
		
		String sRow = "1";
		String sCol = "2";
		String cellValua = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr["+ sRow +"]/td["+ sCol +"]")).getText();
		System.out.println(cellValua);
		
		String sRowValue = "Compositions";	
		for (int i=1; i <= 3; i++) {
			String sValuae = null;
			sValuae = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr["+ i +"]")).getText();
			if(sValuae.equalsIgnoreCase(sRowValue)) {
				for (int j=1; j <= 2; j++) {
					String sColumValue = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr["+ i +"]/td["+ j +"]")).getText();
					System.out.println(sColumValue);
				}
				break;
			}
		}
	}

}
