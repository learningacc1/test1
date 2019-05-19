package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private By flightsButton = By.xpath("//li[@data-title='flights']");
    private By hotelsButton = By.xpath("//li[@data-title='hotels']");
    private By toursButton = By.xpath("//li[@data-title='tours']");
    private By carsButton = By.xpath("//li[@data-title='cars']");
    private By carsSearchButton = By.xpath("//*[@id='cars']/form/div[7]/button");
    private By carsPickUp = By.id("s2id_carlocations");
    private By carsDropOff = By.id("s2id_carlocations2");

    public HomePage() {
        super();
        waitForPageToLoad();
    }

    public HomePage clickFlights() {
        driver.findElement(flightsButton).click();
        return this;
    }

    public HomePage clickHotels() {
        driver.findElement(hotelsButton).click();
        return this;
    }

    public HomePage clickCars() {
        driver.findElement(carsButton).click();
        return this;
    }

    public HomePage clickTours() {
        driver.findElement(toursButton).click();
        return this;
    }

    public HomePage setCarPickUp() {
        waitForClickAbleAndClick(carsPickUp, "Nile Egypt");
        return this;

    }

    public HomePage setCarDropOff() {
        waitForClickAbleAndClick(carsDropOff, "Petra");
        return this;
    }

    public void clickCarsSearchButton() {
        driver.findElement(carsSearchButton).click();
//        return new CarsPage();
    }


}
