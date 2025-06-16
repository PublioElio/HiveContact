package service;

import java.util.List;

import org.springframework.stereotype.Service;

import dao.ContactsDao;
import model.Contact;

/**
 * Implementation of the ContactsService interface. This class provides the
 * business logic for managing Contact entities using a data access object
 * (DAO).
 * 
 * @author AdrianoDíazBenítez
 */
@Service
public class ContactsServiceImp implements ContactsService {

	private final ContactsDao dao;

	/**
	 * Constructor that injects the DAO dependency.
	 * 
	 * @param dao Instance of ContactsDao for data access operations on Contact
	 *            entities.
	 */
	public ContactsServiceImp(ContactsDao dao) {
		this.dao = dao;
	}

	/**
	 * Adds a new contact if there is no existing contact with the same ID.
	 * 
	 * @param contact The contact to add.
	 * @return true if the contact was successfully added, false if it already
	 *         exists.
	 */
	@Override
	public boolean addContact(Contact contact) {
		if (dao.getContactById(contact.getIdContact()) == null) {
			dao.addContact(contact);
			return true;
		}
		return false;
	}

	/**
	 * Retrieves a list of all stored contacts.
	 * 
	 * @return List of contacts.
	 */
	@Override
	public List<Contact> getAllContacts() {
		return dao.getAllContacts();
	}

	/**
	 * Updates an existing contact if it is already stored in the database.
	 * 
	 * @param contact The contact with updated information.
	 */
	@Override
	public void updateContact(Contact contact) {
		if (dao.getContactById(contact.getIdContact()) != null) {
			dao.updateContact(contact);
		}
	}

	/**
	 * Deletes a contact by its ID if it exists in the database.
	 * 
	 * @param idContact The ID of the contact to delete.
	 * @return true if the contact was successfully deleted, false if it does not
	 *         exist.
	 */
	@Override
	public boolean deleteContact(int idContact) {
		if (dao.getContactById(idContact) != null) {
			dao.deleteContactById(idContact);
			return true;
		}
		return false;
	}

	/**
	 * Retrieves a contact by its ID if it exists in the database.
	 * 
	 * @param idContact The ID of the contact to retrieve.
	 * @return The contact found, or null if it does not exist.
	 */
	@Override
	public Contact getContact(int idContact) {
		return dao.getContactById(idContact);
	}

}
