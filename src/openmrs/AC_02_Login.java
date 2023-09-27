package openmrs;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utility.MyFunc.isClickable;

public class AC_02_Login extends BaseDriver {
    @Test
    public static void Login() {

        driver.get("https://openmrs.org");
        driver.manage().window().maximize();

        WebElement demo = isClickable(By.linkText("Demo"));
        demo.click();

        WebElement expMRS2Demo = isClickable(By.xpath("(//span[@class='elementor-button-text'])[4]"));
        expMRS2Demo.click();

        WebElement userName = isClickable(By.xpath("//input[@id='username']"));
        userName.sendKeys("admin");

        WebElement psw = driver.findElement(By.xpath("//input[@id='password']"));
        psw.sendKeys("Admin123");

        WebElement locationIW = driver.findElement(By.xpath("//li[@id='Inpatient Ward']"));
        locationIW.click();

        WebElement logIn = isClickable(By.xpath("//input[@id='loginButton']"));
        logIn.click();

    }
}


