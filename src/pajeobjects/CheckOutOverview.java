package pajeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverview extends BasePage {
	@FindBy (css =".btn_action.cart_button" )
	private WebElement FinishBtn ;

	public CheckOutOverview(WebDriver driver) {
		super(driver);
		
	}
	
	public void Finish () {
		click(FinishBtn);
	}
	

}
