package TestCases.CreateHardwareKit;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.HardwareKitPO;
import TestCases.Login.AdminLogin.RefrigeratorAdminLoginTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HWKitRefrigeratorTC extends BaseTest {

    int Flag = 1;
    public HWKitRefrigeratorTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }

    @Test
    public void verifyAddHWKit() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Refrigerator Hardware Kit Test Started");
            ExtentTestManager.getTest().assignCategory("Refrigerator Solution");
            log.info("Add Hardware Kit For Refrigerator Test Started");
        }

        RefrigeratorAdminLoginTC refrigeratorAdminLoginTC = new RefrigeratorAdminLoginTC(driver,1);
        refrigeratorAdminLoginTC.verifyLogin();

        CommonMethods commonMethods = new CommonMethods(driver);
        HardwareKitPO hardwareKitPO = new HardwareKitPO(driver);


        //Step 1: Click on Hardware Kit Icon
        Thread.sleep(5000);
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(hardwareKitPO.hw_Icon_Lighting), "Unable to click on Hardware Kit Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "clicks on Hardware Kit Icon", "User got redirected on Hardware Kit detail page");

        //Step 2: Click on Add Kit button
        Thread.sleep(5000);
        Assert.assertTrue(commonMethods.clickByJS(hardwareKitPO.addKit_Btn), "Unable to Click on Add Kit button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Clicks on Add Kit button", "User got redirected on add Hardware Kit page");

        //Step 3: Enter Hardware Kit Id
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.hwKitId_Txt,hardwareKitPO.hwID), "Unable to Enter Hardware Kit Id");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Hardware Kit Id", "Test Data: "+ hardwareKitPO.hwID);


        //Step 4: Select Kit Type Value
        Assert.assertTrue(commonMethods.selectFromDropDown(hardwareKitPO.kitTypeDD_Icon, hardwareKitPO.kitTypeDD_Value), "Unable to Select Kit Type Value");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Kit Type Value", "Kit Type Value Selected");

        //Step 5: Enter Unique Id value
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.uniqueId_Txt,  hardwareKitPO.UDID), "Unable to Enter Unique Id value");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Unique Id value", "Test Data: "+hardwareKitPO.UDID);

        //Step 6: Enter Name Elevator Hardware Kit Name
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.name_Txt_Ele, hardwareKitPO.name), "Unable to  Enter Name Refrigerator Hardware Kit Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Refrigerator Hardware Kit Name", "Test Data: "+hardwareKitPO.name);

        //Step 7: Enter Note
        Assert.assertTrue(commonMethods.enterTextInInputField(hardwareKitPO.note_Txt,"Test Note"), "Unable to Enter Note");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Note", "Test Data: Test Note");

        //Step 8: Click on Submit button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(hardwareKitPO.submit_Btn), "Unable to Click on Submit button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit button", "Click on Submit button");

        //Step 9: Verify Success Message
        Assert.assertTrue(commonMethods.verifySuccessMsg(hardwareKitPO.successMsg), "Unable to Add Hardware Kit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Hardware Kit should be add Successfully and Success Message should be Verify", "Hardware Kit Added Successfully and Verified Success Message");

        Assert.assertTrue(commonMethods.logOutAdmin(),"Unable To Click on Logout");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Logout Button", "User got redirected on Login Page");

    }
}
