package SelPrg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver a = new ChromeDriver ();
		a.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		a.manage().window().maximize();
		a.findElement(By.id("txt_unam")).sendKeys("sylix");
		a.findElement(By.name("txt_pass")).sendKeys("admi");
		Thread.sleep(5000);
		a.findElement(By.name("Button3")).click();
		Thread.sleep(8000);
		Alert error = a.switchTo().alert();
		System.out.println("This is .."+error.getText() );
		error.accept();
		Thread.sleep(5000);
		a.close();
		
		
		
	}

}
