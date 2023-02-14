package com.anitha;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, null);
		addItems(driver);
		
			
}
	
	private static void addItems(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		String[] itemsNeeded = {"Tomato","Beans","Capsicum"};
//		
		List<WebElement> vegName=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<vegName.size();i++)
		{
		String[] name=vegName.get(i).getText().split("-");
		String formattedName=name[0].trim();
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		int j= 0;
		if(itemsNeededList.contains(formattedName))
		{
		j++;
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)
		{
			break;
		}
		}
		}
		
		driver.quit();
		
		
		
	}

	}
