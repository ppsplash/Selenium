package com.anitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Anitha");
		driver.findElement(By.name("email")).sendKeys("anitha123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("example123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/input[@value='option1']")).click();
		driver.findElement(By.name("bday")).sendKeys("05/21/1990");
		driver.findElement(By.cssSelector("*[class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	}

}
