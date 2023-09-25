package openmrs;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class AC_04_RegPatient extends BaseDriver {

    @Test
    public void RegPatient() {
        WebElement regPatient = driver.findElement(By.xpath("//i[@class='icon-user']"));
        regPatient.click();

        WebElement givenName = driver.findElement(By.xpath("//input[@name='givenName']"));
        givenName.click();
        givenName.sendKeys("Emir");

        WebElement middleName = driver.findElement(By.xpath("//input[@name='middleName']"));
        middleName.click();
        middleName.sendKeys("Can");

        WebElement famName = driver.findElement(By.xpath("//input[@name='familyName']"));
        famName.click();
        famName.sendKeys("İğrek");

        WebElement nextBtn1 = driver.findElement(By.xpath("//icon[@class='fas fa-chevron-right']"));
        nextBtn1.click();

        WebElement gender = driver.findElement(By.xpath("//option[@value='M']"));
        gender.click();

        WebElement nextBtn2 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn2.click();

        WebElement day = driver.findElement(By.xpath("//input[@name='birthdateDay']"));
        day.click();
        day.sendKeys("02");

        WebElement month = driver.findElement(By.xpath("//option[@value='4']"));
        month.click();

        WebElement year = driver.findElement(By.xpath("//input[@name='birthdateYear']"));
        year.click();
        year.sendKeys("1993");

        WebElement nextBtn3 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn3.click();

        WebElement adress1 = driver.findElement(By.xpath("//input[@id='address1']"));
        adress1.click();
        adress1.sendKeys("Yaprak Mah.");

        WebElement adress2 = driver.findElement(By.xpath("//input[@id='address2']"));
        adress2.click();
        adress2.sendKeys("Çınar Sok.");

        WebElement city = driver.findElement(By.xpath("//input[@id='cityVillage']"));
        city.click();
        city.sendKeys("İ");

        WebElement state = driver.findElement(By.xpath("//input[@id='stateProvince']"));
        state.click();
        state.sendKeys("İstanbul");

        WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
        country.click();
        country.sendKeys("Türkiye");

        WebElement postalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
        postalCode.click();
        postalCode.sendKeys("55522333");

        WebElement nextBtn4 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn4.click();

        WebElement number = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
        number.click();
        number.sendKeys("1111111114");

        WebElement nextBtn5 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn5.click();

        WebElement reletionship = driver.findElement(By.xpath("//option[@data-val='Parent']"));
        reletionship.click();

        WebElement reletionshipName = driver.findElement(By.xpath("//input[@placeholder='Person Name']"));
        reletionshipName.click();
        reletionshipName.sendKeys("Fatma");

        WebElement nextBtn6 = driver.findElement(By.xpath("//button[@class='confirm right']"));
        nextBtn6.click();

        WebElement confirm = driver.findElement(By.xpath("//input[@value='Confirm']"));
        confirm.click();

        // BekleVeKapat();
    }

}


