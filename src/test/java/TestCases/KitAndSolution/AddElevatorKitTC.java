package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddElevatorBuildingTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddElevatorKitTC extends BaseTest {

    int Flag = 1;


    /*public AddElevatorKitTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }*/


    @Test
    public void verifyToAddElevator() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Elevator Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Elevator Solution");
            log.info("Bind Hardware kit With Building Test Started");
        }

        //Pre-Condition:- Add Building and Wing
        AddElevatorBuildingTC addElevatorBuildingTC = new AddElevatorBuildingTC(driver, 1);
        addElevatorBuildingTC.VerifyCreateBuilding_Elevator();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Elevator Icon
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.elevator_Icon), "Unable to Click on Elevator Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Elevator Icon", "User should be redirected to Create Elevator Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Elevator Button
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.addElevator_Btn), "Unable to Click on Add Elevator Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Elevator Button", "Click on Add Elevator Button");

        //Step 3:Enter Elevator Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.name_Txt, addElevatorPO.elevatorName), "Unable to Enter Elevator Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Elevator Name", "Test Data: " + addElevatorPO.elevatorName);

        //Step 4:Select Building Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.building_DD, addElevatorPO.building_Value), "Unable to Select Building Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Building Name", "Test Data: " + addBuildingPO.buildName);

        //Step 5:Select Wing Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.wing_DD, addElevatorPO.wing_Value), "Unable to Select Wing Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Wing Name", "Test Data: Test Wing");

        //Step 6:Enter Kit Code
        //Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCode_Txt,addElevatorPO.hwID+"Water"), "Unable to Enter Kit Code");
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "Test Data: "+addElevatorPO.hwID+"Water");

        //Step 7:Enter Unique ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.uID_Txt_QA, addElevatorPO.udID), "Unable to Enter Unique ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique ID", "Test Data: " + addElevatorPO.udID);

        //Step 6:Enter Specification
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.specification_Txt, "Test Specification"), "Unable to Enter Specification");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Specification", "Test Data: Test Specification");

        //Step 6:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.desc_Txt, "Test Description"), "Unable to Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 6:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
    }
}
