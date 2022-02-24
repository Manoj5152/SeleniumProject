package SelPrg;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class move_practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.get("https://www.bharatmatrimony.com/");
		Thread.sleep(5000);

		((JavascriptExecutor) m).executeScript("window.open()");
		ArrayList<String> tab2 = new ArrayList<String>(m.getWindowHandles());
		m.switchTo().window(tab2.get(1));
		m.get("https://www.google.com/");
		Thread.sleep(5000);

		((JavascriptExecutor) m).executeScript("window.open()");
		ArrayList<String> tab3 = new ArrayList<String>(m.getWindowHandles());
		m.switchTo().window(tab3.get(2));
		m.get("https://www.google.com/");
		Thread.sleep(5000);
		
		ArrayList<String> tab1 = new ArrayList<String>(m.getWindowHandles());
		m.switchTo().window(tab1.get(0));
		m.get("https://web.whatsapp.com/");
		String currenturl = m.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(5000);
		
		ArrayList<String> tab2o = new ArrayList<String>(m.getWindowHandles());
		m.switchTo().window(tab2o.get(1));
		m.get("https://www.sunnetwork.in/");
		m.getTitle();
		Thread.sleep(3000);
		
		ArrayList<String> tab3o = new ArrayList<String>(m.getWindowHandles());
		m.switchTo().window(tab3o.get(2));
		m.get("https://www.hotstar.com/in/channels/star-vijay");
		Thread.sleep(7000);
		
		
		
		m.quit();
		

	}

}
