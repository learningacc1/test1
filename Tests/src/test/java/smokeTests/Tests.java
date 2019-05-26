package smokeTests;

import driver.DriverManager;
import driver.DriverManagerFactory;
import driver.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {

    protected static WebDriver driver;
    By button = By.id("btn");
    By checkbox = By.cssSelector("[type='checkbox']");
    By message = By.id("message");

    @BeforeClass
    public void setUp() {
        DriverManager driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_controls");
    }

    @Test
    public void test() {
        WebElement checkBox = driver.findElement(checkbox);

        assertThat(checkBox.isSelected()).isFalse();
        assertThat(checkBox.isDisplayed()).isTrue();

        WebElement button = driver.findElement(this.button);
        button.click();


        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.message));

        WebElement message = driver.findElement(this.message);
        assertThat(message.getText()).isEqualTo("It's gone!");

        button.click();
        WebDriverWait wait2 = new WebDriverWait(driver, 5);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(this.message));

        checkBox = driver.findElement(checkbox);
        assertThat(checkBox.isSelected()).isFalse();
        assertThat(checkBox.isDisplayed()).isTrue();
        assertThat(checkBox.isDisplayed()).isTrue();
    }

}
