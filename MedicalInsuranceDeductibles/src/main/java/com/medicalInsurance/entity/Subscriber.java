package com.medicalInsurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "subscriber")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscriber {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscriberId;
    
    @ManyToOne
    @JoinColumn(name = "plan_id", referencedColumnName = "planId")
    private DentalPlan dentalPlan;
    
    private String subscriberName;
    
    private double preventiveRemaining;
    private double basicRemaining;
    private double majorRemaining;
    private double orthoRemaining;
    private double otherRemaining;
    
    // Getters and setters
    
    public int getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}
	public DentalPlan getDentalPlan() {
		return dentalPlan;
	}
	public void setDentalPlan(DentalPlan dentalPlan) {
		this.dentalPlan = dentalPlan;
	}
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	public double getPreventiveRemaining() {
		return preventiveRemaining;
	}
	public void setPreventiveRemaining(double preventiveRemaining) {
		this.preventiveRemaining = preventiveRemaining;
	}
	public double getBasicRemaining() {
		return basicRemaining;
	}
	public void setBasicRemaining(double basicRemaining) {
		this.basicRemaining = basicRemaining;
	}
	public double getMajorRemaining() {
		return majorRemaining;
	}
	public void setMajorRemaining(double majorRemaining) {
		this.majorRemaining = majorRemaining;
	}
	public double getOrthoRemaining() {
		return orthoRemaining;
	}
	public void setOrthoRemaining(double orthoRemaining) {
		this.orthoRemaining = orthoRemaining;
	}
	public double getOtherRemaining() {
		return otherRemaining;
	}
	public void setOtherRemaining(double otherRemaining) {
		this.otherRemaining = otherRemaining;
	}
}
