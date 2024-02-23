package com.medicalInsurance.pojo;

public class DentalPlanUpdateRequest {
    
	private int planId;
    private double preventiveDeductibleDifference;
    private double basicDeductibleDifference;
    private double majorDeductibleDifference;
    private double orthoDeductibleDifference;
    private double otherDeductibleDifference;
    
    
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public double getPreventiveDeductibleDifference() {
		return preventiveDeductibleDifference;
	}
	public void setPreventiveDeductibleDifference(double preventiveDeductibleDifference) {
		this.preventiveDeductibleDifference = preventiveDeductibleDifference;
	}
	public double getBasicDeductibleDifference() {
		return basicDeductibleDifference;
	}
	public void setBasicDeductibleDifference(double basicDeductibleDifference) {
		this.basicDeductibleDifference = basicDeductibleDifference;
	}
	public double getMajorDeductibleDifference() {
		return majorDeductibleDifference;
	}
	public void setMajorDeductibleDifference(double majorDeductibleDifference) {
		this.majorDeductibleDifference = majorDeductibleDifference;
	}
	public double getOrthoDeductibleDifference() {
		return orthoDeductibleDifference;
	}
	public void setOrthoDeductibleDifference(double orthoDeductibleDifference) {
		this.orthoDeductibleDifference = orthoDeductibleDifference;
	}
	public double getOtherDeductibleDifference() {
		return otherDeductibleDifference;
	}
	public void setOtherDeductibleDifference(double otherDeductibleDifference) {
		this.otherDeductibleDifference = otherDeductibleDifference;
	}
    
	@Override
	public String toString() {
		return "DentalPlanUpdateRequest [planId=" + planId + ", preventiveDeductibleDifference="
				+ preventiveDeductibleDifference + ", basicDeductibleDifference=" + basicDeductibleDifference
				+ ", majorDeductibleDifference=" + majorDeductibleDifference + ", orthoDeductibleDifference="
				+ orthoDeductibleDifference + ", otherDeductibleDifference=" + otherDeductibleDifference + "]";
	}
}
