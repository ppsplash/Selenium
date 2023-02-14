package com.anitha;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		addItems(driver);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("Anitha");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.quit();
			
}
	
	private static void addItems(WebDriver driver) throws InterruptedException 
	{
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
		
		
				
		
	}

	}
