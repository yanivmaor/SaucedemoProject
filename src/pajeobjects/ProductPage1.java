package pajeobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage1 extends BasePage{
	@FindBy(css =".btn_primary.btn_inventory")
	private WebElement addcartBtn;
	

	public ProductPage1(WebDriver driver) {
		super(driver);
		
	}
	
	public void AddToCart () {
		click(addcartBtn);
		}
	
	public void backToProducts () {
		driver.navigate().back();
	}
	
	
	
	

}

