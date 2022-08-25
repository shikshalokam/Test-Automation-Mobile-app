package com.sikshalokam.utils.gestures;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.report.SikshaLokamReport;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.SupportsNetworkStateManagement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.util.Set;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

@SuppressWarnings("rawtypes")
public class Gestures {
    public AppiumDriver driver;

    public Gestures(AppiumDriver driver) {
        this.driver = driver;
    }

    public void gestures() {
        debugLogger().info("Gestures");
    }

    public void sendValueToTextBox(MobileElement element, String text) {
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getText(MobileElement element) {

        return element.getText();
    }

    public boolean isDisplayed(MobileElement element) {
        return element.isDisplayed();
    }

    public boolean click(MobileElement element) throws Exception {
        String identifyBy = "xpath";
        boolean bElementFound = false;
        try {
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = element.isDisplayed();
                element.click();
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = this.driver.findElement(By.id(element.getAttribute("ID"))).isDisplayed();
                element.click();
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            SikshaLokamClient.get().logger()
                    .error("None of the Element Selected Please check the Element Once: " + element);
            Assert.assertTrue(false, "***Method: click: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger().info("Method: click for locator = " + element + " status = " + bElementFound);

        return bElementFound;
    }

    public boolean type(MobileElement element, String value) throws Exception {
        String identifyBy = "xpath";
        boolean bElementFound = false;
        try {
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = element.isDisplayed();
                element.sendKeys(value);
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = this.driver.findElement(By.id(element.getAttribute("ID"))).isDisplayed();
                element.sendKeys(value);
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            SikshaLokamClient.get().logger()
                    .error("None of the Element Selected Please check the Element Once: " + element);
            Assert.assertTrue(false, "***Method: type: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger().info("Method: type for locator = " + element + " status = " + bElementFound);
        return bElementFound;
    }

    public void clear(MobileElement element) {
        try {
            waitTillTheElementIsVisibleAndClickable(element);
            element.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSelected(MobileElement element) {
        return element.isSelected();
    }

    public boolean type(MobileElement element) throws IOException {
        String identifyBy = "xpath";
        boolean bElementFound = false;
        waitTillTheElementIsVisibleAndClickable(element);
        try {
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = element.isDisplayed();
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = this.driver.findElement(By.id(element.getAttribute("ID"))).isDisplayed();
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            SikshaLokamClient.get().logger().error("Method: assertIfElementExists :: Exception occured for locator = "
                    + element + " exception is = " + e.getMessage());
            Assert.assertTrue(false,
                    "***Method: assertIfElementExists: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger()
                .info("Method: assertIfElementExists for locator = " + element + " status = " + bElementFound);
        return bElementFound;
    }

    public void clearValue(MobileElement element) {
        element.clear();
    }

    public boolean assertIfElementExistsAndClick(WebDriver mDriver, String identifyBy, WebElement locator)
            throws Exception {
        boolean bElementFound = false;
        try {
            waitTillTheElementIsVisibleAndClickable(locator);
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = locator.isDisplayed();
                locator.click();
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = mDriver.findElement(By.id(locator.getAttribute("ID"))).isDisplayed();
                mDriver.findElement(By.id(locator.getAttribute("ID"))).click();
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            SikshaLokamReport.getExtentTest().log(Status.FAIL,
                    "Method: assertIfElementExists :: Exception occured for locator = " + locator + " exception is = "
                            + e.getMessage());
            Assert.assertTrue(false,
                    "***Method: assertIfElementExists: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger()
                .info("Method: assertIfElementExists for locator = " + locator + " status = " + bElementFound);
        return bElementFound;
    }

    // Method to Wait till the Element is Visible and Clickable
    private void waitTillTheElementIsVisibleAndClickable(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait = new WebDriverWait(driver, 25);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error(e.getLocalizedMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void switchContext(String context) {
        try {
            Set<String> con = driver.getContextHandles();
            for (String c : con) {
                debugLogger().info("Available Context : " + c);
                if (c.contains(context)) {
                    driver.context(c);
                    debugLogger().info("Switched to WEB_VIEW :: " + driver.getContext());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error(e.getLocalizedMessage());
        }
    }

    // New

    public boolean isElementPresent(WebElement locator) {
        try {
            waitForElementToAppear(locator);
            if (locator.isDisplayed())
                System.out.println("Element present on screen ***********" + locator);
            return true;
        } catch (Exception e) {
            System.out.println("Element not present on screen **************" + locator);
            return false;
        }
    }

    public WebElement waitForElementToAppear(WebElement id) {
        WebDriverWait wait = new WebDriverWait(this.driver, 25);
        wait.until(ExpectedConditions.visibilityOf(id));
        return id;
    }

    public void scrollToMobileElement(MobileElement element, String scrollCount) {
        try {
            int count = Integer.parseInt(scrollCount);
            for (int i = 0; i < count; i++) {
                if (!isElementPresent(element)) {
                    break;
                } else {
                    swipeUp();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error(e.getLocalizedMessage());
        }
    }

    public void scrollUpToMobileElement(MobileElement element, String scrollCount) {
        try {
            int count = Integer.parseInt(scrollCount);
            for (int i = 0; i < count; i++) {
                if (isElementPresent(element)) {
                    break;
                } else {
                    swipeUp();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error(e.getLocalizedMessage());
        }
    }

    public void swipeUp() {
        Dimension size = driver.manage().window().getSize();
        try {
            int starty = (int) (size.height * 0.85);
            int endy = (int) (size.height * 0.2);
            int startx = (int) (size.width / 2.2);
            debugLogger()
                    .info("Trying to swipe up from x:" + startx + " y:" + starty + ", to x:" + startx + " y:" + endy);
            new TouchAction(this.driver).press(point(startx, starty)).waitAction(waitOptions(ofSeconds(2)))
                    .moveTo(point(startx, endy)).release().perform();
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error(e.getLocalizedMessage());
        }
    }

    public void clickOnBackButton() throws Exception {
        try {
            ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.BACK));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void swipeDown() {
        Dimension size = driver.manage().window().getSize();
        try {
            int starty = (int) (size.height * 0.45);
            int endy = (int) (size.height * 0.90);
            int startx = (int) (size.width / 2.2);
            debugLogger()
                    .info("Trying to swipe up from x:" + startx + " y:" + starty + ", to x:" + startx + " y:" + endy);
            new TouchAction(this.driver).press(point(startx, starty))
                    .waitAction(waitOptions(ofSeconds(3))).moveTo(point(startx, endy)).release().perform();
        } catch (Exception e) {
            debugLogger().error("Swipe did not complete successfully." + e.getLocalizedMessage());
        }
    }

    public void scrollAndClick(String visibleText) throws Exception {
        SikshaLokamClient.get().driver().findElementsByXPath(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
                        + visibleText + "\").instance(0))");
    }


    public void waitAndClickElementisVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }


    public void changeDriverContextToWeb(AppiumDriver driver) {
        Set<String> allContext = driver.getContextHandles();
        System.out.println(allContext);
        for (String context : allContext) {
            if (context.contains("WEBVIEW"))
                driver.context(context);
        }
    }

    public boolean isEnabled(MobileElement element) {
        return element.isEnabled();
    }


    public void longPress(MobileElement element) throws InterruptedException {
        Thread.sleep(5000);
        element.click();
        MobileElement longpress = (MobileElement) new WebDriverWait(driver, 30).
                until(ExpectedConditions.elementToBeClickable(element));
        new Actions(driver).clickAndHold(longpress).perform();
        Thread.sleep(5000);
    }

    public void clkBackButton() {
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        debugLogger().info("Clicked on Android back button");
    }


    public void doubleTap(MobileElement mobileElement) {
        TouchActions action = new TouchActions(driver);
        action.doubleTap(mobileElement);
        action.perform();
    }

    public void sendInteger(String phNumber) throws Exception {
        try {
            char[] ch = phNumber.toCharArray();
            for (int i = 0; i < phNumber.length(); i++) {
                switch (ch[i]) {
                    case '0':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
                        break;
                    case '1':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                        break;
                    case '2':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                        break;
                    case '3':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                        break;
                    case '4':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                        break;
                    case '5':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
                        break;
                    case '6':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_6));
                        break;
                    case '7':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_7));
                        break;
                    case '8':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
                        break;
                    case '9':
                        ((AndroidDriver) SikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
                        break;
                    default:
                        System.out.println("Nothing matched");
                }
            }
            debugLogger().info("Entered Phone Number "+phNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void hideKeyBoard() {
        try {
            ((AppiumDriver<MobileElement>) driver).hideKeyboard();
            System.out.println("Hide KeyBoard");
        } catch (Exception e) {
            System.out.println("KeyBoard not found to hide");
        }
    }
    
    public void turnOffMobileData() {
    	try {
            ((SupportsNetworkStateManagement) driver).toggleWifi();
            System.out.println("Turned Off MobileData");
        } catch (Exception e) {
            System.out.println("Unable to TurnOff MobileData");
        }
    }
    
    public void turnOnMobileData() {
    	try {
            ((SupportsNetworkStateManagement) driver).toggleWifi();
            System.out.println("Turned On MobileData");
        } catch (Exception e) {
            System.out.println("Unable to TurnOn MobileData");
        }
    }
    
    public void switchToWhatsapp() {
    	
    }
}
