package openmrs;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utility.MyFunc.clickable;

public class AC_04_RegPatient extends BaseDriver {

    @Test
    public void RegPatient() {
        WebElement regPatient = clickable(By.xpath("//i[@class='icon-user']"));
        regPatient.click();

        WebElement givenName = clickable(By.xpath("//input[@name='givenName']"));
        givenName.sendKeys("Emir");

        WebElement middleName = driver.findElement(By.xpath("//input[@name='middleName']"));
        middleName.sendKeys("Can");

        WebElement famName = driver.findElement(By.xpath("//input[@name='familyName']"));
        famName.sendKeys("İğrek");

        WebElement nextBtn1 = driver.findElement(By.xpath("//icon[@class='fas fa-chevron-right']"));
        nextBtn1.click();

        WebElement gender = clickable(By.xpath("//option[@value='M']"));
        gender.click();

        WebElement nextBtn2 = clickable(By.xpath("//button[@class='confirm right']"));
        nextBtn2.click();

        WebElement day = driver.findElement(By.xpath("//input[@name='birthdateDay']"));
        day.sendKeys("02");

        WebElement month = driver.findElement(By.xpath("//option[@value='4']"));
        month.click();

        WebElement year = clickable(By.xpath("//input[@name='birthdateYear']"));
        year.sendKeys("1993");

        WebElement nextBtn3 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn3.click();

        WebElement adress1 = clickable(By.xpath("//input[@id='address1']"));
        adress1.sendKeys("Yaprak Mah.");

        WebElement adress2 = driver.findElement(By.xpath("//input[@id='address2']"));
        adress2.sendKeys("Çınar Sok.");

        WebElement city = driver.findElement(By.xpath("//input[@id='cityVillage']"));
        city.sendKeys("İ");

        WebElement state = driver.findElement(By.xpath("//input[@id='stateProvince']"));
        state.sendKeys("İstanbul");

        WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
        country.sendKeys("Türkiye");

        WebElement postalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
        postalCode.sendKeys("55522333");

        WebElement nextBtn4 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn4.click();

        WebElement number = clickable(By.xpath("//input[@name='phoneNumber']"));
        number.sendKeys("1111111114");

        WebElement nextBtn5 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn5.click();

        WebElement relationship = clickable(By.xpath("//option[@data-val='Parent']"));
        relationship.click();

        WebElement relationshipName = clickable(By.xpath("//input[@placeholder='Person Name']"));
        relationshipName.sendKeys("Fatma");

        WebElement nextBtn6 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn6.click();

        WebElement confirm = clickable(By.xpath("//input[@value='Confirm']"));
        confirm.click();

        MyFunc.Bekle(2);
        driver.navigate().to("https://demo.openmrs.org/openmrs/referenceapplication/home.page");
    }

}


