package SelPrg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
				WebDriver d = new ChromeDriver();
				
				d.get("http://www.leafground.com/pages/table.html");
				Thread.sleep(10000);
				d.manage().window().maximize();
				
				/*System.out.println("All Data in Table");
				List<WebElement> tall = d.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement td:tall) {
					String tabletext= td.getText();
					System.out.println(tabletext+"\t");
				}*/
				
				System.out.println();
				System.out.println("Row Data in Table");
				List<WebElement> tr4 = d.findElements(By.xpath("//table/tbody/tr[4]/td"));
				
				for(WebElement tr:tr4) {
					String rn=tr.getText();
					System.out.print(rn+"   ");
				}
		
			}

		


	}


