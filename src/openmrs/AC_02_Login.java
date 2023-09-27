package openmrs;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utility.MyFunc.clickable;

public class AC_02_Login extends BaseDriver {
    @Test
    public static void Login() {

        driver.get("https://openmrs.org");
        driver.manage().window().maximize();

        WebElement demo = clickable(By.linkText("Demo"));
        demo.click();

        WebElement expMRS2Demo = clickable(By.xpath("(//span[@class='elementor-button-text'])[4]"));
        expMRS2Demo.click();

        WebElement userName = clickable(By.xpath("//input[@id='username']"));
        userName.sendKeys("admin");

        WebElement psw = driver.findElement(By.xpath("//input[@id='password']"));
        psw.sendKeys("Admin123");

        WebElement locationIW = driver.findElement(By.xpath("//li[@id='Inpatient Ward']"));
        locationIW.click();

        WebElement logIn = clickable(By.xpath("//input[@id='loginButton']"));
        logIn.click();

    }
}


