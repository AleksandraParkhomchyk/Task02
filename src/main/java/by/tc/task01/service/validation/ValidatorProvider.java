package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

/**
 * ValidatorProvider class
 */
public final class ValidatorProvider {

    /**
     * @param criteria
     * @return returns true if criteria valid. Otherwise, returns false
     */
    public static boolean criteriaValidator(Criteria criteria) {
        String currentGroupSearchName = criteria.getGroupSearchName();

        if (currentGroupSearchName.equals("Oven")) {
            return OvenCriteriaValidator.validate(criteria);
        } else if (currentGroupSearchName.equals("Laptop")) {
            return LaptopCriteriaValidator.validate(criteria);
        } else if (currentGroupSearchName.equals("Refrigerator")) {
            return RefrigeratorCriteriaValidator.validate(criteria);
        } else if (currentGroupSearchName.equals("VacuumCleaner")) {
            return VacuumCleanerCriteriaValidator.validate(criteria);
        } else if (currentGroupSearchName.equals("TabletPC")) {
            return TabletPCCriteriaValidator.validate(criteria);
        } else if (currentGroupSearchName.equals("Speakers")) {
            return SpeakersCriteriaValidator.validate(criteria);
        } else {
            return ValidatorNoType.validate();
        }
    }
}

