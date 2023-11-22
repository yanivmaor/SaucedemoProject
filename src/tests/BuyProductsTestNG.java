package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pajeobjects.CheckOutOverview;
import pajeobjects.CheckOutPage;
import pajeobjects.FinishPage;
import pajeobjects.LoginPage1;
import pajeobjects.ProductPage1;
import pajeobjects.ProductsPage1;
import pajeobjects.YourCartPage1;

public class BuyProductsTestNG extends BaseTest{
	
	@Test
	public void tc01_login() {
		
		       LoginPage1 lp = new LoginPage1(driver);
		       lp.LoginPass("standard_user1", "secret_sauce");
		       lp = new LoginPage1(driver);
		       lp.LoginPass("standard_user", "secret_sauce");

}
	
	@Test
	public void tc02_productsList() {
		       
		       ProductsPage1 pp1 = new ProductsPage1(driver);
		       pp1.Productslist();	
	}
	
	@Test
	public void tc03_Chooseproduct() {
		       
		       ProductsPage1 psp1 = new ProductsPage1(driver);
		       psp1.ChooseProduct("Test.allTheThings() T-Shirt (Red)"); 
		       
		       ProductPage1 pp = new ProductPage1(driver);
		       pp.AddToCart();
		       pp.backToProducts();
		 
		       }
		       
	 @Test
	 public void tc04_Chooseproduct() {
		   
		       ProductsPage1 psp1 = new ProductsPage1(driver);
		       psp1.ChooseProduct("Sauce Labs Bolt T-Shirt");

		       ProductPage1 pp1 = new ProductPage1(driver);
		       pp1.AddToCart();
		       pp1.backToProducts();
		       
		       }
		       	
	  @Test
     public void tc05_Chooseproduct() {
		    
		  ProductsPage1 psp1 = new ProductsPage1(driver);
		       psp1.ChooseProduct("Sauce Labs Fleece Jacket");
		       
		       ProductPage1 pp2 = new ProductPage1(driver);
		       pp2.AddToCart();
		       pp2.backToProducts();
		       
	}
	
	  @Test
   	  public void tc06_MovetoCartPage() {
		     
		     ProductsPage1 psp1 = new ProductsPage1(driver);
		     psp1.MoveToCartPage();
	  }
	  
	   @Test
	  public void tc07_DeleteProduct() {
		  YourCartPage1 ycp = new YourCartPage1(driver); 
			ycp.MoveProduct("Test.allTheThings() T-Shirt (Red)");
		  }
	   
	   @Test
		  public void tc08_ChackOut() {
		   YourCartPage1 ycp = new YourCartPage1(driver);
		   ycp.CheckOut();
				 
	   }
	   @Test
		  public void tc09_ChackOutForm() {
		   CheckOutPage cop = new CheckOutPage(driver);
		   cop.FillForm("yaniv", "maor", "7777");
		  
	    }
	   @Test
		  public void tc10_OverView() {
		   CheckOutOverview cov = new CheckOutOverview(driver);
		   cov.Finish();
	   }
	   
	   @Test
		  public void tc11_FinishPage() {
		   FinishPage fp= new FinishPage(driver);
		      if (fp.getFinishMsg().equalsIgnoreCase("THANK YOU FOR YOUR ORDER")) {
		    	  System.out.println("test passed");
		      } else
		    	  System.out.println("test failed");
	       
	   }
	   
	   
}
	
