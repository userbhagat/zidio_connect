package com.zidioRecruiter.RecruiterService.DTO;

public class ApplicationStatusUpdateRequest {

	private Long applicationId;
	private String status;
	
	public Long getApplicationId() {
		return applicationId;
	}
	
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
