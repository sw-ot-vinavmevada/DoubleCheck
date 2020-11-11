package PageObjects;

import BasePackage.BasePage;
import BasePackage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Random;

public class AddElevatorPO extends BasePage {


    public AddElevatorPO(WebDriver driver) throws IOException {
        super(driver);
    }

    public String elevatorName = "Auto Elevator " + DynamicData.randomStrings();
    public String airName = "Auto AirQuality " + DynamicData.randomStrings();
    public String generatorName = "Auto GeneratorSet " + DynamicData.randomStrings();
    public String greenHouseName = "Auto GreenHouse " + DynamicData.randomStrings();
    public String lightsName = "Auto Lights " + DynamicData.randomStrings();
    public String assetsName = "Auto Assets " + DynamicData.randomStrings();
    public String waterName = "Auto WaterSensor " + DynamicData.randomStrings();
    public String refrigeratorName = "Auto Refrigerator" + DynamicData.randomStrings();
    public String vendingName = "Auto Vending" + DynamicData.randomStrings();
    public String shelfId = "AutoId" + DynamicData.randomnumber();
    public String shelfId1 = "AutoId1" + DynamicData.randomnumber();
    public String shelfId2 = "AutoId2" + DynamicData.randomnumber();
    public String shelfCapacity =  DynamicData.randomnumber();
    public String hwID = HardwareKitPO.hwID;
    public String udID = "AutoUDID" + DynamicData.randomStrings();
    //public String udID = HardwareKitPO.UDID;
    public String model = "AutoModel" + DynamicData.randomStrings();
    public String power =  DynamicData.randomnumber();
    public String voltage =  DynamicData.randomnumber();
    public String capacity =   DynamicData.randomnumber();
    public String netWeight =  DynamicData.randomnumber();

    Random random = new Random();
    public int randomnum = random.nextInt(1000);

    //Add Building Elements
    //public By elevator_Icon = By.xpath("//i[@class='icon-sidebar icon-elevator ng-star-inserted']");
    public By elevator_Icon = By.xpath("//i[@class='icon-sidebar icon-elevator']");
    public By addElevator_Btn = By.xpath("//span[contains(text(),'Add Elevator')][1]");
    public By name_Txt = By.xpath("//input[@placeholder='Name']");
    public By building_DD = By.xpath("(//mat-select[@role='listbox'])[1]");
    public By building_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By wing_DD = By.xpath("(//mat-select[@role='listbox'])[2]");
    public By wing_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By kitCode_Txt = By.xpath("//input[@name='kitcode']");
   public By uID_Txt_QA = By.xpath("//input[@placeholder='Unique Id']");
 //   public By uID_Txt_UAT = By.xpath("//input[@placeholder='Elevator ID']");

    public By uID_Txt1 = By.xpath("//input[@placeholder='Sensor ID']");
    public By specification_Txt = By.xpath("//textarea[@placeholder='Specification']");
    public By desc_Txt = By.xpath("//textarea[@placeholder='Description']");

    public By submit_Btn = By.xpath("//span[contains(text(),'SUBMIT')]");
    public By submit1_Btn = By.xpath("//button[@title='Submit']");


    //Add Water Quality Elements
    public By sensor_Icon1 = By.xpath("//i[@class='icon-sidebar icon-sensor ng-star-inserted']");
    public By sensor_Icon = By.xpath("//i[@class='icon-sidebar icon-sensor']");
    public By addSensor_Btn = By.xpath("//span[contains(text(),'Add Sensor')][1]");

    //Add Lights Elements
    //public By lights_Icon = By.xpath("//i[@class='icon-sidebar icon-lights ng-star-inserted']");
    public By lights_Icon = By.xpath("//i[@class='icon-sidebar icon-lights']");
    public By addLights_Btn = By.xpath("//span[contains(text(),'Add Light')][1]");
    public By uIDLight_Txt = By.xpath("//input[@placeholder='Light ID']");
    public By genID_Txt = By.xpath("//input[@placeholder='Generator ID']");
    public By capacity_Txt = By.xpath("//input[@placeholder='Light Voltage Capacity']");

    //Add Green House
    public By greenHouse_Icon = By.xpath("//span[contains(text(),'Hardware Kits')]");
    public By addKit_Btn = By.xpath("//span[contains(text(),'Add Kit')][1]");
    public By greenHouse_DD = By.xpath("(//mat-select[@role='listbox'])[1]");
    //public By greenHouseValue_Xpath = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active mat-selected']//span)[1]");
    public By greenHouseValue_Xpath = By.xpath("//span[contains(text(),'Auto GreenHouse')]");
    public By kitCodeGH_Txt = By.xpath("//input[@name='kitCode']");
    public By parentIDGH_Txt = By.xpath("//input[@placeholder='Enter a Parent Device']");
    public By next_Btn = By.xpath("//span[contains(text(),'Next')]");

    //Refrigerator Elements
    public By refrigerator_Icon1 = By.xpath("//i[@class='icon-sidebar icon-refrigerator ng-star-inserted']");
    public By refrigerator_Icon = By.xpath("//i[@class='icon-sidebar icon-refrigerator']");
    public By addRefrigerator_Btn = By.xpath("//span[contains(text(),'Add Refrigerator')][1]");
    public By location_DD = By.xpath("(//mat-select[@role='listbox'])[1]");
    public By type_DD = By.xpath("(//mat-select[@role='listbox'])[2]");
    public By location_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By type_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By kitCode_Xpath = By.xpath("//input[@name='kitCode']");
    public By model_Xpath = By.xpath("//input[@name='model']");
    public By power_Xpath = By.xpath("(//input[@name='power'])[1]");
    public By voltage_Xpath = By.xpath("(//input[@name='voltage'])[1]");
    public By capacity_Xpath = By.xpath("(//input[@name='capacity'])[1]");
    public By netWeight_Xpath = By.xpath("(//input[@name='netWeight'])[1]");
    public By submitRef_Btn = By.xpath("//span[contains(text(),'Submit')]");

    //GenSet Elements
    //public By generator_Icon = By.xpath("//i[@class='icon-sidebar icon-generator ng-star-inserted']");
    public By generator_Icon = By.xpath("//i[@class='icon-sidebar icon-generator']");
    public By addGenerator_Btn = By.xpath("//span[contains(text(),'Add Generator')][1]");

    //Air Quality Elements
    public By AirQuality_Icon = By.xpath("//i[@class='icon-sidebar icon-facility']");
    public By QualitySensor_Icon = By.xpath("//i[@class='icon-sidebar icon-device']");
   // public By AirQuality_Icon = By.xpath("//i[@class='icon-sidebar icon-device ng-star-inserted']");
    public By uID_Txt_Air = By.xpath("//input[@placeholder='Unique ID']");

    //Vending Machine Elements
    public By vendingM_Icon = By.xpath("//i[@class='icon-sidebar icon-vending-machine']");
    public By addVending_Btn = By.xpath("//span[contains(text(),' Add Vending Machine')][1]");
    public By vendingName_Txt = By.xpath("//input[@placeholder='Machine Name']");

    public By uID_Txt_VM = By.xpath("//input[@placeholder='Machine ID']");
    public By productType_DD = By.xpath("(//span[contains(text(),'Select Product Type')])[1]");
    public By productType_DD1 = By.xpath("(//span[contains(text(),'Select Product Type')])[3]");
    //public By productType_DD2 = By.xpath("(//span[contains(text(),'Select Product Type')])[5]");
    public By productType_DD2 = By.xpath("(//div[@class='mat-select-arrow'])[4]");
    public By productType_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By productType_Value1 = By.xpath("//mat-option//span[contains(text(),'Cold Drink Bottle')]");
    public By productType_Value2 = By.xpath("//mat-option//span[contains(text(),'Chips')]");
    public By shelfId_Txt = By.xpath("(//input[@placeholder='Shelf ID'])[1]");
    public By shelfId_Txt1 = By.xpath("(//input[@placeholder='Shelf ID'])[2]");
    public By shelfId_Txt2 = By.xpath("(//input[@placeholder='Shelf ID'])[3]");
    public By shelfCapacity_Txt = By.xpath("(//input[@placeholder='Shelf Capacity'])[1]");
    public By shelfCapacity_Txt1 = By.xpath("(//input[@placeholder='Shelf Capacity'])[2]");
    public By shelfCapacity_Txt2 = By.xpath("(//input[@placeholder='Shelf Capacity'])[3]");

    //Add Asset Elements
    public By assets_Icon = By.xpath("//i[@class='icon-sidebar icon-assets ng-star-inserted']");
    public By addAssets_Btn = By.xpath("//span[contains(text(),'Add Asset')][1]");
    public By assetName_Txt = By.xpath("//input[@placeholder='Asset Name']");
    public By assetId_Txt = By.xpath("//input[@placeholder='Asset ID']");
    public By zone_DD = By.xpath("(//mat-select[@role='listbox'])[2]");
    public By zone_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By asset_DD = By.xpath("(//mat-select[@role='listbox'])[3]");
    public By asset_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By sensor_DD = By.xpath("(//mat-select[@role='listbox'])[4]");
    public By sensor_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By condition_DD = By.xpath("(//mat-select[@role='listbox'])[5]");
    public By condition_Value = By.xpath("(//mat-option[@class='mat-option ng-star-inserted mat-active']//span)[1]");
    public By sensor_Value_Txt = By.xpath("//input[@placeholder='Sensor Value']");

}
