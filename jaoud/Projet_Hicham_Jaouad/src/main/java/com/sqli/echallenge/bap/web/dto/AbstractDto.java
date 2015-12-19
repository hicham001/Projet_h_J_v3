package com.sqli.echallenge.bap.web.dto;

import java.util.Date;


public abstract class AbstractDto {
	protected boolean deleted;
	protected Date creationDate;
	protected Date modifiedDate;
	
	
	public AbstractDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AbstractDto(boolean deleted, Date creationDate, Date modifiedDate) {
		super();
		this.deleted = deleted;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
