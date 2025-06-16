package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.Contact;

/**
 * Implementation of the ContactsDao interface, managing database operations for
 * contacts.
 * 
 * @author AdrianoDíazBenítez
 */
@Repository
public class ContactsDaoImp implements ContactsDao {

	private final ContactsJpaSpring contacts;

	/**
	 * Constructor injecting the ContactsJpaSpring repository.
	 *
	 * @param contacts JPA repository for managing Contact entities.
	 */
	public ContactsDaoImp(ContactsJpaSpring contacts) {
		this.contacts = contacts;
	}

	/**
	 * Adds a new contact to the database.
	 *
	 * @param contact Contact object to be saved.
	 */
	@Override
	public void addContact(Contact contact) {
		contacts.save(contact);
	}

	/**
	 * Retrieves a contact by its email.
	 *
	 * @param email Email of the contact to find.
	 * @return Contact object if found, otherwise null.
	 */
	@Override
	public Contact getContactByEmail(String email) {
		return contacts.findByEmail(email);
	}

	/**
	 * Retrieves a contact by its ID.
	 *
	 * @param idContact ID of the contact to find.
	 * @return Contact object if found, otherwise null.
	 */
	@Override
	public Contact getContactById(int idContact) {
		return contacts.findById(idContact).orElse(null);
	}

	/**
	 * Deletes a contact by its email.
	 *
	 * @param email Email of the contact to delete.
	 */
	@Override
	public void deleteContactByEmail(String email) {
		contacts.deleteByEmail(email);

	}

	/**
	 * Deletes a contact by its ID.
	 *
	 * @param idContact ID of the contact to delete.
	 */
	@Override
	public void deleteContactById(int idContact) {
		contacts.deleteById(idContact);
	}

	/**
	 * Retrieves all contacts from the database.
	 *
	 * @return List of all Contact objects.
	 */
	@Override
	public List<Contact> getAllContacts() {
		return contacts.findAll();
	}

	/**
	 * Updates an existing contact in the database.
	 *
	 * @param contact Contact object with updated details.
	 */
	@Override
	public void updateContact(Contact contact) {
		contacts.save(contact);
	}

}
