package com.anitha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();


driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();

Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
driver.quit();
	
/*WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

Thread.sleep(7000);

// OriginStation

 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

driver.findElement(By.cssSelector("a[value='DEL']")).click();     

	// Destination

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

Thread.sleep(5000);

driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();*/

}

}