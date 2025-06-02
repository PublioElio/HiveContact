package service;

import java.util.List;

import model.Contact;

public interface ContactsService {
	boolean addContact(Contact contact);

	List<Contact> getAllContacts();

	void updateContact(Contact contact);

	boolean deleteContact(int idContact);

	Contact getContact(int idContact);
}
