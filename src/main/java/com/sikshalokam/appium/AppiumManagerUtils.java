package com.sikshalokam.appium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 *
 * @author: Sunil H N Date: 12/02/2022 Purpose: To get free ports and nodepath
 * and appium path to start service
 */

public class AppiumManagerUtils {

    public static int getFreePort() throws Exception {
        int port = 0;
        try {
            ServerSocket socket = new ServerSocket(0);
            socket.setReuseAddress(true);
            port = socket.getLocalPort();
            socket.close();
        } catch (Exception e) {
            debugLogger().error("Exception while generating free port.");
            e.printStackTrace();
        }
        return port;
    }

    public static String getNodePath() throws IOException, InterruptedException {
        try {
            String jsPaths = null;
            String nodePath = null;
            Process p;
            BufferedReader reader;
            String operatingSystem = System.getProperty("os.name");
            if (operatingSystem.contains("Windows")) {
                String whereAppium = "where" + " " + "node";
                debugLogger().info("where Appium : " + whereAppium);
                p = Runtime.getRuntime().exec(whereAppium);
                reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                debugLogger().info("Reader - " + reader);
                while ((jsPaths = reader.readLine()) != null) {
                    nodePath = jsPaths;
                    break;
                }
                p.waitFor();
                p.destroy();

                if (nodePath == null) {
                    System.exit(0);
                }
            } else if (operatingSystem.contains("Linux")) {
                String command = "which " + "node";
                p = Runtime.getRuntime().exec(command);
                p.waitFor();
                reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = "";

                while ((line = reader.readLine()) != null) {
                    nodePath = line;
                    break;
                }

                p.destroy();
                if (nodePath == null) {
                    System.exit(0);
                }
            }

            debugLogger().info("nodePath :" + nodePath);
            return nodePath;
        } catch (Exception e) {
            debugLogger().error("Exception while Getting Node Path");
            e.printStackTrace();
        }
        return null;
    }

    public static String getAppiumJSPath() throws IOException, InterruptedException {
        try {
            String jsPaths = null;
            String actualJSPath = null;
            Process p;
            String operatingSystem = System.getProperty("os.name");
            if (operatingSystem.contains("Win")) {
                String whereAppium = "where" + " " + "appium";
                p = Runtime.getRuntime().exec(whereAppium);
                BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                debugLogger().info("StdInput " + stdInput);
                while ((jsPaths = stdInput.readLine()) != null) {
                    actualJSPath = jsPaths.replace("appium", "node_modules\\appium\\build\\lib\\main.js");
                    break;
                }
                p.waitFor();
                p.destroy();

                if (actualJSPath == null) {
                    System.exit(0);
                }
            } else if (operatingSystem.contains("Linux")) {
                String whereAppium = "which" + " " + "appium";
                p = Runtime.getRuntime().exec(whereAppium);
                BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((jsPaths = stdInput.readLine()) != null) {
                    actualJSPath = jsPaths.replace("/usr/local/bin/appium", "");
                    break;
                }
                p.waitFor();
                p.destroy();

                if (actualJSPath == null) {
                    System.exit(0);
                }
            } else {
                debugLogger().info("else");
                actualJSPath = "/home/qualitrix/Documents/WebDriverIo/node-v14.15.0-linux-x64/lib/node_modules/appium/build/lib/main.js";
            }
            debugLogger().info("actualJSPath :" + actualJSPath);
            return actualJSPath;
        } catch (Exception e) {
            debugLogger().error("Exception while Getting Appium js Path");
            e.printStackTrace();
        }
        return null;
    }


}
