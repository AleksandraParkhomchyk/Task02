package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.utils.ApplianceStoreCatalogWithParams;
import by.tc.task01.dao.utils.Matcher;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.dao.utils.ApplianceFactory;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.IOException;
import java.util.*;


public class ApplianceDAOImpl implements ApplianceDAO {
    @Override
    public List<Appliance> find(Criteria criteria) throws IOException, JDOMException {
        List<Appliance> resultList = new ArrayList<>();
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
        return resultList;
    }

    private Appliance getApplianceIfMatch(Map<String, Object> expectedCriteriaParams, Element appliancesElement) throws IOException, JDOMException {
        Map<String, Object> elementParams = ApplianceStoreCatalogWithParams.createFullDescription(appliancesElement);

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


