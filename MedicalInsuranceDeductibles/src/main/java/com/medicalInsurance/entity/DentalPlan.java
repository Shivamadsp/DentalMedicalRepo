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
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dental_plan")
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DentalPlan {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int planId;
    
    @ManyToOne
    @JoinColumn(name = "carrier_id", referencedColumnName = "carrierId")
    private Carrier carrier;
    
    private String planName;
    
    private double standardDeductible;
    private boolean preventiveFlag;
    private double preventiveDeductible;
    private boolean basicFlag;
    private double basicDeductible;
    private boolean majorFlag;
    private double majorDeductible;
    private boolean orthoFlag;
    private double orthoDeductible;
    private boolean otherFlag;
    private double otherDeductible;
    
    // Getters and setters
    
    @Override
	public String toString() {
		return "DentalPlan [planId=" + planId + ", carrier=" + carrier + ", planName=" + planName
				+ ", standardDeductible=" + standardDeductible + ", preventiveFlag=" + preventiveFlag
				+ ", preventiveDeductible=" + preventiveDeductible + ", basicFlag=" + basicFlag + ", basicDeductible="
				+ basicDeductible + ", majorFlag=" + majorFlag + ", majorDeductible=" + majorDeductible + ", orthoFlag="
				+ orthoFlag + ", orthoDeductible=" + orthoDeductible + ", otherFlag=" + otherFlag + ", otherDeductible="
				+ otherDeductible + "]";
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public Carrier getCarrier() {
		return carrier;
	}
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public double getStandardDeductible() {
		return standardDeductible;
	}
	public void setStandardDeductible(double standardDeductible) {
		this.standardDeductible = standardDeductible;
	}
	public boolean getPreventiveFlag() {
		return preventiveFlag;
	}
	public void setPreventiveFlag(boolean preventiveFlag) {
		this.preventiveFlag = preventiveFlag;
	}
	public double getPreventiveDeductible() {
		return preventiveDeductible;
	}
	public void setPreventiveDeductible(double preventiveDeductible) {
		this.preventiveDeductible = preventiveDeductible;
	}
	public boolean getBasicFlag() {
		return basicFlag;
	}
	public void setBasicFlag(boolean basicFlag) {
		this.basicFlag = basicFlag;
	}
	public double getBasicDeductible() {
		return basicDeductible;
	}
	public void setBasicDeductible(double basicDeductible) {
		this.basicDeductible = basicDeductible;
	}
	public boolean getMajorFlag() {
		return majorFlag;
	}
	public void setMajorFlag(boolean majorFlag) {
		this.majorFlag = majorFlag;
	}
	public double getMajorDeductible() {
		return majorDeductible;
	}
	public void setMajorDeductible(double majorDeductible) {
		this.majorDeductible = majorDeductible;
	}
	public boolean getOrthoFlag() {
		return orthoFlag;
	}
	public void setOrthoFlag(boolean orthoFlag) {
		this.orthoFlag = orthoFlag;
	}
	public double getOrthoDeductible() {
		return orthoDeductible;
	}
	public void setOrthoDeductible(double orthoDeductible) {
		this.orthoDeductible = orthoDeductible;
	}
	public boolean getOtherFlag() {
		return otherFlag;
	}
	public void setOtherFlag(boolean otherFlag) {
		this.otherFlag = otherFlag;
	}
	public double getOtherDeductible() {
		return otherDeductible;
	}
	public void setOtherDeductible(double otherDeductible) {
		this.otherDeductible = otherDeductible;
	}
    
}
