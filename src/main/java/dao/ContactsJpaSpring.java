package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Contact;

public interface ContactsJpaSpring extends JpaRepository<Contact, Integer> {
	
	Contact findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Contact c WHERE c.email=?")
	void deleteByEmail(String email);
}
