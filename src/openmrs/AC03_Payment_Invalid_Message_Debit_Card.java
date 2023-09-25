package openmrs;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//AC_01_Warning

public class AC03_Payment_Invalid_Message_Debit_Card extends BaseDriver {

    @Test(groups = {"Smoke Test"}, priority = 1)
    public void test1() {
        driver.get("https://openmrs.org/");
        driver.manage().window().maximize();

        WebElement demo2 = driver.findElement(By.cssSelector("[class='zak-button']"));
        demo2.click();
        MyFunc.Bekle(2);

        WebElement button = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[2]"));
        button.click();
        MyFunc.Bekle(2);

        WebElement elementor = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[4]"));
        elementor.click();
        MyFunc.Bekle(2);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("ahmet");
        username.clear();


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Admin123");
        password.clear();


        WebElement inpatientWard = driver.findElement(By.id("Inpatient Ward"));
        inpatientWard.click();

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        WebElement username2 = driver.findElement(By.id("username"));
        username2.sendKeys("admin");

        WebElement password2 = driver.findElement(By.id("password"));
        password2.sendKeys("Admin123");

        WebElement loginButton2 = driver.findElement(By.id("loginButton"));
        loginButton2.click();

        WebElement username1 = driver.findElement(By.id("username"));
        username1.sendKeys("admin");

        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("Admin123");

        WebElement inpatientWard1 = driver.findElement(By.id("Inpatient Ward"));
        inpatientWard1.click();

        WebElement loginButton1 = driver.findElement(By.id("loginButton"));
        loginButton1.click();




    }
    //AC_06_Search
    @Test(groups = "Smoke Test", priority = 2)
    public void test2 () {
        driver.get("https://openmrs.org/");
        driver.manage().window().maximize();

        WebElement demo2 = driver.findElement(By.cssSelector("[class='zak-button']"));
        demo2.click();
        MyFunc.Bekle(2);

        WebElement button = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[2]"));
        button.click();
        MyFunc.Bekle(2);

        WebElement elementor = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[4]"));
        elementor.click();
        MyFunc.Bekle(2);

        WebElement username12 = driver.findElement(By.id("username"));
        username12.sendKeys("admin");

        WebElement password12 = driver.findElement(By.id("password"));
        password12.sendKeys("Admin123");

        WebElement inpatientWard12 = driver.findElement(By.id("Inpatient Ward"));
        inpatientWard12.click();

        WebElement loginButton12 = driver.findElement(By.id("loginButton"));
        loginButton12.click();

        WebElement coreapps = driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension"));
        coreapps.click();

        MyFunc.Bekle(2);
        WebElement patient = driver.findElement(By.id("patient-search"));
        patient.sendKeys("ahmet");
        MyFunc.Bekle(2);
        patient.clear();
        MyFunc.Bekle(2);
        WebElement patient1 = driver.findElement(By.id("patient-search"));
        patient1.sendKeys("ali");

        WebElement odd = driver.findElement(By.cssSelector("[class='odd']"));
        odd.click();


    }
    //AC_03_Logout
    @Test(groups = "Smoke Test", priority = 2)
    public void test3 () {
        driver.get("https://openmrs.org/");
        driver.manage().window().maximize();

        WebElement demo2 = driver.findElement(By.cssSelector("[class='zak-button']"));
        demo2.click();
        MyFunc.Bekle(2);

        WebElement button = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[2]"));
        button.click();
        MyFunc.Bekle(2);

        WebElement elementor = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[4]"));
        elementor.click();
        MyFunc.Bekle(2);

        WebElement username12 = driver.findElement(By.id("username"));
        username12.sendKeys("admin");

        WebElement password12 = driver.findElement(By.id("password"));
        password12.sendKeys("Admin123");

        WebElement inpatientWard12 = driver.findElement(By.id("Inpatient Ward"));
        inpatientWard12.click();

        WebElement loginButton12 = driver.findElement(By.id("loginButton"));
        loginButton12.click();

        WebElement logout = driver.findElement(By.cssSelector("[class='nav-item logout']"));
        logout.click();


    }
}
