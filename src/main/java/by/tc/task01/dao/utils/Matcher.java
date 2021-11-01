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

        matchList.put("BATTERY_CAPACITY", "battery-capacity");
        matchList.put("OS", "os");
        matchList.put("MEMORY_ROM", "memory-rom");
        matchList.put("SYSTEM_MEMORY", "system-memory");
        matchList.put("CPU", "cpu");
        matchList.put("DISPLAY_INCHES", "display-inches");

        matchList.put("FREEZER_CAPACITY", "freezer-capacity");
        matchList.put("OVERALL_CAPACITY", "overall-capacity");

        matchList.put("FILTER_TYPE", "filter-type");
        matchList.put("BAG_TYPE", "bag-type");
        matchList.put("WAND_TYPE", "wand-type");
        matchList.put("MOTOR_SPEED_REGULATION", "motor-speed-regulation");
        matchList.put("CLEANING_WIDTH", "cleaning-width");

        matchList.put("FLASH_MEMORY_CAPACITY", "flash-memory-capacity");
        matchList.put("COLOR", "color");

        matchList.put("NUMBER_OF_SPEAKERS", "number-of-speakers");
        matchList.put("FREQUENCY_RANGE", "frequency-range");
        matchList.put("CORD_LENGTH", "cord-length");

        return matchList;
    }

    public static Map<String, Object> matchingParams(Criteria criteria) throws IOException, JDOMException {

        Map<String, Object> params = criteria.getCriteria();
        Map<String, Object> newParams = new HashMap<>();
        String type = criteria.getGroupSearchName();

        Set<String> keysFromParams = params.keySet();
        for (String s : keysFromParams) {
            String newKey = Matcher.getXmlTagName(s);
            Object value = params.get(s);
            newParams.put(newKey, value);
        }

        newParams.put("type", type);
        return newParams;
    }
}
