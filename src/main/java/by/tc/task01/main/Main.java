package by.tc.task01.main;

import static by.tc.task01.service.validation.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import org.jdom2.JDOMException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException, JDOMException, ParserConfigurationException {
        List<Appliance> appliances;
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();
        //////////////////////////////////////////////////////////////////
        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1000);
        criteriaOven.add(Oven.WEIGHT.toString(), 10);
        criteriaOven.add(Oven.CAPACITY.toString(), 32);
        criteriaOven.add(Oven.DEPTH.toString(), 60);
        criteriaOven.add(Oven.HEIGHT.toString(), 45.5);
        criteriaOven.add(Oven.WIDTH.toString(), 59.5);
        appliances = service.find(criteriaOven);
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
        //////////////////////////////////////////////////////////////////

        /*Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY.toString(), 3);
        appliances = service.find(criteriaTabletPC);// find(Object...obj)
        PrintApplianceInfo.print(appliances);*/



        /*Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.WEIGHT.toString(), 10);
        criteriaOven.add(Oven.DEPTH.toString(), 60);
        criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1000);
        appliances = service.find(criteriaOven);
        PrintApplianceInfo.print(appliances);*/
        //////////////////////////////////////////////////////////////////
       /* Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
          //criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
        	criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        	//criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
        	appliances = service.find(criteriaTabletPC);// find(Object...obj)
        	PrintApplianceInfo.print(appliances);*/
    }

}
