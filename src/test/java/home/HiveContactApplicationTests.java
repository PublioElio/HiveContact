package home;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Integration test class for the HiveContact microservice.
 * Uses MockMvc to simulate HTTP requests and validate responses.
 */
@AutoConfigureMockMvc
@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class HiveContactApplicationTests {

	@Autowired
	MockMvc mock;

	@Test
	@Order(0)
	void testDeleteContact() throws Exception {
		mock.perform(delete("/contacts/60")).andDo(print()).andExpect(status().isOk());
	    mock.perform(get("/contacts/60")).andExpect(status().isNotFound());
	}

	@Test
	@Order(1)
	void testContacts() throws Exception {
		mock.perform(get("/contacts")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	@Order(2)
	void testCreateContacts() throws Exception {
		mock.perform(post("/contacts").contentType(MediaType.APPLICATION_JSON)
				.content("{\"contactAge\":\"38\", \"contactName\":\"Victor Santos\", \"contactEmail\":\"victor.santos@example.com\"}")).andDo(print())
				.andExpect(status().isCreated());
	}

	@Test
	@Order(3)
	void testUpdateContact() throws Exception {
		mock.perform(put("/contacts").contentType(MediaType.APPLICATION_JSON)
				.content("{\"contactAge\":\"88\", \"contactName\":\"Alan Moore\", \"contactEmail\":\"alan.moore@example-new.com\"}")).andDo(print())
				.andExpect(status().isOk());
	}
	
}
