package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationFrameworks {

	public static void main(String[] args) {

//		String geckodriver = System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe";

		String chromedriver = "D:\\Company-workspace\\AutomationTraning\\src\\test\\resources\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromedriver);
		// Create a new instance of the FireFox driver
		WebDriver driver = new ChromeDriver();

		// Storing the Application Url in the String variable
		String url = "http://automationpractice.com/index.php";

		// Launch the ToolsQA WebSite
		driver.get(url);

		// Storing Title name in the String variable
		String title = driver.getTitle();

		// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();

		// Printing Title & Title length in the Console window
		System.out.println("Title of the page is : " + title);
		System.out.println("Length of the title is : " + titleLength);

		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(url)) {
			System.out.println("Verification Successful - The correct Url is opened.");
		} else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
			// In case of Fail, you like to print the actual and expected URL for the record
			// purpose
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + url);
		}

		// Storing Page Source in String variable
		String pageSource = driver.getPageSource();

		// Storing Page Source length in Int variable
		int pageSourceLength = pageSource.length();

		// Printing length of the Page Source on console
		System.out.println("Total length of the Page Source is : " + pageSourceLength);

		// Closing browser
		driver.close();
	}

}
