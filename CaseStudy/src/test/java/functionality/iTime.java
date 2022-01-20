package functionality;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import object_repository.iTimeElements;

public class iTime {

	//WebDriver driver;
	
	public WebElement markAttendance(WebDriver driver) throws InterruptedException {
		Thread.sleep(30000);
		iTimeElements.Attendance(driver).sendKeys("9");
		iTimeElements.submit(driver).click();
		
		
		return iTimeElements.Attendance(null);
	}
}
