package TestCases.DeleteLocation;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.KitAndSolution.AddElevatorKitTC;
import TestCases.KitAndSolution.AddGreenHouseKitTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteGreenHouseLocationTC extends BaseTest {

    int Flag = 1;

  /*  public DeleteWaterQualityLocationTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }*/

    @Test
    public void VerifyDeleteLocation_GreenHouse() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Delete Location Of Green House Test Started");
            ExtentTestManager.getTest().assignCategory("Green House Solution");
            log.info("Delete Location Of Green House Solution Test Started");
        }


        //Pre Condition:- Add Elevator Kit
        AddGreenHouseKitTC addGreenHouseKitTC = new AddGreenHouseKitTC(driver, 1);
        addGreenHouseKitTC.verifyToAddGreenHouse();

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
        Thread.sleep(6000);

    }
}
