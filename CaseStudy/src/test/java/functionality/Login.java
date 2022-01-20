package functionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import object_repository.loginElements;

public class Login {
	
	@Test
	public void loginpage_fn() throws InterruptedException, IOException {
		
		WebDriver driver;
		FileInputStream st=new FileInputStream("src\\test\\java\\Config.properties");
		
		Properties prop = new Properties();
		prop.load(st);
		String browser_name= prop.getProperty("browser");
		String driver_path= prop.getProperty("path");
		
		if (browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driver_path);
			driver = new ChromeDriver();
		}
		
		else if (browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driver_path);
			driver = new FirefoxDriver();
		}
		
		else {
			System.setProperty("webdriver.ie.driver", driver_path);
			driver = new InternetExplorerDriver();
		}
		
		
		
//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Chromedriver updated version\\chromedriver.exe");	
//		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.myhcl.com");
		
		Thread.sleep(8000);
		loginElements.Username(driver).sendKeys("subodh.mogra@hcl.com");
		
		loginElements.next(driver).click();
		
		loginElements.Password(driver).sendKeys("Honey@1205");
		
		Thread.sleep(5000);
		loginElements.Signin(driver).click();
		
		Thread.sleep(2000);
		loginElements.GetOtpByText(driver).click();
		
		Thread.sleep(20000);
		loginElements.OtpSubmitButton(driver).click();
		
		Thread.sleep(2000);
		loginElements.StaySignedIn(driver).click();
		
		driver.findElement(By.id("txtSearch")).sendKeys("itime");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("iTime (Time Sheet Management System)")).click();
		
		//Call Itime Class
		iTime i = new iTime();
		i.markAttendance(driver);
		
	}
}
