package GreenKartEcommerce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import pageObjects.CheckoutPage;
import pageObjects.GreenKartPage;
import resources.base;

public class Checkout extends base {

	AddToCartVegetables a = new  AddToCartVegetables();

	@Test
    public void TC04ValidateProductListsameasAddedByUser() throws IOException, InterruptedException
    {
    	//Runtime.getRuntime().exec("C:\\Users\\S900226\\Desktop\\AutoItScript\\HandleAuthenticationWindows.exe");
    	
		 GreenKartPage Gk= new GreenKartPage(a.driver);
   	  Gk.getCheckout();
   	  CheckoutPage Ck= new CheckoutPage(a.driver);
     	String [] itemsNeeded= getExcelData();
     	ArrayList<String> a = new ArrayList();
     	System.out.println("Inside Checkout page");
     	List<WebElement> products= Ck.ProductName();
     	System.out.println(products.size());
		
    	for (int i=0;i<products.size();i++)
   	 {
   			//Brocolli - 1 Kg

   			//Brocolli,    1 kg
   		 String [] name= products.get(i).getText().split("-");
   		 
   		 String formattedName =name[0].trim();
   		 a.add(formattedName);
}
    	System.out.println(a);
    }
	
}