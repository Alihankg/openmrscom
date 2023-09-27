package openmrs.Musab;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AC_01_Warning extends BaseDriver {
    @Test(groups = {"Smoke Test"}, priority = 1)
    public void AC_01_Warning() {
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

//    @Test(groups = {"Smoke Test"}, priority = 1)
//    public void test1() {
//        driver.get("https://openmrs.org/");
//        driver.manage().window().maximize();
//
//        WebElement demo2 = driver.findElement(By.cssSelector("[class='zak-button']"));
//        demo2.click();
//        MyFunc.Bekle(2);
//
//        WebElement button = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[2]"));
//        button.click();
//        MyFunc.Bekle(2);
//
//        WebElement elementor = driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[4]"));
//        elementor.click();
//        MyFunc.Bekle(2);
//
//// İlk giriş denemesi (sadece kullanıcı adı)
//        login("gecersizKullanici", "", "Inpatient");
//
//// "Login" tuşuna basmak için elementi bulup tıklama
//        WebElement loginButton = driver.findElement(By.id("loginButton"));
//        loginButton.click();
//
//// Şifre alanını temizle
//        WebElement passwordField = driver.findElement(By.id("password"));
//        passwordField.clear();
//
//// İkinci giriş denemesi (yanlış kullanıcı adı ve şifre)
//        login("gecersizKullanici", "gecersizSifre", "Inpatient Ward");
//
//    }
//
//    private void login(String username, String password, String ward) {
//        WebElement usernameField = driver.findElement(By.id("username"));
//        usernameField.sendKeys(username);
//
//        WebElement passwordField = driver.findElement(By.id("password"));
//        passwordField.sendKeys(password);
//
//        WebElement wardField = driver.findElement(By.id(ward));
//        wardField.click();
//
//        WebElement loginButton = driver.findElement(By.id("loginButton"));
//        loginButton.click();
//    }
    }
}
