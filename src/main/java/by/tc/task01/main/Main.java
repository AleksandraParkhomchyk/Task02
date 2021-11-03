package by.tc.task01.main;

import static by.tc.task01.service.validation.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import org.jdom2.JDOMException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException, JDOMException, ParserConfigurationException, TransformerException, NoSuchFieldException, IllegalAccessException {
        List<Appliance> appliances;
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////
        /*Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1000);
        criteriaOven.add(Oven.WEIGHT.toString(), 10);
        criteriaOven.add(Oven.CAPACITY.toString(), 33);
        criteriaOven.add(Oven.DEPTH.toString(), 60);
        criteriaOven.add(Oven.HEIGHT.toString(), 45.5);
        criteriaOven.add(Oven.WIDTH.toString(), 59.5);
        appliances = service.find(criteriaOven);
        PrintApplianceInfo.print(appliances);*/


        //////////////////////////////////////////////////////////////////
        Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
        criteriaLaptop.add(Laptop.BATTERY_CAPACITY.toString(), 1.0);
        criteriaLaptop.add(Laptop.OS.toString(), "Windows");
        criteriaLaptop.add(Laptop.MEMORY_ROM.toString(), 4000);
        criteriaLaptop.add(Laptop.SYSTEM_MEMORY.toString(), 1000);
        criteriaLaptop.add(Laptop.CPU.toString(), 1.2);
        criteriaLaptop.add(Laptop.DISPLAY_INCHES.toString(), 18);
        appliances = service.find(criteriaLaptop);
        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////
        Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
        criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION.toString(), 100);
        criteriaRefrigerator.add(Refrigerator.WEIGHT.toString(), 20);
        criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY.toString(), 10);
        criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY.toString(), 300.0);
        criteriaRefrigerator.add(Refrigerator.HEIGHT.toString(), 200);
        criteriaRefrigerator.add(Refrigerator.WIDTH.toString(), 70);
        appliances = service.find(criteriaRefrigerator);// find(Object...obj)
        PrintApplianceInfo.print(appliances);

        /*//////////////////////////////////////////////////////////////////
        Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());
        criteriaSpeakers.add(Speakers.POWER_CONSUMPTION.toString(), 15);
        criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS.toString(), 2);
        criteriaSpeakers.add(Speakers.FREQUENCY_RANGE.toString(), "2-4");
        criteriaSpeakers.add(Speakers.CORD_LENGTH.toString(), 2);
        appliances = service.find(criteriaSpeakers);
        PrintApplianceInfo.print(appliances);*/

       //////////////////////////////////////////////////////////////////
        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY.toString(), 3);
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
        criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY.toString(), 2);
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
        appliances = service.find(criteriaTabletPC);
        PrintApplianceInfo.print(appliances);


         //////////////////////////////////////////////////////////////////
        Criteria criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
        criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION.toString(), 100);
        criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), 3000);
        criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH.toString(), 20);
        criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE.toString(), "A");
        criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE.toString(), "A2");
        criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE.toString(), "all-in-one");
        appliances = service.find(criteriaVacuumCleaner);
        PrintApplianceInfo.print(appliances);

        }
}
