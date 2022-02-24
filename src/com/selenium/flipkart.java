package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver f= new ChromeDriver();
		
		
f.get("https://www.flipkart.com/");
//f.findElement(By.partialLinkText("Login")).click();
f.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("b.krishna324@gmail.com");
f.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("krishnababu");
f.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();

}
}

//f.findElement(By.partialLinkText("Login")).click();