package openmrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utility.BaseDriver.driver;
import static Utility.MyFunc.isClickable;
import static Utility.MyFunc.isPresent;

public class AC_10 {
    @Test
    public void appointment(){

        //Navigate
        WebElement appointmentSchedulingButton = isClickable(By.id("appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension"));
        appointmentSchedulingButton.click();

        WebElement manageAppointmentsButton = isClickable(By.id("appointmentschedulingui-manageAppointments-app"));
        manageAppointmentsButton.click();

        WebElement patientSearchBar = isClickable(By.id("patient-search"));
        patientSearchBar.sendKeys("Emir Can İğrek");

        WebElement patientButton = isClickable(By.xpath("//table[@id='patient-search-results-table']/tbody/tr"));
        patientButton.click();

        WebElement timeZoneWarning = isPresent(By.xpath("//div[@id='time-zone-warning']//p"));
        String timeZoneWarningText = "Your computer is not set to the right time zone. Please change to Coordinated Universal Time and then close and restart your browser to assure proper scheduling functionality.";
        Assert.assertEquals(timeZoneWarningText, timeZoneWarning.getText());


    }
}
