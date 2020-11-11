package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateElevatorUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElevatorUserLoginTC extends BaseTest {

    int Flag = 1;


    public ElevatorUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Elevator solution Company User Login Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Elevator Solution");
            log.info("Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateElevatorUserTC createCompanyUserTC = new CreateElevatorUserTC(driver,1);
        createCompanyUserTC.VerifyCreateCompanyUser_111();
        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.companyUrl), "Unable to Open End User URL");

        //Step1: Login in Admin Panel
        Thread.sleep(6000);
        //Assert.assertTrue(companyUserLoginPO.CompanyUserLogin());
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_Ele));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Elevator Company User should get logged in Application","Elevator Company User got successfully logged in application");
        log.info("Login successfully in Elevator Panel");
        Thread.sleep(3000);
    }
}
