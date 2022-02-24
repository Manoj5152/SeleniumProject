package SelPrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			 System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
			 WebDriver h=new ChromeDriver();
			 h.get("https://demoqa.com/menu/");
		     h.manage().window().maximize();
		  	  	Thread.sleep(6000);
		  	
		  	 Actions a = new Actions(h);
		       
		     WebElement mainmenu = h.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		     a.moveToElement(mainmenu).perform();
		     Thread.sleep(6000);
		    
		     	     
		     WebElement subMenu = h.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a")); 
		     a.moveToElement(subMenu).perform();
		     Thread.sleep(6000);
		    
		     WebElement SubMenuItem2 = h.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a"));
		     SubMenuItem2.click();
		 

		}

	}




