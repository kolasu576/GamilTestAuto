import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Invoking Browser

		// chromedriver.exe
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://mail.google.com/");
		System.out.println("Title " + driver.getTitle());
		System.out.println("Current URL " + driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
	}

}
