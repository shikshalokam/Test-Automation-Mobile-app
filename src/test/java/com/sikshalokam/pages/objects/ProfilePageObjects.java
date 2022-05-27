package com.sikshalokam.pages.objects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

 public class ProfilePageObjects {


    @FindBy(xpath = "//android.widget.Button[@text='My groups']")
    public MobileElement myGroups;

    @FindBy(xpath = "//android.widget.Button[@text='Try new DIKSHA experience']")
    public MobileElement tryNew;

    @FindBy(xpath = "//android.widget.Button[@text='Switch to dark mode']")
    public MobileElement switchToDarkMode;

    @FindBy(xpath = "//android.widget.Button[@text='Settings']")
    public MobileElement settings;

    @FindBy(xpath = "//android.widget.Button[@text='Help']")
    public MobileElement help;

    @FindBy(xpath = "//android.widget.Button[@text='Log out']")
    public MobileElement logOut;

    @FindBy(xpath = "//android.widget.Button[@text='Import Content']")
    public MobileElement importContent;

    @FindBy(xpath = "//android.widget.Button[@text='Language']")
    public MobileElement language;

    @FindBy(xpath = "(//android.view.View[contains(@text,'Select Board')])[1]")
    public MobileElement selectBoard;
    
    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'CBSE')]")
    public MobileElement cbseOrNcertRadioButton;
    
    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'IGOT-Health')]")
    public MobileElement IGOTHealthRadioButton;
    
    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'Andhra Pradesh')]")
    public MobileElement andraPradeshRadioButton;
    
    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'Assam')]")
    public MobileElement assamRadioButton;
    
    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'Bihar')]")
    public MobileElement biharRadioButton;

    @FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
    public MobileElement submitOnBoardSelectPage;
    
    @FindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement cancelButton;
    
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Board')]")
    public MobileElement boardTitle;
    
    @FindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public MobileElement saveButton;
    
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Choose content preferences')]")
    public MobileElement chooseContentPreferenceTitle;
    
    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select State')]")
    public MobileElement selectStateDropDwn;
    
    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select Subrole')]")
    public MobileElement selectSubRoleDropDwn;
    
    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select District')]")
    public MobileElement selectDistrictDropDwn;
    
    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select Block')]")
    public MobileElement selectBlockDropDwn;
    
    @FindBy(xpath = "//android.widget.ListView[contains(@text,'Select School')]")
    public MobileElement selectSchoolDropDwn;
    
    @FindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement submitOnContentPreferencePage;
    
    @FindBy(xpath = "//android.widget.TextView[@text='Select Subrole']")
    public MobileElement selectSubRoleTitle;
    
    @FindBy(xpath = "//android.widget.CheckBox[@text='HT']")
    public MobileElement HTRole;
    
   public static class MyGroups{

      @FindBy(xpath = "//android.widget.Button[@text='Language']")
      public MobileElement language;

    }



}
