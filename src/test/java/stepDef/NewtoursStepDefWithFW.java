package stepDef;

import Utilities.EncapsulationClass;
import Utilities.PropertiesReader;
import Utilities.Utility;
import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterPage;
import pages.NewtoursRegistrationConfirmationPage;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursStepDefWithFW extends BaseUtil {
    private BaseUtil base;

    public NewtoursStepDefWithFW(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Newtours homepage")
    public void i_am_on_the_newtours_homepage() throws IOException {
        base.driver.manage().window().maximize();
//      base.driver.get("https://demo.guru99.com/selenium/newtours");
//      base.driver.navigate().to("https://demo.guru99.com/selenium/newtours");
        PropertiesReader propertiesReader = new PropertiesReader();
        base.driver.get(propertiesReader.getNewtoursUrl());
    }
    @When("I click on Register link")
    public void i_click_on_register_link() {
        NewtoursHomePage mercuryToursHomePage = new NewtoursHomePage(base.driver);
        mercuryToursHomePage.clickRegisterLink();
    }
    @Then("I enter User Information of {string},Password and Confirm Password as {string}")
    @Then("I enter User Information of username as {string}, password and confirm password as {string}")
    @And("I enter Username as {string}, password and confirmation password as {string}")
    public void iEnterUsernameAsPasswordAndConfirmationPasswordAs(String uName, String pWord) {
        NewtoursRegisterPage mercuryToursRegisterPage = new NewtoursRegisterPage(base.driver);
        mercuryToursRegisterPage.enterUsername(uName);
        mercuryToursRegisterPage.enterPassword(pWord);
        mercuryToursRegisterPage.enterConfirmPassword(pWord);

    }

    @When("I click on Submit button")
    public void i_click_on_submit_button() {
        NewtoursRegisterPage mercuryToursRegisterPage = new NewtoursRegisterPage(base.driver);
        mercuryToursRegisterPage.clickSubmitButton();

    }

    @Then("The confirmation page is displayed with the username as {string}")
    public void the_confirmation_page_is_displayed_with_the_username_as(String uName) {

//           String acknowledgementMsg= driver.findElements(By.xpath("//b")).get(1).getText();
//       assertThat(acknowledgementMsg.contains(uName), equalTo(true));

        NewtoursRegistrationConfirmationPage newtoursRegistrationConfirmationPage = new NewtoursRegistrationConfirmationPage(base.driver);
        assertThat(newtoursRegistrationConfirmationPage.getAcknowledgementMsg().contains(uName),equalTo(true));


    }

    @When("I enter the contact information of {string},{string},{string} and {string}")
    @When("I enter the contact information of Firstname as {string}, Lastname as {string}, number as  {string} and email as {string}")
    public void iEnterTheContactInformationOfFirstnameAsLastnameAsNumberAsAndEmailAs(String fName, String lName, String pNumber, String email) {
        EncapsulationClass.setRandNumbers(Utility.generateFiveRandNumbers());
        EncapsulationClass.setRandNumbers(12345);

        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterFirstName(fName);
        newtoursRegisterPage.enterLastName(lName);
        newtoursRegisterPage.enterPhoneNumber(pNumber);
        newtoursRegisterPage.enterEmail(email);

    }
    @And("I enter mailing Information of {string}, {string},{string},{string} and {string}")
    @And("I enter mailing Information of address as {string} City as {string}, State as  {string} postalCode as {string},and country as {string}")
    public void iEnterMailingInformationOfAddressAsCityAsStateAsPostalCodeAsAndCountryAs(String address, String city, String state, String pCode, String country) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        System.out.println(EncapsulationClass.getRandNumber());
        newtoursRegisterPage.enterAddress(address + EncapsulationClass.getRandNumber());
        newtoursRegisterPage.enterCity(city);
        newtoursRegisterPage.enterState(state);
        newtoursRegisterPage.enterPostalCode(pCode);
        newtoursRegisterPage.SelectCountry(country);

    }



}









