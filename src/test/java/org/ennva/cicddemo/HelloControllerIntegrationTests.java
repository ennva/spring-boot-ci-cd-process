package org.ennva.cicddemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class HelloControllerIntegrationTests {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private BuildProperties buildProperties;

	@Test
	public void homeTest() throws Exception {
		this.mvc.perform(get("/")).andExpect(status().isOk())
				.andExpect(content().string("Welcome to Spring Boot. " + buildProperties.getName() + "-" + buildProperties.getVersion()));
	}
	
	@Test
	public void helloTest() throws Exception {
		this.mvc.perform(get("/hello/Neph")).andExpect(status().isOk())
				.andExpect(content().string("Hello Neph"));
	}

}
