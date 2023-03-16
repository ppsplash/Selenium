package com.anitha;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterAndTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver = footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		for(int i =0;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
		}
		Set<String> a= driver.getWindowHandles();
		Iterator<String> it = a.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();
		
	}

}
