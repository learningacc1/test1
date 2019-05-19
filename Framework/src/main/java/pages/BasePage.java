package pages;

import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.RandomSelector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class BasePage {

    private static final String BASE_URL = "https://www.phptravels.net/";

    //TODO: Think about driver passing without static
    protected static WebDriver driver;

    BasePage() {
        DriverManager driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        if (driver == null){
            driver = driverManager.getDriver();
            driver.navigate().to(BASE_URL);
        }
    }

    void waitForPageToLoad() {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

    void waitForClickAbleAndClick(final By findElement, final String text) {
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.elementToBeClickable(findElement));

        //TODO: Extract to different method
        Actions actions = new Actions(driver);
        actions.moveToElement(myDynamicElement);
        actions.click();
        actions.sendKeys(text);
        actions.sendKeys(Keys.RETURN);
        actions.build().perform();
    }
}
