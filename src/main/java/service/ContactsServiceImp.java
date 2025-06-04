package service;

import java.util.List;

import org.springframework.stereotype.Service;

import dao.ContactsDao;
import model.Contact;

/**
 * Implementation of the ContactsService interface. This class provides the
 * business logic for managing Contact entities using a data access object
 * (DAO).
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

	@Override
	public boolean addContact(Contact contact) {
		if (dao.getContactById(contact.getIdContact()) == null) {
			dao.addContact(contact);
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		return dao.getAllContacts();
	}

	@Override
	public void updateContact(Contact contact) {
		if (dao.getContactById(contact.getIdContact()) != null) {
			dao.updateContact(contact);
		}
	}

	@Override
	public boolean deleteContact(int idContact) {
		if (dao.getContactById(idContact) != null) {
			dao.deleteContactById(idContact);
			return true;
		}
		return false;
	}

	@Override
	public Contact getContact(int idContact) {
		return dao.getContactById(idContact);
	}

}
