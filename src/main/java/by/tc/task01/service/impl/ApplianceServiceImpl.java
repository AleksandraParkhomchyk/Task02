package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.utils.DocumentSaver;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.main.PrintApplianceInfo;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.BaseValidator;
import org.jdom2.JDOMException;

import javax.print.Doc;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	/**
	 * this method find appliances with valid params
	 * @param criteria
	 * @return
	 * @throws IOException
	 * @throws JDOMException
	 */
	@Override
	public List<Appliance> find(Criteria criteria) throws IOException, JDOMException, ParserConfigurationException, TransformerException, NoSuchFieldException, IllegalAccessException {
		if (!BaseValidator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);

		DocumentSaver.saveDoc(appliance);

		return appliance;
	}
}
