package com.sikshalokam.constants;

import java.io.File;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 * 
 * @author: Sunil H N Date: 09/02/2022 Purpose: paths required for projects
 * 
 */

public interface IAutoConst {

	public final String PROJECT_PATH = System.getProperty("user.dir");

	public final static String MODE_LOCAL = "local";

	public final static String MODE_CLOUD = "cloud";


	public final static String REPORT_DIR_PATH = PROJECT_PATH + File.separator + "Reports" + File.separator
			+ "ExtentReport.html";

	public final static String EXTENT_CONFIG = PROJECT_PATH + File.separator + "src" + File.separator + "main"
			+ File.separator + "resources" + File.separator + "extent-config.xml";

	public final static String APPIUM_LOG = PROJECT_PATH + File.separator + "logs" + File.separator + "appium.log";

	public final static String APP_LOG = PROJECT_PATH + File.separator + "logs" + File.separator + "app.log";

	public final static String DEBUG_LOG_PATH = PROJECT_PATH + File.separator + "logs" + File.separator + "debug.log";

	public final static String GOOGLE_AUTHFILE = PROJECT_PATH + File.separator + "src" + File.separator + "main"
			+ File.separator + "resources" + File.separator + "sikshalokam-8542b87e21f7.p12";

	public final static String CAPS = PROJECT_PATH + File.separator + "config" + File.separator + "cap.json";

	public final static String CHROME_DRIVER = PROJECT_PATH + File.separator + "driver" + File.separator
			+ "chromedriver";

	public final static String APK = PROJECT_PATH + File.separator + "apk" + File.separator + "diksha-staging-debug.apk";

}
