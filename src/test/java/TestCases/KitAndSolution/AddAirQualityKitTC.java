package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddAirQualityFacilitiesTC;
import TestCases.AddBuilding.AddElevatorBuildingTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAirQualityKitTC extends BaseTest {

    int Flag = 1;



  /*  public AddBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }*/


    @Test
    public void verifyToAddElevator() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Air Quality Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Air Quality Solution");
            log.info("Bind Hardware kit With Facilities Test Started");
        }

        //Pre-Condition:- Add Facilities and Sensor
        AddAirQualityFacilitiesTC addAirQualityFacilitiesTC = new AddAirQualityFacilitiesTC(driver,1);
        addAirQualityFacilitiesTC.verifyCreateFacility_AirQuality();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Facilities Icon
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.QualitySensor_Icon), "Unable to Click on Facilities Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Facilities Icon", "User should be redirected to Create Facilities Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Sensor Button
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.addSensor_Btn), "Unable to Click on Add Sensor Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Sensor Button", "Click on Add Sensor Button");

        //Step 3:Enter Sensor Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.name_Txt,addElevatorPO.airName), "Unable to Enter Sensor Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Sensor Name", "Test Data: "+addElevatorPO.airName);

        //Step 4:Select Facility Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.building_DD,addElevatorPO.building_Value), "Unable to Select Facility Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Facility Name", "Test Data: "+addBuildingPO.buildName);

        //Step 5:Select Zone Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.wing_DD,addElevatorPO.wing_Value), "Unable to Select Zone Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Zone Name", "Test Data: Test Zone");

        //Step 6:Enter Kit Code
      //  Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCode_Txt,addElevatorPO.hwID), "Unable to Enter Kit Code");
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "Test Data: "+addElevatorPO.hwID);

        //Step 7:Enter Unique ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.uID_Txt_Air,addElevatorPO.udID+"AirQ"), "Unable to Enter Unique ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique ID", "Test Data: "+addElevatorPO.udID+"AirQ");

        //Step 6:Enter Specification
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.specification_Txt,"Test Specification"), "Unable to Enter Specification");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Specification", "Test Data: Test Specification");

        //Step 6:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.desc_Txt,"Test Description"), "Unable to Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 6:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
 }
}
