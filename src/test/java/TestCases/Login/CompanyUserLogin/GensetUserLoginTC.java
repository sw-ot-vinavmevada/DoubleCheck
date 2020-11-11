package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateGensetUserTC;
import TestCases.CreateCompanyUser.CreateLightingUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GensetUserLoginTC extends BaseTest {

    int Flag = 1;



    public GensetUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin_GenSet() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Company User Login For GenSet solution Test Started");
            ExtentTestManager.getTest().assignCategory("Smart GenSet Solution");
            log.info("Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateGensetUserTC createGensetUserTC = new CreateGensetUserTC(driver,1);
        createGensetUserTC.verifyCreateCompanyUser_GenSet();
        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.genSetUrl), "Unable to Open End User URL");

        //Step1: Login in Admin Panel
        Thread.sleep(6000);
        //Assert.assertTrue(companyUserLoginPO.CompanyUserLogin());
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_GenSet));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Smart GenSet User should get logged in Application","Smart GenSet User got successfully logged in application");
        log.info("Login successfully in GenSet Solution");
        Thread.sleep(3000);
       // driver.quit();
    }
}
