package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//p[@class='product-name']")
	
	@FindBy(xpath="//tr//td[2]//p")
	List<WebElement> ProductName;
	
	
	
	public List<WebElement> ProductName()
    {
    	return ProductName;
    }
	
	

}
