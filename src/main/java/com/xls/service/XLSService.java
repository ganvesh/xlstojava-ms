package com.xls.service;

import java.util.List;
import com.xls.domain.EmployeeDetails;
import com.xls.domain.ResultCalculation;

public interface XLSService {
	
	public List<ResultCalculation> getCalculationData(int year);
	
	public boolean insertEmployeeDetails(EmployeeDetails employeeDetails);
	
}
