package SelPrg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagenavigation {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			//Refresh, Back, Forword, Navigate to
			//Page Refresh
			/*d.navigate().to("https://www.flipkart.com/");
			
			d.navigate().refresh();
			Thread.sleep(5000);
			d.navigate().refresh();
			Thread.sleep(5000);
			d.navigate().refresh();*/
			
					
			
			//Page Navigation
			d.get("https://www.facebook.com/");
			d.get("https://www.cricbuzz.com/");
			d.navigate().back();
			Thread.sleep(5000);
			d.get("https://www.shopclues.com/");
			d.get("https://web.whatsapp.com/");
			
			d.navigate().back();
			Thread.sleep(5000);
			d.navigate().forward();
			Thread.sleep(5000);
			d.navigate().back();
			Thread.sleep(5000);
			
			d.navigate().back();
			Thread.sleep(5000);
			d.navigate().forward();
			Thread.sleep(5000);
			d.navigate().back();
			Thread.sleep(5000);
			d.close();
			//f->c->f->s->w->s->w->s->c->s->c..........CLOSE		
			
		}

	}




