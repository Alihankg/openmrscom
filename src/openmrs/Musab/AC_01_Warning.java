package openmrs.Musab;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AC_01_Warning extends BaseDriver {
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

// İlk giriş denemesi (sadece kullanıcı adı)
        login("gecersizKullanici", "", "Inpatient");

// "Login" tuşuna basmak için elementi bulup tıklama
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

// Şifre alanını temizle
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();

// İkinci giriş denemesi (yanlış kullanıcı adı ve şifre)
        login("gecersizKullanici", "gecersizSifre", "Inpatient Ward");

    }

    private void login(String username, String password, String ward) {
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        WebElement wardField = driver.findElement(By.id(ward));
        wardField.click();

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
    }
}
