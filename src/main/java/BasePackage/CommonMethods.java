package BasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    public By userMenu_Btn = By.xpath("//li[@class='dropdown user user-menu']");
    public By signOut_Btn = By.xpath("//a[contains(text(),'Sign Out')]");
    private WebDriver driver;
    private JavascriptExecutor jse;

    public CommonMethods() {

    }

    public CommonMethods(WebDriver driver) {
        this.driver = driver;

    }

    public boolean clickOnLinkOrButton(By by) throws Exception {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            //return false;
            throw e;
        }
    }

    public boolean openUrl(String url) {
        try {
            driver.get(url);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean clearText(By by) throws Exception {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            generic_WebL.clear();
            return true;
        } catch (Exception e) {
            //return false;
            throw e;
        }
    }

    public boolean enterTextInInputField(By by, String data) throws Exception {
        try {
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            if (generic_WebL.isDisplayed()) {
                generic_WebL.clear();
                generic_WebL.sendKeys(data);
                return true;
            }
            return false;
        } catch (Exception e) {
            throw e;

        }
    }

    public boolean selectFromDropDown(By drpDownClick, By drpValue) throws Exception {
        try {
            Thread.sleep(2500);

            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(drpDownClick));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            Thread.sleep(1500);
            WebElement value1 = new WebDriverWait(driver, 20).
                    until(ExpectedConditions.visibilityOfElementLocated(drpValue));
            value1.click();
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean clickByJS(By by) throws Exception {
        try {
            Thread.sleep(1000);
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean clickByJSs(By by) throws Exception {
        try {
            Thread.sleep(1000);
            jse = (JavascriptExecutor) driver;
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.presenceOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean selectValueFromDD(By dropDown, String value, By ddValue) throws Exception {
        try {
            WebElement countryDD = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(dropDown));
            if (countryDD.isDisplayed()) {
                Thread.sleep(1000);
                countryDD.sendKeys(value);

                WebElement countryText = (new WebDriverWait(driver, 90))
                        .until(ExpectedConditions.elementToBeClickable(ddValue));
                countryText.click();
                return true;
            }
            return false;
        } catch (Exception e) {
            throw e;


        }
    }

    public boolean selectFromComboBox(By txtXpath, String value, By click) throws Exception {
        try {
            WebElement comboVal = new WebDriverWait(driver, 20).
                    until(ExpectedConditions.visibilityOfElementLocated(txtXpath));
            comboVal.sendKeys(value);
            WebElement value1 = new WebDriverWait(driver, 20).
                    until(ExpectedConditions.visibilityOfElementLocated(click));
            value1.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void switchToFrame(By by) {
        driver.switchTo().frame(driver.findElement(by));
    }

    public boolean switchToDefaultContent() {
        try {
            driver.switchTo().defaultContent();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean logOutAdmin() throws Exception {
        try {

            Thread.sleep(3000);
            WebElement menu = new WebDriverWait(driver, 300)
                    .until(ExpectedConditions.visibilityOfElementLocated(userMenu_Btn));
            menu.click();

            WebElement signOut = new WebDriverWait(driver, 300)
                    .until(ExpectedConditions.visibilityOfElementLocated(signOut_Btn));
            signOut.click();
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            //return false;
            throw e;
        }
    }

    public boolean verifySuccessMsg(By msg) throws Exception {
        try {
            WebElement success = (new WebDriverWait(driver, 90)).
                    until(ExpectedConditions.visibilityOfElementLocated(msg));

            // success.click();
            return success.isDisplayed();
        } catch (Exception e) {
            throw e;
        }
    }
}
