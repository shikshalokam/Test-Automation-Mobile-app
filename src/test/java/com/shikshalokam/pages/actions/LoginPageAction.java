package com.shikshalokam.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.utils.logger.Logger;


public class LoginPageAction {

	LoginPageObjects loginPageObjects = new LoginPageObjects();


 public LoginPageAction() throws Exception {
	  PageFactory.initElements(ShikshaLokamClient.get().driver(), loginPageObjects);
}

	// switch to webview for inspect elements
    public void switchToWebView() throws Exception {
        Thread.sleep(5000);
        ShikshaLokamClient.get().gestures().changeDriverContextToWeb(ShikshaLokamClient.get().driver());
    }

    public void userOnBoardingAsHTOfficial() throws Exception {
    clickOnEnglish();
    clickOnContinue();
    clickOnHeadTeacherOption();
    }



    // enter user name to field.
    public void enterUserName(String userName) throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.userName);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.userName, userName);
    }

    // enter password to field.
    public void enterPassword(String password) throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.password);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.password, password);
    }

    public void clickOnLoginButton() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.loginButton);
        Logger.logAndReportInfo("Clicked On Login Button.");
        Thread.sleep(10000);
    }

    public void verifyLoginFailedErrorMsg() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.loginErrorMsg);
    	Logger.logAndReportPass("Login Error Message is displayed succesfully.");
    }

    public void verifyHomePage() throws Exception {
        Thread.sleep(6000);
        ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.welcomeTitle);
        Logger.logAndReportPass("HomePage Welcome title is displayed succesfully.");
    }


    public void clickOnEnglish() throws Exception {
    	 Thread.sleep(10000);
        ShikshaLokamClient.get().gestures().waitForElementToAppear(loginPageObjects.englishLanguageOption);
        ShikshaLokamClient.get().gestures().click(loginPageObjects.englishLanguageOption);
        Logger.logAndReportInfo("Clicked on English language");
       // Thread.sleep(2000);
    }

    public void clickOnContinue() throws Exception {
    	 ShikshaLokamClient.get().gestures().waitForElementToAppear(loginPageObjects.continueButton);
        ShikshaLokamClient.get().gestures().click(loginPageObjects.continueButton);
        Logger.logAndReportInfo("Clicked on the continue button ");

    }

    public void clickOnHeadTeacherOption() throws Exception {
    	 ShikshaLokamClient.get().gestures().waitForElementToAppear(loginPageObjects.headTeacherOption);
        ShikshaLokamClient.get().gestures().click(loginPageObjects.headTeacherOption);
        Logger.logAndReportInfo("Clicked on head teacher option");
        Thread.sleep(2000);
    }

    public void clickOnTeacherOption() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.TeacherOption);
        Logger.logAndReportInfo("Clicked on teacher option");
    }

    public void clickOnLoginWithDikshaOption() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.loginWithDiksha);
        //ShikshaLokamClient.get().gestures().click(loginPageObjects.loginWithDiksha);
        Logger.logAndReportInfo("Clicked on login button with diksha option");
    }

    public void verifyLoginPageTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.loginPageTitle);
    	Logger.logAndReportPass("Login page title is displayed succesfully.");
    }

    public void clickonRegister() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.registerButton);
        Logger.logAndReportInfo("clicked on register button.");
    }

    public void clickOnSelectYearOfBirthDropDwn() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.yearOfBirthDropDwn);
        Logger.logAndReportInfo("clicked on select year of birth dropdown");

    }

    public void selectYearOfBirthOption() throws Exception {
    	Thread.sleep(2000);
        ShikshaLokamClient.get().gestures().click(loginPageObjects.selectYear2021);
        Logger.logAndReportInfo("Year of Birth option is selected.");
    }

    public void clickOnTermsAndConditionToRegister() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.termsAndConditionCheckBox);
        Logger.logAndReportInfo("Clicked on the terms and conditions checkbox");
        Thread.sleep(5000);
    }

    public void clickOnSubmitButtonToRegister() throws Exception {
        Thread.sleep(20000);
    	ShikshaLokamClient.get().gestures().hideKeyBoard();
        ShikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonToRegister);
        Logger.logAndReportInfo("Clicked on the Register button on register page ");
    }

    public void verifyRegisterPageTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.registerPageTitle);
    	Logger.logAndReportPass("Register page title is displayed succesfully");
    }

    public void verifyContentForRegister() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.contentToRegister);
    	Logger.logAndReportPass("Content for Register page title is displayed succesfully");
    }

    public void verifyFormNameFieldEnabled() throws Exception {
        boolean state = ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.nameToRegister);
        if (state)
            Logger.logAndReportInfo("Form Name is Enabled.");
        else
            Logger.logAndReportInfo("Form Name is Disabled.");
    }

    public void verifyMobileNumbaerFieldEnabled() throws Exception {
        boolean state = ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.mobileNumberToRegister);
        if (state)
            Logger.logAndReportInfo("Mobile Number field is Enabled.");
        else
            Logger.logAndReportInfo("Mobile Number field is Disabled.");
    }

    public void verifyPasswordFieldEnabled() throws Exception {
        boolean state = ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.passwordToRegister);
        if (state)
            Logger.logAndReportInfo("Password field is Enabled.");
        else
            Logger.logAndReportInfo("Password field is Disabled.");
    }

    public void verifyConfirmPasswordFieldEnabled() throws Exception {
        boolean state = ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.confirmPasswordToRegister);
        if (state)
            Logger.logAndReportInfo("Confirm Password field is Enabled.");
        else
            Logger.logAndReportInfo("Confirm Password field is Disabled.");
    }

    public void verifySubmitFieldEnabled() throws Exception {
        boolean state = ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.submitButtonToRegister);
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
        // ShikshaLokamClient.get().gestures().click(loginPageObjects.nameToRegister);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.nameToRegister, userName);
        Logger.logAndReportInfo("entered name for registration form : " + userName);
    }

 // enter date of birth year to register form
    public void enterDOBForRegister(String dateOfBirthYear) throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.nameToRegister);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.yearOfBirthToRegister, dateOfBirthYear);
        Logger.logAndReportInfo("entered Date of birth year for registration form : " + dateOfBirthYear);
        Thread.sleep(10000);
    }

    public void selectDateOfBirthYearToRegister() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.dateOfBirthYear);
    	Logger.logAndReportInfo("Date of birth year is selected.");
    }
    public void clickOnContinueButtonForRegistration() throws Exception {
            loginPageObjects.continueButtonForRegistration.click();
            Logger.logAndReportInfo("Clicked on the continue button ");
    }

    // enter mobile number to register form
    public void enterMobileNumberForRegister(String mobileNumber) throws Exception {
        loginPageObjects.mobileNumberToRegister.click();
        ShikshaLokamClient.get().gestures().sendInteger(mobileNumber);
        ShikshaLokamClient.get().gestures().hideKeyBoard();

//        ShikshaLokamClient.get().gestures().click(loginPageObjects.mobileNumberToRegister);
//
//        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.mobileNumberToRegister, mobileNumber);
//        Thread.sleep(15000);
//        Logger.logAndReportInfo("entered mobile number for registration form : " + mobileNumber);
//        Thread.sleep(15000);
//        System.out.println("10 sec wait completed");
    }

    // enter password to register form
    public void enterPasswordForRegister(String password) throws Exception {
        //ShikshaLokamClient.get().gestures().click(loginPageObjects.passwordToRegister);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.passwordToRegister, password);
        ShikshaLokamClient.get().gestures().hideKeyBoard();
        Logger.logAndReportInfo("entered password for registration form : " + password);
    }

    public void swipeUpToConfirmPassword() throws Exception {
        ShikshaLokamClient.get().gestures().scrollToMobileElement(loginPageObjects.passwordToRegister, "2");
        //System.out.println(observationPageObjects.question5.getText());
        // ShikshaLokamClient.get().gestures().ScrollToAndClick(observationPageObjects.question5.getText());

        Logger.logAndReportInfo("Scrolled to the confirmPassword field");
    }

    // enter confirm password to register form
    public void enterConfirmPasswordForRegister(String confirmPassword) throws Exception {
        //ShikshaLokamClient.get().gestures().click(loginPageObjects.confirmPasswordToRegister);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.confirmPasswordToRegister, confirmPassword);
        //ShikshaLokamClient.get().gestures().hideKeyBoard();
        Logger.logAndReportInfo("entered confirm password for registration form : " + confirmPassword);
        Thread.sleep(25000);
        ShikshaLokamClient.get().gestures().click(loginPageObjects.confirmPasswordToRegister);
        ShikshaLokamClient.get().gestures().hideKeyBoard();
    }

    public void clickOnProgramsTile() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.programsTile);
    	Logger.logAndReportInfo("Clicked on the programs tile");
    	Thread.sleep(3000);
    }

    public void clickOnRoleToRegisterDropdwn() throws Exception {
    	Thread.sleep(10000);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.roleToRegister);
    	//ShikshaLokamClient.get().gestures().click(loginPageObjects.roleToRegister);
    	Logger.logAndReportInfo("Clicked on the role to register dropdown");
    }

    public void selectHTAndOfficialRoleToRegister() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.HTAndOfficialRoleOption);
    	Logger.logAndReportInfo("Selected HT and Official Role to register");
    }


    public void clickOnStateToRegisterDropdwn() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.stateToRegister);
    	Logger.logAndReportInfo("Clicked on the state dropdown to register");
    }

    public void swipeUpToUttarPradeshState() throws Exception {
        ShikshaLokamClient.get().gestures().scrollToMobileElement(loginPageObjects.selectUPStateToRegister, "6");
        //System.out.println(observationPageObjects.question5.getText());
        // ShikshaLokamClient.get().gestures().ScrollToAndClick(observationPageObjects.question5.getText());

        Logger.logAndReportInfo("Scrolled to the confirmPassword field");
    }

    public void selectUttarPradeshStateToRegister() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.selectUPStateToRegister);
    	Logger.logAndReportInfo("Selected Uttar Pradesh to register");
    }

    public void clickOnsubRoleToRegister() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.subRoleToRegister);
    	Logger.logAndReportInfo("Clicked on the sub role drop down to register");
    }

    public void selectHMSubRoletoRegister() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.HMSubRoleOption);
    	Logger.logAndReportInfo("HM Sub role is selected to register");
    }

    public void clickOnDistictToRegisterDropdwn() throws Exception {
		ShikshaLokamClient.get().gestures().click(loginPageObjects.districtToRegister);
		Logger.logAndReportInfo("Clicked on the district to register");
	}

    public void selectAgraDistrictToRegister() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.selectAgraDistrictToRegister);
    	Logger.logAndReportInfo("Agra district is selected to register");
    }

    public void clickOnSubmitButtonToContentSubmission() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonForContentSubmission);
    	Logger.logAndReportInfo("Clicked on the submit button for content submission to register");
    }

    public void clickOnSelectBoardDropdown() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.selectBoardDropdown);
    	Logger.logAndReportInfo("Clicked on the select board dropdown");
    }

    public void selectCBSEBoard() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.cbseRadioButton);
    	Logger.logAndReportInfo("Selected the CBSE radio button " );
    }

    public void clickOnSubmitButtonForBoarding() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonForBoarding);
    	Logger.logAndReportInfo("Clicked on the submit button for boarding.");
    }

    public void clickOnSelectMediumDropdown() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.selectMedium);
    	Logger.logAndReportInfo("Clicked on the select medium dropdown.");
    }

    public void selectEnglishMedium() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.englishMedium);
    	Logger.logAndReportInfo("Selected english language.");
    }

    public void clickOnClassDropdown() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.selectClass);
    	Logger.logAndReportInfo("Clicked on the select class dropdown");
    }

    public void selectClass5() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.class5);
    	Logger.logAndReportInfo("selected class 5");
    }

    public void clickOnContinueForBoarding() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.continueButtonForBoarding);
    	Logger.logAndReportInfo("Clicked on the Continue button for boarding.");
    }

    public void clickOnSwitchToNewExperience() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.switchToNewExperience);
    	Logger.logAndReportInfo("Clicked on the switch to new experience button ");
    }

    public void clickOnReportsTile() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.reportsTile);
    	Logger.logAndReportInfo("Clicked on the reports tile. ");
    }

    //****************************Verify******************************************//

    public void verifyOtpPage() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.oneTimePasswordTitle);
    	Logger.logAndReportPass("OTP Page title is displayed succesfully");
    }

    public void verifyProgramsTile() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.programsTile);
    	Logger.logAndReportPass("Programs Tile is displayed succesfully. ");
    }

    public void verifyProjectsTile() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.projectsTile);
    	Logger.logAndReportPass("Project Tile is displayed succesfully. ");
    }

    public void verifyObservationsTile() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.observationsTile);
    	Logger.logAndReportPass("Observation Tile is displayed succesfully. ");
    }

    public void verifySurveyTile() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.surveyTile);
    	Logger.logAndReportPass("Survey Tile is displayed succesfully. ");
    }

    public void verifyCoursesTile() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.courseTile);
    	Logger.logAndReportPass("Courses Tile is displayed succesfully. ");
    }

    public void verifyReportsTile() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.reportsTile);
    	Logger.logAndReportPass("Reports Tile is displayed succesfully. ");
    }

    public void verifyProgramsTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.programsTitle);
    	Logger.logAndReportPass("Programs title is displayed succesfully");
    }

    public void verifyHambergerMenu() throws Exception {
    	ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.hambergerMenu);
    	Logger.logAndReportPass("Hamberger menu is displayed succesfully");
    }
}

/*class PageObjects{
	@CacheLookup
	@FindBy(xpath="//android.widget.Button[contains(@text,'English')]")
    public  WebElement englishLanguageOption;
} */

