import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRahulAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		//Delay 2000 milliseconds
		//Thread.sleep(2000);
		// enter user name idenfity by id
		driver.findElement(By.id("inputUsername")).sendKeys("SureshUser");
		// enter password wrong identify by name
		driver.findElement(By.name("inputPassword")).sendKeys("WrongPwd");
		// enter sign in button identify by class
		driver.findElement(By.className("signInBtn")).click();
		
		// read element by css selector
		//classname is known tagname.classname Button.error or .error
		//Thread.sleep(2000);
		System.out.println("**************************");
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		// locate the forgot password link and click
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//xpath //input[@placeholder='Name']
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("JOHN");
		driver.findElement(By.xpath("//input[@placeholder ='Email']")).sendKeys("john@xyz.com");
		
		
	}

}
