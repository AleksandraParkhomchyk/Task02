package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import org.jdom2.JDOMException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public interface ApplianceService {
	/**
	 * что нибудь поменялось
	 * @param criteria
	 * @return List of appliances with valid params
	 * @throws IOException
	 * @throws JDOMException
	 */
	List<Appliance> find(Criteria criteria) throws IOException, JDOMException, ParserConfigurationException, TransformerException, NoSuchFieldException, IllegalAccessException;
	
}
