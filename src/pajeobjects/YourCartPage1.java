package pajeobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class YourCartPage1 extends BasePage{
	@FindBy (css =".btn_secondary.cart_button" )
	private WebElement removeBtn ;
	@FindBy (css =".btn_action.checkout_button" )
	private WebElement CheckOuteBtn ;
	

	public YourCartPage1(WebDriver driver) {
		super(driver);
	
	}

	public void MoveProduct (String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement el : list) {
			if(el.getText().equalsIgnoreCase(name)) {
				
				Actions a = new Actions(driver);
				a.moveToElement(removeBtn).click().build().perform();
				break;
		
	}
			
}

}
	public void CheckOut () {
		click(CheckOuteBtn);
	}
}
