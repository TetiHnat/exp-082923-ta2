/*package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static support.TestContext.getDriver;

public class JavaStepsHomework {

    @Given("I open url ")
    public void IOpenTestUrlForTheForm() {
        getDriver().get("http://quote-stage.portnov.com/");
    }

    @And("I type {string} into all input fields")
    public void iTypeIntoAllInputFields(String inputString) {
        List<WebElement> webElementList = getDriver().findElements(By.xpath("//input[@type='text']"));
        for (WebElement we : webElementList) {
            we.sendKeys(inputString);
        }

            }




    }
}*/