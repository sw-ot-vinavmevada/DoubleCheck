package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddAssetLocationTC;
import TestCases.AddBuilding.AddLightingBuildingTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAssetKitTC extends BaseTest {

    int Flag = 1;



  /*  public AddBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }
*/

    @Test
            //(invocationCount = 2)
    public void verifyToAddAssets() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Assets Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Assets Solution");
        }


        //Pre-Condition:- Add Asset Type and Location
        AddAssetLocationTC addAssetLocationTC = new AddAssetLocationTC(driver, 1);
        addAssetLocationTC.verifyCreateBuilding_Assets();

        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);


        //Add Asset Type
        Thread.sleep(6000);
        //Step 1:Click on Asset Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.assets_Icon), "Unable to Click on Asset Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Asset Icon", "User should be redirected to Add Asset Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Asset Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.addAssets_Btn), "Unable to Click on Add Asset Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Asset Button", "Click on Add Asset Button");

        //Step 3:Enter Asset ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.assetId_Txt, addElevatorPO.udID), "Unable to Enter Asset ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Asset ID", "Test Data: "+addElevatorPO.udID);

        //Step 3:Enter Asset Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.assetName_Txt, addElevatorPO.assetsName), "Unable to Enter Asset Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Asset Name", "Test Data: "+addElevatorPO.assetsName);

        //Step 4:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.desc_Txt, "Test Description"), "Unable to Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 4:Select Location Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.location_DD, addElevatorPO.location_Value), "Unable to Select Location Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Location Name", "Test Data: "+addBuildingPO.locationName);

        //Step 5:Select Zone Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.zone_DD, addElevatorPO.zone_Value), "Unable to Select Zone Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Zone Name", "Test Data: Test Zone");

        //Step 6:Select Asset Type
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.asset_DD, addElevatorPO.asset_Value), "Unable to Select Asset Type");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Asset Type", "Test Data: Asset Type");

        //Step 7:Enter Specification
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.specification_Txt, "Test Specification"), "Unable to Enter Specification");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Specification", "Test Data: Test Specification");

        //Step 8:Select Sensor
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.sensor_DD, addElevatorPO.sensor_Value), "Unable to Select Sensor");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Sensor", "Test Data: Test Sensor");

        //Step 9:Select Condition
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.condition_DD, addElevatorPO.condition_Value), "Unable to Select Condition");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Condition", "Test Data: Test Condition");

        //Step 10:Enter Sensor value
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.sensor_Value_Txt,"15"), "Unable to Enter Sensor value");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Sensor value", "Entered Sensor value");

        //Step 11:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
/*
        Thread.sleep(6000);
        //Step 2:Click on Add Sensor Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.addLights_Btn), "Unable to Click on Add Sensor Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Sensor Button", "Click on Add Sensor Button");

        //Step 3:Enter Sensor Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.name_Txt, addElevatorPO.lightsName), "Unable to Enter Sensor Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Sensor Name", "Test Data: "+addElevatorPO.lightsName);

        //Step 4:Select Building Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.building_DD, addElevatorPO.building_Value), "Unable to Select Building Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Building Name", "Test Data: "+addBuildingPO.buildName);

        //Step 5:Select Zone Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.wing_DD, addElevatorPO.wing_Value), "Unable to Select Zone Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Zone Name", "Test Data: Test Zone");

        //Step 6:Enter Kit Code
        //Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCode_Txt, addElevatorPO.hwID), "Unable to Enter Kit Code");
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "Test Data: "+addElevatorPO.hwID);

        //Step 7:Enter Unique ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.uIDLight_Txt, addElevatorPO.udID+"Lights"), "Unable to Enter Unique ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique ID", "Test Data: "+addElevatorPO.udID+"Lights");

        //Step 8:Enter Specification
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.specification_Txt, "Test Specification"), "Unable to Enter Specification");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Specification", "Test Data: Test Specification");

        //Step 9:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.desc_Txt, "Test Description"), "Unable to Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 10:Enter Capacity
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.capacity_Txt, "3"), "Unable to Enter Capacity");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Capacity", "Test Data: 3");

        //Step 11:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");*/
    }
}
