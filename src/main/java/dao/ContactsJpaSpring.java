package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import model.Contact;

public interface ContactsJpaSpring extends JpaRepository<Contact, Integer> {

	Contact findByEmail(String contactEmail);

	@Transactional
	@Modifying
	@Query("DELETE FROM Contact c WHERE c.email = :email")
	void deleteByEmail(@Param("email") String email);

}
