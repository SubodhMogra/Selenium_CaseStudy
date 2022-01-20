package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iTimeElements {

	public static WebElement Attendance(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input"));
	}
	
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/main/div/div[2]/section/span/button[2]"));
		//return driver.findElement(By.id("le_apply"));
		
	}
}
