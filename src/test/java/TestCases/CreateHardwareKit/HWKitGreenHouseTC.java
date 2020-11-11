package TestCases.CreateHardwareKit;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.HardwareKitPO;
import TestCases.Login.AdminLogin.GreenHouseAdminLoginTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HWKitGreenHouseTC extends BaseTest {

    int Flag = 1;
    public HWKitGreenHouseTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }

    @Test
    public void verifyAddHWKit() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Green House Hardware Kit Test Started");
            ExtentTestManager.getTest().assignCategory("Green House Solution");
            log.info("Add Hardware Kit For Green House Test Started");
        }

        GreenHouseAdminLoginTC greenHouseAdminLoginTC = new GreenHouseAdminLoginTC(driver, 1);
        greenHouseAdminLoginTC.verifyLogin();

        CommonMethods commonMethods = new CommonMethods(driver);
        HardwareKitPO hardwareKitPO = new HardwareKitPO(driver);


        //Step 1: Click on Hardware Kit Icon
        Thread.sleep(5000);
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(hardwareKitPO.hw_Icon), "Unable to click on Hardware Kit Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "clicks on Hardware Kit Icon", "User got redirected on Hardware Kit detail page");

        //Step 2: Click on Add Kit button
        Thread.sleep(5000);
        Assert.assertTrue(commonMethods.clickByJS(hardwareKitPO.addKit_Btn), "Unable to Click on Add Kit button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Clicks on Add Kit button", "User got redirected on add Hardware Kit page");

        //Step 3: Enter Hardware Kit Id
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.hwKitId_Txt, hardwareKitPO.hwID), "Unable to Enter Hardware Kit Id");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Hardware Kit Id", "Test Data: "+hardwareKitPO.hwID);

        //Step 4: Select Kit Type Value
        Assert.assertTrue(commonMethods.selectFromDropDown(hardwareKitPO.kitTypeDD_Icon, hardwareKitPO.kitTypeDD_Value), "Unable to Select Kit Type Value");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Kit Type Value", "Kit Type Value Selected");

        //Step 5: Enter Unique Id value
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.uniqueId_Txt,  hardwareKitPO.UDID), "Unable to Enter Unique Id value");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique Id value", "Test Data: "+hardwareKitPO.UDID);

        //Step 6: Enter Green House Hardware Kit Name
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.name_Txt_GH, hardwareKitPO.name), "Unable to Enter Green House Hardware Kit Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Green House Hardware Kit Name", "Test Data: "+hardwareKitPO.name);

        //Step 7: Click On Add(Plus) button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(hardwareKitPO.add_Btn), "Unable to Click On Add(Plus) button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Add(Plus) button", "Click On Add(Plus) button");

        //Step 8: Enter Unique Id value
        Assert.assertTrue(commonMethods.clearText(hardwareKitPO.uniqueId_Txt));
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.uniqueId_Txt, hardwareKitPO.UDID1), "Unable to Enter Unique Id value");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique Id value", "Test Data: "+hardwareKitPO.UDID1);

        //Step 9: Enter Green House Hardware Kit Name
        Assert.assertTrue(commonMethods.clearText(hardwareKitPO.name_Txt_GH));
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.name_Txt_GH, hardwareKitPO.name1), "Unable to Enter Green House Hardware Kit Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Green House Hardware Kit Name", "Test Data: "+hardwareKitPO.name1);

        //Step 10: Select Tag  Value
        Assert.assertTrue(commonMethods.selectFromDropDown(hardwareKitPO.tag_DropDown_GH, hardwareKitPO.tag_Value_GH), "Unable to Select Tag  Value");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Tag  Value", "Test Data: nutrient.N(env)");

        Thread.sleep(3000);
        //Step 11: Click On Add(Plus) button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(hardwareKitPO.add_Btn), "Unable to Click On Add(Plus) button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Add(Plus) button", "Click On Add(Plus) button");

        //Step 12: Click on Submit button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(hardwareKitPO.submit_Btn), "Unable to Click on Submit button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit button", "Click on Submit button");

        //Step 9: Verify Success Message
        Assert.assertTrue(commonMethods.verifySuccessMsg(hardwareKitPO.successMsg), "Unable to Add Hardware Kit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Hardware Kit should be add Successfully and Success Message should be Verify", "Hardware Kit Added Successfully and Verified Success Message");

        Assert.assertTrue(commonMethods.logOutAdmin(),"Unable To Click on Logout");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Logout Button", "User got redirected on Login Page");

    }
}
