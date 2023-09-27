package openmrs;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.fedcm.model.Account;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Utility.BaseDriver.driver;

public class AC_05_MyAccount {


    @Test(priority = 2, groups = {"Smoke Test"})
    public void MyAccoun() {
        WebElement profil = driver.findElement(By.cssSelector("[class='nav-item identifier']"));
        Actions aksiyon = new Actions(driver);
        MyFunc.Bekle(2);
        aksiyon.moveToElement(profil).build().perform();

        Assert.assertTrue(profil.getText().contains("Account"), "My Account görüntülenemedi.");
        WebElement myAccount = driver.findElement(By.xpath("//a[@href='/openmrs/adminui/myaccount/myAccount.page']"));
        myAccount.click();

        MyFunc.Bekle(2);
        WebElement page = driver.findElement(By.xpath("//div[@id='tasks']"));

        Assert.assertTrue(page.getText().contains("Change"), "Change görünmedi");

        MyFunc.Bekle(2);
        Assert.assertTrue(page.getText().contains("Languages"), "Languages görünmedi");


    }


}



