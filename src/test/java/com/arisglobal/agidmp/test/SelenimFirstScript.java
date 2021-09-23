package com.arisglobal.agidmp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenimFirstScript {
	
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
	
	}

}
