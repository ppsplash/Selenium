package com.anitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaSelenium {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "/home/tamil/AnithaSelenium/EclipseWorkspace/Introduction/chromedriver_108.0.5359.71/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "/home/tamil/AnithaSelenium/EclipseWorkspace/Introduction/firefox-108.0.1/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.google.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();
	}

} 
