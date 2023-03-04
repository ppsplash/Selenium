package com.anitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		WebElement findElement = driver.findElement(By.id("Div1"));
		String attribute = findElement.getAttribute("style");
		System.out.println(attribute);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 attribute = findElement.getAttribute("style");
		System.out.println(attribute);
		Assert.assertTrue(attribute.contains("1"));
		

}
}
