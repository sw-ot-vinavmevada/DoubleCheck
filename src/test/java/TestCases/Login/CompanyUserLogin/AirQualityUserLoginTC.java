package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateAirQualityUserTC;
import TestCases.CreateCompanyUser.CreateElevatorUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirQualityUserLoginTC extends BaseTest {

    int Flag = 1;



    public AirQualityUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Air Quality solution Company User Login Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Air Quality Solution");
            log.info("Air Quality Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateAirQualityUserTC createAirQualityUserTC = new CreateAirQualityUserTC(driver,1);
        createAirQualityUserTC.verifyCreateCompanyUser_AirQuality();
        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.AirQualityUrl), "Unable to Open End User URL");


        //Step1: Login in Admin Panel
        Thread.sleep(6000);
        //Assert.assertTrue(companyUserLoginPO.CompanyUserLogin());
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_Air));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Air Quality Company User should get logged in Application","Air Quality Company User got successfully logged in application");
        log.info("Login successfully in Air Quality Panel");
        Thread.sleep(3000);
    }
}
