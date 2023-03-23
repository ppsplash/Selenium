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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		js.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.cssSelector("input[name='form_fields[travel_comp_date]']")).click();
		WebElement month =driver.findElement(By.cssSelector("div[class='flatpickr-current-month']"));
		while(!month.getText().equalsIgnoreCase("May"))
		{
			driver.findElement(By.xpath("//div/span[@class='flatpickr-next-month']")).click();
			
		}
		List<WebElement> dates = driver.findElements(By.cssSelector("//div/span[@class='flatpickr-day ']"));
		int count= dates.size();
		for(int i = 0;i<count;i++)
		{
			String no = dates.get(i).getText();
			if(no.equalsIgnoreCase("25"))
			{
				dates.get(i).click();
				break;	
			}
					
		}
		System.out.println(driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).getAttribute("value"));	
	}

}
