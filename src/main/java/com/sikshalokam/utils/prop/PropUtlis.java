package com.sikshalokam.utils.prop;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sikshalokam.constants.IAutoConst;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

public class PropUtlis {

    private JSONParser parser;

    public static String readConfig(String... jsonObjects) throws Exception {
        JSONParser parser = new JSONParser();
        String path = "";
        Object obj = parser.parse(new FileReader(path));
        JSONObject jsonObj = (JSONObject) obj;
        JSONObject jsonChildObj = (JSONObject) jsonObj.get(jsonObjects[0].trim());
        String value = (String) jsonChildObj.get(jsonObjects[1].trim());
        debugLogger().info(value);
        return value;

    }

    private static JSONArray parseJSON(String jsonLocation) throws Exception {
        JSONParser jsonParser = new JSONParser();
        return (JSONArray) jsonParser.parse(new FileReader(jsonLocation));
    }

    @SuppressWarnings("unchecked")
    private static HashMap<String, Object> convertCapsToHashMap(String capabilityName, String jsonLocation)
            throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(getCapability(capabilityName, jsonLocation).toString(), HashMap.class);
    }

    private static JSONObject getCapability(String capabilityName, String jsonLocation) throws Exception {
        System.out.println("cap " + capabilityName);
        JSONArray capabilitiesArray = parseJSON(jsonLocation);
        for (Object jsonObj : capabilitiesArray) {
            JSONObject capability = (JSONObject) jsonObj;
            if (capability.get("name").toString().equalsIgnoreCase(capabilityName)) {
                return (JSONObject) capability.get("caps");
            }
        }
        return null;
    }

    public static DesiredCapabilities getDesiredCapabilities(String capabilityName, String jsonPath) throws Exception {
        HashMap<String, Object> caps;
        try {
            caps = convertCapsToHashMap(capabilityName, jsonPath);
        } catch (Exception e) {
            throw new Exception("json key/value is mis-matching");
        }
        return new DesiredCapabilities(caps);

    }

    public static void getmap(String mode) throws Exception {
        DesiredCapabilities desiredCap;
        if (mode.equalsIgnoreCase("local")) {
            desiredCap = new DesiredCapabilities(PropUtlis.getDesiredCapabilities("local", IAutoConst.CAPS));
            System.out.println(desiredCap);
        }
        if (mode.equalsIgnoreCase("chrome")) {
            desiredCap = new DesiredCapabilities(PropUtlis.getDesiredCapabilities("chrome", IAutoConst.CAPS));
            System.out.println(desiredCap);

        }
    }


    public void propFile() {
        debugLogger().info("On PropUtlis");
    }

    public String readJson(String path, String... jsonObjects)
            throws IOException, ParseException {
        parser = new JSONParser();
        Object obj = parser.parse(new FileReader(path));
        JSONObject jsonObj = (JSONObject) obj;
        JSONObject jsonChildObj = (JSONObject) jsonObj.get(jsonObjects[0].trim());
        String value = (String) jsonChildObj.get(jsonObjects[1].trim());
        System.out.println(value);
        return value;
    }

    public String readJson(String path, String jsonObjects) throws IOException, ParseException {
        parser = new JSONParser();
        Object obj = parser.parse(new FileReader(path));
        JSONObject jsonObj = (JSONObject) obj;
        String value = (String) jsonObj.get(jsonObjects);
        System.out.println(value);
        return value;
    }
}
