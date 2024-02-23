package com.medicalInsurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalInsurance.entity.Subscriber;
import com.medicalInsurance.pojo.DentalPlanUpdateRequest;
import com.medicalInsurance.repository.SubscriberRepo;

@Service
public class SubscriberService {
	
	@Autowired
	SubscriberRepo subscriberRepo;

	public void updateSubscribers(Integer dentalPlanId, DentalPlanUpdateRequest planDiff) {
		List<Subscriber> subscribersList = subscriberRepo.findByDentalPlanPlanId(dentalPlanId);
		
		for(Subscriber subscriber: subscribersList)
		{
			double updatedValue = subscriber.getBasicRemaining() + planDiff.getBasicDeductibleDifference();
			subscriber.setBasicRemaining(updatedValue<0 ? 0: updatedValue);
			
			updatedValue = subscriber.getMajorRemaining() + planDiff.getMajorDeductibleDifference();
			subscriber.setMajorRemaining(updatedValue<0 ? 0: updatedValue);
			
			updatedValue = subscriber.getPreventiveRemaining() + planDiff.getPreventiveDeductibleDifference();
			subscriber.setPreventiveRemaining(updatedValue<0 ? 0: updatedValue);
			
			updatedValue = subscriber.getOrthoRemaining() + planDiff.getOrthoDeductibleDifference();
			subscriber.setOrthoRemaining(updatedValue<0 ? 0: updatedValue);
			
			updatedValue = subscriber.getOtherRemaining() + planDiff.getOtherDeductibleDifference();
			subscriber.setOtherRemaining(updatedValue<0 ? 0: updatedValue);
			
		}
		
		subscriberRepo.saveAll(subscribersList);
	}

}
