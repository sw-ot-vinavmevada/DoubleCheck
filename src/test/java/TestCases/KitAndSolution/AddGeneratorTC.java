package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddGensetLocationTC;
import TestCases.AddBuilding.AddLightingBuildingTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGeneratorTC extends BaseTest {

    int Flag = 1;



    public AddGeneratorTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }

    @Test
    public void verifyToAddGenerators() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Generator Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Generator Solution");
            log.info("Bind Generator With Building Test Started");
        }


        //Pre-Condition:- Add Location
        AddGensetLocationTC addGensetLocationTC = new AddGensetLocationTC(driver, 1);
        addGensetLocationTC.verifyCreateLocation_GenSet();

        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Generators Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.generator_Icon), "Unable to Click on Generators Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Generators Icon", "User should be redirected to Create Generators Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Generator Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.addGenerator_Btn), "Unable to Click on Add Generator Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Sensor Button", "Click on Add Generator Button");

        //Step 3:Select Location
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.location_DD, addElevatorPO.location_Value), "Unable to Select Location Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Location Name", "Test Data: "+addBuildingPO.locationName);

        //Step 4:Select Type
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.type_DD,addElevatorPO.type_Value), "Unable to Select Type");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Type Name", "Type Selected");

        //Step 5:Enter Generator Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.name_Txt, addElevatorPO.generatorName), "Unable to Enter Generator Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Generator Name", "Test Data: "+addElevatorPO.generatorName);

        //Step 6:Enter Kit Code
        //Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCode_Txt, addElevatorPO.hwID), "Unable to Enter Kit Code");
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "Test Data: "+addElevatorPO.hwID);

        //Step 7:Enter Unique ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.genID_Txt, addElevatorPO.udID+"GenSet"), "Unable to Enter Unique ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique ID", "Test Data: "+addElevatorPO.udID+"GenSet");

        //Step 8:Enter Specification
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.specification_Txt, "Test Specification"), "Unable to Enter Specification");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Specification", "Test Data: Test Specification");

        //Step 9:Enter Description
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.desc_Txt, "Test Description"), "Unable to Enter Description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Description", "Test Data: Test Description");

        //Step 10:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
        Thread.sleep(5000);
    }
}
