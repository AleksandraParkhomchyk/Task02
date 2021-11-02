package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class TabletPCCriteriaValidator {

    public static boolean validate(Criteria criteria) {
        Map<String, Object> tabletPCParams = criteria.getCriteria();

        /*if (tabletPCParams.containsKey("BATTERY_CAPACITY")) {
            Integer batteryCapacity = (Integer.parseInt(String.valueOf(tabletPCParams.get("BATTERY_CAPACITY"))));
            return (batteryCapacity >= 3) && (batteryCapacity <= 5);
        } else if (tabletPCParams.containsKey("DISPLAY_INCHES")) {
            Integer displayInches = (Integer.parseInt(String.valueOf(tabletPCParams.get("DISPLAY_INCHES"))));
            return (displayInches >= 14) && (displayInches <= 16);
        } else if (tabletPCParams.containsKey("MEMORY_ROM")) {
            Integer memoryRom = (Integer.parseInt(String.valueOf(tabletPCParams.get("MEMORY_ROM"))));
            return (memoryRom >= 8000) && (memoryRom <= 16000);
        } else if (tabletPCParams.containsKey("FLASH_MEMORY_CAPACITY")) {
            Integer flashMemoryCapacity = (Integer.parseInt(String.valueOf(tabletPCParams.get("FLASH_MEMORY_CAPACITY"))));
            return (flashMemoryCapacity >= 2) && (flashMemoryCapacity <= 8);
        } else if (tabletPCParams.containsKey("COLOR")) {
            String color = (String) tabletPCParams.get("COLOR");
            return (color.equals("BLUE")) || (color.equals("RED")) || (color.equals("GREEN"));
        } else {
            return false;
        }*/
        return true;
    }
}
