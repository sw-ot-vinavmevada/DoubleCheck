package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateWaterQualityUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaterQualityUserLoginTC extends BaseTest {

    int Flag = 1;



    public WaterQualityUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Company User Login For Water Quality solution Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Water Quality Solution");
            log.info("Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateWaterQualityUserTC createWaterQualityUserTC = new CreateWaterQualityUserTC(driver,1);
        createWaterQualityUserTC.VerifyCreateCompanyUser();

        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.waterUrl), "Unable to Open End User URL");

        //Step1: Login in Water Solution Panel
        Thread.sleep(6000);
        //Assert.assertTrue(companyUserLoginPO.CompanyUserLogin());
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_Wat));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Water Quality User should get logged in Application","Water Quality Company User got successfully logged in application");
        log.info("Login successfully in Water Quality Solution");
        Thread.sleep(3000);
    }
}
