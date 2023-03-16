package com.anitha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("checkBoxOption2")).click();
		String choice =driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropdown =driver.findElement(By.id("dropdown-class-example"));
		Select s= new Select(dropdown);
		s.selectByVisibleText(choice);
		driver.findElement(By.id("name")).sendKeys(choice);
		driver.findElement(By.id("alertbtn")).click();
		String Message= driver.switchTo().alert().getText();
		System.out.println(Message);
		if(Message.contains(choice))
		{
			System.out.println("Selection and alert are same");
		}
		else
		{
			System.out.println("Please check your selection,the alert message is different when compared to selected option");
		}
	}

}
