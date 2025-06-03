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

/**
 * REST controller to manage CRUD operations on contacts.
 */
@RestController
@RequestMapping("/contacts")
public class ContactsController {

	private final ContactsService service;

	/**
     * Constructor injecting the ContactsService instance.
     *
     * @param service Contacts service instance.
     */
	public ContactsController(ContactsService service) {
		this.service = service;
	}

	/**
     * Retrieves a list of all contacts.
     *
     * @return List of contacts in JSON format.
     */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getAllContacts() {
		return service.getAllContacts();
	}
	
    /**
     * Retrieves a specific contact by its ID.
     *
     * @param id ID of the contact to retrieve.
     * @return The contact found.
     */
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact(@PathVariable int id) {
		return service.getContact(id);
	}

    /**
     * Adds a new contact.
     *
     * @param contact Contact received in the request body.
     * @return HTTP response indicating whether the contact was successfully added.
     */
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addContact(@RequestBody Contact contact) {
		boolean isAdded = service.addContact(contact);
		if (isAdded)
			return ResponseEntity.status(HttpStatus.CREATED).body("Contact added successfully");
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error adding new contact");
	}

    /**
     * Updates an existing contact.
     *
     * @param contact Updated contact sent in the request body.
     * @return Updated contact or HTTP response in case of an error.
     */
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Contact> updateContact(@RequestBody Contact contact) {
		Contact updatedContact = service.getContact(contact.getIdContact());
		if (updatedContact != null) {
			service.updateContact(contact);
			return ResponseEntity.ok(updatedContact);
		} else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

	@DeleteMapping("/{id}")
	public void deleteContact(@PathVariable int id) {
		service.deleteContact(id);
	}
}
