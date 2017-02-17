package com.xls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xls.dao.XLSDao;
import com.xls.domain.EmployeeDetails;
import com.xls.domain.ResultCalculation;

@Service
public class XLSServiceImpl implements XLSService {
	
	@Autowired
	private XLSDao xlsDao;

	@Override
	public List<ResultCalculation> getCalculationData(int year) {
		return xlsDao.getCalculationData(year);
	}

	@Override
	public boolean insertEmployeeDetails(EmployeeDetails employeeDetails) {
		return xlsDao.insertEmployeeDetails(employeeDetails);
	}

}
