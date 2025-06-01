package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ContactsDao;
import model.Contact;

@Service
public class ContactsServiceImp implements ContactsService {
	
	@Autowired
	ContactsDao dao;

	@Override
	public boolean addContact(Contact contact) {
		if(dao.getContactById(contact.getIdContact()) == null) {
			dao.addContact(contact);
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		return null;
	}

	@Override
	public void updateContact(Contact contact) {
	}

	@Override
	public boolean deleteContact(int idContact) {
		return false;
	}

	@Override
	public Contact getContact(int idContact) {
		return dao.getContactById(idContact);
	}

}
