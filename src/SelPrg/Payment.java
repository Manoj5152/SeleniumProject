package SelPrg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Payment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");

		WebDriver e = new ChromeDriver();
		// Getting URL
		e.get("https://demo.guru99.com/payment-gateway/index.php");
		e.manage().window().maximize();
		
		// Using Scroll
		((JavascriptExecutor) e).executeScript("window.scrollBy(0,1800)");
		Thread.sleep(5000);

		// Using Dropdown
		Select qty = new Select(e.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[4]/select")));
		Thread.sleep(2000);
		qty.selectByValue("2");
		Thread.sleep(2000);

		e.findElement(By.xpath("//input[@class='button special']")).click();
		Thread.sleep(2000);

		((JavascriptExecutor) e).executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);

		e.findElement(By.xpath("//*[@id=\"card_nmuber\"]")).sendKeys("4569056893203");
		
		Select month = new Select(e.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByIndex(4);
		
		Thread.sleep(2000);

		Select year = new Select(e.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByIndex(10);

		e.findElement(By.xpath("//*[@id=\"cvv_code\"]")).sendKeys("333");

		e.findElement(By.xpath("//*[@id=\"three\"]/div/form/div[2]/div/ul/li/input")).click();
		
		Alert alt = e.switchTo().alert();
		String t = alt.getText();
		System.out.println("ALERT: "+t);
		alt.accept();
		Thread.sleep(5000);
		

	}
}