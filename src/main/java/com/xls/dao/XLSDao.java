package com.xls.dao;

import java.util.List;

import com.xls.domain.EmployeeDetails;
import com.xls.domain.ResultCalculation;

public interface XLSDao {
	
	public List<ResultCalculation> getCalculationData(int year);
	
	public boolean insertEmployeeDetails(EmployeeDetails employeeDetails);
}
