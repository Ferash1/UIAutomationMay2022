package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerDBAddAComputerPage extends BasePage implements IComputerDBAddAComputerPage{
    public ComputerDBAddAComputerPage(WebDriver driver){
        super(driver);

    }
    @FindBy(css = "input#name") private WebElement ComputerNameInputElement;
    @FindBy(css = "input#introduced") private WebElement IntroducedDateInputElement;
    @FindBy(css = "input#discontinued") private WebElement DiscontinuedDateInputElement;
    @FindBy(css = "select[name='company']") private WebElement CompanyElement;
    @FindBy(css = ".btn.primary") private WebElement CreateThisComputerButtonElement;
    @FindBy(linkText ="cancel") private WebElement CancelButtonElement;
//    @FindBy(xpath = "//strong[.='Done!']") private WebElement AddComputerToDataBaseElement;

    public void enterComputerName(String ComputerName){
        ComputerNameInputElement.sendKeys(ComputerName);
    }
    public void enterIntroducedDate(String iDate){
        IntroducedDateInputElement.sendKeys(iDate);
    }
    public void enterDiscontinuedDate(String dDate){
        DiscontinuedDateInputElement.sendKeys(dDate);
    }
    public void selectCompany(String cName){
        selectFromDropDownUsingVisibleText(CompanyElement,cName);
    }
    public void ClickOnCreateThisComputerButton(){
        CreateThisComputerButtonElement.click();
    }

//    @Override
    public void testInterface() {

    }


    public void testMethod() {
    }
}

