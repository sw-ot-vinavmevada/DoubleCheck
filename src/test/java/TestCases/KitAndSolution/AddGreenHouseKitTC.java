package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import PageObjects.HardwareKitPO;
import TestCases.AddBuilding.AddGreenHouseBuildingTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddGreenHouseKitTC extends BaseTest {

    int Flag = 1;



    public AddGreenHouseKitTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }


    @Test
    public void verifyToAddGreenHouse() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Green House Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Green House Solution");
            log.info("Bind Hardware kit With Building Test Started");
        }

        //Pre-Condition:- Add Building and Wing
        AddGreenHouseBuildingTC addGreenHouseBuildingTC = new AddGreenHouseBuildingTC(driver, 1);
        addGreenHouseBuildingTC.VerifyCreate_GreenHouse();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        HardwareKitPO hardwareKitPO = new HardwareKitPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);

        //Step 1:Click on Green House Icon
        Assert.assertTrue(commonMethods.clickByJSs(addElevatorPO.greenHouse_Icon), "Unable to Click on Elevator Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Green House Icon", "User should be redirected to Create Green House Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Green House Button
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.addKit_Btn), "Unable to Click on Add Add Green House Kit Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Green House Kit Button", "Click on Add Add Green House Kit Button");

        //Step 3:Select Green House Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.greenHouse_DD, addElevatorPO.greenHouseValue_Xpath), "Unable to Select Green House Name");
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Select Green House Name", "Test Data: "+addElevatorPO.greenHouseValue);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Green House Name", "Test Data: " + addBuildingPO.houseName);

        //Step 4:Enter Kit Code
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCodeGH_Txt, HardwareKitPO.hwID), "Unable to Enter Kit Code");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "Test Data: " + HardwareKitPO.hwID);

        //Step 5:Click on Next Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.next_Btn), "Unable to Click on Next Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Next Button", "Click on Next Button");

        //Step 6:Enter Parent Device Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.parentIDGH_Txt, HardwareKitPO.UDID), "Unable to Enter Parent Device Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Parent Device Name", "Test Data: " + HardwareKitPO.UDID);

        //Step 7:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
    }
}
