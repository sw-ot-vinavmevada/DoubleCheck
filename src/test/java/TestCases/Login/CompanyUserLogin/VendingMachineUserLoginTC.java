package TestCases.Login.CompanyUserLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateCompanyUser.CreateAirQualityUserTC;
import TestCases.CreateCompanyUser.CreateVendingMachineUserTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VendingMachineUserLoginTC extends BaseTest {

    int Flag = 1;



    public VendingMachineUserLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Vending Machine solution Company User Login Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Vending Machine Solution");
            log.info("Vending Machine Test Case Started");
        }

        //Pre Condition:- Create Company User
        CreateVendingMachineUserTC createVendingMachineUserTC = new CreateVendingMachineUserTC(driver,1);
        createVendingMachineUserTC.verifyCreateCompanyUser_VendingMachine();

        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);

        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.VendingMachineUrl), "Unable to Open End User URL");

        //Step1: Login in Admin Panel
        Thread.sleep(6000);
        //Assert.assertTrue(companyUserLoginPO.CompanyUserLogin());
        Assert.assertTrue(companyUserLoginPO.CompanyUserLogin(companyUserLoginPO.email_Str_Ven));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Vending Machine Company User should get logged in Application","Vending Machine Company User got successfully logged in application");
        log.info("Login successfully in Vending Machine Solution");
        Thread.sleep(3000);
    }
}
