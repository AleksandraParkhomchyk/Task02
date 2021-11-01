package by.tc.task01.dao.utils;

import by.tc.task01.entity.*;
import org.jdom2.Element;
import org.jdom2.JDOMException;

import java.io.IOException;

public class ApplianceFactory {

    public static Appliance createAppliance(Element applianceElement) throws IOException, JDOMException {

        String type = applianceElement.getChildText("type");

        if (type.equals("Laptop")) {

            Integer id = Integer.parseInt(applianceElement.getAttributeValue("id"));
            Double batteryCapacity = Double.parseDouble(applianceElement.getChildText("battery-capacity"));
            Integer memoryRom = Integer.parseInt(applianceElement.getChildText("memory-rom"));
            Integer systemMemory = Integer.parseInt(applianceElement.getChildText("system-memory"));
            Integer displayInches = Integer.parseInt(applianceElement.getChildText("display-inches"));
            String OS = applianceElement.getChildText("os");
            Double cpu = Double.parseDouble(applianceElement.getChildText("cpu"));
            Laptop laptop = new Laptop(id, batteryCapacity, memoryRom, systemMemory, displayInches, OS, cpu);

            return laptop;

        } else if (type.equals("Oven")) {

            Integer id = Integer.parseInt(applianceElement.getAttributeValue("id"));
            Integer powerConsumption = Integer.parseInt(applianceElement.getChildText("power-consumption"));
            Integer weight = Integer.parseInt(applianceElement.getChildText("weight"));
            Integer capacity = Integer.parseInt(applianceElement.getChildText("capacity"));
            Integer depth = Integer.parseInt(applianceElement.getChildText("depth"));
            Double height = Double.parseDouble(applianceElement.getChildText("height"));
            Double width = Double.parseDouble(applianceElement.getChildText("width"));
            Oven oven = new Oven(id, powerConsumption, weight, capacity, depth, height, width);

            return oven;

        } else if (type.equals("Refrigerator")) {

            Integer id = Integer.parseInt(applianceElement.getAttributeValue("id"));
            Integer powerConsumption = Integer.parseInt(applianceElement.getChildText("power-consumption"));
            Integer weight = Integer.parseInt(applianceElement.getChildText("weight"));
            Integer freezerCapacity = Integer.parseInt(applianceElement.getChildText("freezer-capacity"));
            Integer height = Integer.parseInt(applianceElement.getChildText("height"));
            Integer width = Integer.parseInt(applianceElement.getChildText("width"));
            Double overallCapacity = Double.parseDouble(applianceElement.getChildText("overall-capacity"));
            Refrigerator refrigerator = new Refrigerator(id, powerConsumption, weight, freezerCapacity, height, width, overallCapacity);

            return refrigerator;

        } else if (type.equals("VacuumCleaner")) {

            Integer id = Integer.parseInt(applianceElement.getAttributeValue("id"));
            Integer powerConsumption = Integer.parseInt(applianceElement.getChildText("power-consumption"));
            Integer motorSpeedRegulation = Integer.parseInt(applianceElement.getChildText("motor-speed-regulation"));
            Integer cleaningWidth = Integer.parseInt(applianceElement.getChildText("cleaning-width"));
            String filterType = applianceElement.getChildText("filter-type");
            String bagType = applianceElement.getChildText("bag-type");
            String wandType = applianceElement.getChildText("wand-type");
            VacuumCleaner vacuumCleaner = new VacuumCleaner(id, powerConsumption, motorSpeedRegulation, cleaningWidth, filterType, bagType, wandType);

            return vacuumCleaner;

        } else if (type.equals("TabletPC")) {

            Integer id = Integer.parseInt(applianceElement.getAttributeValue("id"));
            Integer batteryCapacity = Integer.parseInt(applianceElement.getChildText("battery-capacity"));
            Integer displayInches = Integer.parseInt(applianceElement.getChildText("display-inches"));
            Integer memoryRom = Integer.parseInt(applianceElement.getChildText("memory-rom"));
            Integer flashMemoryCapacity = Integer.parseInt(applianceElement.getChildText("flash-memory-capacity"));
            String color = applianceElement.getChildText("color");
            TabletPC tabletPC = new TabletPC(id, batteryCapacity, memoryRom, flashMemoryCapacity, displayInches, color);

            return tabletPC;

        } else if (type.equals("Speakers")) {

            Integer id = Integer.parseInt(applianceElement.getAttributeValue("id"));
            Integer powerConsumption = Integer.parseInt(applianceElement.getChildText("power-consumption"));
            Integer numberOfSpeakers = Integer.parseInt(applianceElement.getChildText("number-of-speakers"));
            Integer cordLength = Integer.parseInt(applianceElement.getChildText("cord-length"));
            String frequencyRange = applianceElement.getChildText("frequency-range");
            Speakers speakers = new Speakers(id, powerConsumption, numberOfSpeakers, cordLength, frequencyRange);

            return speakers;
        }
        return null;
    }
}




