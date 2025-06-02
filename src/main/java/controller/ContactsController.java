package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Contact;
import service.ContactsService;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

	private final ContactsService service;

	public ContactsController(ContactsService service) {
	    this.service = service;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getAllContacts() {
		return service.getAllContacts();
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact(@PathVariable int id) {
		return service.getContact(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addContact(@RequestBody Contact contact) {
		boolean isAdded = service.addContact(contact);
		if (isAdded)
			return ResponseEntity.status(HttpStatus.CREATED).body("Contact added successfully");
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error adding new contact");
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateContact(@RequestBody Contact contact) {
	    Contact updatedContact = service.getContact(contact.getIdContact());
	    if (updatedContact != null)
	        return ResponseEntity.ok(contact);
	    else
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Contacto no encontrado");
	}

	@DeleteMapping("/{id}")
	public void deleteContact(@PathVariable int id) {
		service.deleteContact(id);
	}
}
