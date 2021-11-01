package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class VacuumCleanerCriteriaValidator {

    public static boolean validate(Criteria criteria) {
        Map<String, Object> vacuumCleanerParams = criteria.getCriteria();

        if (vacuumCleanerParams.containsKey("POWER_CONSUMPTION")) {
            int powerConsumption = (Integer.parseInt(String.valueOf(vacuumCleanerParams.get("POWER_CONSUMPTION"))));
            return (powerConsumption >= 90) && (powerConsumption <= 110);
        } else if (vacuumCleanerParams.containsKey("FILTER_TYPE")) {
            String filterType = (String) vacuumCleanerParams.get("FILTER_TYPE");
            return (filterType == "A") || (filterType == "B") || (filterType == "C");
        } else if (vacuumCleanerParams.containsKey("BAG_TYPE")) {
            String bagType = (String) vacuumCleanerParams.get("BAG_TYPE");
            return (bagType == "A2") || (bagType == "AA-89") || (bagType == "XX00");
        } else if (vacuumCleanerParams.containsKey("WAND_TYPE")) {
            String wandType = (String) vacuumCleanerParams.get("WAND_TYPE");
            return (wandType == "all-in-one");
        } else if (vacuumCleanerParams.containsKey("MOTOR_SPEED_REGULATION")) {
            int motorSpeedRegulation = (Integer.parseInt(String.valueOf(vacuumCleanerParams.get("MOTOR_SPEED_REGULATION"))));
            return (motorSpeedRegulation >= 2900) && (motorSpeedRegulation <= 3000);
        } else if (vacuumCleanerParams.containsKey("CLEANING_WIDTH")) {
            int cleaningWidth = (Integer.parseInt(String.valueOf(vacuumCleanerParams.get("CLEANING_WIDTH"))));
            return (cleaningWidth >= 20) && (cleaningWidth <= 30);
        } else {

            return false;
        }
    }
}
