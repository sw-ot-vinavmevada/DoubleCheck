package TestCases.DeleteLocation;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.KitAndSolution.AddElevatorKitTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteElevatorLocationTC extends BaseTest {

    int Flag = 1;

  /*  public DeleteWaterQualityLocationTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }*/

    @Test
    public void VerifyDeleteLocation_Elevator() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Delete Location Of Elevator Test Started");
            ExtentTestManager.getTest().assignCategory("Elevator Solution");
            log.info("Delete Location Of Elevator Quality Solution Test Started");
        }


        //Pre Condition:- Add Elevator Kit
       /* AddElevatorKitTC addElevatorKitTC = new AddElevatorKitTC(driver, 1);
        addElevatorKitTC.verifyToAddElevator();*/

        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);
        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);

        //Step 1: Open IoT URL
        Thread.sleep(4000);
        System.out.println("IOT URL:- " + companyUserPO.iot_Url);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.iot_Url), "Unable to Open IoT URL");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Browser should get open and should provide IoT URL", "Browser got redirected to the IoT dashboard page");

        Thread.sleep(25000);
        //Step 1:Click on Devices Link
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.devices_Link), "Unable to Click on Link Devices");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Clicks on Devices Link", "User got redirected on Devices Page");

        Thread.sleep(4000);
        //Step 2:Click on View Device
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.device_ViewBtn), "Unable to Click on View Device");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on View Device", "User got redirected on Devices List");

        Thread.sleep(4000);
        //Step 3:Click on Delete Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.delete_deviceIcon), "Unable to Click on Delete Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Delete Button", "Delete Confirmation Popup Displayed");
        Thread.sleep(4000);

        //Step 4:Click on Confirmation Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.confirmationPopup), "Unable to Click on Confirmation Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirmation Button", "Device Deleted Successfully");
        Thread.sleep(3000);

        //Step 1: Open URL
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.companyUrl), "Unable to Open End User URL");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Browser should get open and should provide End User URL", "Browser got redirected to the Welcome page");

        Thread.sleep(6000);
       /* Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserLoginPO.login_Btn));
        Thread.sleep(2000);
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserLoginPO.logout_Btn));
*/
  /*      Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(CompanyUserLoginPO.email_Str_Ele));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Water Quality User should get logged in Application", "Water Quality Company User got successfully logged in application");
        log.info("Login successfully in Water Quality Solution");
*/
        Thread.sleep(6000);
        //Step 1:Click on Buildings Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.building_Icon), "Unable to Click on Buildings Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buildings Icon", "Click on Buildings Icon");

        //Step 2:Click on Building Name
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.buildNameLnk), "Unable to Click on Buildings Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buildings Name", "Clicks on Buildings Name");

        Thread.sleep(3000);
        //Step 3:Click on Delete Wing Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteWing_Icon), "Unable to Click on Click on Delete Wing Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Delete Wing Icon", "Click on Delete Wing Icon");

        //Step 4:Click on Confirmation Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteWingConfirmYes), "Unable to Click on Confirmation Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirmation Button", "Wing Deleted Successfully");
        Thread.sleep(3000);
        /*//Step 3:Click on Delete Building Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteWing_Icon), "Unable to Click on Click on Delete Building Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Delete Building Icon", "Click on Delete Building Icon");*/

        //Step 1:Click on Buildings Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.building_Icon), "Unable to Click on Buildings Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buildings Icon", "Click on Buildings Icon");
        Thread.sleep(3000);

        //Step 3:Click on Delete Building Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteBuilding_Icon), "Unable to Click on Click on Delete Building Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Delete Building Icon", "Click on Delete Building Icon");

        /*//Step 4:Click on Confirmation Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteConfirmYes), "Unable to Click on Confirmation Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirmation Button", "Building Deleted Successfully");
*/
        //Need to update valid message

        //Step 4:Verify Confirmation Message
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteConfirmYes), "Unable to Verify Confirmation Message");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirmation Button", "Building Deleted Confirmation message verified Successfully");


    }
}
