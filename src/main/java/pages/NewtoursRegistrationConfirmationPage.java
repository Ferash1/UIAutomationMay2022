package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewtoursRegistrationConfirmationPage extends BasePage{
    public NewtoursRegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//b") private List<WebElement> Msgs;
    public String getAcknowledgementMsg(){
        return Msgs.get(1).getText() ;
    }
}
