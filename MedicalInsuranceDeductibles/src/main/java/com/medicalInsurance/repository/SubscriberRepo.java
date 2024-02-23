package com.medicalInsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalInsurance.entity.Subscriber;

@Repository
public interface SubscriberRepo extends JpaRepository<Subscriber, Integer>{

	List<Subscriber> findByDentalPlanPlanId(int planId);
}
