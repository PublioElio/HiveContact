package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.ContactsDao;
import model.Contact;

public class ContactsServiceImp implements ContactsService {
	
	@Autowired
	ContactsDao dao;

	@Override
	public boolean addContact(Contact contact) {
		return false;
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

	@Override
	public boolean deleteContact(int idContact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact getContact(int idContact) {
		return dao.getContact(idContact);
	}

}
