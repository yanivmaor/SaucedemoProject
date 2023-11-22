package pajeobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage1 extends BasePage{
	
	@FindBy (css ="[data-prefix='fas']" )
	private WebElement CartBtn ;
	

	public ProductsPage1(WebDriver driver) {
		super(driver);
	}
	
		public void Productslist () {
			List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_label"));
			for (WebElement el : list) {
				System.out.println(el.getText());}
				
			}
		
		public void ChooseProduct (String name) {
			List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
			for (WebElement el : list) {
				if(el.getText().equalsIgnoreCase(name)) {
					click(el);
					break;
				}
				
			}
			}
		
		

		public void MoveToCartPage () {
			click(CartBtn);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
