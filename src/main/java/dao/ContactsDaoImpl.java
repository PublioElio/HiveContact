package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.Contact;

/**
 * Implementation of the ContactsDao interface, managing database operations for contacts.
 */
@Repository
public class ContactsDaoImpl implements ContactsDao {
	
	private final ContactsJpaSpring contacts;

	public ContactsDaoImpl(ContactsJpaSpring contacts) {
		this.contacts = contacts;
	}
	
	@Override
	public void addContact(Contact contact) {
		contacts.save(contact);
	}

	@Override
	public Contact getContactByEmail(String email) {
		return contacts.findByEmail(email);
	}

	@Override
	public Contact getContactById(int idContact) {
		return contacts.findById(idContact).orElse(null);
	}

	@Override
	public void deleteContactByEmail(String email) {
		contacts.deleteByEmail(email);

	}

	@Override
	public void deleteContactById(int idContact) {
		contacts.deleteById(idContact);
	}

	@Override
	public List<Contact> getAllContacts() {
		return contacts.findAll();
	}

	@Override
	public void updateContact(Contact contact) {
		contacts.save(contact);
	}

}
