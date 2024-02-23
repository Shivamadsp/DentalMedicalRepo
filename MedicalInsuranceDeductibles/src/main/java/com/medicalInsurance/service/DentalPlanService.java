package com.medicalInsurance.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalInsurance.entity.DentalPlan;
import com.medicalInsurance.pojo.DentalPlanUpdateRequest;
import com.medicalInsurance.repository.DentalPlanRepo;

@Service
public class DentalPlanService {
	
	@Autowired
	DentalPlanRepo dentalPlanRepo;
	
	@Autowired
	SubscriberService subscriberService;

	public void updateDeductibleService(DentalPlan dentalPlanRequest) {
		Integer dentalPlanId = dentalPlanRequest.getPlanId();
		
		if(dentalPlanId != null)
		{
			Optional<DentalPlan> dentalPlanFromDbOptional = dentalPlanRepo.findById(dentalPlanId);
			
			if(dentalPlanFromDbOptional.isPresent())
			{
				//We need to make sure all the fields are present and have proper values
				
					
				//Creating the DentalPlanUpdateRequest object
				/*
				 * All checks and validations will be implemented here only and only addition will take place in Subscriber class
				 * If flag is false and standard deductible is not modifies then no need to update those fields 
				 * and in JSON also those field values should be same as standard
				 */
				DentalPlanUpdateRequest planDiff = new DentalPlanUpdateRequest();
				DentalPlan dentalPlanDb = dentalPlanFromDbOptional.get();
				planDiff.setPlanId(dentalPlanId);
				planDiff.setBasicDeductibleDifference(dentalPlanRequest.getBasicDeductible() - dentalPlanDb.getBasicDeductible());
				planDiff.setMajorDeductibleDifference(dentalPlanRequest.getMajorDeductible() - dentalPlanDb.getMajorDeductible());
				planDiff.setOrthoDeductibleDifference(dentalPlanRequest.getOrthoDeductible() - dentalPlanDb.getOrthoDeductible());
				planDiff.setOtherDeductibleDifference(dentalPlanRequest.getOtherDeductible() - dentalPlanDb.getOtherDeductible());
				planDiff.setPreventiveDeductibleDifference(dentalPlanRequest.getPreventiveDeductible() - dentalPlanDb.getPreventiveDeductible());
				System.out.println(planDiff);
				
				
				//Update the db dental plan db object with the dental plan request
				dentalPlanDb.setBasicDeductible(dentalPlanRequest.getBasicDeductible());
				dentalPlanDb.setBasicFlag(dentalPlanRequest.getBasicFlag());
				dentalPlanDb.setMajorDeductible(dentalPlanRequest.getMajorDeductible());
				dentalPlanDb.setMajorFlag(dentalPlanRequest.getMajorFlag());
				dentalPlanDb.setPreventiveDeductible(dentalPlanRequest.getPreventiveDeductible());
				dentalPlanDb.setPreventiveFlag(dentalPlanRequest.getPreventiveFlag());
				dentalPlanDb.setOrthoDeductible(dentalPlanRequest.getOrthoDeductible());
				dentalPlanDb.setOrthoFlag(dentalPlanRequest.getOrthoFlag());
				dentalPlanDb.setOtherDeductible(dentalPlanRequest.getOtherDeductible());
				dentalPlanDb.setOtherFlag(dentalPlanRequest.getOtherFlag());
				
				
				//Updating the Dental plan table
				dentalPlanRepo.save(dentalPlanDb);
				
				//Call the subscriber service class with the DentalPlanUpdateRequest object to update subscribers
				subscriberService.updateSubscribers(dentalPlanId, planDiff);
				
			}
			
		}
		
	}

}
