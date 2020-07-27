package pageObjects;

import java.io.IOException;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenKartPage {
	
	public WebDriver driver;
	
	private By VegetablesName=By.cssSelector("h4.product-name");
	private By ReducingQuantity=By.cssSelector("a.decrement");
	private By IncreasingQuantity=By.cssSelector("a.increment");
	private By AddtoCartButton= By.xpath("//div[@class='product-action']/button");
	private By Cart=By.xpath("//img[@alt='Cart']");
	private By ProceedToCheckout=By.xpath("//button[text()='PROCEED TO CHECKOUT']");



public GreenKartPage(WebDriver driver)
{
	this.driver=driver;
}

public List VegetablesName()
{
	return driver.findElements(VegetablesName);
	
}

public WebElement ReducingQuantity()
{
	return driver.findElement(ReducingQuantity);
	
}

public List<WebElement> IncreasingQuantity()
{
	return driver.findElements(IncreasingQuantity);
	
}

public List<WebElement> AddtoCartButton()
{
	return driver.findElements(AddtoCartButton);
	
}

public WebElement Cart()
{
	return driver.findElement(Cart);
	
}

public WebElement ProceedToCheckout()
{
	return driver.findElement(ProceedToCheckout);
	
}

public CheckoutPage getCheckout()
{
	 driver.findElement(ProceedToCheckout).click();
	 CheckoutPage Ck1=new CheckoutPage(driver);
	 return Ck1;
	 
	 
	 
	 
}
}


