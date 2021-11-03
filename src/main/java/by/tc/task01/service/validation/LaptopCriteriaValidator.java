package by.tc.task01.service.validation;

import static by.tc.task01.service.validation.SearchCriteria.*;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;

/**
 * LaptopCriteriaValidator class
 */
public class LaptopCriteriaValidator {

    public static boolean validate(Criteria criteria) {
        Map<String, Object> laptopParams = criteria.getCriteria();
        Set<String> keysLaptopParams = laptopParams.keySet();

        for (String s : keysLaptopParams) {
            Laptop enumParamName = Laptop.valueOf(s);
            switch (enumParamName) {
                case BATTERY_CAPACITY:
                    Double batteryCapacity = (Double.parseDouble(String.valueOf(laptopParams.get("BATTERY_CAPACITY"))));
                    if (!(batteryCapacity >= 1) && (batteryCapacity <= 3)) {
                        return false;
                    }
                case OS:
                    String os = (String) laptopParams.get("OS");
                    if (!(os.equals("Windows")) || (os.equals("Linux"))) {
                        return false;
                    }
                case MEMORY_ROM:
                    Integer memoryRom = (Integer.parseInt(String.valueOf(laptopParams.get("MEMORY_ROM"))));
                    if (!(memoryRom >= 4000) && (memoryRom <= 8000)) {
                        return false;
                    }
                case SYSTEM_MEMORY:
                    Integer systemMemory = (Integer.parseInt(String.valueOf(laptopParams.get("SYSTEM_MEMORY"))));
                    if (!(systemMemory >= 1000) && (systemMemory <= 1500)) {
                        return false;
                    }
                case CPU:
                    Double cpu = (Double.parseDouble(String.valueOf(laptopParams.get("CPU"))));
                    if (!(cpu >= 1) && (cpu <= 3)) {
                        return false;
                    }
                case DISPLAY_INCHES:
                    Integer displayInches = (Integer.parseInt(String.valueOf(laptopParams.get("DISPLAY_INCHES"))));
                    if (!(displayInches >= 18) && (displayInches <= 22)) {
                        return false;
                    }
            }
        }
        return true;
    }
}
