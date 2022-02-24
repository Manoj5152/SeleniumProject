package SelPrg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertType {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumjars\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://www.leafground.com/pages/Alert.html");
		d.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(d, 10);
		//simple Alert
	 WebElement simple = d.findElement(By.xpath("//button[text()='Alert Box']"));
	simple.click();
	Thread.sleep(15000);
	Alert alert = d.switchTo().alert();
	String t = alert.getText() ;
	System.out.println("Hi..."+t);
	Thread.sleep(6000);

	alert.accept();
	Thread.sleep(3000);
		/*//confirm alert
		WebElement con = d.findElement(By.xpath("//button[text()='Confirm Box']"));
		con.click();
		Thread.sleep(5000);
		d.switchTo().alert().dismiss();
		Thread.sleep(5000);
		d.close();
		//prompt alert
		d.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(3000);
		Alert alt2=d.switchTo().alert();
		alt2.sendKeys("mindtree");
		String at = alt2.getText();
		System.out.println(at);
		Thread.sleep(5000);
		alt2.accept();
		Thread.sleep(5000);
		
		/*d.findElement(By.id("btn")).click();
		Thread.sleep(5000);
		Alert a3=d.switchTo().alert();
		d.findElement(By.xpath("//button[text()='OK']")).click();*/
		

		
	
	
}

}