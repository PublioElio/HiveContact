package service;

import java.util.List;

import model.Contact;

/**
 * ContactsService interface defines the contract for managing Contact entities.
 * It provides methods to perform CRUD operations on contacts.
 */
public interface ContactsService {

	/**
	 * Adds a new contact to the system.
	 * 
	 * @param contact the Contact entity to be added
	 * @return true if the contact was successfully added, false otherwise
	 */
	boolean addContact(Contact contact);

	/**
	 * Retrieves all contacts.
	 * 
	 * @return a list of all Contact entities
	 */
	List<Contact> getAllContacts();

	/**
	 * Updates an existing contact's details.
	 * 
	 * @param contact the Contact entity with updated information
	 */
	void updateContact(Contact contact);

	/**
	 * Deletes a contact based on its unique identifier.
	 * 
	 * @param idContact the ID of the contact to be deleted
	 * @return true if the contact was successfully deleted, false otherwise
	 */
	boolean deleteContact(int idContact);

	/**
	 * Retrieves a contact by its unique identifier.
	 * 
	 * @param idContact the ID of the contact to retrieve
	 * @return the Contact entity if found, or null otherwise
	 */
	Contact getContact(int idContact);
}
