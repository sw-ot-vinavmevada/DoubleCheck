package TestCases.EditLocation;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.KitAndSolution.AddElevatorKitTC;
import TestCases.KitAndSolution.AddGeneratorTC;
import TestCases.KitAndSolution.AddGreenHouseKitTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditGenSetLocationTC extends BaseTest {

    int Flag = 1;

  /*  public EditGenSetLocationTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }*/

    @Test
    public void VerifyEditLocation_GenSet() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Edit Location Of GenSet Test Started");
            ExtentTestManager.getTest().assignCategory("GenSet Solution");
            log.info("Edit Location Of GenSet Solution Test Started");
        }


        //Pre Condition:- Add GenSet Kit
        AddGeneratorTC addGeneratorTC = new AddGeneratorTC(driver, 1);
        addGeneratorTC.verifyToAddGenerators();


        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);


        Thread.sleep(8000);
        //Step 1:Click on Location Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.locationGenSet_Icon), "Click on Location Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Location Icon", "Click on Location Icon");

        //Step 2:Click on Edit Icon
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.editLocation), "Unable to Click on Edit Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Edit Icon", "User got redirected on Edit Location Page");

        Thread.sleep(2000);
        //Step 3: Enter Address 2
        Assert.assertTrue(commonMethods.enterTextInInputField(addBuildingPO.address_Txt2, "Test Address"), "Update Address 2");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Address", "Test Data: Update Address Content");

        //Step 4:Click on Submit Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addBuildingPO.submitWater_Btn), "Unable to Click on Submit Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Submit Button", "Location Address Updated Successfully.");
        Thread.sleep(4000);


    }
}
