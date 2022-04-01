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


   public static class MyGroups{

      @FindBy(xpath = "//android.widget.Button[@text='Language']")
      public MobileElement language;

    }



}
