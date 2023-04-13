package com.anitha;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://global.flixbus.com/");
		driver.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("dateInput-from")).click();
		WebElement month =driver.findElement(By.xpath("//caption/h3[@class='hcr-h3-5-7-1 hcr-h3--section-header-5-7-1 hcr-clndr__title-5-7-1']"));
		while(!month.getText().equalsIgnoreCase("May"))
		{
			driver.findElement(By.xpath("//button[@aria-label='Show next month']")).click();			
		}
		List<WebElement> dates = driver.findElements(By.xpath("//tr/td/button[@class='hcr-clndr__btn-5-7-1']"));
		int count= dates.size();
		for(int i = 0;i<count;i++)
		{
			String no = dates.get(i).getText();
			if(no.equalsIgnoreCase("28"))
			{
				dates.get(i).click();
				break;	
			}
		}
	}
}
