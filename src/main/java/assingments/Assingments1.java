package assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingments1 {
//	2. Enter username: demo@techfios.com 
//	3. Enter password: abc123
//	4. Click login button
//	5. Click on Bank & Cash button
//	6. Click on New Account button 
//	7. Fill out the Add New Account form
//	8. Click on submit button
//	9. Visually check if the account has been created
	static WebDriver driver;
	
	public static void main(String[] args) {
		launchBrowser();
		identifyElements();
//		newAccount();
		
		
	}
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		}
	
	public static void identifyElements() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");;
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		}
	public static void newAccount() {
		driver.findElement(By.cssSelector("span.nav-label")).click();
		driver.findElement(By.linkText("New Account")).click();
		driver.findElement(By.id("account")).sendKeys("Savings Account");
		driver.findElement(By.id("description")).sendKeys("qwertyuiop[asdf");
		driver.findElement(By.id("balance")).sendKeys("$500");
		driver.findElement(By.id("account_number")).sendKeys("1234567890");
		driver.findElement(By.id("contact_person")).sendKeys("Sonali gupta");
		driver.findElement(By.id("contact_phone")).sendKeys("+1(234)345456");
		driver.findElement(By.className("btn btn-primary")).click();
	}
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
