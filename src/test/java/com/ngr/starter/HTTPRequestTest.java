package com.ngr.starter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HTTPRequestTest {
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void codeAvailableScenario() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/AFG",
				String.class)).contains("{\"name\":\"Afghanistan\",\"continent\":\"Asia\",\"population\":22720000,\"life_expectancy\":45.9,\"country_language\":\"Pashto\"}");
	}
	
	@Test
	public void codeNotAvailableTest() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/XYZ",
				String.class)).contains("{\"message\":\"INVALID_COUNTRY_CODE\",\"is_error\":true}");
	}
	
	/*Uncomment that test if you want to test the Server Down Behaviour*/
	/*@Test
	public void serverDownTest() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/EGY",
				String.class)).contains("{\"message\":\"INTERNAL_ERROR\",\"is_error\":true}");
	}*/
}
