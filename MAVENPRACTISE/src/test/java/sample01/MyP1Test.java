package sample01;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MyP1Test {

	@Test
	public void m1() throws IOException {
		/*WebDriver driver=null;
		FileUtilities flib=new FileUtilities();
		String browser=flib.getPropertyKeyValue("browser");
		String url=flib.getPropertyKeyValue("url");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else  {
			driver=new FirefoxDriver();
		}
		driver.get(url);*/
		System.out.println("hi001");
	}
	
	
	
}
