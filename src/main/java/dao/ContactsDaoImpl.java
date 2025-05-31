package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Contact;

@Repository
public class ContactsDaoImpl implements ContactsDao {
	
	@Autowired
	ContactsJpaSpring contacts;

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
		return contacts.findById(idContact);
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
