package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import service.ContactsService;

@RestController
public class ContactsController {
	
	@Autowired
	ContactsService service;
	
	@GetMapping()
	public List<Contact> getAllContacts(){
		
	}
	

}
