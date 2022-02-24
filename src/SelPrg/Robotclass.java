package SelPrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement Gmail = d.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a=new Actions(d);
		a.contextClick(Gmail).build().perform();
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

