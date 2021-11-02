package by.tc.task01.service.validation;

import static by.tc.task01.service.validation.SearchCriteria.*;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;
import java.util.Set;

public class OvenCriteriaValidator {

    public static boolean validate(Criteria criteria) {
        Map<String, Object> ovenParams = criteria.getCriteria();
        Set<String> keysOvenParams = ovenParams.keySet();

        for (String s : keysOvenParams) {
            Oven enumParamName = Oven.valueOf(s);
            switch (enumParamName) {
                case POWER_CONSUMPTION:
                    Integer powerConsumption = (Integer.parseInt(String.valueOf(ovenParams.get("POWER_CONSUMPTION"))));
                    if (!(powerConsumption >= 1000) && (powerConsumption <= 2000)) {
                        return false;
                    }
                    break;
                case WEIGHT:
                    Integer weight = (Integer.parseInt(String.valueOf(ovenParams.get("WEIGHT"))));
                    if (!(weight >= 10) && (weight <= 12)) {
                        return false;
                    }
                    break;
                case CAPACITY:
                    Integer capacity = (Integer.parseInt(String.valueOf(ovenParams.get("CAPACITY"))));
                    if (!(capacity >= 32) && (capacity <= 33)) {
                        return false;
                    }
                    break;
                case DEPTH:
                    Integer depth = (Integer.parseInt(String.valueOf(ovenParams.get("DEPTH"))));
                    if (!(depth == 60)) {
                        return false;
                    }
                    break;
                case HEIGHT:
                    Double height = (Double.parseDouble(String.valueOf(ovenParams.get("HEIGHT"))));
                    if (!(height >= 40) && (height <= 45.5)) {
                        return false;
                    }
                    break;
                case WIDTH:
                    Double width = (Double.parseDouble(String.valueOf(ovenParams.get("WIDTH"))));
                    if (!(width >= 59.5) && (width <= 70)) {
                        return false;
                    }
            }
        }
        return true;
    }
}


