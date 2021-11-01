package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class OvenCriteriaValidator {
    //todo:validate all
    public static boolean validate(Criteria criteria) {
        Map<String, Object> ovenParams = criteria.getCriteria();

        if (ovenParams.containsKey("POWER_CONSUMPTION")) {
            Integer powerConsumption = (Integer.parseInt(String.valueOf(ovenParams.get("POWER_CONSUMPTION"))));
            return (powerConsumption >= 1000) && (powerConsumption <= 2000);
        } else if (ovenParams.containsKey("WEIGHT")) {
            Integer weight = (Integer.parseInt(String.valueOf(ovenParams.get("WEIGHT"))));
            return (weight >= 10) && (weight <= 12);
        } else if (ovenParams.containsKey("CAPACITY")) {
            Integer capacity = (Integer.parseInt(String.valueOf(ovenParams.get("CAPACITY"))));
            return (capacity >= 32) && (capacity <= 33);
        } else if (ovenParams.containsKey("DEPTH")) {
            Integer depth = (Integer.parseInt(String.valueOf(ovenParams.get("DEPTH"))));
            return (depth == 60);
        } else if (ovenParams.containsKey("HEIGHT")) {
            Double height = (Double.parseDouble(String.valueOf(ovenParams.get("HEIGHT"))));
            return (height >= 40) && (height <= 45.5);
        } else if (ovenParams.containsKey("WIDTH")) {
            Double width = (Double.parseDouble(String.valueOf(ovenParams.get("WIDTH"))));
            return (width >= 59.5) && (width <= 70);
        } else {
            return false;
        }
    }
}

