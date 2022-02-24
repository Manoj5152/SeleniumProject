package SelPrg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
					    // Launch the application		
		        d.get("http://demo.guru99.com/test/guru99home/");
		        Thread.sleep(5000);
		        
		        d.manage().window().maximize();
		           
		       JavascriptExecutor js = (JavascriptExecutor) d;
		     js.executeScript("scrollBy(0,2000)");
		     Thread.sleep(10000);
		     js.executeScript("window.scrollBy(0,-1000)");
		     
		     
		}

	}


/*JavascriptExecutor js =  (JavascriptExecutor) d;

js.executeScript("window.scrollBy(0,2500)");

Thread.sleep(10000);

js.executeScript("window.scrollBy(0,-1000)");

*/
