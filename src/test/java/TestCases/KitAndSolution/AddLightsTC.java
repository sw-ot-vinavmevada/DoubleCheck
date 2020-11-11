package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddLightingBuildingTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddLightsTC extends BaseTest {

    int Flag = 1;



  /*  public AddBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }
*/

    @Test
            //(invocationCount = 2)
    public void verifyToAddLights() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Lights Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Lighting Solution");
            log.info("Bind Sensor With Building Test Started");
        }


        //Pre-Condition:- Add Building and Wing
        AddLightingBuildingTC addLightingBuildingTC = new AddLightingBuildingTC(driver, 1);
        addLightingBuildingTC.VerifyCreateBuilding_Lighting();

        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Sensor Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.lights_Icon), "Unable to Click on Sensor Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Sensor Icon", "User should be redirected to Create Sensor Page");

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
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
    }
}
