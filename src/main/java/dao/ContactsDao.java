package dao;

import java.util.List;

import model.Contact;

public interface ContactsDao {
	
	void addContact(Contact contact);
	
	Contact getContactByEmail(String email);
	Contact getContactById(int idContact);
	
	void deleteContactByEmail(String email);
	void deleteContactById(int idContact);
	
	List<Contact> getAllContacts();
		
	void updateContact(Contact contact);
}
