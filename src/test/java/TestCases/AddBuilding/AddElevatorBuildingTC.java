package TestCases.AddBuilding;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import TestCases.Login.CompanyUserLogin.ElevatorUserLoginTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddElevatorBuildingTC extends BaseTest {

    int Flag = 1;



    public AddElevatorBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }


    @Test
    public void VerifyCreateBuilding_Elevator() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Building For Elevator Test Started");
            ExtentTestManager.getTest().assignCategory("Elevator Solution");
            log.info("Create Building and Wing For Solution ");
        }


        ElevatorUserLoginTC elevatorUserLoginTC = new ElevatorUserLoginTC(driver,1);
        elevatorUserLoginTC.verifyLogin();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Buildings Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.building_Icon), "Click on Buildings Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buildings Icon", "Click on Buildings Icon");

        Thread.sleep(6000);
        //Step 2:Click on Add Buildings Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.addBuilding_Btn), "Click on Add Buildings Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Buildings Button", "Click on Add Buildings Button");

        //Step 3:Enter Building Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.name_Txt,addBuildingPO.buildName), "Enter Building Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Building Name", "Test Data: "+addBuildingPO.buildName);

        //Step 4:Enter Address
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.address_Txt, "Test Address"), "Enter Address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Address", "Test Data: Test Address");

        //Step 5:Select Country
        Thread.sleep(3000);
        Assert.assertTrue(commonMethods.selectValueFromDD(addBuildingPO.country_DD, addBuildingPO.country, addBuildingPO.country_Value), "Select Country");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Country", "Test Data: "+addBuildingPO.country);

        Thread.sleep(2000);
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
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.submit_Btn), "Click on Submit Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit Button", "Click on Submit Button");

        //Step 13:Click on Added Building
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.buildName_Xpath), "Click on Added Building");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Added Building", "Click on Added Building");

        Thread.sleep(3000);
        //Step 14:Click on Add Wing Icon
        Assert.assertTrue(commonMethods.clickByJS(addBuildingPO.addWing_Btn), "Click on Add Wing Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Wings Icon", "Click on Add Wing Icon");

        //Step 15:Enter Wing Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.nameWing_Txt,"Test Wing"), "Enter Wing Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Wing Name", "Test Data: Test Wing");

        //Step 16:Enter Wing Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.descWing_Txt,"Test Data Description"), "Enter Wing Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: TestDescription");

        //Step 17:Click on Add Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.add_Btn), "Click on Add Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Button", "Click on Add Button");
    }
}
