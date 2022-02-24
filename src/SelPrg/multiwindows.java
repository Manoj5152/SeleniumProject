package SelPrg;


	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class multiwindows {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
			WebDriver d = new ChromeDriver();

			d.navigate().to("http://www.leafground.com/pages/Window.html");
			Thread.sleep(7000);
			d.manage().window().maximize();
			String Parentwindow = d.getWindowHandle();
			System.out.println(Parentwindow);

			d.findElement(By.xpath("//button[@id='home']")).click();

		     Set<String> Childwindow = d.getWindowHandles();
		    
			int csize = Childwindow.size();
			
			System.out.println(Childwindow);
			System.out.println(csize);
			
			for (String handles : Childwindow) {
				d.switchTo().window(handles);
			}
			Thread.sleep(6000);
			d.findElement(By.xpath("//img[@src='images/edit.png']")).click();
			Thread.sleep(6000);// EDIT
			d.close();//child window close

			Thread.sleep(16000);
			d.switchTo().window(Parentwindow);

			d.findElement(By.xpath("//button[@onclick='openWindows()']")).click();

			int number = d.getWindowHandles().size();
			System.out.println("NO OF OPENED WINDOWS=" + number);// COUNT

			
			Set<String> multiplewindows = d.getWindowHandles();

			System.out.println(multiplewindows);
			
			for (String child : multiplewindows) {
				if (!child.equals(Parentwindow)) {
					d.switchTo().window(child);
					Thread.sleep(4000);
					d.close();
				}
			}
			d.switchTo().window(Parentwindow);
			Thread.sleep(4000);
			d.findElement(By.xpath("//*[@id=\"color\"]")).click();

		}
	}



