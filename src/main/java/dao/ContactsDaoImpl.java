package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import model.Contact;

@Repository
public class ContactsDaoImpl implements ContactsDao {

	@Override
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public Contact getContactByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(int idContact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteContactByEmail(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteContactById(int idContact) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub

	}

}
