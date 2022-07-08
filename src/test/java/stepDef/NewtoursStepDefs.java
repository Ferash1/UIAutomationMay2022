//package stepDef;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class NewtoursStepDefs {
//    WebDriver driver;
//
//    @Before
//
//    public void createWebdriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//    }
//
//    @Given("I am on the Newtours homepage")
//    public void i_am_on_the_newtours_homepage() {
//        driver.get("https://demo.guru99.com/selenium/newtours");
//    }
//    @When("I click on Register link")
//    public void i_click_on_register_link() {
//         //Identify the element
//        WebElement registerlinkElement = driver.findElement(By.linkText("REGISTER"));
//
//         //Perform action on the element
//        registerlinkElement.click();
//
//    }
////    @When("I enter Username as\"Alex\", password and confirmation password as {string}")
////    public void i_enter_username_as_alex_password_and_confirmation_password_as(String uName, String pWord) {
////        // Write code here that turns the phrase above into concrete actions
////        WebElement userNameElement = driver.findElement(By.id("email"));
////        userNameElement.sendKeys(uName);
////
////        WebElement passwordElement = driver.findElement(By.xpath ("//input[@name='password']"));
////        passwordElement.sendKeys(pWord);
////
////        WebElement confirmpasswordElement = driver.findElement(By.xpath ("//input[@name='confirmpassword']"));
////        confirmpasswordElement.sendKeys(pWord);
////    }
//    @When("I click on Submit button")
//    public void i_click_on_submit_button() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.cssSelector("input[name='submit']")).click();
//    }
//    @Then("The confirmation page is displayed with the username as {string}")
//    public void the_confirmation_page_is_displayed_with_the_username_as(String uName) {
//        // Write code here that turns the phrase above into concrete actions
//       String acknowledgementMsg= driver.findElements(By.xpath("//b")).get(1).getText();
//       assertThat(acknowledgementMsg.contains(uName), equalTo(true));
//    }
//    @After
//    public void TearDown(){
//        driver.close();
//        driver.quit();
//
//    }
//
//    @And("I enter Username as {string}, password and confirmation password as {string}")
//    public void iEnterUsernameAsPasswordAndConfirmationPasswordAs(String uName, String pWord) {
//        WebElement userNameElement = driver.findElement(By.id("email"));
//        userNameElement.sendKeys(uName);
//
//        WebElement passwordElement = driver.findElement(By.xpath ("//input[@name='password']"));
//        passwordElement.sendKeys(pWord);
//
//        WebElement confirmPasswordElement = driver.findElement(By.xpath ("//input[@name='confirmPassword']"));
//        confirmPasswordElement.sendKeys(pWord);
//    }
//}
