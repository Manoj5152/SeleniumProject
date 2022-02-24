package SelPrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_new {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("http://www.leafground.com/pages/frame.html");
			Thread.sleep(4000);
			WebElement frame1 = d.findElement(By.xpath("//iframe[@src='default.html']"));
			d.switchTo().frame(frame1);
			Thread.sleep(2000);
			d.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
			Thread.sleep(5000);
			d.switchTo().defaultContent();
			Thread.sleep(3000);
			WebElement frame2 = d.findElement(By.xpath("//iframe[@src='page.html']"));
			d.switchTo().frame(frame2);
			Thread.sleep(2000);
			WebElement frameinner2 = d.findElement(By.xpath("(//iframe[@id='frame2'])[1]"));
			d.switchTo().frame(frameinner2);
			Thread.sleep(2000);
			d.findElement(By.xpath("//button[@id='Click1']")).click();
			Thread.sleep(4000);
			
		}

	}


