package com.sikshalokam.test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.utils.gSheet.TestData;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Map;

public class NewScript {

    Map<String, String> loginPageTestData;
    String nameForCredential;
    String mobileNumber;

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    @Test(description = "login to application")
    @Author(name = "Manjunath Kumar")
    public void loginToApplication() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().verifyHomePage();

    }

    

}