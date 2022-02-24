package SelPrg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Prac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		Thread.sleep(7000);

		WebElement user = d.findElement(By.xpath("//input[@id='txt_unam']"));
		user.sendKeys("sylix");

		WebElement pwd = d.findElement(By.xpath("//input[@id='txt_pass']"));
		pwd.sendKeys("admin");

		WebElement Login = d.findElement(By.xpath("//*[@id=\"Button3\"]"));
		Login.click();

		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[6]/a")).click();
		Select Product_Category = new Select(d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_prodcate\"]")));
		Product_Category.selectByValue("watch");
		Thread.sleep(3000);

		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("scrollBy(0,2000)");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-1000)");

	}
}
