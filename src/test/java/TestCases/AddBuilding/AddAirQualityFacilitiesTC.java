package TestCases.AddBuilding;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import TestCases.Login.CompanyUserLogin.AirQualityUserLoginTC;
import TestCases.Login.CompanyUserLogin.ElevatorUserLoginTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAirQualityFacilitiesTC extends BaseTest {

    int Flag = 1;



    public AddAirQualityFacilitiesTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }


    @Test
    public void verifyCreateFacility_AirQuality() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Facility For Air Quality Test Started");
            ExtentTestManager.getTest().assignCategory("Air Quality Solution");
            log.info("Create Facility and Zone For Air Quality Solution ");
        }


        AirQualityUserLoginTC airQualityUserLoginTC = new AirQualityUserLoginTC(driver,1);
        airQualityUserLoginTC.verifyLogin();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Facilities Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.facilities_Icon), "Click on Facilities Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Facilities Icon", "Click on Facilities Icon");

        Thread.sleep(6000);
        //Step 2:Click on Add Facility Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.addFacility_Btn), "Click on Add Facility Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Buildings Button", "Click on Add Facility Button");

        //Step 3:Enter Facility Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.name_Txt,addBuildingPO.facilityName), "Enter Facility Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Facility Name", "Test Data: "+addBuildingPO.facilityName);

        //Step 4:Enter Address
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.address_Txt, "Test Address"), "Enter Address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Address", "Test Data: Test Address");

        //Step 5:Select Country
        Thread.sleep(1000);
        Assert.assertTrue(commonMethods.selectValueFromDD(addBuildingPO.country_DD, addBuildingPO.country, addBuildingPO.country_Value), "Select Country");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Country", "Test Data: "+addBuildingPO.country);

        Thread.sleep(3000);
        //Step 6:Select state
        Assert.assertTrue(commonMethods.selectValueFromDD(addBuildingPO.state_DD, addBuildingPO.state,addBuildingPO.state_Value));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select state", "Test Data: "+addBuildingPO.state);

        //Step 7:Enter City
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.city_Txt, addBuildingPO.city), "Enter City");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter City", "Test Data: "+addBuildingPO.city);

        //Step 8:Enter ZipCode
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.zip_Txt, "345634"), "Enter ZipCode");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter ZipCode", "Test Data: 345634");

        //Step 9:Enter Latitude
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.latitude_Txt,"15"), "Enter Latitude");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Latitude", "Test Data: 15");

        //Step 10:Enter longitude
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.longitude_Txt,"15"), "Enter longitude");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter longitude", "Test Data: 15");

        //Step 11:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.desc_Txt,"Test Description"), "Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: TestDescription");

        //Step 12:Click on Submit Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.submit1_Btn), "Click on Submit Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit Button", "Click on Submit Button");

        //Step 13:Click on Added Facility
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.addedFacilityName_Xpath), "Click on Added Facility");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Added Facility", "Click on Added Facility");

        Thread.sleep(3000);
        //Step 14:Click on Add Zone Icon
        Assert.assertTrue(commonMethods.clickByJS(addBuildingPO.addWing_Btn), "Click on Add Zone Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Zone Icon", "Click on Add Zone Icon");

        //Step 15:Enter Zone Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.nameZone_Txt,"Test Wing"), "Enter Zone Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Zone Name", "Test Data: Test Zone");

        //Step 16:Select Zone Type
        Assert.assertTrue(commonMethods.selectFromDropDown(addBuildingPO.airZoneTypeDD,addBuildingPO.zoneType_Value), "Select Zone Type");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Zone Type", "Zone Type Selected");

        //Step 17:Enter Zone Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.descWing_Txt,"Test Data Description"), "Enter Zone Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 18:Click on Add Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.add_Btn_Air), "Click on Add Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Button", "Click on Add Button");
    }
}
