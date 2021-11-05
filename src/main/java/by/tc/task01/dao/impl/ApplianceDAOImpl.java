package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DaoException;
import by.tc.task01.dao.utils.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.IOException;
import java.util.*;

/**
 * ApplianceDAOImpl class
 * Implements {@link ApplianceDAO}
 *
 */

public class ApplianceDAOImpl implements ApplianceDAO {
    /**
     * Creates list of suitable appliances
     *
     * @return list of suitable appliances
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        List<Appliance> resultList = new ArrayList<>();
        try {

            Map<String, Object> expectedParams = Matcher.matchingParams(criteria);

            SAXBuilder builder = new SAXBuilder();
            Document document = builder.build("E:\\Tr\\Task02\\src\\main\\resources\\dataset.xml");

            Element root = document.getRootElement();
            List<Element> appliances = root.getChildren("appliance");
            Iterator<Element> appliancesIterator = appliances.iterator();

            while (appliancesIterator.hasNext()) {
                Element appliancesElement = appliancesIterator.next();
                Appliance appliance = getApplianceIfMatch(expectedParams, appliancesElement);

                if (appliance != null) {
                    resultList.add(appliance);
                }
            }
        } catch (IOException | JDOMException e) {
            throw new DaoException(e);
        }
        return resultList;
    }

    private Appliance getApplianceIfMatch(Map<String, Object> expectedCriteriaParams, Element appliancesElement) {

        Map<String, Object> elementParams = ApplianceWithDescription.createFullDescription(appliancesElement);

        Set<String> keysExpected = expectedCriteriaParams.keySet();
        for (String s : keysExpected) {
            Object expectedValue = expectedCriteriaParams.get(s);
            Object currentElementValue = elementParams.get(s);

            if (!expectedValue.equals(currentElementValue)) {
                return null;
            }
        }
        Appliance appliance = ApplianceFactory.createAppliance(appliancesElement);

        return appliance;

    }
}


