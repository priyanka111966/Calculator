package calculator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	ChromeDriver driver;
	String Baseurl1="https://www.calculator.net/";


	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\priya_4pm\\example\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();		
	}
	
	@AfterClass
	public void finish() {
		//driver.quit();
	}

}
