package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateLightingUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LightingUserLoginTC extends BaseTest {

    int Flag = 1;



    public LightingUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin_Light() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Company User Login For Lighting solution Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Lighting Solution");
            log.info("Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateLightingUserTC createLightingUserTC = new CreateLightingUserTC(driver,1);
        createLightingUserTC.VerifyCreateCompanyUser_Lighting();

        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.lightUrl), "Unable to Open End User URL");

        //Step1: Login in Admin Panel
        Thread.sleep(6000);
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_Lig));
        //Assert.assertTrue(companyUserLoginPO.CompanyUserLogin());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Smart Lighting User should get logged in Application","Smart Lighting User got successfully logged in application");
        log.info("Login successfully in Lighting Solution");
        Thread.sleep(3000);
       // driver.quit();
    }
}
