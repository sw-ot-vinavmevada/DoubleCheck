package PageObjects;

import BasePackage.BasePage;
import BasePackage.DynamicData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class HardwareKitPO extends BasePage {

    public HardwareKitPO(WebDriver driver)throws IOException{
        super(driver);
    }
    public static String hwID =  "AutoHWID" + DynamicData.randomStrings();
    public static String UDID =  "AutoUDID" + DynamicData.randomStrings();
    public static String UDID1 =  "AutoUDID1" + DynamicData.randomStrings();
    public String name = "AutoHWKit"+DynamicData.hwUniqueID();
    public String name1 = "AutoHWKit"+DynamicData.hwUniqueID();


    public By hw_Icon = By.xpath("//i[@class='icon-sidebar icon-devices']");
    public By hw_Icon_Air = By.xpath("//i[@class='icon-sidebar icon-device']");
    public By hw_Icon_Lighting = By.xpath("//i[@class='icon-sidebar icon-device']");
    public By hw_Icon_WQ = By.xpath("//i[@class='icon-sidebar icon-hardware-kits']");
    //public By hw_Icon = By.xpath("//i[@ng-reflect-ng-class='icon-devices']");
    public By addKit_Btn = By.xpath("//span[contains(text(),'Add Kit')][1]");
    public By hwKitId_Txt = By.xpath("//input[@placeholder='H/W Kit ID']");
    public By uniqueId_Txt = By.xpath("//input[@name='uniqueId']");
    public By kitTypeDD_Icon = By.xpath("//div[@class='mat-select-arrow']");
    public By kitTypeDD_Value = By.xpath("//span[contains(text(),'Default')]");
    public By name_Txt_Ele = By.xpath("//input[@placeholder='Name']");
    public By note_Txt = By.xpath("//textarea[@placeholder='Note']");
    public By submit_Btn = By.xpath("//span[contains(text(),'Submit')]");
    public By successMsg = By.xpath("//div[@class='notifications']");

    //public String kitValue = driver.findElement(By.xpath("//span[contains(text(),'Default')]")).getText();

    //Green House Xpath
    public By name_Txt_GH = By.xpath("//input[@id='devicename']");
    public By name_Txt_GH1 = By.xpath("//input[@name='name']");
    public By tag_DropDown_GH = By.xpath("(//div[@class='mat-select-arrow'])[2]");
    public By tag_Value_GH = By.xpath("//span[contains(text(),'nutrient.N(env)')]");
    public By add_Btn = By.xpath("//mat-icon[contains(text(),'add')]");



}
