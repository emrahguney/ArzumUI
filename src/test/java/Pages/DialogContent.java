package Pages;

import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy (xpath = "(//i[@class='icon-member-default text-custom-pink'])[2]")
    public WebElement loginButton;

    @FindBy (id = "member-login-btn")
    public WebElement loginButton2;

    @FindBy(id ="ug-email" )
    public WebElement email;

    @FindBy(id="ug-password")
    public WebElement password;

    @FindBy(id = "live-search")
    public WebElement searchText;

    @FindBy(id= "search-btn")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='col col-12 sifirlaMargin']")
    public WebElement accountAssert;

    @FindBy(xpath = "//div[@id='list-slide1003']/div")
    public List<WebElement> airFryerItems;

    @FindBy(id="addCartBtn")
    public WebElement addCart;

    @FindBy(xpath = "//div[contains(@class,'totalBasketPrice')]")
    public WebElement airPrice;

    @FindBy(xpath = "//button[@data-id='1']")
    public WebElement goCart;

    @FindBy(xpath = "(//span[contains(@class,'UrunBirimFiyat')])[2]")
    public WebElement totalPrice;


    public WebElement getWebElement(String Button) {

        switch (Button) {

            case "password" : return password;
            default: return null;
        }


    }

    public void clickOnSearchButton() {

      //  searchButton.click();
    }
    public void waitUntilRefresh(){

        wait.until(ExpectedConditions.numberOfElementsToBe
                (By.xpath(" //fuse-progress-bar/*") , 0));

    }



   /* public void deleteItem(String searchText){


        sendKeysFunction(searchInput,searchText);
        clickFunction(searchButton);


         wait.until(ExpectedConditions.elementToBeClickable(searchButton));

         // wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        MyFunc.Bekle(1);
        clickFunction(deleteImageBtn);
        //MyFunc.Bekle(1);
        clickFunction(deleteDialogBtn);

    }*/


}