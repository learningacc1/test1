package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarsPage extends BasePage {

    private By flightsButton = By.xpath("//li[@data-title='flights']");
    private By detailsButton = By.xpath("//button[contains(text(), 'Details')]");
    private By nextResultPageButton = By.xpath("//button[contains(text(), 'Details')]");

    public CarsPage() {
        waitForPageToLoad();
    }

    public void SelectCars() {

    }

    public void selectCarsRandomly() {
        List<WebElement> list = driver.findElements(detailsButton);
        int random = (int) (Math.random() * 5);
        WebElement myDynamicElement = list.get(random);
        myDynamicElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(myDynamicElement));
        myDynamicElement.click();
    }

//    public static void main(String[] args) {
//        List<String> str = new ArrayList<String>();
//        str.add("");
//        str.add("");
//        str.add("");
//        str.add("");
//        str.add("");
//        Random random = new Random();
//        int randomIndex = random.nextInt(str.size()+1);
//        System.out.println(randomIndex);
//    }
}
