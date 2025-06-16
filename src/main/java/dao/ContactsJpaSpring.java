package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import model.Contact;

/**
 * ContactsJpaSpring interface defines a repository for managing Contact
 * entities. It extends JpaRepository to provide CRUD operations for Contact
 * entities using Spring Data JPA.
 * 
 * @author AdrianoDíazBenítez
 */
public interface ContactsJpaSpring extends JpaRepository<Contact, Integer> {

	/**
	 * Finds a contact by its email address.
	 * 
	 * @param contactEmail the email address of the contact to find
	 * @return the Contact entity matching the provided email, or null if not found
	 */
	Contact findByEmail(String contactEmail);

	/**
	 * Deletes a contact by its email address. This operation is transactional and
	 * modifying, meaning it alters the database state.
	 * 
	 * @param email the email address of the contact to delete
	 */
	@Transactional
	@Modifying
	@Query("DELETE FROM Contact c WHERE c.email = :email")
	void deleteByEmail(@Param("email") String email);

}
