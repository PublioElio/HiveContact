package model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * Represents a contact entity stored in the database.
 * 
 * This class is mapped to the `contacts` table using JPA annotations. It
 * implements `Serializable` to allow instances to be serialized, which can be
 * useful in caching or distributed computing scenarios.
 * 
 * @author AdrianoDíazBenítez
 */
@Entity
@Table(name = "contacts")
@NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c") // Predefined query to retrieve all contacts
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L; // Version identifier for serialization

	/**
	 * Unique identifier for the contact. Automatically generated using `IDENTITY`,
	 * which means the value is assigned by the database with `AUTO_INCREMENT`.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contact")
	private int idContact;

	/**
	 * Age of the contact. Stored in the `contact_age` column in the database.
	 */
	@Column(name = "contact_age")
	private int age;

	/**
	 * Email address of the contact. Stored in the `contact_email` column. This
	 * field should ideally be unique in the database.
	 */
	@Column(name = "contact_email")
	private String email;

	/**
	 * Name of the contact. Stored in the `contact_name` column.
	 */
	@Column(name = "contact_name")
	private String name;

	/**
	 * Default constructor required by JPA.
	 */
	public Contact() {
	}

	/**
	 * Gets the contact ID.
	 * 
	 * @return The contact's unique identifier.
	 */
	public int getIdContact() {
		return this.idContact;
	}

	/**
	 * Sets the contact ID.
	 * 
	 * @param idContact The new contact ID.
	 */
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	/**
	 * Gets the contact's age.
	 * 
	 * @return The contact's age.
	 */
	public int getContactAge() {
		return this.age;
	}

	/**
	 * Sets the contact's age.
	 * 
	 * @param age The new age.
	 */
	public void setContactAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the contact's email address.
	 * 
	 * @return The contact's email.
	 */
	public String getContactEmail() {
		return this.email;
	}

	/**
	 * Sets the contact's email address.
	 * 
	 * @param email The new email address.
	 */
	public void setContactEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the contact's name.
	 * 
	 * @return The contact's name.
	 */
	public String getContactName() {
		return this.name;
	}

	/**
	 * Sets the contact's name.
	 * 
	 * @param name The new name.
	 */
	public void setContactName(String name) {
		this.name = name;
	}
}