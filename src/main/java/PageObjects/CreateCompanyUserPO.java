package PageObjects;

import BasePackage.BasePage;
import BasePackage.CommonMethods;
import BasePackage.DynamicData;
import ExcelUtility.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class CreateCompanyUserPO extends BasePage {


    public CreateCompanyUserPO(WebDriver driver) throws IOException {
        super(driver);
    }
    public CreateCompanyUserPO() throws IOException {
        super();
    }
    public String compName = DynamicData.companyName();
    public String fName_Str = DynamicData.randomString();
    public String lName_Str = DynamicData.randomString();



    public By newAccount_Lnk = By.xpath("//a[contains(text(),'Create new account')]");
    public By newAccount_Lnk1 = By.xpath("//span[contains(text(),'Register')]");
    public By companyName_Txt = By.xpath("//input[@placeholder='Company Name']");
    public By contactNumber_Txt = By.xpath("//input[@placeholder='Enter Contact Number']");
    public By address_Txt = By.xpath("//input[@placeholder='Address']");
    public By city_Txt = By.xpath("//input[@placeholder='City Name']");
    public By zip_Txt = By.xpath("//input[@placeholder='Zip Code']");
    public By country_DD = By.xpath("(//input[@role='combobox'])[1]");
    public By country_Value = By.xpath("(//div[@class='ng-option ng-star-inserted ng-option-marked']//span)[1]");
   // public String countries = driver.findElement(country_Value).getText();




    public By state_DD = By.xpath("(//input[@role='combobox'])[2]");
    public By state_Value = By.xpath("(//div[@class='ng-option ng-star-inserted ng-option-marked']//span)[1]");
    public By timeZone_DD = By.xpath("//span[contains(text(),'Time Zone')]");
    public By timeZone_Value = By.xpath("//span[contains(text(),'UTC-11')]");
    public By fName_Txt = By.xpath("//input[@placeholder='First Name']");
    public By lName_Txt = By.xpath("//input[@placeholder='Last Name']");
    public By email_Txt = By.xpath("//input[@placeholder='Email']");
    public By pass_Txt = By.xpath("//input[@placeholder='password']");
    public By Next_Btn = By.xpath("//span[contains(text(),'Next')]");
    public By basic_Plan = By.xpath("(//div[@class='mat-radio-container'])[1]");
    public By cardName_Txt = By.xpath("//input[@placeholder='Name on Card']");
    public By cardNumber_Txt = By.xpath("//input[@name='cardnumber']");
    public By cardExpDate_Txt = By.xpath("//input[@name='exp-date']");
    public By cardCVV_Txt = By.xpath("//input[@name='cvc']");
    public By cardPostal_Txt = By.xpath("//input[@name='postal']");
    public By confirm_Btn = By.xpath("//button[@title='next']");
    public By iFrameId = By.xpath("//iframe[contains(@title, 'Secure payment')]");
    CommonMethods commonMethods = new CommonMethods(driver);

    //Read Data From Excel File

    ReadExcel readExcel = new ReadExcel("Data.xlsx", "URLs");
    public String companyUrl = readExcel.readValues("ElevatorUser");
    public String refrigeratorUrl = readExcel.readValues("RefrigeratorUser");
    public String waterUrl = readExcel.readValues("WaterQualityUser");
    public String greenUrl = readExcel.readValues("GreenUser");
    public String lightUrl = readExcel.readValues("LightingUser");
    public String genSetUrl = readExcel.readValues("GenSetUser");
    public String AirQualityUrl = readExcel.readValues("AirQualityUser");
    public String VendingMachineUrl = readExcel.readValues("VendingMachineUser");
    public String AssetUrl = readExcel.readValues("AssetUser");
    public String iot_Url = readExcel.readValues("iotUrl");

    public String cardHolderNameStr = readExcel.readValues("CardHolderName");
    public String cardNumberStr = readExcel.readValues("CardNumber");
    public String expDateStr = readExcel.readValues("MMYY");
    public String cvcCodeStr = readExcel.readValues("CVC");
    public String zipStr = readExcel.readValues("ZIP");

    public String country = readExcel.readValues("country");
    public String state = readExcel.readValues("state");
    public String city = readExcel.readValues("city");



    public void switchFrame() {
        commonMethods.switchToFrame(iFrameId);
    }

    //IOT Elements

    public By devices_Link = By.xpath("//li//span[contains(text(),'Devices')]");
   // public By device_ViewBtn = By.xpath("(//a[@href='/device/1'])[3]");
    public By device_ViewBtn = By.xpath("(//a[@href='/device/3'])[3]");
    public By delete_deviceIcon = By.xpath("//a[@title='Delete Device']");
    public By confirmationPopup = By.xpath("(//div[@class='col-sm-12']//button[@value='OK'])[1]");
    //public By editLocation = By.xpath("(//a[@title='Edit'])[1]");
    public By editLocation = By.xpath("//a[@title='Edit']");


}
