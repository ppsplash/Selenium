package com.anitha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.de/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("sp-cc-accept")).click();
		WebElement Lang=driver.findElement(By.cssSelector("span[class='icp-nav-link-inner']"));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("kids").build().perform();
		a.moveToElement(Lang).click().build().perform();
		//moveToElement(driver.findElement(By.xpath("//i[@xpath='2']"))).click().build().perform();
		 driver.findElement(By.xpath("(//input[@name='lop'])[1]")).sendKeys(Keys.ENTER);
		//a.moveToElement(driver.findElement(By.xpath("//input[@class='a-button-input'][1]"))).click().build().perform();
		
	}

}
