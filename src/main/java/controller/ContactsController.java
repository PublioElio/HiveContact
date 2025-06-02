package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Contact;
import service.ContactsService;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
	
	@Autowired
	ContactsService service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getAllContacts() {
		return service.getAllContacts();
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact(@PathVariable int id) {
		return service.getContact(id);
	}

}
