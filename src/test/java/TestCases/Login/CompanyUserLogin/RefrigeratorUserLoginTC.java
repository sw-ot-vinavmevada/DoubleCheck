package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateRefrigeratorUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefrigeratorUserLoginTC extends BaseTest {

    int Flag = 1;



    public RefrigeratorUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Refrigerator solution Company User Login Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Refrigerator Solution");
            log.info("Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateRefrigeratorUserTC createRefrigeratorUserTC = new CreateRefrigeratorUserTC(driver,1);
        createRefrigeratorUserTC.VerifyCreateCompanyUser_111();
        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.refrigeratorUrl), "Unable to Open End User URL");

        //Step1: Login in Admin Panel
        Thread.sleep(6000);
        //Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(),"Unable to Login Refrigerator Company User Successfully");
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_Ref),"Unable to Login Refrigerator Company User Successfully");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Refrigerator Company User should get logged in Application","Refrigerator Company User got successfully logged in application");
        log.info("Login successfully in Refrigerator Solution");
        Thread.sleep(3000);
    }
}
