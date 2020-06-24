package com.qshore.QshoreTech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods 
{
	public void launchApp(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\8WD\\Jar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.get(URL);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

}
