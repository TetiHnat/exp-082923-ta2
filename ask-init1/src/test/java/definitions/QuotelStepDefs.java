package definitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.*;

import static support.TestContext.getDriver;

public class QuotelStepDefs {
    @Given("I visit Quote Page in the {string} Enviroment")
    public void iVisitQuotePageInTheEnviroment(String EnvironmentName) {
        if (EnvironmentName.equals("QA")) {
            getDriver().get("http://quote-stage.portnov.com");
        } else {
            System.out.println("Environment " + EnvironmentName + "not supported");
        }

    }

    @When("I enter {string} for the Username field")
    public void iEnterForTheUsernameField(String username) {
        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    }


    @And("I enter {string} for first name field")
    public void iEnterForFirstNameAndForLastName(String firstName) {
        String xpath = "//input[@name='name']";
        getDriver().findElement(By.xpath(xpath)).sendKeys(firstName);
    }

    @And("I enter {string} for the Email field")
    public void iEnterForTheEmailField(String email) {
        String xpath = "//input[@name='email']";
        getDriver().findElement(By.xpath(xpath)).sendKeys(email);
    }

    @When("I enter {string} for the Password field")
    public void iEnterForThePasswordField(String password) {
        String xpath = "//input[@type='password']";
        getDriver().findElement(By.xpath(xpath)).sendKeys(password);
    }

    @When("I enter {string} for the Confirm Password field")
    public void iEnterForTheComfirmPasswordField(String confirmpassword) {
        String xpath = "//*[@name='confirmPassword']";
        getDriver().findElement(By.xpath(xpath)).sendKeys(confirmpassword);
    }

    @And("I {string} the Privacy Policy checkbox")
    public void iThePrivacyPolicyCheckbox(String check) {
        String xpath = "//*[@name='agreedToPrivacyPolicy']";
        WebElement agreeCheckbox = getDriver().findElement(By.xpath(xpath));
        agreeCheckbox.click();

    }

    @When("I click on the {string} button at the bottom of the page")
    public void iClickOnTheButtomAtTheBottonOfThePage(String submit) {
        String xpath = "//button[@name='formSubmit']";
        getDriver().findElement(By.xpath(xpath)).click();
    }


    @Then("I verify we see the Submitted Application Page")
    public void iVerifyWeSeeTheSubmittedApplicationPage() {
        String xpath = "//legend[contains(text(), 'Submitted Application')]";
        WebElement title = getDriver().findElement(By.xpath(xpath));
        assertThat(title.isDisplayed()).isTrue();
    }
}
