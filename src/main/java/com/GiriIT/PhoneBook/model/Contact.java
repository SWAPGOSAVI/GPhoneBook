package com.GiriIT.PhoneBook.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
@Id
	Integer contactId;
	String contactName;
	String contactNumber;
	String contactEmail;
	
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + "]";
	}
	

}
