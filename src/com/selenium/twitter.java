package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver t = new ChromeDriver();
		t.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		t.manage().window().maximize();
		Thread.sleep(3000);
		t.findElement(By.xpath("//input[@name='text']")).sendKeys("b.krishna324@gmail.com");
		Thread.sleep(2000);
		t.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[6]/div/span/span")).click();
		Thread.sleep(3000);

	}
}
