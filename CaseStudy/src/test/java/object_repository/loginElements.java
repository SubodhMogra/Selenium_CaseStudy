package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginElements {
	
	public static WebElement Username(WebDriver driver) {
		 return driver.findElement(By.xpath("//input[@id='i0116']"));
	}
	
	public static WebElement next(WebDriver driver) {
		return driver.findElement(By.id("idSIButton9"));
	}
	
	public static WebElement Password(WebDriver driver) {
		return driver.findElement(By.id("i0118"));
	}
	
	public static WebElement Signin(WebDriver driver) {
		return driver.findElement(By.id("idSIButton9"));
	}
	
	public static WebElement GetOtpByText(WebDriver driver) {
		return driver.findElement(By.className("table-row"));
	}
	
	public static WebElement OtpSubmitButton(WebDriver driver) {
		return driver.findElement(By.id("idSubmit_SAOTCC_Continue"));
	}
	
	public static WebElement StaySignedIn(WebDriver driver) {
		return driver.findElement(By.id("idBtn_Back"));
	}
}
