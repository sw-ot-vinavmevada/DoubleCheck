package PageObjects;

import BasePackage.BasePage;
import ExcelUtility.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class AdminLoginPO extends BasePage {


    public AdminLoginPO(WebDriver driver) throws IOException {
        super(driver);
    }

    public By login_Btn = By.xpath("//span[contains(text(),'Login')]");
    public By email_Txt = By.xpath("(//input[@placeholder='Email Address'])[1]");
    public By pass_Txt = By.xpath("(//input[@placeholder='Password'])[1]");
    public By submit_Btn = By.xpath("(//button[@type='submit'])[1]");

    public By userMenu_Btn = By.xpath("//li[@class='dropdown user user-menu']");
    public By signOut_Btn = By.xpath("//a[contains(text(),'Sign Out')]");


    ReadExcel readExcel = new ReadExcel("Data.xlsx", "URLs");
    public String SmartElevatorAdmin = readExcel.readValues("SmartElevatorAdmin");
    public String refrigeratorAdmin = readExcel.readValues("RefrigeratorUserAdmin");
    public String SmartGreenHouse = readExcel.readValues("GreenUserAdmin");
    public String waterQualityUrl = readExcel.readValues("WaterAdmin");
    public String lightingAdminUrl = readExcel.readValues("LightingAdmin");
    public String genSetAdminUrl = readExcel.readValues("GenSetAdminUser");
    public String airQualityAdminUrl = readExcel.readValues("AirQualityAdminUser");
    public String VendingMachineAdminUrl = readExcel.readValues("VendingMachineAdminUser");

    ReadExcel readExcel1 = new ReadExcel("Data.xlsx", "AdminEmail");
    public String emailIdAdmin = readExcel1.readValues("emailAdmin");
    public String passAdmin = readExcel1.readValues("passAdmin");


    public boolean loginInAdmin() throws Exception {
        try {

            Thread.sleep(3000);
            WebElement emailID = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.elementToBeClickable(email_Txt));
            Thread.sleep(2000);
            emailID.sendKeys(emailIdAdmin);
            WebElement password = new WebDriverWait(driver, 90)
                    .until(ExpectedConditions.visibilityOfElementLocated(pass_Txt));
            password.sendKeys(passAdmin);

            WebElement submit = new WebDriverWait(driver, 300)
                    .until(ExpectedConditions.visibilityOfElementLocated(submit_Btn));
            submit.click();

            return true;
        } catch (Exception e) {
            //return false;
            throw e;
        }
    }
}
