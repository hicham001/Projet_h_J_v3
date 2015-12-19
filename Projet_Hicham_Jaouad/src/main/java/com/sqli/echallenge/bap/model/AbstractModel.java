package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;


@MappedSuperclass	
public abstract class AbstractModel implements Serializable {
	private static final long serialVersionUID = 2441143639225181443L;
	@Column(name="DELETED")
	protected boolean deleted;
	
	@Column(name="CREATION_DATE", 
			insertable=true, updatable=false)
	protected Date creationDate;
	
	@Column(name = "MODIFIED_DATE", insertable = false, updatable = true)
	protected Date modifiedDate;
	
	@PrePersist
	void onCreate() {
	    this.setCreationDate(new Timestamp((new Date()).getTime()));
	}
	@PreUpdate
	void onPersist() {
	    this.setModifiedDate(new Timestamp((new Date()).getTime()));
	}
	

	public AbstractModel() {
		super();
	}
	
	public AbstractModel(boolean deleted, Date creationDate, Date modifiedDate) {
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
