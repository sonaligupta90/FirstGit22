package assingments;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssingments1_JUnit {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		}
	@Test
	public void identifyElements() {
		driver.findElement(By.cssSelector("input#username")).sendKeys("demo@techfios.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();
		driver.findElement(By.cssSelector("a[href$='https://techfios.com/billing/?ng=accounts/add/']")).click();
		driver.findElement(By.cssSelector("input[id='account']")).sendKeys("Savings Account_James");
		driver.findElement(By.cssSelector("input[id='description']")).sendKeys("Techfios");
		driver.findElement(By.cssSelector("input[id='balance']")).sendKeys("$500");
		driver.findElement(By.cssSelector("input[id='account_number']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[id='contact_person']")).sendKeys("Sonali gupta");
		driver.findElement(By.cssSelector("input[id='contact_phone']")).sendKeys("+1(234)345456");
//		driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary']")).click();
	}
//	@After
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}


}
