package openmrs.Musab;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AC_06_Search extends BaseDriver {
    @BeforeClass
    public void setUp() {
        // WebDriver başlatma
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Pencereyi maksimize et
        driver = new ChromeDriver(options);
    }
    @Test(groups = "Smoke Test", priority = 1)
    public void test1() {
        driver.get("https://openmrs.org/");
        clickByCssSelector("[class='zak-button']");
        wait(2);
        clickByXPath("(//span[@class='elementor-button-text'])[2]");
        wait(2);
        clickByXPath("(//span[@class='elementor-button-text'])[4]");
        wait(2);
        login("admin", "Admin123", "Inpatient Ward");
    }
    private void clickByCssSelector(String selector) {
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.click();
    }
    private void clickByXPath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }
    private void login(String username, String password, String ward) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement wardField = driver.findElement(By.id(ward));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        wardField.click();

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
    }
    private void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
