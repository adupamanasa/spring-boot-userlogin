package com.nrg.rest.model;

public class MessageResponse {
	
	public String returnMessage;

	public String getSuccessMessage() {
		return returnMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.returnMessage = successMessage;
	}

	public MessageResponse(String successMessage) {
		super();
		this.returnMessage = successMessage;
	}

}
