package smokeTests;

import org.testng.annotations.Test;
import pages.CarsPage;
import pages.HomePage;


public class FirstSmokeTest {

    @Test
    public void firstSmokeTest() {
        new HomePage()
                .clickCars()
                .setCarPickUp()
                .setCarDropOff()
                .clickCarsSearchButton();
        CarsPage carsPage = new CarsPage();
        carsPage.selectCarsRandomly();
        carsPage.selectCarsRandomly();
        carsPage.selectCarsRandomly();
        carsPage.selectCarsRandomly();
    }
}