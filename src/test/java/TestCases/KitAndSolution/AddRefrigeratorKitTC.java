package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddRefrigeratorLocationTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRefrigeratorKitTC extends BaseTest {

    int Flag = 1;



  /*  public AddBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }*/


    @Test
    public void verifyToAddRefrigerator() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Refrigerator Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Refrigerator Solution");
            log.info("Bind Hardware kit With Refrigerator Test Started");
        }

        //Pre-Condition:- Add Location
        AddRefrigeratorLocationTC addRefrigeratorLocationTC = new AddRefrigeratorLocationTC(driver,1);
        addRefrigeratorLocationTC.VerifyCreateLocation_Refrigerator();

        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);
        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Refrigerator Icon
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.refrigerator_Icon), "Unable to Click on Refrigerator Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Refrigerator Icon", "User should be redirected to Create Refrigerator Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Refrigerator Button
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.addRefrigerator_Btn), "Unable to Click on Add Refrigerator Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Refrigerator Button", "Click on Add Refrigerator Button");

        //Step 3:Enter Refrigerator Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.name_Txt,addElevatorPO.refrigeratorName), "Unable to Enter Refrigerator Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Refrigerator Name", "Test Data: "+addElevatorPO.refrigeratorName);

        //Step 4:Select location Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.location_DD,addElevatorPO.location_Value), "Unable to Select Location Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Location Name", "Test Data: "+addBuildingPO.locationName);

        //Step 5:Select Type
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.type_DD,addElevatorPO.type_Value), "Unable to Select Type");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Type Name", "Type Selected");

        //Step 6:Enter Kit Code
       // Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCode_Xpath,addElevatorPO.hwID), "Unable to Enter Kit Code");
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "Test Data: "+addElevatorPO.hwID);

        //Step 7:Enter Unique ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.uID_Txt_QA,addElevatorPO.udID+"Refrigerator"), "Unable to Enter Unique ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique ID", "Test Data: "+addElevatorPO.udID+"Refrigerator");

        //Step 8:Enter Refrigerator Model
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.model_Xpath,addElevatorPO.model), "Unable to Enter Refrigerator Model");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Refrigerator Model", "Test Data: "+addElevatorPO.model);

        //Step 9:Enter Refrigerator Power
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.power_Xpath,addElevatorPO.power), "Unable to Enter Refrigerator Power");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Refrigerator Power", "Test Data: "+addElevatorPO.power);

        //Step 10:Enter Refrigerator Voltage
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.voltage_Xpath,addElevatorPO.voltage), "Unable to Enter Refrigerator Voltage");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Refrigerator Voltage", "Test Data: "+addElevatorPO.voltage);

        //Step 11:Enter Refrigerator Capacity
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.capacity_Xpath,addElevatorPO.capacity), "Unable to Enter Refrigerator Capacity");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Refrigerator Capacity", "Test Data: "+addElevatorPO.capacity);

        //Step 12:Enter Refrigerator Net Weight
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.netWeight_Xpath,addElevatorPO.netWeight), "Unable to Enter Refrigerator Net Weight");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Refrigerator Net Weight", "Test Data: "+addElevatorPO.netWeight);

        //Step 6:Enter Specification
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.specification_Txt,"Test Specification"), "Unable to Enter Specification");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Specification", "Test Data: Test Specification");

        //Step 6:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.desc_Txt,"Test Description"), "Unable to Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 6:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submitRef_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
 }
}
