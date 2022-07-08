package org.ennva.cicddemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class CicdDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void applicationStartTest() {
		CicdDemoApplication.main(new String[] {"Hello", "World"});
	}

}
