package SelPrg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");

		WebDriver e = new ChromeDriver();
		
		e.get("http://demo.guru99.com/test/simple_context_menu.html");
		e.manage().window().maximize();
		Actions a = new Actions(e);
		
		WebElement dc = e.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		dc.click();
		a.doubleClick(dc).perform();
		
		Alert alt = e.switchTo().alert();
		String alert = alt.getText();
		System.out.println("When Double Click "+alert);
		alt.accept();
		Thread.sleep(3000);
		e.close();	

}
} 