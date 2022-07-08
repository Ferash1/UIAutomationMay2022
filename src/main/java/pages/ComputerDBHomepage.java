package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerDBHomepage extends BasePage {
    public ComputerDBHomepage(WebDriver driver){
        super(driver);

    }
    @FindBy(css = "a#add") private WebElement addAComputerButtonElement;

    public  void ClickOnAddAComputerButton(){
        addAComputerButtonElement.click();

    }
}
