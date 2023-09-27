package openmrs.Musab;


import org.testng.annotations.Test;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AC_06_Search extends BaseDriver {
    @Test(groups = "Smoke Test", priority = 2)
    public void AC_06_Search() {

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
        patient1.sendKeys("Rock Ma");

        WebElement odd = driver.findElement(By.xpath("//tr[@class='odd'][1]"));
        odd.click();
    }
}
