package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Contact;

public interface ContactsJpaSpring extends JpaRepository<Contact, Integer> {

}
