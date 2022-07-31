package com.sikshalokam.pages.actions;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.utils.logger.Logger;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.codehaus.groovy.util.SingleKeyHashMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {


    LoginPageObjects loginPageObjects = new LoginPageObjects();

    public LoginPageAction() throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), loginPageObjects);
    }

    // switch to webview for inspect elements
    public void switchToWebView() throws Exception {
        Thread.sleep(5000);
        SikshaLokamClient.get().gestures().changeDriverContextToWeb(SikshaLokamClient.get().driver());
    }

    // enter user name to field.
    public void enterUserName(String userName) throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.userName);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.userName, userName);
    }

    // enter password to field.
    public void enterPassword(String password) throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.password);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.password, password);
    }

    public void clickOnLoginButton() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.loginButton);

    }

    public void verifyLoginFailedErrorMsg() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.loginErrorMsg);
    	Logger.logAndReportPass("Login Error Message is displayed succesfully.");
    }
    
    public void verifyHomePage() throws Exception {
        Thread.sleep(6000);
        SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.programs);
        Logger.logAndReportPass("HomePage Welcome title is displayed succesfully.");
    }


    public void clickOnEnglish() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.englishLanguageOption);
        Logger.logAndReportInfo("Clicked on English language");
    }

    public void clickOnContinue() throws Exception {
        loginPageObjects.continueButton.click();
        //SikshaLokamClient.get().gestures().click(loginPageObjects.continueButton);
        Logger.logAndReportInfo("Clicked on the continue button ");
    }

    public void clickOnHeadTeacherOption() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.headTeacherOption);
        Logger.logAndReportInfo("Clicked on head teacher option");
    }

    public void clickOnTeacherOption() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.TeacherOption);
        Logger.logAndReportInfo("Clicked on teacher option");
    }
    
    public void clickOnLoginWithDikshaOption() throws Exception {
    	SikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.loginWithDiksha);	
        //SikshaLokamClient.get().gestures().click(loginPageObjects.loginWithDiksha);
        Logger.logAndReportInfo("Clicked on login button with diksha option");
    }

    public void verifyLoginPageTitle() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.loginPageTitle);
    	Logger.logAndReportPass("Login page title is displayed succesfully.");
    }
    
    public void clickonRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.registerButton);
        Logger.logAndReportInfo("clicked on register button.");
    }

    public void clickOnSelectYearOfBirthDropDwn() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.yearOfBirthDropDwn);
        Logger.logAndReportInfo("clicked on select year of birth dropdown");

    }

    public void selectYearOfBirthOption() throws Exception {
    	Thread.sleep(2000);
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectYear2021);
        Logger.logAndReportInfo("Year of Birth option is selected.");
    }

    public void clickOnTermsAndConditionToRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.termsAndConditionCheckBox);
        Logger.logAndReportInfo("Clicked on the terms and conditions checkbox");
        Thread.sleep(5000);
    }

    public void clickOnSubmitButtonToRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonToRegister);
        Logger.logAndReportInfo("Clicked on the Register button on register page ");
    }

    public void verifyRegisterPageTitle() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.registerPageTitle);
    	Logger.logAndReportPass("Register page title is displayed succesfully");
    }
    
    public void verifyContentForRegister() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.contentToRegister);
    	Logger.logAndReportPass("Content for Register page title is displayed succesfully");
    }
    
    public void verifyFormNameFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.nameToRegister);
        if (state)
            Logger.logAndReportInfo("Form Name is Enabled.");
        else
            Logger.logAndReportInfo("Form Name is Disabled.");
    }

    public void verifyMobileNumbaerFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.mobileNumberToRegister);
        if (state)
            Logger.logAndReportInfo("Mobile Number field is Enabled.");
        else
            Logger.logAndReportInfo("Mobile Number field is Disabled.");
    }

    public void verifyPasswordFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.passwordToRegister);
        if (state)
            Logger.logAndReportInfo("Password field is Enabled.");
        else
            Logger.logAndReportInfo("Password field is Disabled.");
    }

    public void verifyConfirmPasswordFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.confirmPasswordToRegister);
        if (state)
            Logger.logAndReportInfo("Confirm Password field is Enabled.");
        else
            Logger.logAndReportInfo("Confirm Password field is Disabled.");
    }

    public void verifySubmitFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.submitButtonToRegister);
        if (state)
            Logger.logAndReportInfo("Submit Button is Enabled.");
        else
            Logger.logAndReportInfo("Submit Button is Disabled.");
        Thread.sleep(5000);
    }

    public void verifyRegisterPageFields() throws Exception {
        verifyFormNameFieldEnabled();
        verifyMobileNumbaerFieldEnabled();
        verifyPasswordFieldEnabled();
        verifyConfirmPasswordFieldEnabled();
    }

    // enter name to register form
    public void enterNameForRegister(String userName) throws Exception {
        // SikshaLokamClient.get().gestures().click(loginPageObjects.nameToRegister);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.nameToRegister, userName);
        Logger.logAndReportInfo("entered name for registration form : " + userName);
    }

 // enter date of birth year to register form
    public void enterDOBForRegister(String dateOfBirthYear) throws Exception {
        // SikshaLokamClient.get().gestures().click(loginPageObjects.nameToRegister);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.yearOfBirthToRegister, dateOfBirthYear);
        Logger.logAndReportInfo("entered Date of birth year for registration form : " + dateOfBirthYear);
    }
    
    public void selectDateOfBirthYearToRegister() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.dateOfBirthYear);
    	Logger.logAndReportInfo("Date of birth year is selected.");
    }
    public void clickOnContinueButtonForRegistration() throws Exception {
            loginPageObjects.continueButtonForRegistration.click();
            Logger.logAndReportInfo("Clicked on the continue button ");
    }
    
    // enter mobile number to register form
    public void enterMobileNumberForRegister(String mobileNumber) throws Exception {
        loginPageObjects.mobileNumberToRegister.click();
        SikshaLokamClient.get().gestures().sendInteger(mobileNumber);
        SikshaLokamClient.get().gestures().hideKeyBoard();

//        SikshaLokamClient.get().gestures().click(loginPageObjects.mobileNumberToRegister);
//
//        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.mobileNumberToRegister, mobileNumber);
//        Thread.sleep(15000);
//        Logger.logAndReportInfo("entered mobile number for registration form : " + mobileNumber);
//        Thread.sleep(15000);
//        System.out.println("10 sec wait completed");
    }

    // enter password to register form
    public void enterPasswordForRegister(String password) throws Exception {
        //SikshaLokamClient.get().gestures().click(loginPageObjects.passwordToRegister);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.passwordToRegister, password);
        SikshaLokamClient.get().gestures().hideKeyBoard();
        Logger.logAndReportInfo("entered password for registration form : " + password);
    }

    public void swipeUpToConfirmPassword() throws Exception {
        SikshaLokamClient.get().gestures().scrollToMobileElement(loginPageObjects.passwordToRegister, "2");
        //System.out.println(observationPageObjects.question5.getText());
        // SikshaLokamClient.get().gestures().ScrollToAndClick(observationPageObjects.question5.getText());

        Logger.logAndReportInfo("Scrolled to the confirmPassword field");
    }
    
    // enter confirm password to register form
    public void enterConfirmPasswordForRegister(String confirmPassword) throws Exception {
        //SikshaLokamClient.get().gestures().click(loginPageObjects.confirmPasswordToRegister);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.confirmPasswordToRegister, confirmPassword);
        Logger.logAndReportInfo("entered confirm password for registration form : " + confirmPassword);
       // SikshaLokamClient.get().gestures().hideKeyBoard();
    }
    
    public void clickOnProgramsTile() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.programsTile);
    	Logger.logAndReportInfo("Clicked on the programs tile");
    }
    
    public void clickOnRoleToRegisterDropdwn() throws Exception {
    	Thread.sleep(10000);
    	SikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.roleToRegister);
    	//SikshaLokamClient.get().gestures().click(loginPageObjects.roleToRegister);
    	Logger.logAndReportInfo("Clicked on the role to register dropdown");
    }
    
    public void selectHTAndOfficialRoleToRegister() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.HTAndOfficialRoleOption);
    	Logger.logAndReportInfo("Selected HT and Official Role to register");
    }
    
    
    public void clickOnStateToRegisterDropdwn() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.stateToRegister);
    	Logger.logAndReportInfo("Clicked on the state dropdown to register");
    }
    
    public void swipeUpToUttarPradeshState() throws Exception {
        SikshaLokamClient.get().gestures().scrollToMobileElement(loginPageObjects.selectUPStateToRegister, "6");
        //System.out.println(observationPageObjects.question5.getText());
        // SikshaLokamClient.get().gestures().ScrollToAndClick(observationPageObjects.question5.getText());

        Logger.logAndReportInfo("Scrolled to the confirmPassword field");
    }
    
    public void selectUttarPradeshStateToRegister() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.selectUPStateToRegister);
    	Logger.logAndReportInfo("Selected Uttar Pradesh to register");
    }
    
    public void clickOnsubRoleToRegister() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.subRoleToRegister);
    	Logger.logAndReportInfo("Clicked on the sub role drop down to register");
    }
    
    public void selectHMSubRoletoRegister() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.HMSubRoleOption);
    	Logger.logAndReportInfo("HM Sub role is selected to register");
    }
    
    public void clickOnDistictToRegisterDropdwn() throws Exception {
		SikshaLokamClient.get().gestures().click(loginPageObjects.districtToRegister);
		Logger.logAndReportInfo("Clicked on the district to register");
	}
    
    public void selectAgraDistrictToRegister() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.selectAgraDistrictToRegister);
    	Logger.logAndReportInfo("Agra district is selected to register");
    }
    
    public void clickOnSubmitButtonToContentSubmission() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonForContentSubmission);
    	Logger.logAndReportInfo("Clicked on the submit button for content submission to register");
    }
    //****************************Verify******************************************//
    
    public void verifyOtpPage() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.oneTimePasswordTitle);
    	Logger.logAndReportPass("OTP Page title is displayed succesfully");
    }
    
    public void verifyProgramsTile() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.programsTile);
    	Logger.logAndReportPass("Programs Tile is displayed succesfully. ");
    }

    public void verifyProjectsTile() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.projectsTile);
    	Logger.logAndReportPass("Project Tile is displayed succesfully. ");
    }
    
    public void verifyObservationTile() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.observationTile);
    	Logger.logAndReportPass("Observation Tile is displayed succesfully. ");
    }
    
    public void verifySurveyTile() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.surveyTile);
    	Logger.logAndReportPass("Survey Tile is displayed succesfully. ");
    }
    
    public void verifyCoursesTile() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.courseTile);
    	Logger.logAndReportPass("Courses Tile is displayed succesfully. ");
    }
    
    public void verifyReportsTile() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.reportsTile);
    	Logger.logAndReportPass("Reports Tile is displayed succesfully. ");
    }
    
    public void verifyProgramsTitle() throws Exception {
    	SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.programsTitle);
    	Logger.logAndReportPass("Programs title is displayed succesfully");
    }
}
