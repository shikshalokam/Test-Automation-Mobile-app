package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



 public class ProfilePageObjects {


    @FindBy(xpath = "//android.widget.Button[@text='My groups']")
    public WebElement myGroups;

    @FindBy(xpath = "//android.widget.Button[@text='Try new DIKSHA experience']")
    public WebElement tryNew;

    @FindBy(xpath = "//android.widget.Button[@text='Switch to dark mode']")
    public WebElement switchToDarkMode;

    @FindBy(xpath = "//android.widget.Button[@text='Settings']")
    public WebElement settings;

    @FindBy(xpath = "//android.widget.Button[@text='Help']")
    public WebElement help;

    @FindBy(xpath = "//android.widget.Button[@text='Log out']")
    public WebElement logOut;

    @FindBy(xpath = "//android.widget.Button[@text='Import Content']")
    public WebElement importContent;

    @FindBy(xpath = "//android.widget.Button[@text='Language']")
    public WebElement language;

    @FindBy(xpath = "(//android.view.View[contains(@text,'Select Board')])[1]")
    public WebElement selectBoard;

    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'CBSE')]")
    public WebElement cbseOrNcertRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'IGOT-Health')]")
    public WebElement IGOTHealthRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'Andhra Pradesh')]")
    public WebElement andraPradeshRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'Assam')]")
    public WebElement assamRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'Bihar')]")
    public WebElement biharRadioButton;

    @FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
    public WebElement submitOnBoardSelectPage;

    @FindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public WebElement cancelButton;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Board')]")
    public WebElement boardTitle;

    @FindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public WebElement saveButton;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Choose content preferences')]")
    public WebElement chooseContentPreferenceTitle;

    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select State')]")
    public WebElement selectStateDropDwn;

    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select Subrole')]")
    public WebElement selectSubRoleDropDwn;

    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select District')]")
    public WebElement selectDistrictDropDwn;

    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select Block')]")
    public WebElement selectBlockDropDwn;

    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select School')]")
    public WebElement selectSchoolDropDwn;

    @FindBy(xpath = "//android.widget.Button[@text='Submit']")
    public WebElement submitOnContentPreferencePage;

    @FindBy(xpath = "//android.widget.TextView[@text='Select Subrole']")
    public WebElement selectSubRoleTitle;

    @FindBy(xpath = "//android.widget.CheckBox[@text='HT']")
    public WebElement HTRole;

    @FindBy(xpath = "//android.widget.Button[@text='Edit Role, Block, District, State']")
    public WebElement EditRole;



   public static class MyGroups{

      @FindBy(xpath = "//android.widget.Button[@text='Language']")
      public WebElement language;

    }



}
