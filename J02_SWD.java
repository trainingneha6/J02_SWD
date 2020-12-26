package com.anyaut.Orange._POM._POM;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J02_SWD {
	
	@Test
	public void JUnit() {
		System.out.println("This does nothing right now.....");
		
	}

	@Test
	public void SWD() throws Exception {
		System.out.println("~~~~~~~~~~~Start of the Test~~~~~~~~~~~~~");
		String bURL = "https://anyaut.com/test/";
		String chromedriver = "C:\\neha\\Training\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);
				
		WebDriver myD;
		myD = new ChromeDriver();
		myD.manage().window().maximize();
		
		myD.navigate().to(bURL);
		Thread.sleep(2000);
		System.out.println("Title is : " + myD.getTitle());
		
		myD.close();
		
		System.out.println("~~~~~~~~~~~~~~End of my Test~~~~~~~~~~~~~~~");
		
		
	}
}
