package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class LaptopCriteriaValidator {

    public static boolean validate(Criteria criteria) {
        Map<String, Object> laptopParams = criteria.getCriteria();

        if (laptopParams.containsKey("BATTERY_CAPACITY")) {
            double batteryCapacity = (Double.parseDouble(String.valueOf(laptopParams.get("BATTERY_CAPACITY"))));
            return (batteryCapacity >= 1) && (batteryCapacity <= 3);
        } else if (laptopParams.containsKey("OS")) {
            String os = (String) laptopParams.get("OS");
            return (os == "Windows") || (os == "Linux");
        } else if (laptopParams.containsKey("MEMORY_ROM")) {
            int memoryRom = (Integer.parseInt(String.valueOf(laptopParams.get("MEMORY_ROM"))));
            return (memoryRom >= 4000) && (memoryRom <= 8000);
        } else if (laptopParams.containsKey("SYSTEM_MEMORY")) {
            int systemMemory = (Integer.parseInt(String.valueOf(laptopParams.get("SYSTEM_MEMORY"))));
            return (systemMemory >= 1000) && (systemMemory <= 1500);
        } else if (laptopParams.containsKey("CPU")) {
            double cpu = (Double.parseDouble(String.valueOf(laptopParams.get("CPU"))));
            return (cpu >= 1) && (cpu <= 3);
        } else if (laptopParams.containsKey("DISPLAY_INCHES")) {
            int displayInches = (Integer.parseInt(String.valueOf(laptopParams.get("DISPLAY_INCHES"))));
            return (displayInches >= 18) && (displayInches <= 22);
        } else {
            return false;
        }
    }
}
