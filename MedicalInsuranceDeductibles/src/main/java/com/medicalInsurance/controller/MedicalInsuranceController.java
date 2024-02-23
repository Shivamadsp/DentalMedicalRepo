package com.medicalInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicalInsurance.entity.DentalPlan;
import com.medicalInsurance.service.DentalPlanService;

@RestController
@RequestMapping("/dental-plan")
public class MedicalInsuranceController {
  
	@Autowired
	private DentalPlanService dentalPlanService;
	    
	@PutMapping
	public String updateDeductible(@RequestBody DentalPlan dentalPlan)
	{
		if(dentalPlan!=null)
		{
			dentalPlanService.updateDeductibleService(dentalPlan);
			return "Plan gets updated successfully";
		}
		
		return "Plan does not exis";
	}
	
}
