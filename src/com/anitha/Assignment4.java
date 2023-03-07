package com.anitha;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> Windows= driver.getWindowHandles();
		Iterator<String> IT = Windows.iterator();
		String Parent = IT.next();
		String Child = IT.next();
		driver.findElement(By.linkText("Click Here")).click();
		driver.switchTo().window(Child);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(Parent);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.quit();
		
		
	}

}
