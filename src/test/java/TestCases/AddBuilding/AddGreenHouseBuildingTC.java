package TestCases.AddBuilding;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import TestCases.Login.CompanyUserLogin.GreenHouseUserLoginTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGreenHouseBuildingTC extends BaseTest {

    int Flag = 1;


    public AddGreenHouseBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }


    @Test
    public void VerifyCreate_GreenHouse() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Building For Green House Test Started");
            ExtentTestManager.getTest().assignCategory("Green House Solution");
            log.info("Add Green House and Crops For Green House Solution ");
        }


        GreenHouseUserLoginTC greenHouseUserLoginTC = new GreenHouseUserLoginTC(driver, 1);
        greenHouseUserLoginTC.verifyLogin();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Green House Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.greenHouse_Icon1), "Click on Green House Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Green House Icon", "Click on Green House Icon");

        Thread.sleep(6000);
        //Step 2:Click on Green House Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.addGreenhouse_Btn), "Click on Green House Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Green House Button", "Click on Green House Button");

        //Step 3:Enter Green House Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.name_Txt, addBuildingPO.houseName), "Enter Green House Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Green House Name", "Test Data: " + addBuildingPO.buildName);

        //Step 4:Enter Address
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.address_Txt, "Test Address"), "Enter Address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Address", "Test Data: Test Address");

        //Step 5:Select Country
        Thread.sleep(1000);
        Assert.assertTrue(commonMethods.selectValueFromDD(addBuildingPO.country_DD, addBuildingPO.country, addBuildingPO.country_Value), "Select Country");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Country", "Test Data: "+addBuildingPO.country);

        Thread.sleep(3000);
        //Step 6:Select state
        Assert.assertTrue(commonMethods.selectValueFromDD(addBuildingPO.state_DD, addBuildingPO.state, addBuildingPO.state_Value),"Enter State");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select state", "Test Data: "+addBuildingPO.state);

        //Step 7:Enter City
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.city_Txt, addBuildingPO.city), "Enter City");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter City", "Test Data: "+addBuildingPO.city);

        //Step 8:Enter ZipCode
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.zip_Txt, "345634"), "Enter ZipCode");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter ZipCode", "Test Data: 345634");

        //Step 9:Enter Latitude
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.latitude_Txt, "15"), "Enter Latitude");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Latitude", "Test Data: 15");

        //Step 10:Enter longitude
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.longitude_Txt, "15"), "Enter longitude");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter longitude", "Test Data: 15");

        //Step 11:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.desc_Txt, "Test Description"), "Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: TestDescription");

        //Step 12:Click on Submit Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.submit_Btn), "Click on Submit Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit Button", "Click on Submit Button");

        //Step 13:Click on Added Green House
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.greenHouse_Xpath), "Click on Added Green House");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Added Green House", "Click on Added Green House");

        Thread.sleep(3000);
        //Step 14:Click on Add Crops Icon
        Assert.assertTrue(commonMethods.clickByJS(addBuildingPO.addWing_Btn), "Click on Add Crops Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Crops Icon", "Click on Add Crops Icon");

        //Step 15:Enter Crops Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.nameWing_Txt, "Test Crops"), "Enter Crops Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Crops Name", "Test Data: Test Crops");

        //Step 16:Click on Add Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.add_Btn), "Click on Add Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Button", "Click on Add Button");
    }
}
