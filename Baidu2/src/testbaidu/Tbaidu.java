package testbaidu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Tbaidu{
	@Test
	public void openchrome() throws InterruptedException {
		   //¹È¸èä¯ÀÀÆ÷
		  
	System.setProperty("webdriver.chrome.driver",".//tools//chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	  driver.get("http://www.baidu.com");
}
}