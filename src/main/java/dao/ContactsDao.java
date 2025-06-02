package dao;

import java.util.List;
import model.Contact;

/**
 * DAO (Data Access Object) interface for managing contacts in the database.
 * 
 * This interface defines the CRUD operations for handling `Contact` entities.
 * Implementations of this interface interact with the database to store,
 * retrieve, update, and delete contact records.
 */
public interface ContactsDao {

	/**
	 * Adds a new contact to the database.
	 * 
	 * @param contact The contact to be added.
	 */
	void addContact(Contact contact);

	/**
	 * Retrieves a contact by its email address.
	 * 
	 * @param email The email of the contact.
	 * @return The contact matching the email, or `null` if not found.
	 */
	Contact getContactByEmail(String email);

	/**
	 * Retrieves a contact by its ID.
	 * 
	 * @param idContact The unique identifier of the contact.
	 * @return The contact matching the ID, or `null` if not found.
	 */
	Contact getContactById(int idContact);

	/**
	 * Deletes a contact from the database using its email.
	 * 
	 * @param email The email of the contact to be deleted.
	 */
	void deleteContactByEmail(String email);

	/**
	 * Deletes a contact from the database using its ID.
	 * 
	 * @param idContact The unique identifier of the contact to be deleted.
	 */
	void deleteContactById(int idContact);

	/**
	 * Retrieves all contacts from the database.
	 * 
	 * @return A list of all contacts.
	 */
	List<Contact> getAllContacts();

	/**
	 * Updates an existing contact in the database.
	 * 
	 * @param contact The contact with updated information.
	 */
	void updateContact(Contact contact);
}
