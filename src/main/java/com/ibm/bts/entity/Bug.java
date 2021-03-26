package com.ibm.bts.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Bug {
	@Id
	private String id;
	private String description;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		if (status == null) {
			throw new IllegalArgumentException("Status cannot be blanck");
		}
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
