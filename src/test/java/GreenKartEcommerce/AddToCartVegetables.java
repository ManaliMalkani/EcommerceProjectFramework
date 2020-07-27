package GreenKartEcommerce;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CheckoutPage;
import pageObjects.GreenKartPage;
import resources.base;

public class AddToCartVegetables extends base {

	public static WebDriver driver;
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();	
		
				
	}
		
    @Test
    public void TC01VegetablesAddToCart() throws IOException
    {
    	//Runtime.getRuntime().exec("C:\\Users\\S900226\\Desktop\\AutoItScript\\HandleAuthenticationWindows.exe");
    	
		driver.get(prop.getProperty("url"));
		GreenKartPage Gk= new GreenKartPage(driver);
    	String [] itemsNeeded= getExcelData();
    	
    	int j=0;
    	
    	 List<WebElement> products= Gk.VegetablesName();
    	 for (int i=0;i<products.size();i++)
    	 {
    			//Brocolli - 1 Kg

    			//Brocolli,    1 kg
    		 String [] name= products.get(i).getText().split("-");
    		 
    		 String formattedName =name[0].trim();
    		 //System.out.println(formattedName);
    		//format it to get actual vegetable name

    			//convert array into array list for easy search

    			//  check whether name you extracted is present in arrayList or not-
    		 
    		 List itemNeededList= Arrays.asList(itemsNeeded);
    		 if(itemNeededList.contains(formattedName))
    		 
    		 {
    			 j++;
    			 System.out.println(formattedName);
    			String str=getExcelDataQuantity(formattedName);
    			 
    			 int n=Integer.parseInt(str);
    			 for (int k=1; k<n;k++)
    			 {
    				 Gk.IncreasingQuantity().get(i).click();
    			 }
    			 //driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
    			 //driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
    			//button[text()='ADD TO CART']
    			Gk.AddtoCartButton().get(i).click(); 
    			 if(j==itemsNeeded.length)

    				{

    				break;

    				}

    				}

    				}
       // String quantity= getExcelDataQuantity();
    	
    	
    }
    @Test
    public void TC02AddtoCart() throws InterruptedException 
    {
    	  GreenKartPage Gk= new GreenKartPage(driver);
    	Gk.Cart().click();
    	
    }
    
    
   
	
}



