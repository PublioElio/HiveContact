package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Contact;
import service.ContactsService;

@RestController
public class ContactsController {
	
	@Autowired
	ContactsService service;
	
	@GetMapping()
	public List<Contact> getAllContacts() {

	}

}
