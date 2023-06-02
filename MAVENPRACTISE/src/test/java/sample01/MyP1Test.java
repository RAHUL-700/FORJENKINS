package sample01;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MyP1Test {
 
	//WebDriver driver;
	@Test
	public void m1() throws IOException {
		/*WebDriver driver=null;
		FileUtilities flib=new FileUtilities();*/
		
		/*String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox"))  {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(url);*/
		System.out.println("hi001");
	}
	
	
	
}
