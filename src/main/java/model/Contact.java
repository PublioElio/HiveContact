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
	private int age;

	@Column(name="contact_email")
	private String email;

	@Column(name="contact_name")
	private String name;

	public Contact() {
	}

	public int getIdContact() {
		return this.idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	public int getContactAge() {
		return this.age;
	}

	public void setContactAge(int age) {
		this.age = age;
	}

	public String getContactEmail() {
		return this.email;
	}

	public void setContactEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return this.name;
	}

	public void setContactName(String name) {
		this.name = name;
	}

}