package by.tc.task01.dao.utils;

import by.tc.task01.entity.Appliance;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
import java.lang.reflect.Field;
import java.util.List;

public class DocumentSaver {

    public static void saveDoc(List<Appliance> appliances) throws ParserConfigurationException, IOException, NoSuchFieldException, TransformerException, IllegalAccessException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element matchesTheRequest = document.createElement("matches-the-request");

        for (Appliance appliance : appliances) {
        paramsReadAndWrite(appliance, document, matchesTheRequest);

        }
        document.appendChild(matchesTheRequest);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new FileWriter("E:\\Tr\\Task02\\src\\main\\resources\\results.xml"));

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);

    }

    private static void paramsReadAndWrite(Appliance appliance, Document document, Element matchesTheRequest) throws NoSuchFieldException, IllegalAccessException {
        Element applianceFound = document.createElement("appliance");

        String applianceTypeName = appliance.getClass().getSimpleName();
        Element type = document.createElement("type");
        type.setTextContent(applianceTypeName);

        Class<? extends Appliance> className = appliance.getClass();
        Field[] declaredFields = className.getDeclaredFields();

        for (Field field : declaredFields) {

            String fieldName = (field.getName());
            Element param = document.createElement(fieldName);

            Field currentField = className.getDeclaredField(fieldName);
            currentField.setAccessible(true);
            Object memoryRomValue = currentField.get(appliance);

            param.setTextContent(memoryRomValue.toString());
            applianceFound.appendChild(param);
            matchesTheRequest.appendChild(applianceFound);

        }

        applianceFound.appendChild(type);

    }
}

