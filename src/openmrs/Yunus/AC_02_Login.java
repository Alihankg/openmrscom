package openmrs.Yunus;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AC_02_Login extends BaseDriver {
    @Test
    public static void Login() {

        driver.get("https://openmrs.org");
        driver.manage().window().maximize();
        MyFunc.Bekle(2);

        WebElement demo = driver.findElement(By.linkText("Demo"));
        demo.click();

        //  (//span[@class="elementor-button-text"])[2]
        WebElement expMRS2 = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[2]"));
        expMRS2.click();
        MyFunc.Bekle(2);

        WebElement expMRS2Demo = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[4]"));
        expMRS2Demo.click();


        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("admin");

        WebElement psw = driver.findElement(By.xpath("//input[@id='password']"));
        psw.sendKeys("Admin123");

        WebElement locationIW = driver.findElement(By.xpath("//li[@id='Inpatient Ward']"));
        locationIW.click();

        WebElement logIn = driver.findElement(By.xpath("//input[@id='loginButton']"));
        logIn.click();

        MyFunc.Bekle(5);
        // driver.quit();
    }

}


