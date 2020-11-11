package TestCases.AddBuilding;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import TestCases.Login.CompanyUserLogin.RefrigeratorUserLoginTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRefrigeratorLocationTC extends BaseTest {

    int Flag = 1;



    public AddRefrigeratorLocationTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }

    @Test
    public void VerifyCreateLocation_Refrigerator() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Location For Refrigerator Test Started");
            ExtentTestManager.getTest().assignCategory("Refrigerator Solution");
            log.info("Create Location For Solution ");
        }


        RefrigeratorUserLoginTC refrigeratorUserLoginTC = new RefrigeratorUserLoginTC(driver,1);
        refrigeratorUserLoginTC.verifyLogin();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Location Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.location_Icon), "Click on Location Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buildings Icon", "Click on Location Icon");

        Thread.sleep(6000);
        //Step 2:Click on Add Location Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.addLocation_Btn), "Click on Add Location Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Buildings Button", "Click on Add Location Button");

        //Step 3:Enter Location Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.name_Txt,addBuildingPO.locationName), "Enter Location Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Location Name", "Test Data: "+addBuildingPO.locationName);

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
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.submitWater_Btn), "Click on Submit Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit Button", "Click on Submit Button");

    }
}
