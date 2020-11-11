package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddWaterQualityBuildingTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddWaterSensorTC extends BaseTest {

    int Flag = 1;



  /*  public AddBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }
*/

    @Test
    public void verifyToAddDevice_WaterSensor() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Water Sensor Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Water Sensor Solution");
            log.info("Bind Sensor With Building Test Started");
        }

        //Pre-Condition:- Add Building and Wing
        AddWaterQualityBuildingTC addWaterQualityBuildingTC = new AddWaterQualityBuildingTC(driver,1);
        addWaterQualityBuildingTC.VerifyCreateBuilding_Sensor();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);


        Thread.sleep(6000);
        //Step 1:Click on Sensor Icon
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.sensor_Icon), "Click on Sensor Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Sensors Icon", "User should be redirected to Add Sensor Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Sensor Button
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.addSensor_Btn), "Click on Add Sensor Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Sensor Button", "User should be redirected to Create Sensor Page");

        //Step 3:Enter Sensor Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.name_Txt,addElevatorPO.waterName), "Enter Sensor Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Sensor Name", "TestData: "+addElevatorPO.waterName);

        //Step 4:Select Building Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.building_DD,addElevatorPO.building_Value), "Select Building Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Building Name", "TestData: "+addBuildingPO.buildName);

        //Step 5:Select Wing Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.wing_DD,addElevatorPO.wing_Value), "Select Wing Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Wing Name", "TestData: Test Wing Name");

        //Step 6:Enter Kit Code
        /*Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCode_Txt,addElevatorPO.hwID), "Enter Kit Code");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "TestData: "+addElevatorPO.hwID);
*/
        //Step 7:Enter Unique ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.uID_Txt_QA,addElevatorPO.udID+ "Water"), "Enter Unique ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique ID", "TestData: "+addElevatorPO.udID+ "Water");

        //Step 8:Enter Specification
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.specification_Txt,"Enter Specification"), "Enter Specification");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Specification", "TestData: Test Specification");

        //Step 9:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.desc_Txt,"Enter Description"), "Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 10:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
 }
}
