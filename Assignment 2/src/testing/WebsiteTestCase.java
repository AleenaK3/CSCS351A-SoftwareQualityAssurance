package API.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\program files\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String email = "aleena3khalid@gmail.com";
		String pass = "aleena123";
			
		
		driver.get("https://pk.sapphireonline.pk/account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("CustomerEmail")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.name("customer[password]")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.className("btn mb__25 js_add_ld")).click();
		
		String at = driver.getTitle();
		String et = "SapphireOnline";
		
		driver.close();
		
		if(at.equalsIgnoreCase(et)){
			
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test Failure");
		}
	}
}
