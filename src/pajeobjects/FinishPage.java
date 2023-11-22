package pajeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends BasePage{
	@FindBy (css =".complete-header" )
	private WebElement finishMsg ;
	

	public FinishPage(WebDriver driver) {
		super(driver);}
	

		public String getFinishMsg() {
			return getText(finishMsg);
		
	}
		
		
	
	

}
