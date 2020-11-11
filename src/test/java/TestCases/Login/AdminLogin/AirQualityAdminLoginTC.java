package TestCases.Login.AdminLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AdminLoginPO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirQualityAdminLoginTC extends BaseTest {

    int Flag = 1;
    public AirQualityAdminLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Smart Air Quality solution Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Air Quality Solution");
            log.info("Air Quality Test Case Started");
        }

        CommonMethods commonMethods = new CommonMethods(driver);
        AdminLoginPO adminLoginPO = new AdminLoginPO(driver);

        //Step 1: Open URL
        Assert.assertTrue(commonMethods.openUrl(adminLoginPO.airQualityAdminUrl), "Unable to Open End User URL");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Browser should get open and should provide Admin User URL", "Browser got redirected to the Admin User Login page");

        //Step 2: Login in Admin Panel
        Assert.assertTrue(adminLoginPO.loginInAdmin(),"Unable to Login in Elevator Admin Panel");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Elevator Admin User should get logged in Application","Elevator Admin got successfully logged in application");
        Thread.sleep(3000);

    }
}
