package com.anitha;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
		List<WebElement> add=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		int sum =0;
		for(int i=0;i<add.size();i++)
		{
			sum=sum+Integer.parseInt(add.get(i).getText());
		}
		System.out.println(sum);
	}
/*
WebElement table=driver.findElement(By.id("product"));


System.out.println(table.findElements(By.tagName("tr")).size());


System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());


List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));


System.out.println(secondrow.get(0).getText());


System.out.println(secondrow.get(1).getText());


System.out.println(secondrow.get(2).getText());
 */
}
