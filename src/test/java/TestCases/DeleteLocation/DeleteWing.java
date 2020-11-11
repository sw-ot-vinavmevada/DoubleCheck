package TestCases.DeleteLocation;

import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;

/*
public class DeleteWing {


    //Step 1: Open URL
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.companyUrl), "Unable to Open End User URL");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Browser should get open and should provide End User URL", "Browser got redirected to the Welcome page");

    //  Thread.sleep(6000);
       */
/* Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserLoginPO.login_Btn));
        Thread.sleep(2000);
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserLoginPO.logout_Btn));
*//*

        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(CompanyUserLoginPO.email_Str_Ele));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Water Quality User should get logged in Application", "Water Quality Company User got successfully logged in application");
        log.info("Login successfully in Water Quality Solution");
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
        */
/*//*
/Step 3:Click on Delete Building Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteWing_Icon), "Unable to Click on Click on Delete Building Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Delete Building Icon", "Click on Delete Building Icon");*//*


    //Step 1:Click on Buildings Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.building_Icon), "Unable to Click on Buildings Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Buildings Icon", "Click on Buildings Icon");
        Thread.sleep(3000);

    //Step 3:Click on Delete Building Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteBuilding_Icon), "Unable to Click on Click on Delete Building Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Delete Building Icon", "Click on Delete Building Icon");

        */
/*//*
/Step 4:Click on Confirmation Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteConfirmYes), "Unable to Click on Confirmation Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirmation Button", "Building Deleted Successfully");
*//*

    //Need to update valid message

    //Step 4:Verify Confirmation Message
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.deleteConfirmYes), "Unable to Verify Confirmation Message");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirmation Button", "Building Deleted Confirmation message verified Successfully");

}
*/
