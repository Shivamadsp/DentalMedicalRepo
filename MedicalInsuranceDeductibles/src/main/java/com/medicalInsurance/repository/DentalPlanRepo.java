package com.medicalInsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalInsurance.entity.DentalPlan;

@Repository
public interface DentalPlanRepo extends JpaRepository<DentalPlan, Integer>{

}
