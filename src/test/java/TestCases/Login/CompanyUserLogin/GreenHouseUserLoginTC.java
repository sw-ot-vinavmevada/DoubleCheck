package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateGreenHouseUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreenHouseUserLoginTC extends BaseTest {

    int Flag = 1;



    public GreenHouseUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Green House solution Company User Login Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Green House Solution");
            log.info("Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateGreenHouseUserTC createGreenHouseUserTC = new CreateGreenHouseUserTC(driver,1);
        createGreenHouseUserTC.VerifyToCreateGreenHouseUser();

        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.greenUrl), "Unable to Open End User URL");

        //Step1: Login in Admin Panel
        Thread.sleep(6000);
       // Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(),"Unable to Login Green House Company User Successfully");
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_GH),"Unable to Login Green House Company User Successfully");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Green House User should get logged in Application","Green House got successfully logged in application");
        Thread.sleep(3000);
    }
}
