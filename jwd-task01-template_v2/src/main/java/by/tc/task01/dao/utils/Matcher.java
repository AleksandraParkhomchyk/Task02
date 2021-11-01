package by.tc.task01.dao.utils;

import by.tc.task01.entity.criteria.Criteria;
import org.jdom2.JDOMException;

import java.io.IOException;
import java.util.*;

public class Matcher {
    public final static HashMap<String, String> matchListNew = fillInMatchingMap();

    public static String getXmlTagName(String key) {

        return matchListNew.get(key);
    }

    private static HashMap<String, String> fillInMatchingMap() {
        HashMap<String, String> matchList = new HashMap<>();
        matchList.put("POWER_CONSUMPTION", "power-consumption");
        matchList.put("WEIGHT", "weight");
        matchList.put("CAPACITY", "capacity");
        matchList.put("DEPTH", "depth");
        matchList.put("HEIGHT", "height");
        matchList.put("WIDTH", "width");

        matchList.put("BATTERY_CAPACITY", "batteryCapacity");
        matchList.put("OS", "os");
        matchList.put("MEMORY_ROM", "memory-rom");
        matchList.put("SYSTEM_MEMORY", "systemMemory");
        matchList.put("CPU", "cpu");
        matchList.put("DISPLAY_INCHES", "displayInches");

        matchList.put("FREEZER_CAPACITY", "freezerCapacity");
        matchList.put("OVERALL_CAPACITY", "overallCapacity");

        matchList.put("FILTER_TYPE", "filterType");
        matchList.put("BAG_TYPE", "bagTpe");
        matchList.put("WAND_TYPE", "wandType");
        matchList.put("MOTOR_SPEED_REGULATION", "motorSpeedRegulation");
        matchList.put("CLEANING_WIDTH", "cleaningWidth");

        matchList.put("FLASH_MEMORY_CAPACITY", "flash-memory-capacity");
        matchList.put("COLOR", "color");

        matchList.put("NUMBER_OF_SPEAKERS", "numberOfSpeakers");
        matchList.put("FREQUENCY_RANGE", "frequencyRange");
        matchList.put("CORD_LENGTH", "cordLength");

        return matchList;
    }

    public static Map<String, Object> matchingParams(Criteria criteria) throws IOException, JDOMException {

        Map<String, Object> params = criteria.getCriteria();
        Map<String, Object> newParams = new HashMap<>();
        Set<Map.Entry<String, Object>> set = params.entrySet();
        for (Map.Entry<String, Object> stringObjectEntry : set) {
            String key = stringObjectEntry.getKey();
            String newKey = Matcher.getXmlTagName(key);
            Object value = stringObjectEntry.getValue();
            newParams.put(newKey, value);
        }
        return newParams;
    }
}
