package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class RefrigeratorCriteriaValidator {

    public static boolean validate(Criteria criteria) {
        Map<String, Object> refrigeratorParams = criteria.getCriteria();

        /*if (refrigeratorParams.containsKey("POWER_CONSUMPTION")) {
            Integer powerConsumption = (Integer.parseInt(String.valueOf(refrigeratorParams.get("POWER_CONSUMPTION"))));
            return (powerConsumption >= 100) && (powerConsumption <= 200);
        } else if (refrigeratorParams.containsKey("WEIGHT")) {
            Integer weight = (Integer.parseInt(String.valueOf(refrigeratorParams.get("WEIGHT"))));
            return (weight >= 20) && (weight <= 35);
        } else if (refrigeratorParams.containsKey("FREEZER_CAPACITY")) {
            Integer freezerCapacity = (Integer.parseInt(String.valueOf(refrigeratorParams.get("FREEZER_CAPACITY"))));
            return (freezerCapacity >= 10) && (freezerCapacity <= 20);
        } else if (refrigeratorParams.containsKey("OVERALL_CAPACITY")) {
            Double overallCapacity = (Double.parseDouble(String.valueOf(refrigeratorParams.get("OVERALL_CAPACITY"))));
            return (overallCapacity >= 300) && (overallCapacity <= 350.5);
        } else if (refrigeratorParams.containsKey("HEIGHT")) {
            Integer height = (Integer.parseInt(String.valueOf(refrigeratorParams.get("HEIGHT"))));
            return (height >= 180) && (height <= 250);
        } else if (refrigeratorParams.containsKey("WIDTH")) {
            Integer width = (Integer.parseInt(String.valueOf(refrigeratorParams.get("WIDTH"))));
            return (width >= 70) && (width <= 80);
        } else {
            return false;*/
        // }
        return true;
    }
}
