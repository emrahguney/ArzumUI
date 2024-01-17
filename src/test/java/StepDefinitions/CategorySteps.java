package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import java.util.ArrayList;


public class CategorySteps {
    String expectedResult;
    DialogContent dc= new DialogContent();


    @Given("Navigate to Arzum")
    public void navigateTo() {

        GWD.getDriver().get("https://www.arzum.com.tr");
    }


    @When("Click on Login Button")
    public void clickOnLoginButton() {

        dc.clickFunction(dc.loginButton);
    }

    @Then("Enter email and password and click login button")
    public void enterEmailAndPasswordAndClickLoginButton() {
        ArrayList<ArrayList<String>> info = ExcelUtility.getData("src/main/resources/TestData/TestData.xlsx","Sayfa1",2);
        dc.clickFunction(dc.email);
        dc.sendKeysFunction(dc.email,info.get(0).get(0));
        dc.clickFunction(dc.password);
        dc.sendKeysFunction(dc.password,info.get(0).get(1));
        dc.clickFunction(dc.loginButton2);
        dc.waitUntilClickable(dc.accountAssert);
        Assert.assertTrue(dc.accountAssert.isDisplayed());



    }

    @And("Click on Search Button and searching Airfryer")
    public void clickOnSearchButtonAndSearchingAirfryer() {
        dc.clickFunction(dc.searchText);
        dc.sendKeysFunction(dc.searchText,"Airfryer");
        dc.clickFunction(dc.searchButton);
        
    }

    @And("Click on first Item")
    public void clickOnFirstItem() {
        System.out.println("number of elements = "+dc.airFryerItems.size());
        dc.clickFunction(dc.airFryerItems.get(0));


    }

    @And("Click on Add to Cart")
    public void clickOnAddToCart() {
        dc.clickFunction(dc.addCart);
        dc.waitUntilVisible(dc.airPrice);
        System.out.println("price = "+dc.airPrice.getText());
        expectedResult = dc.airPrice.getText();
    }

    @And("Click on Go to Cart")
    public void clickOnGoToCart() {

        dc.clickFunction(dc.goCart);

    }

    @And("Verify to Price")
    public void verifyToPrice() {

        Assert.assertEquals(expectedResult,dc.totalPrice.getText());
    }
}
