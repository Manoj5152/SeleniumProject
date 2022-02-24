package SelPrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","D:\\Seleniumjars\\chromedriver.exe");
			WebDriver f=new ChromeDriver();
			String UploadURL = "http://demo.guru99.com/test/upload/";
	       
			
	        f.get(UploadURL);
	        
	       WebElement fu = f.findElement(By.id("uploadfile_0"));
	       
	        fu.sendKeys("C:\\Users\\SAMSUNG\\NetHood\\Desktop\\Scroll.docx");

	        Thread.sleep(5000);
	        f.findElement(By.xpath("//input[@class='field_check']")).click();
	        Thread.sleep(5000);
	        
	        f.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	        String text = f.getTitle();
	        System.out.println(text);
	        Thread.sleep(5000);
	        f.close();
		}

	}



