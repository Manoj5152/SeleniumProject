package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dhamu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver t = new ChromeDriver();

		t.get("https://learn.thryv.com/hc/en-us");
		Thread.sleep(3000);
		t.findElement(By.xpath("/html/body/header/div[3]/a")).click();
		Thread.sleep(3000);
		t.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("cjt@dexyp.com");
		/*t.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("welcome1");
		 * t.findElement(By.xpath("//*[@id=\"sign-in-submit-button\"]")).click();
		 */

	}

}
