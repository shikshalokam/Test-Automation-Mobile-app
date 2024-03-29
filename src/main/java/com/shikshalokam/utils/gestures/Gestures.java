package com.shikshalokam.utils.gestures;

import static com.shikshalokam.utils.logger.DebugLogger.debugLogger;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.report.ShikshaLokamReport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.SupportsNetworkStateManagement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

@SuppressWarnings("rawtypes")
public class Gestures {
    public AppiumDriver driver;

    public Gestures(AppiumDriver driver) {
        this.driver = driver;
    }

    public void gestures() {
        debugLogger().info("Gestures");
    }

    public void sendValueToTextBox(WebElement password, String text) {
        try {
            password.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendNumberToTextBox(WebElement element, CharSequence[] i) {
        try {
        	element.sendKeys(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean click(WebElement element) throws Exception {
        String identifyBy = "xpath";
        boolean bElementFound = true;
        try {
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = element.isDisplayed();
                element.click();
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = this.driver.findElement(By.id(element.getAttribute("ID"))).isDisplayed();
                element.click();
            } else {
                ShikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ShikshaLokamClient.get().logger()
                    .error("None of the Element Selected Please check the Element Once: " + element);
            Assert.assertTrue(false, "***Method: click: Exception occured for locator= " + e.getMessage());
        }
        ShikshaLokamClient.get().logger().info("Method: click for locator = " + element + " status = " + bElementFound);

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
                ShikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ShikshaLokamClient.get().logger()
                    .error("None of the Element Selected Please check the Element Once: " + element);
            Assert.assertTrue(false, "***Method: type: Exception occured for locator= " + e.getMessage());
        }
        ShikshaLokamClient.get().logger().info("Method: type for locator = " + element + " status = " + bElementFound);
        return bElementFound;
    }

    public void clear(WebElement element) {
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
                ShikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            ShikshaLokamClient.get().logger().error("Method: assertIfElementExists :: Exception occured for locator = "
                    + element + " exception is = " + e.getMessage());
            Assert.assertTrue(false,
                    "***Method: assertIfElementExists: Exception occured for locator= " + e.getMessage());
        }
        ShikshaLokamClient.get().logger()
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
                ShikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ShikshaLokamReport.getExtentTest().log(Status.FAIL,
                    "Method: assertIfElementExists :: Exception occured for locator = " + locator + " exception is = "
                            + e.getMessage());
            Assert.assertTrue(false,
                    "***Method: assertIfElementExists: Exception occured for locator= " + e.getMessage());
        }
        ShikshaLokamClient.get().logger()
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

    public void scrollToMobileElement(WebElement passwordToRegister, String scrollCount) {
        try {
            int count = Integer.parseInt(scrollCount);
            for (int i = 0; i < count; i++) {
                if (!isElementPresent(passwordToRegister)) {
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

    public void scrollUpToMobileElement(WebElement element, String scrollCount) {
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
            ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.BACK));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void typeNumber2() throws Exception {
        try {
            ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
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
        ShikshaLokamClient.get().driver().findElementsByXPath(
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

    public boolean isEnabled(WebElement nameToRegister) {
        return nameToRegister.isEnabled();
    }


    public void longPress(MobileElement element) throws InterruptedException {
        Thread.sleep(5000);
        element.click();
        MobileElement longpress = (MobileElement) new WebDriverWait(driver, 30).
                until(ExpectedConditions.elementToBeClickable(element));
        new Actions(driver).clickAndHold(longpress).perform();
        Thread.sleep(5000);
    }

    public void clickBackButton() {
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
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
                        break;
                    case '1':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                        break;
                    case '2':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                        break;
                    case '3':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                        break;
                    case '4':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                        break;
                    case '5':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
                        break;
                    case '6':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_6));
                        break;
                    case '7':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_7));
                        break;
                    case '8':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
                        break;
                    case '9':
                        ((AndroidDriver) ShikshaLokamClient.get().driver()).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
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
