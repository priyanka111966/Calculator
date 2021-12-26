package calculator;

import org.testng.annotations.Test;

public class TC_Addition extends BaseClass 
{
	@Test
	public void Addition() {
		driver.get(Baseurl1);
		driver.findElementByXPath("//span[contains(text(),'–')]").click();
		driver.findElementByXPath("//span[contains(text(),'2')]").click();
		driver.findElementByXPath("//span[contains(text(),'3')]").click();
		driver.findElementByXPath("//span[contains(text(),'4')]").click();
		driver.findElementByXPath("//span[contains(text(),'2')]").click();
		driver.findElementByXPath("//span[contains(text(),'3')]").click();
		driver.findElementByXPath("//span[contains(text(),'4')]").click();
		driver.findElementByXPath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]").click();
		driver.findElementByXPath("//span[contains(text(),'3')]").click();
		driver.findElementByXPath("//span[contains(text(),'4')]").click();
		driver.findElementByXPath("//span[contains(text(),'5')]").click();
		driver.findElementByXPath("//span[contains(text(),'3')]").click();
		driver.findElementByXPath("//span[contains(text(),'4')]").click();
		driver.findElementByXPath("//span[contains(text(),'5')]").click();
       driver.findElementByXPath("//span[contains(text(),'=')]").click();

}

	

}
