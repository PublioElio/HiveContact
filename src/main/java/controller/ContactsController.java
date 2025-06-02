package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Contact;
import service.ContactsService;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
	
	@Autowired
	ContactsService service;
	
	@GetMapping(value)
	public List<Contact> getAllContacts() {

	}

}
