package com.xls.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xls.domain.EmployeeDetails;
import com.xls.domain.ResultCalculation;
import com.xls.service.XLSService;

@Controller
public class XLSController {
	
	@Autowired
	private XLSService xlsService;
	
	@ResponseBody
	@RequestMapping(value="/getResultCalculation",  method= RequestMethod.POST)
	public List<ResultCalculation> getCalculationData(@RequestParam int year){
		return xlsService.getCalculationData(year);
	}
	
	@ResponseBody
	@RequestMapping(value="/insertEmpDetails",  method= RequestMethod.POST)
	public boolean insertEmpDetails(@RequestBody EmployeeDetails empDetails){
		return xlsService.insertEmployeeDetails(empDetails);
	}

}
