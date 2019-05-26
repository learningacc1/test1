package smokeTests;

import org.testng.annotations.Test;
import pages.CarsPage;
import pages.HomePage;


public class FirstSmokeTest {

    @Test
    public void firstSmokeTest() {
        new HomePage()
                .clickCars()
                .setCarDropOff()
                .clickCars()
                .setCarDropOff()
                .clickCarsSearchButton();
        CarsPage carsPaasdasge = new CarsPage();
        CarsPage cars = new CarsPage();

    }
}