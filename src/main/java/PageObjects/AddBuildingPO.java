package PageObjects;

import BasePackage.BasePage;
import BasePackage.DynamicData;
import ExcelUtility.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class AddBuildingPO extends BasePage {

    public AddBuildingPO(WebDriver driver) throws IOException {
        super(driver);
    }

    public String buildName = "Auto Build" + DynamicData.randomStrings();
    public String facilityName = "Auto Facility" + DynamicData.randomStrings();
    public String locationName = "Auto Location" + DynamicData.randomStrings();
    public String houseName = "Auto GreenHouse" + DynamicData.randomStrings();

    ReadExcel readExcel = new ReadExcel("Data.xlsx", "URLs");
    public String country = readExcel.readValues("country");
    public String state = readExcel.readValues("state");
    public String city = readExcel.readValues("city");

    //Add Building Elements
    public By building_Icon = By.xpath("//i[@class='icon-sidebar icon-building']");
    public By buildNameLnk = By.xpath("//a[contains(text(),'Auto Build')]");

    public By building_Icon1 = By.xpath("//i[@class='icon-sidebar icon-building ng-star-inserted']");
    public By addBuilding_Btn = By.xpath("//span[contains(text(),'Add Building')][1]");
    public By name_Txt = By.xpath("//input[@placeholder='Name']");
    public By address_Txt = By.xpath("//textarea[@placeholder='Address']");
    public By address_Txt2 = By.xpath("//textarea[@placeholder='Address2']");
    public By city_Txt = By.xpath("//input[@placeholder='City']");
    public By latitude_Txt = By.xpath("//input[@placeholder='Latitude']");
    public By longitude_Txt = By.xpath("//input[@placeholder='Longitude']");
    public By zip_Txt = By.xpath("//input[@placeholder='Zip Code']");
    public By desc_Txt = By.xpath("//textarea[@placeholder='Description']");
    public By country_DD = By.xpath("(//input[@role='combobox'])[1]");
    public By country_Value = By.xpath("(//div[@class='ng-option ng-star-inserted ng-option-marked']//span)[1]");
    public By state_DD = By.xpath("(//input[@role='combobox'])[2]");
    public By state_Value = By.xpath("(//div[@class='ng-option ng-star-inserted ng-option-marked']//span)[1]");
    public By submit_Btn = By.xpath("//span[contains(text(),'SUBMIT')]");

    //Delete Building
    public By deleteBuilding_Icon = By.xpath("//a[@title='Delete']");
    public By deleteWing_Icon = By.xpath("//a[@title='Delete']");
    public By deleteWingConfirmYes = By.xpath("//span[contains(text(),'Confirm')]");
    public By deleteConfirmYes = By.xpath("//span[contains(text(),'Yes')]");


    //Add Wing Elements
    public By buildName_Xpath = By.xpath("//a[contains(text(),'Auto Build')]");
    public By addWing_Btn = By.xpath("//i[contains(text(),'add')]");
    public By add_Btn = By.xpath("//span[contains(text(),'ADD')]");
    public By nameWing_Txt = By.xpath("//input[@name='name']");
    public By descWing_Txt = By.xpath("//textarea[@name='description']");

    //Water Quality Elements
    public By submitWater_Btn = By.xpath("//span[contains(text(),'Submit')]");
    public By buildNameWater_Xpath = By.xpath("//span[contains(text(),'Auto Build')]");
    public By addWater_Btn = By.xpath("//span[contains(text(),'Add')]");

    //Lighting Elements
    public By buildNameLight_Xpath = By.xpath("//a[contains(text(),'Auto Build')]");
    public By nameZone_Txt = By.xpath("//input[@name='name']");
    public By zoneTypeDD = By.xpath("(//mat-select[@role='listbox'])[3]");
    public By zoneType_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By addLight_Btn = By.xpath("//i[contains(text(),'add')]");

    //Green House Elements
    //public By greenHouse_Icon1 = By.xpath("//i[@class='icon-sidebar icon-greenhouse ng-star-inserted']");
    public By greenHouse_Icon1 = By.xpath("//i[@class='icon-sidebar icon-greenhouse']");

    public By addGreenhouse_Btn = By.xpath("//span[contains(text(),'Add Green House')][1]");
    public By greenHouse_Xpath = By.xpath("//a[contains(text(),'Auto GreenHouse')]");

    //Refrigerator Element
    public By location_Icon1 = By.xpath("//i[@class='icon-sidebar icon-location ng-star-inserted']");

    public By location_Icon = By.xpath("//i[@class='icon-sidebar icon-location']");
    public By addLocation_Btn = By.xpath("//span[contains(text(),'Add Location')][1]");

    //GenSet Elements
    //public By locationGenSet_Icon = By.xpath("//i[@class='icon-sidebar icon-location ng-star-inserted']");
    public By locationGenSet_Icon = By.xpath("//i[@class='icon-sidebar icon-location']");
    public By addLocationGen_Btn = By.xpath("//span[contains(text(),'Add Location')][1]");

    //Air Quality
    //public By facilities_Icon = By.xpath("(//i[@class='icon-sidebar icon-facility ng-star-inserted'])[1]");
    public By facilities_Icon = By.xpath("(//i[@class='icon-sidebar icon-facility'])[1]");

    public By addFacility_Btn = By.xpath("//span[contains(text(),'Add Facility')][1]");
    public By submit1_Btn = By.xpath("//span[contains(text(),'Submit')]");
    public By addedFacilityName_Xpath = By.xpath("//a[contains(text(),'Auto Facility')]");
    public By airZoneTypeDD = By.xpath("(//mat-select[@role='listbox'])[4]");
    public By add_Btn_Air = By.xpath("//span[contains(text(),'Add')]");

    public Object getText(By xpath){
        try {
            WebElement header = (new WebDriverWait(driver, 90)).
                    until(ExpectedConditions.visibilityOfElementLocated(xpath));
           String value = header.getText();
            System.out.println("Test:-" + header.getText());
            return header;

        }catch (Exception e){
            return String.valueOf(e);
        }
    }

}
