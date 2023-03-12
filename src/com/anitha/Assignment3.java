package com.anitha;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("label[class='customradio']:nth-child(2)")).click();
		//driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropdown= driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("signin")).click();
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(15));
		//w.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> phone = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		for (int i = 0; i<phone.size();i++)
		{
			phone.get(i).click();
		}
		driver.findElement(By.cssSelector("*[class='nav-link btn btn-primary']")).click();
		
			
	}

}
