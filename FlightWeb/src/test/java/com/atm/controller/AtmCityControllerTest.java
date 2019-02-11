package com.atm.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
class AtmCityControllerTest {

	
	MockMvc mockMVC;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetAtm() {
		fail("Not yet implemented");
	}

	@Test
	void testHandleEmployeeNotFoundException() {
		fail("Not yet implemented");
	}

}
