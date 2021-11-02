package by.tc.task01.dao.utils;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.management.StringValueExp;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;


public class DocumentSaver {
    public static void saveApplianceInXML(Appliance appliance) throws ParserConfigurationException, TransformerException, IOException, NoSuchFieldException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element matchesTheRequest = document.createElement("matches-the-request");
        Element applianceFound = document.createElement("appliance");

        String applianceTypeName = appliance.getClass().getSimpleName();
        Element type = document.createElement("type");
        type.setTextContent(applianceTypeName);

        if (appliance instanceof Oven) {
            String powerConsumption = String.valueOf(((Oven) appliance).getPowerConsumption());
            Element powerConsumptionE = document.createElement("power-consumption");
            powerConsumptionE.setTextContent(powerConsumption);
            applianceFound.appendChild(powerConsumptionE);

            String weight = String.valueOf(((Oven) appliance).getWeight());
            Element weightE = document.createElement("weight");
            weightE.setTextContent(weight);
            applianceFound.appendChild(weightE);

            String capacity = String.valueOf(((Oven) appliance).getCapacity());
            Element capacityE = document.createElement("capacity");
            capacityE.setTextContent(capacity);
            applianceFound.appendChild(capacityE);

        }

        applianceFound.appendChild(type);
        matchesTheRequest.appendChild(applianceFound);
        document.appendChild(matchesTheRequest);


        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new FileWriter("E:\\Tr\\Task02\\src\\main\\resources\\results.xml"));

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);

    }
}

