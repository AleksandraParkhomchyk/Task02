package by.tc.task01.service;

import by.tc.task01.dao.DaoException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws DaoException, ServiceException;

}
