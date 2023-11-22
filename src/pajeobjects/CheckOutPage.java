package pajeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
	@FindBy (css ="#first-name" )
	private WebElement Firstnamefield ;
	@FindBy (css ="#last-name" )
	private WebElement Lastnamefield ;
	@FindBy (css ="#postal-code" )
	private WebElement zipcodefield ;
	@FindBy (css =".btn_primary.cart_button" )
	private WebElement continueBtn ;
	

	public CheckOutPage(WebDriver driver) {
		super(driver); }
		
	
	public void FillForm(String name, String lastname, String zipcode ) {
		fillText(Firstnamefield, name);
		fillText(Lastnamefield, lastname);
		fillText(zipcodefield, zipcode);
		click(continueBtn);
		
	}

	
	}


