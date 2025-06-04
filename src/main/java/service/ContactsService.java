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

	List<Contact> getAllContacts();

	void updateContact(Contact contact);

	boolean deleteContact(int idContact);

	Contact getContact(int idContact);
}
