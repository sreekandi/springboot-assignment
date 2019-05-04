package com.capgemini.persontest.person;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.persontest.person.controller.PersonController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonApplicationTests {

	@Autowired

	private PersonController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();

	}
	

}
