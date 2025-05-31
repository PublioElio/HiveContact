package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the contacts database table.
 * 
 */
@Entity
@Table(name="contacts")
@NamedQuery(name="Contact.findAll", query="SELECT c FROM Contact c")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contact")
	private int idContact;

	@Column(name="contact_age")
	private int contactAge;

	@Column(name="contact_email")
	private String contactEmail;

	@Column(name="contact_name")
	private String contactName;

	public Contact() {
	}

	public int getIdContact() {
		return this.idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	public int getContactAge() {
		return this.contactAge;
	}

	public void setContactAge(int contactAge) {
		this.contactAge = contactAge;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

}