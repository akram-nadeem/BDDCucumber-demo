package Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class logInPage {
    static WebDriver driver;
    By usrName = By.id("user-name");

    //Locator for password field
    By pswd = By.id("password");

    //Locator for login button
    By loginBtn = By.id("login-button");



    public void verifyUserIsOnLoginPage(){

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.saucedemo.com/v1/");
    }

    public void enterUserName(){
        driver.findElement(usrName).sendKeys("standard_user");
    }

    public  void enterPassword(){
        driver.findElement(pswd).sendKeys("secret_sauce");
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void verifyUserIsOnHomePage(){

        String homePageSwagLabs = driver.getCurrentUrl();
        Assert.assertEquals(homePageSwagLabs,"https://www.saucedemo.com/inventory.html");
    }

    }


