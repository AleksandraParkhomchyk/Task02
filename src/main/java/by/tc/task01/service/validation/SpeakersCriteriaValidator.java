package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class SpeakersCriteriaValidator {
    public static boolean validate(Criteria criteria) {
        Map<String, Object> speakersParams = criteria.getCriteria();

        /*if (speakersParams.containsKey("POWER_CONSUMPTION")) {
            Integer powerConsumption = (Integer.parseInt(String.valueOf(speakersParams.get("POWER_CONSUMPTION"))));
            return (powerConsumption >= 15) && (powerConsumption <= 20);
        } else if (speakersParams.containsKey("NUMBER_OF_SPEAKERS")) {
            Integer numberOfSpeakers = (Integer.parseInt(String.valueOf(speakersParams.get("NUMBER_OF_SPEAKERS"))));
            return (numberOfSpeakers >= 2) && (numberOfSpeakers <= 4);
        } else if (speakersParams.containsKey("FREQUENCY_RANGE")) {
            String frequencyRange = (String) speakersParams.get("FREQUENCY_RANGE");
            return (frequencyRange.equals("2-4")) || (frequencyRange.equals("3-4")) || (frequencyRange.equals("2-3.5"));
        } else if (speakersParams.containsKey("CORD_LENGTH")) {
            Integer cordLength = (Integer.parseInt(String.valueOf(speakersParams.get("CORD_LENGTH"))));
            return (cordLength >= 2) && (cordLength <= 4);
        } else {
            return false;
        }*/
        return true;
    }
}
