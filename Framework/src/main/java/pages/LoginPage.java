//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class LoginPage {
//
//    private final By username = By.name("username");
//    private final By password = By.name("password");
//    private final By loginButton = By.xpath("//*[@id='loginfrm']/button");
//
//    public LoginPage(WebDriver driver) {
//        this.driver=driver;
//    }
//    public void setUsername(String username) {
//        driver.findElement(username).click();
//    }
//
//    public void setPassword(String password) {
//        this.password.sendKeys(password);
//    }
//
//    public void logIn() {
//        loginButton.click();
//    }
//
//}
