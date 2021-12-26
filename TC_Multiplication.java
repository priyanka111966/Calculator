package calculator;

import org.testng.annotations.Test;

public class TC_Multiplication extends BaseClass {
  @Test
  public void multiplication() {
	  
		driver.get(Baseurl1);
		driver.findElementByXPath("//span[contains(text(),'4')]").click();
		driver.findElementByXPath("//span[contains(text(),'2')]").click();
		driver.findElementByXPath("//span[contains(text(),'3')]").click();
		driver.findElementByXPath("//span[contains(text(),'×')]").click();
		driver.findElementByXPath("//span[contains(text(),'5')]").click();
		driver.findElementByXPath("//span[contains(text(),'2')]").click();
		driver.findElementByXPath("//span[contains(text(),'5')]").click();
	    driver.findElementByXPath("//span[contains(text(),'=')]").click();

}
}
