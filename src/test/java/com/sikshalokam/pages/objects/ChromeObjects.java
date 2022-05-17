package com.sikshalokam.pages.objects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class ChromeObjects {


    @FindBy(id = "com.android.chrome:id/search_box_text")
    public MobileElement searchBox;

    @FindBy(xpath = " //android.view.View[@content-desc=\"Start Observation\"]/android.widget.Button")
    public MobileElement startObservation;

    @FindBy(xpath = " //android.view.View[@content-desc=\"Start project\"]/android.widget.Button")
    public MobileElement startProject;
    
    
}
